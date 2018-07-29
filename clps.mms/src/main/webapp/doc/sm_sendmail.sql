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

/*Table structure for table `sm_sendmail` */

DROP TABLE IF EXISTS `sm_sendmail`;

CREATE TABLE `sm_sendmail` (
  `email_id` int(11) NOT NULL AUTO_INCREMENT,
  `email_subject` varchar(50) DEFAULT NULL,
  `email_recipient` varchar(50) NOT NULL,
  `email_addresser` varchar(50) NOT NULL,
  `email_letter` text NOT NULL,
  `email_sendtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `email_status` tinyint(1) NOT NULL,
  `email_default1` varchar(30) DEFAULT NULL,
  `email_default2` varchar(30) DEFAULT NULL,
  `email_is_visable` tinyint(1) NOT NULL,
  PRIMARY KEY (`email_id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

/*Data for the table `sm_sendmail` */

insert  into `sm_sendmail`(`email_id`,`email_subject`,`email_recipient`,`email_addresser`,`email_letter`,`email_sendtime`,`email_status`,`email_default1`,`email_default2`,`email_is_visable`) values (1,'xxxxx','wq','dd','qwertyuiop','2018-06-04 14:18:11',1,NULL,NULL,1),(2,'love','djx','dd',' i love you','2018-06-04 13:29:02',1,'','',1),(3,'hate','syy','dd',' i very hate you','2018-06-04 13:29:03',1,'','',1),(4,'aaaaa','aa','dd','aaaaaaa','2018-06-04 13:29:04',1,NULL,NULL,1),(5,'bbbbbb','bb','dd','bbbbbbbbbbbbb','2018-06-04 13:29:05',1,NULL,NULL,1),(10,'qqqq','qqq','dd','qqqqqqqqqq','2018-06-04 13:29:10',1,NULL,NULL,1),(15,'1','1','1','2','2018-06-04 14:14:21',1,NULL,NULL,0),(17,'4','4','5','444444','2018-06-04 14:21:49',1,NULL,NULL,1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
