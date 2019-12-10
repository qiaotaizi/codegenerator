package com.jaiz.orm.codegenerator;

import static com.jaiz.orm.codegenerator.util.Constants.TABLE_NAME_SEPERATOR;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.jaiz.orm.codegenerator.dao.TableSchemaDAO;
import com.jaiz.orm.codegenerator.entity.TableColumn;
import com.jaiz.orm.codegenerator.util.ConfigHolder;
import com.jaiz.orm.codegenerator.util.Constants;
import com.jaiz.orm.codegenerator.util.DataSourceHolder;
import com.jaiz.orm.codegenerator.util.Generator;

public class App {
	
	
	/**
	 * 核心逻辑
	 * @param session
	 */
	private static void coreLogic(SqlSession session) {
		TableSchemaDAO dao = session.getMapper(TableSchemaDAO.class);
		String dbName=ConfigHolder.getStringByName("db.name");
		String[] tableNames=ConfigHolder.getStringByName("table.names").split(TABLE_NAME_SEPERATOR);
		for(int i=0;i<tableNames.length;i++) {
			String tableName=tableNames[i];
			List<TableColumn> cols = dao.queryColumns(dbName, tableName);
			//这里获取了想要的数据
			//开始拿这些数据做事吧
			Generator gen=new Generator(cols,tableName);
			gen.work();
		}
		
	}
	
	/**
	 * 程序入口
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("程序开始");
		System.out.println(Constants.STDOUT_SEPERATOR);
		SqlSessionFactory factory = DataSourceHolder.getFactoryInstance();
		SqlSession session = factory.openSession();
		
		//执行核心逻辑
		coreLogic(session);
		
		session.close();
		System.out.println(Constants.STDOUT_SEPERATOR);
		System.out.println("已关闭数据源");
		System.out.println(Constants.STDOUT_SEPERATOR);
		System.out.println("程序运行完毕");
	}


}
