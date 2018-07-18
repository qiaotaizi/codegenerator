package com.jaiz.orm.codegenerator.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jaiz.orm.codegenerator.entity.TableColumn;

public interface TableSchemaDAO {

	
	public List<TableColumn> queryColumns(@Param("dbName")String dbName,@Param("tableName")String tableName);
}
