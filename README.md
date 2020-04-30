# datatest
连接MySQL并插入表情
#### MySQL设置
1. 修改my.ini [mysqld] character-set-server=utf8mb4
2. 在Connector/J的连接参数中，不要加characterEncoding参数。 不加这个参数时，默认值就时autodetect。
3. 将已经建好的表也转换成utf8mb4    命令：ALTER TABLE `TABLE_NAME` CONVERT TO CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci; （将TABLE_NAME替换成你的表名）
4. 将需要使用emoji的字段设置类型为：    命令：ALTER TABLE `TABLE_NAME` MODIFY COLUMN `COLUMN_NAME`  text（varch（50）也行） CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
