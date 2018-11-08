package com.jaiz.orm.codegenerator.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jaiz.orm.codegenerator.entity.TableColumn;

public interface TableSchemaDAO {

	/**
	 * 查询表字段元信息
	 * @param dbName
	 * @param tableName
	 * @return
	 */
	List<TableColumn> queryColumns(@Param("dbName")String dbName,@Param("tableName")String tableName);
}
