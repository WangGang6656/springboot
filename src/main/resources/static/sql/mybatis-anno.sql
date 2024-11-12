CREATE DATABASE `demo` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_bin;
USE `demo`;
SET FOREIGN_KEY_CHECKS=0;


DROP TABLE IF EXISTS `users`;
-- 创建表
CREATE TABLE `users` (
                      id BIGINT PRIMARY KEY auto_increment,
                      username VARCHAR(255),
                      nick_name VARCHAR(255),
                      sex VARCHAR(10)
);

-- 插入数据
INSERT INTO `users` (id, username, nick_name, sex) VALUES (1, 'john_doe', 'Johnny', '男');
INSERT INTO `users` (id, username, nick_name, sex) VALUES (2, 'jack', 'jack', '男');
