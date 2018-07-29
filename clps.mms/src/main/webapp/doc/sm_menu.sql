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

/*Table structure for table `sm_menu` */

DROP TABLE IF EXISTS `sm_menu`;

CREATE TABLE `sm_menu` (
  `menu_id` int(11) NOT NULL AUTO_INCREMENT,
  `menu_name` varchar(20) NOT NULL,
  `menu_parent` int(11) DEFAULT NULL,
  `menu_url` varchar(60) DEFAULT NULL,
  `menu_created_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `menu_created_by` varchar(50) DEFAULT NULL,
  `is_visable` tinyint(1) DEFAULT NULL,
  `menu_comment` varchar(100) DEFAULT NULL,
  `menu_updated_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `menu_updated_by` varchar(50) DEFAULT NULL,
  `menu_target` varchar(60) DEFAULT NULL,
  `menu_default1` varchar(20) DEFAULT NULL,
  `menu_default2` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

/*Data for the table `sm_menu` */

insert  into `sm_menu`(`menu_id`,`menu_name`,`menu_parent`,`menu_url`,`menu_created_date`,`menu_created_by`,`is_visable`,`menu_comment`,`menu_updated_date`,`menu_updated_by`,`menu_target`,`menu_default1`,`menu_default2`) values (1,'账户管理',0,'','2018-06-03 12:59:15','gxf',1,'mmm','2018-05-09 11:53:24','ggg','123',NULL,NULL),(2,'账户添加',1,'../sm/addview','2018-06-03 13:03:00','gxf',1,'nnn','2018-05-09 11:53:24','hhh','123',NULL,NULL),(3,'账户查询',1,'../sm/accountList','2018-06-03 13:02:43','gxf',1,NULL,'2018-06-25 14:29:10','jjj',NULL,NULL,NULL),(4,'职位管理',0,NULL,'2018-06-03 13:03:05',NULL,NULL,NULL,'2018-06-03 09:13:10',NULL,NULL,NULL,NULL),(5,'职位添加',4,'../sm/positionAdd','2018-06-03 13:03:40',NULL,NULL,NULL,'2018-06-03 09:13:19',NULL,NULL,NULL,NULL),(6,'职位查询',4,'../sm/positionList','2018-06-03 13:04:14',NULL,NULL,NULL,'2018-06-03 09:13:34',NULL,NULL,NULL,NULL),(7,'部门管理',0,NULL,'2018-06-03 13:05:13',NULL,NULL,NULL,'2018-06-03 13:04:58',NULL,NULL,NULL,NULL),(8,'部门添加',7,'../sm/addDepartment','2018-06-07 15:35:57',NULL,NULL,NULL,'2018-06-03 13:05:03',NULL,NULL,NULL,NULL),(9,'部门查询',7,'../sm/departmentquery','2018-06-07 15:36:33',NULL,NULL,NULL,'2018-06-03 13:05:09',NULL,NULL,NULL,NULL),(10,'邮箱管理',0,NULL,'2018-06-04 09:01:14',NULL,NULL,NULL,'2018-06-04 09:01:14',NULL,NULL,NULL,NULL),(11,'发送邮件',10,'../sm/toMailSend','2018-06-04 09:38:26',NULL,NULL,NULL,'2018-06-04 09:01:27',NULL,NULL,NULL,NULL),(12,'邮件查询',10,'../sm/sendmailList','2018-06-04 09:37:32',NULL,NULL,NULL,'2018-06-04 09:01:47',NULL,NULL,NULL,NULL),(13,'权限管理',0,NULL,'2018-06-04 09:28:51',NULL,NULL,NULL,'2018-06-04 09:28:48',NULL,NULL,NULL,NULL),(14,'权限添加',13,'../sm/toAddPermission','2018-06-04 09:30:13',NULL,NULL,NULL,'2018-06-04 09:29:02',NULL,NULL,NULL,NULL),(15,'权限查询',13,'../sm/permissionList','2018-06-04 09:30:37',NULL,NULL,NULL,'2018-06-04 09:29:10',NULL,NULL,NULL,NULL),(16,'邮件新增',10,'../sm/toAddMail','2018-06-04 09:39:26',NULL,NULL,NULL,'2018-06-04 09:39:26',NULL,NULL,NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
