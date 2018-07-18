适用于mysql数据库的java代码生成器
本期实现了解析数据库表结构并生成po的功能

在src/main/resources目录中
config_properties是核心配置
生成代码前注意做好其中的
java.src.path(java源代码目录,即maven项目的src/main/java目录)
和
pack.path(模块包名,不是生成类的包名,类包名有默认)

两个bool配置gen.po和gen.sql控制是否生成po文件和sql文件