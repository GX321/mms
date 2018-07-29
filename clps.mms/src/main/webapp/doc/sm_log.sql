/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50559
Source Host           : localhost:3306
Source Database       : mms_log

Target Server Type    : MYSQL
Target Server Version : 50559
File Encoding         : 65001

Date: 2018-05-11 12:16:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sm_log`
-- ----------------------------
DROP TABLE IF EXISTS `sm_log`;
CREATE TABLE `sm_log` (
  `log_id` int(20) NOT NULL AUTO_INCREMENT,
  `log_operation_time` varchar(60) CHARACTER SET utf8 NOT NULL,
  `log_operator_name` varchar(40) CHARACTER SET utf8 NOT NULL,
  `log_operation_object` varchar(20) CHARACTER SET utf8 NOT NULL,
  `log_operation_kind` varchar(20) CHARACTER SET utf8 NOT NULL,
  `log_operation_comment` varchar(80) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`log_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of sm_log
-- ----------------------------
INSERT INTO `sm_log` VALUES ('1', '倪虹洁', '', '', '', '');
INSERT INTO `sm_log` VALUES ('2', '2018年05月10日 11:40:22', '黄严', '账户', '查询', '查询丽的账户信息');
INSERT INTO `sm_log` VALUES ('3', '2018年05月11日 10：22：34', '李辰', '部门', '查询', '查询部门信息');
