package com.jaiz.orm.codegenerator.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.util.ArrayList;
import java.util.List;

import com.jaiz.orm.codegenerator.entity.TableColumn;
import com.jaiz.orm.codegenerator.entity.TemplatePlaceHolder;
import com.jaiz.orm.codegenerator.entity.TypeMemberSchema;
import com.jaiz.orm.codegenerator.templates.POTemplate;
import com.jaiz.utils.FastStringUtil;

/**
 * 代码生成器
 *
 * @author graci
 */
public class Generator {

    public Generator() {

    }

    /**
     * 表字段
     */
    private List<TableColumn> cols;

    /**
     * 成员变量元数据
     */
    private List<TypeMemberSchema> members;

    /**
     * 导入语句块
     */
    private List<String> importBlock;

    private String tableName;

    private boolean genPO;

    private boolean genSQL;

    public Generator(List<TableColumn> cols, String tableName) {
        this.cols = cols;
        this.tableName = tableName;
        this.genPO = ConfigHolder.getBoolByName("gen.po");
        this.genSQL = ConfigHolder.getBoolByName("gen.sql");
    }

    public boolean isGenPO() {
        return genPO;
    }

    public void setGenPO(boolean genPO) {
        this.genPO = genPO;
    }

    public boolean isGenSQL() {
        return genSQL;
    }

    public void setGenSQL(boolean genSQL) {
        this.genSQL = genSQL;
    }

    public List<TableColumn> getCols() {
        return cols;
    }

    public void setCols(List<TableColumn> cols) {
        this.cols = cols;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    //包名
    private String packageName;

    //文件位置
    private String filePosition;

    //类名
    private String className;

    /**
     * 生成器开工啦!
     */
    public void work() {
        //初始化一些数据
        // 包名
        this.packageName = orderPoPackageName();
        // 文件位置
        this.filePosition = orderPoFilePosition(packageName);
        // 类名
        this.className = StringUtil.tableName2POClassName(this.tableName);
        //初始化模块包结构
        initConstruct();

        //表字段转成员变量元数据
        tableColumns2TypeMemberSchemas();
        // 生成po
        poWork();
        // 生成单表sql
        sqlWork();
    }

    /**
     * 初始化模块包
     * +packagename
     * |+model
     * ||-po
     * --------------
     * 后续可以把vo,dao模块加入
     */
    private void initConstruct() {
        String dir = ConfigHolder.getStringByName("java.src.path")
                + File.separator + StringUtil.packageName2FilePath(ConfigHolder.getStringByName("pack.path"));
        File rootPack = new File(dir);
        if (!rootPack.exists() || rootPack.isFile()) {
            throw new RuntimeException("所选路径不存在,请配置正确的java.src.path和pack.path");
        }
        //model目录
        File modelDir = new File(dir + File.separator + "model");
        if (!modelDir.exists()) {
            //不存在则创建
            modelDir.mkdir();
        }

        //po目录
        File poDir = new File(modelDir.getAbsolutePath() + File.separator + "po");
        if (!poDir.exists()) {
            poDir.mkdir();
        }
    }

    /**
     * 表字段转成员变量元数据
     * 同时填充导包语句块
     */
    private void tableColumns2TypeMemberSchemas() {
        boolean hasDate = false;
        boolean hasBigDecimal = false;
        List<TypeMemberSchema> schemas = new ArrayList<>();
        List<String> impBlock = new ArrayList<>();
        for (TableColumn col : this.cols) {
            //判断字段类型
            TypeMemberSchema schema = new TypeMemberSchema();
            schema.setMemberComment(col.getColumnComment());
            schema.setMemberName(StringUtil.dash2Camel(col.getColumnName()));
            String colDateType = col.getDataType();
            switch (colDateType) {
                case "varchar":
                    schema.setMemberType("String");
                    break;
                case "decimal":
                    schema.setMemberType("BigDecimal");
                    hasBigDecimal = true;
                    break;
                case "timestamp":
                    schema.setMemberType("Date");
                    hasDate = true;
                    break;
                case "datetime":
                    schema.setMemberType("Date");
                    hasDate = true;
                    break;
                case "tinyint":
                case "smallint":
                    schema.setMemberType("Integer");
                    break;
                case "int":
                    if (col.getNumericPrecision() > 8) {
                        schema.setMemberType("Long");
                    } else {
                        schema.setMemberType("Integer");
                    }
                    break;
                case "bigint":
                    schema.setMemberType("Long");
                    break;
                default:
                    throw new RuntimeException("出现了未知的变量类型" + colDateType);
            }
            schemas.add(schema);
        }
        if (hasDate) {
            impBlock.add(Constants.DATE_IMPORT);
        }
        if (hasBigDecimal) {
            impBlock.add(Constants.DECIMAL_IMPORT);
        }
        this.importBlock = impBlock;
        this.members = schemas;
    }

    /**
     * 生成sql
     */
    private void sqlWork() {
        // 先不做
        if (genSQL) {
            System.out.println("sql生成暂未实现");
        }
    }

    /**
     * 生成po
     */
    private void poWork() {
        if (genPO) {

            //填充模板
            TemplatePlaceHolder ph = new TemplatePlaceHolder();
            ph.setClassName(className);
            ph.setMembers(this.members);
            ph.setPackageName(packageName);
            ph.setImportBlock(this.importBlock);

            POTemplate template = new POTemplate(ph);

            //写文件
            File javaFile = new File(filePosition + File.separator + className + ".java");
            FileWriter out = null;
            try {
                out = new FileWriter(javaFile);
                out.write(template.getContent());
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (out != null) {
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /**
     * 组织PO包名
     *
     * @return
     */
    private String orderPoPackageName() {
        String poPackage = ConfigHolder.getStringByName("po.pach.path");
        if (FastStringUtil.isNotBlank(poPackage)) {
            return poPackage;
        }
        return ConfigHolder.getStringByName("pack.path") + Constants.PACKAGE_NAME_SEPERATOR + Constants.MODLE_PO;
    }

    /**
     * 组织文件位置
     *
     * @param packageName 包名
     * @return
     */
    private String orderPoFilePosition(String packageName) {
        String subPath = StringUtil.packageName2FilePath(packageName);
        String fullPath=ConfigHolder.getStringByName("java.src.path") + File.separator + subPath + File.separator;
        File positonDir=new File(fullPath);
        positonDir.mkdirs();
        return fullPath;
    }

}
