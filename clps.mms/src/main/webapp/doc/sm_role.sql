/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50559
Source Host           : localhost:3306
Source Database       : mms

Target Server Type    : MYSQL
Target Server Version : 50559
File Encoding         : 65001

Date: 2018-05-11 09:59:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sm_role`
-- ----------------------------
DROP TABLE IF EXISTS `sm_role`;
CREATE TABLE `sm_role` (
  `role_id` int(60) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(60) DEFAULT NULL,
  `role_group_id` varchar(10) DEFAULT NULL,
  `role_group_name` varchar(60) DEFAULT NULL,
  `role_update_time` timestamp NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `role_maker` varchar(10) DEFAULT NULL,
  `role_comment` varchar(100) DEFAULT NULL,
  `is_visible` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sm_role
-- ----------------------------
INSERT INTO `sm_role` VALUES ('1', '技术', '1', '增删改查', '2018-05-07 10:41:52', '2', 'cc', '1');
INSERT INTO `sm_role` VALUES ('2', '人事', '1', '增删改查', '2018-05-07 10:42:31', '1', 'rs', '1');
INSERT INTO `sm_role` VALUES ('3', '财务', '1', '增删改查', '2018-05-10 10:36:48', '2', 'w', '1');
INSERT INTO `sm_role` VALUES ('4', '才', '2', '+', '2018-05-11 09:43:17', 'zz', '++', '1');
INSERT INTO `sm_role` VALUES ('5', '安', '2', '+', '2018-05-11 09:56:34', 'z', '++', '1');
INSERT INTO `sm_role` VALUES ('6', 'zz', '22', 'zx', '2018-05-11 09:51:37', '21', '23123', '0');
