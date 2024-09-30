-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: vnb
-- ------------------------------------------------------
-- Server version	8.0.23
use vnb;
/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `chief`
--

DROP TABLE IF EXISTS `chief`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chief` (
  `Name` varchar(100) DEFAULT NULL,
  `Password` varchar(100) DEFAULT NULL,
  `Designation` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chief`
--

LOCK TABLES `chief` WRITE;
/*!40000 ALTER TABLE `chief` DISABLE KEYS */;
INSERT INTO `chief` VALUES ('Mr. Ali Akbar','ali','Chairman'),('Abhinay','abhi','CEO');
/*!40000 ALTER TABLE `chief` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `facoff`
--

DROP TABLE IF EXISTS `facoff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `facoff` (
  `Name` varchar(100) DEFAULT NULL,
  `Password` varchar(100) DEFAULT NULL,
  `Designation` varchar(100) DEFAULT NULL,
  `Type` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `facoff`
--

LOCK TABLES `facoff` WRITE;
/*!40000 ALTER TABLE `facoff` DISABLE KEYS */;
INSERT INTO `facoff` VALUES ('Mr. Borhan','borhan','Teacher','Faculty'),('Mr. Karim','karim','Lab Assistant','Faculty'),('Mr. Khan','khan','Cashier','Official'),('Mr. Rahim','rahim','Librarian','Official');
/*!40000 ALTER TABLE `facoff` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notice`
--

DROP TABLE IF EXISTS `notice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `notice` (
  `Name` varchar(100) DEFAULT NULL,
  `YearBatch` varchar(100) DEFAULT NULL,
  `Notice` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notice`
--

LOCK TABLES `notice` WRITE;
/*!40000 ALTER TABLE `notice` DISABLE KEYS */;
INSERT INTO `notice` VALUES ('Mr. Borhan','Year: 2     Batch: 14','Give Assignment'),('Mr. Karim','Year: 1     Batch: 12','Lab Close'),('Mr. Khan','Year: 1     Batch: 12','Clear All Payment'),('Mr. Khan','Year: 2     Batch: 15','Notice Not Available'),('Mr. Rahim','Year: 1     Batch: 12','Notice Not Available'),('Mr. Borhan','Year: 1     Batch: 12','Give Project'),('Mr. Karim','Year: 3     Batch: 12','Class on Oracle'),('Mr. Rahim','Year: 3     Batch: 12','Return All Books'),('Mr. Ali Akbar','Year: 1     Batch: 12','Meet with me'),('Mr. Ali Akbar','Year: 3     Batch: 8','Submit your thesis paper'),('Mr. Ali Akbar','Year: 2     Batch: 12','Give me your report'),('Mr. Ali Akbar','Year: 1     Batch: 19','Notice Not Available');
/*!40000 ALTER TABLE `notice` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-07-11 20:09:05
