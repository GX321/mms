/*
SQLyog Ultimate v12.5.0 (64 bit)
MySQL - 5.7.20-log : Database - mms
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

/*Table structure for table `sm_department` */

DROP TABLE IF EXISTS `sm_department`;

CREATE TABLE `sm_department` (
  `Department_id` int(2) NOT NULL AUTO_INCREMENT,
  `Department_name` varchar(10) NOT NULL,
  `Department_address` varchar(20) DEFAULT NULL,
  `Department_telephone` varchar(20) DEFAULT NULL,
  `Department_role` int(2) DEFAULT NULL,
  `Department_introduction` varchar(50) DEFAULT NULL,
  `Department_Superior` int(2) NOT NULL,
  `Department_createdId` int(2) DEFAULT NULL,
  `Department_createdTime` timestamp(6) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(6),
  `Department_updatedId` int(2) DEFAULT NULL,
  `Department_updatedTime` timestamp(6) NULL DEFAULT NULL,
  `Department_isvisible` int(2) DEFAULT '1',
  PRIMARY KEY (`Department_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `sm_department` */

insert  into `sm_department`(`Department_id`,`Department_name`,`Department_address`,`Department_telephone`,`Department_role`,`Department_introduction`,`Department_Superior`,`Department_createdId`,`Department_createdTime`,`Department_updatedId`,`Department_updatedTime`,`Department_isvisible`) values 
(1,'需求','1062','13260905323',1,NULL,1,1,'2018-05-15 09:40:50.056000',1,'2018-05-15 09:40:50.056000',1),
(2,'测试','1063','13260905233',1,NULL,1,2,'2018-05-08 10:39:20.000000',2,'2018-05-08 10:39:27.000000',1),
(3,'市场','1066','11111111111',1,NULL,1,2,'2018-05-15 09:40:50.056000',2,'2018-05-15 09:40:50.056000',1),
(4,'后勤','1072','13260905363',2,NULL,2,2,'2018-05-11 11:55:58.022299',2,'2018-05-09 10:27:20.000000',0),
(5,'测试','1750','132908053',2,NULL,2,2,'2018-05-15 09:42:41.033260',2,'2018-05-15 09:40:50.056000',0);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
