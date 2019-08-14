-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: quanlysinhvien
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `sinhvien`
--

DROP TABLE IF EXISTS `sinhvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `sinhvien` (
  `MaSV` char(10) NOT NULL,
  `HoTen` varchar(45) DEFAULT NULL,
  `GioiTinh` tinyint(4) DEFAULT NULL,
  `NgaySinh` datetime DEFAULT NULL,
  `DienThoai` varchar(45) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `SoCMT` varchar(45) DEFAULT NULL,
  `DiaChi` varchar(45) DEFAULT NULL,
  `MaKhoa` char(10) DEFAULT NULL,
  PRIMARY KEY (`MaSV`),
  KEY `FK_MaKhoa` (`MaKhoa`),
  CONSTRAINT `FK_MaKhoa` FOREIGN KEY (`MaKhoa`) REFERENCES `chuyenkhoa` (`MaKhoa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sinhvien`
--

LOCK TABLES `sinhvien` WRITE;
/*!40000 ALTER TABLE `sinhvien` DISABLE KEYS */;
INSERT INTO `sinhvien` VALUES ('11120455','Do Ha Chi',1,'1993-05-09 00:00:00','0918324727','chi.do@gmail.com','201540471','Ha Noi','CNTT'),('11123617','Tran Hong Linh',0,'1994-04-30 00:00:00','0777090484','linh.tran@gmail.com','205181310','Hai Duong','CNTT'),('11130543','Duong Minh Chinh',0,'1995-07-25 00:00:00','0905999801','chinh.duong@gmail.com','201568187','Ha Noi','TTUD'),('11133745','Le Thi Hoai Thu',1,'1995-06-26 00:00:00','0905386208','thu.le@gmail.com','240879025','Hoa Binh','KTD'),('11140636','Luu Thi Diem',1,'1996-01-23 00:00:00','0935225725','diem.luu@gmail.com','173009491','Nam Dinh','TDH');
/*!40000 ALTER TABLE `sinhvien` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-08-13 21:38:04
