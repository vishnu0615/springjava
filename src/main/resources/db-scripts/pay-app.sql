DROP DATABASE IF EXISTS `pay_app`;
CREATE DATABASE IF NOT EXISTS `pay_app`;
use pay_app;

DROP TABLE IF EXISTS `CUSTOMER`;
create table `CUSTOMER`
(
CUSTOMER_ID bigint(20) NOT NULL AUTO_INCREMENT,
CUSTOMER_NAME varchar(50) NULL,
ADDRESS varchar(50) NULL,
MOBILE_NUMBER varchar(50) NULL,
EMAIL varchar(50) NULL,
PASS varchar(50) NULL,
PRIMARY KEY (`CUSTOMER_ID`),
UNIQUE KEY `CUSTOMER_ID_PK` (`CUSTOMER_ID`)
) ;
commit;