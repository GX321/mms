/*
Navicat MySQL Data Transfer

Source Server         : stun
Source Server Version : 50132
Source Host           : localhost:3306
Source Database       : user

Target Server Type    : MYSQL
Target Server Version : 50132
File Encoding         : 65001

Date: 2018-05-10 09:43:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sm_account`
-- ----------------------------
DROP TABLE IF EXISTS `sm_account`;
CREATE TABLE `sm_account` (
  `account_id` int(40) NOT NULL,
  `account_name` varchar(40) NOT NULL,
  `account` varchar(40) NOT NULL,
  `account_pass` varchar(10) NOT NULL,
  `account_mail` varchar(25) NOT NULL,
  `account_position_id` int(10) NOT NULL,
  `account_department_id` int(10) NOT NULL,
  `account_role_id` int(10) NOT NULL,
  `account_company_id` int(10) NOT NULL,
  `account_phone` varchar(10) NOT NULL,
  `account_telephone` varchar(10) DEFAULT NULL,
  `account_comment` varchar(30) DEFAULT NULL,
  `account_created_datetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `account_created_name` int(2) NOT NULL,
  `account_updated_datetime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `account_updated_name` int(2) NOT NULL,
  `is_visible` int(2) NOT NULL,
  `account_default` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`account_id`),
  UNIQUE KEY `account_id` (`account_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sm_account
-- ----------------------------
INSERT INTO `sm_account` VALUES ('3', '113', '3', '111', '11', '11', '11', '11', '11', '11', '11', '1', '2018-05-09 19:48:21', '1', '2018-05-09 19:48:21', '1', '1', '');
INSERT INTO `sm_account` VALUES ('7', '哈海', '2', '123', '1', '3', '3', '4', '5', '11111', '2222', '', '2018-05-08 14:13:20', '1', '2018-05-08 12:46:23', '1', '1', '');
INSERT INTO `sm_account` VALUES ('11', '13', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '2018-05-09 14:51:42', '1', '2018-05-09 14:51:42', '1', '1', '');
INSERT INTO `sm_account` VALUES ('66', '66', '66', '66', '66', '66', '66', '66', '66', '66', '66', '66', '2018-05-09 12:07:02', '1', '2018-05-09 12:07:02', '1', '1', '');
INSERT INTO `sm_account` VALUES ('112', 'å¼ ', '12', '11122', '22@qq.com', '1', '2', '1', '1', '123423452', '86575765', '222', '2018-05-10 09:17:56', '1', '2018-05-10 09:17:56', '1', '1', '');
