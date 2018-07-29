/*
SQLyog Ultimate v11.33 (32 bit)
MySQL - 5.7.21-log : Database - mms
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mms` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `mms`;

/*Table structure for table `sm_position` */

DROP TABLE IF EXISTS `sm_position`;

CREATE TABLE `sm_position` (
  `position_id` int(11) NOT NULL AUTO_INCREMENT,
  `position_name` varchar(40) DEFAULT NULL,
  `position_created_name` varchar(40) DEFAULT NULL,
  `position_created_datetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `position_updated_name` varchar(40) DEFAULT NULL,
  `position_updated_datetime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `position_comment` varchar(100) DEFAULT NULL,
  `position_isVaild` int(11) DEFAULT NULL,
  PRIMARY KEY (`position_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

/*Data for the table `sm_position` */

insert  into `sm_position`(`position_id`,`position_name`,`position_created_name`,`position_created_datetime`,`position_updated_name`,`position_updated_datetime`,`position_comment`,`position_isVaild`) values (1,'销售总监','james.li','2018-05-15 18:43:01','james','2018-05-15 18:43:45','bbb',1),(2,'中级程序员','james.gu','2018-05-09 00:28:44',NULL,'2018-05-05 17:23:05',NULL,1),(3,'初级程序员','james.gu','2018-05-09 00:28:45',NULL,'2018-05-07 14:19:05',NULL,1),(4,'高级程序员','james.gu','2018-05-09 00:28:52',NULL,'2018-05-08 18:05:33',NULL,1),(5,'架构师','james.gu','2018-05-09 00:29:31',NULL,'2018-05-08 18:06:44',NULL,1),(6,'公关经理','james','2018-05-09 09:40:43',NULL,'2018-05-09 09:25:16','aaa',1),(7,'采购员','采购员','2018-05-15 18:30:24','li','2018-05-09 11:15:42','kkk',0),(8,'仓库管理员','james','2018-05-09 10:01:55',NULL,'2018-05-09 09:41:20','xxx',0),(9,'需求分析师','wang','2018-05-15 19:13:58',NULL,'2018-05-15 19:13:55','ccc',NULL),(10,'调研员','li','2018-05-15 19:14:00','li','2018-05-15 19:13:58','ccc',0),(11,'boss','boss','2018-05-21 11:31:39',NULL,'0000-00-00 00:00:00','boss',1),(12,'boss1','boss1','2018-05-21 11:31:56',NULL,'0000-00-00 00:00:00','boss1',1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
