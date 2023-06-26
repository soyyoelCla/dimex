/*
SQLyog Community v13.0.1 (64 bit)
MySQL - 10.3.11-MariaDB : Database - dimex
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`dimex` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

USE `dimex`;

/*Table structure for table `tc_cemex_clientes` */

DROP TABLE IF EXISTS `tc_cemex_clientes`;

CREATE TABLE `tc_cemex_clientes` (
  `id_dimex_cliente` bigint(20) NOT NULL AUTO_INCREMENT,
  `apellido_materno` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `apellido_paterno` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `id_dimex_promotor` bigint(20) DEFAULT NULL,
  `nombre` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id_dimex_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `tc_cemex_clientes` */

/*Table structure for table `tc_dimex_clientes` */

DROP TABLE IF EXISTS `tc_dimex_clientes`;

CREATE TABLE `tc_dimex_clientes` (
  `id_dimex_cliente` bigint(20) unsigned NOT NULL,
  `id_dimex_promotor` bigint(11) unsigned NOT NULL,
  `nombre` varchar(50) COLLATE latin1_bin NOT NULL,
  `apellido_paterno` varchar(100) COLLATE latin1_bin NOT NULL,
  `apellido_materno` varchar(100) COLLATE latin1_bin DEFAULT NULL,
  `registro` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id_dimex_cliente`),
  KEY `FK_tc_dimex_clientes` (`id_dimex_promotor`),
  CONSTRAINT `FK_tc_dimex_clientes` FOREIGN KEY (`id_dimex_promotor`) REFERENCES `tc_dimex_promotores` (`id_dimex_promotor`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_bin;

/*Data for the table `tc_dimex_clientes` */

/*Table structure for table `tc_dimex_promotores` */

DROP TABLE IF EXISTS `tc_dimex_promotores`;

CREATE TABLE `tc_dimex_promotores` (
  `id_dimex_promotor` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `promotor` varchar(20) COLLATE latin1_bin NOT NULL,
  `empresa` varchar(20) COLLATE latin1_bin NOT NULL,
  `registro` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id_dimex_promotor`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1 COLLATE=latin1_bin;

/*Data for the table `tc_dimex_promotores` */

insert  into `tc_dimex_promotores`(`id_dimex_promotor`,`promotor`,`empresa`,`registro`) values 
(1,'ABCD12345','ABC','2023-06-25 14:35:41');

/*Table structure for table `tc_dimex_tipo_solicitudes` */

DROP TABLE IF EXISTS `tc_dimex_tipo_solicitudes`;

CREATE TABLE `tc_dimex_tipo_solicitudes` (
  `id_dimex_tipo_solicitud` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(100) COLLATE latin1_bin NOT NULL,
  PRIMARY KEY (`id_dimex_tipo_solicitud`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1 COLLATE=latin1_bin;

/*Data for the table `tc_dimex_tipo_solicitudes` */

insert  into `tc_dimex_tipo_solicitudes`(`id_dimex_tipo_solicitud`,`descripcion`) values 
(1,'Crédito nuevo');

/*Table structure for table `tr_dimex_creditos` */

DROP TABLE IF EXISTS `tr_dimex_creditos`;

CREATE TABLE `tr_dimex_creditos` (
  `id_dimex_credito` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `id_dimex_solicitud` bigint(11) NOT NULL,
  `capital_dispersado` decimal(10,2) DEFAULT NULL,
  `monto` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id_dimex_credito`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_bin;

/*Data for the table `tr_dimex_creditos` */

/*Table structure for table `tr_dimex_solicitudes` */

DROP TABLE IF EXISTS `tr_dimex_solicitudes`;

CREATE TABLE `tr_dimex_solicitudes` (
  `id_dimex_solicitud` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `id_dimex_cliente` bigint(11) NOT NULL,
  `monto` double DEFAULT NULL,
  `producto` varchar(255) COLLATE latin1_bin DEFAULT NULL,
  `id_dimex_tipo_solicitud` bigint(11) NOT NULL,
  `tasa` double DEFAULT NULL,
  `plazo` int(11) DEFAULT NULL,
  `frecuencia` varchar(255) COLLATE latin1_bin DEFAULT NULL,
  `fecha_solicitud` varchar(8) COLLATE latin1_bin DEFAULT NULL,
  `fecha_solitud` varchar(255) COLLATE latin1_bin DEFAULT NULL,
  PRIMARY KEY (`id_dimex_solicitud`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_bin;

/*Data for the table `tr_dimex_solicitudes` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
