/*
Navicat MySQL Data Transfer

Source Server         : LZF
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : shirojwt

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2020-12-15 17:21:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for books
-- ----------------------------
DROP TABLE IF EXISTS `books`;
CREATE TABLE `books` (
  `bno` varchar(8) NOT NULL DEFAULT '',
  `classid` char(5) DEFAULT NULL,
  `bname` varchar(30) DEFAULT NULL,
  `author` varchar(30) DEFAULT NULL,
  `price` decimal(8,1) DEFAULT NULL,
  `publish` varchar(30) DEFAULT NULL,
  `csl` int(11) DEFAULT NULL,
  PRIMARY KEY (`bno`),
  KEY `r_books` (`bno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of books
-- ----------------------------
INSERT INTO `books` VALUES ('sn9001  ', 'jsj', 'SQL SERVER2005教程', '龚波', '10.5', '北京希望出版社', '5');
INSERT INTO `books` VALUES ('sn9002  ', 'jsj', 'Delphi数据库开发指南', '万科', '26.4', '清华大学出版社', '5');
INSERT INTO `books` VALUES ('sn9003  ', 'wx', '复活', '列夫托尔斯泰', '25.0', '上海人民出版社', '3');
INSERT INTO `books` VALUES ('sn9004  ', 'wx', '三重门', '韩寒', '16.0', '作家出版社', '1');
INSERT INTO `books` VALUES ('sn9005  ', 'wx', '零下一度', '韩寒', '20.0', '作家出版社', '1');
INSERT INTO `books` VALUES ('sn9006  ', 'jsj', '数据库设计凡人入门', '范明', '24.0', '人民邮电出版社', '1');
INSERT INTO `books` VALUES ('sn9007  ', 'kh', '达芬奇的密码', '丹布朗', '16.0', '上海人民出版社', '1');
INSERT INTO `books` VALUES ('sn9008  ', 'kh', '哈利波特', '罗琳', '69.0', '上海人民出版社', '5');
INSERT INTO `books` VALUES ('sn9009  ', 'jsj', 'Maya学习的革命', '孙立', '68.0', '北京希望出版社', '1');
INSERT INTO `books` VALUES ('sn9010  ', 'jsj', 'C语言程序设计基础', '潭浩强', '22.0', '清华大学出版社', '10');
INSERT INTO `books` VALUES ('sn9011  ', 'ly', '中国自助游', '王利', '36.0', '上海人民出版社', '5');
INSERT INTO `books` VALUES ('sn9012  ', 'ly', '浪漫巴黎', '刘佳音', '33.0', '上海人民出版社', '1');
INSERT INTO `books` VALUES ('sn9013  ', 'jsj', 'JAVA入门', '孙思强', '29.5', '北京希望出版社', '5');
INSERT INTO `books` VALUES ('sn9014  ', 'jsj', '数据库系统概论', '王珊', '34.0', '机械工业出版社', '5');
INSERT INTO `books` VALUES ('sn9015', 'jsj', 'R语言编程艺术', '麦特洛夫', '69.0', '机械工业出版社', '1');
INSERT INTO `books` VALUES ('sn9016', 'jsj', '像程序员一样思考', '斯保尔', '35.9', '人民邮电出版社', '2');
INSERT INTO `books` VALUES ('sn9017', 'zj', '穿布鞋的马云:决定阿里巴巴生死的27个节点', '王利芬', '42.0', '北京联合出版公司', '2');
INSERT INTO `books` VALUES ('sn9018', 'wx', '追风筝的人', '卡勒德·胡赛尼', '21.7', '上海人民出版社', '2');
INSERT INTO `books` VALUES ('sn9019', 'zj', '帝王师：刘伯温', '度阴山', '46.0', '江苏文艺出版社', '1');
INSERT INTO `books` VALUES ('sn9020', 'kh', '牧羊少年奇幻之旅', '保罗柯艾略', '18.3', '北京联合出版公司', '1');
INSERT INTO `books` VALUES ('sn9021', 'kh', '幻城', '郭敬明', '23.0', '江苏文艺出版社', '2');
INSERT INTO `books` VALUES ('sn9022', 'zj', '居里夫人自传', '玛丽居里', '19.8', '江苏文艺出版社', '1');
INSERT INTO `books` VALUES ('sn9023', 'zj', '爱因斯坦传', '沃尔特.艾萨克森', '31.8', '江苏文艺出版社', '1');
INSERT INTO `books` VALUES ('sn9024', 'jsj', '图解TCP/IP(第5版)', '竹下隆史、村山公保、荒井透、 苅田幸雄', '69.0', '北京希望出版社', '1');
INSERT INTO `books` VALUES ('sn9025', 'ys', '秘密花园', '乔汉娜贝斯福', '35.0', '北京联合出版公司', '5');
INSERT INTO `books` VALUES ('sn9026', 'zj', '向死而生:我修的死亡学分', '李开复', '42.0', '中信出版社', '1');
INSERT INTO `books` VALUES ('sn9027', 'jsj', 'Android从入门到精通', '明日科技', '69.0', '清华大学出版社', '3');
INSERT INTO `books` VALUES ('sn9028', 'jsj', 'Head First Java（中文版）', '塞若（Sierra，K.）', '79.0', '中国电力出版社', '2');
INSERT INTO `books` VALUES ('sn9029', 'jsj', 'Python核心编程（第二版）', '[美] Wesley J. Chun', '89.0', '人民邮电出版社', '2');
INSERT INTO `books` VALUES ('sn9030', 'jsj', 'php和mysql web开发(原书第4版)', '（澳）威利，（澳）汤姆森', '95.0', '机械工业出版社', '3');
INSERT INTO `books` VALUES ('sn9031', 'jsj', '用户体验要素：以用户为中心的产品设计', '（美）加瑞特', '39.0', '机械工业出版社', '1');
INSERT INTO `books` VALUES ('sn9032', 'ly', '孤独星球Lonely Planet“IN”系列：台湾', '澳大利亚Lonely Planet公司', '66.0', '中国地图出版社', '1');
INSERT INTO `books` VALUES ('sn9033', 'ly', '发现最世界：全球旅行圣地', '穷游网 中国国家地理·图书', '49.8', '北京联合出版公司', '1');
INSERT INTO `books` VALUES ('sn9034', 'wx', '看见', '柴静', '39.8', '广西师范大学出版社', '1');
INSERT INTO `books` VALUES ('sn9035', 'wx', '窗边的小豆豆', '（日）黑柳彻子', '25.0', '南海出版社', '2');
INSERT INTO `books` VALUES ('sn9036', 'wx', '活着', '余华', '20.0', '作家出版社', '1');
INSERT INTO `books` VALUES ('sn9037', 'sh', '种多肉、玩多肉一次搞定', '花草游戏编辑部　编著', '38.0', '河南科学技术出版社', '1');
INSERT INTO `books` VALUES ('sn9038', 'jj', '聪明的投资者(原本第四版)', '（美）本杰明.格雷厄姆', '58.0', '人民邮电出版社', '3');
INSERT INTO `books` VALUES ('sn9039', 'jj', '投资第一课', '那一水的鱼', '49.8', '新世界出版社', '2');
INSERT INTO `books` VALUES ('sn9040', 'jj', '资本的游戏（第2版 彩图本）', '房西苑', '99.0', '机械工业出版社', null);
INSERT INTO `books` VALUES ('sn9041', null, '小王子', null, '55.0', null, null);

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(128) DEFAULT NULL COMMENT '资源名称',
  `per_code` varchar(128) NOT NULL COMMENT '权限代码字符串',
  `del_flag` int(1) DEFAULT '0' COMMENT '删除状态 0正常 1已删除',
  PRIMARY KEY (`id`),
  UNIQUE KEY `per_code` (`per_code`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='资源表';

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES ('1', '查看用户', 'user:view', '0');
INSERT INTO `permission` VALUES ('2', '操作用户', 'user:edit', '0');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(128) NOT NULL COMMENT '角色名称',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', 'admin');
INSERT INTO `role` VALUES ('2', 'customer');

-- ----------------------------
-- Table structure for role_permission
-- ----------------------------
DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `role_id` int(11) NOT NULL COMMENT '角色id',
  `permission_id` int(11) NOT NULL COMMENT '权限id',
  `del_flag` int(1) DEFAULT '0' COMMENT '删除状态 0正常 1已删除',
  PRIMARY KEY (`id`),
  KEY `role_id` (`role_id`),
  KEY `permission_id` (`permission_id`),
  CONSTRAINT `role_permission_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`),
  CONSTRAINT `role_permission_ibfk_2` FOREIGN KEY (`permission_id`) REFERENCES `permission` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='角色资源表';

-- ----------------------------
-- Records of role_permission
-- ----------------------------
INSERT INTO `role_permission` VALUES ('1', '1', '1', '0');
INSERT INTO `role_permission` VALUES ('2', '1', '2', '0');
INSERT INTO `role_permission` VALUES ('3', '2', '1', '0');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `account` varchar(20) NOT NULL COMMENT '帐号',
  `password` varchar(80) NOT NULL COMMENT '密码',
  `username` varchar(20) NOT NULL COMMENT '昵称',
  `reg_time` datetime NOT NULL COMMENT '注册时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `account` (`account`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', 'QUJBNUYyM0M3OTNEN0I4MUFBOTZBOTkwOEI1NDI0MUE=', 'admin', '2019-12-30 16:37:01');
INSERT INTO `user` VALUES ('2', 'wang', 'RTM3MDJENjU0MDg5QURFNUZEQTkxNTNCOEZFQ0MzMkM=', 'wang', '2019-12-30 16:37:01');
INSERT INTO `user` VALUES ('3', 'guest', 'QTNCMzMwREY3MkMwQjRGQjNBQzUyOTM0NTFFMzJCNDg=', 'guest', '2019-12-30 16:37:01');

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `role_id` int(11) NOT NULL COMMENT '角色id',
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  KEY `role_id` (`role_id`),
  CONSTRAINT `user_role_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  CONSTRAINT `user_role_ibfk_2` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='用户角色表';

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('1', '1', '1');
INSERT INTO `user_role` VALUES ('2', '2', '2');
