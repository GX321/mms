/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.17-log : Database - mms
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

/*Table structure for table `sm_permission` */

DROP TABLE IF EXISTS `sm_permission`;

CREATE TABLE `sm_permission` (
  `permission_id` int(11) NOT NULL AUTO_INCREMENT,
  `permission_name` varchar(40) NOT NULL,
  `permission_comment` varchar(100) NOT NULL,
  `permission_created_datetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `permission_created_name` varchar(40) NOT NULL,
  `permission_updated_datetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `permission_updated_name` varchar(40) NOT NULL,
  `permission_isvisible` int(11) DEFAULT NULL,
  `permission_default` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`permission_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `sm_permission` */

insert  into `sm_permission`(`permission_id`,`permission_name`,`permission_comment`,`permission_created_datetime`,`permission_created_name`,`permission_updated_datetime`,`permission_updated_name`,`permission_isvisible`,`permission_default`) values (1,'新增','增加查询操作','2018-06-01 10:24:19','harley.gu','2018-06-01 10:24:19','gu',NULL,NULL),(2,'select','123','2018-05-30 09:28:51','11','2018-05-30 09:28:51','1',NULL,NULL),(3,'12','12345','2018-05-31 10:51:38','123','2018-05-31 10:51:38','1234',NULL,NULL),(4,'select7','12456','2018-05-31 10:51:24','111','2018-05-31 10:51:24','12',NULL,NULL),(8,'77777','7777','2018-05-30 09:31:13','777777','2018-05-30 09:31:13','7777',NULL,NULL),(9,'菜单查询','2222','2018-05-30 11:20:54','gu','2018-05-30 11:20:54','gu',NULL,NULL),(10,'111','111','2018-05-31 10:43:10','11','2018-05-31 10:43:10','11',NULL,NULL),(11,'账户查询','查询账户信息','2018-06-01 10:23:33','harley.gu','2018-06-01 10:23:33','harley.gu',NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
