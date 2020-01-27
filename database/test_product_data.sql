-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: test
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `product_data`
--

DROP TABLE IF EXISTS `product_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_data` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(30) NOT NULL,
  `price` int(11) NOT NULL,
  `category` varchar(11) NOT NULL,
  `stock` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_data`
--

LOCK TABLES `product_data` WRITE;
/*!40000 ALTER TABLE `product_data` DISABLE KEYS */;
INSERT INTO `product_data` VALUES (1,'남녀공용슬립온',49600,'신발',40),(2,'넥스트라인맨투맨',23000,'상의',40),(3,'니즈데님일자팬츠',23000,'하의',40),(4,'달래꽃원피스',22000,'원피스',40),(5,'도트리본핀',14000,'악세서리',40),(6,'도트울삭스',7000,'악세서리',40),(7,'동글메리제인',36000,'신발',40),(8,'디스코파티맨투맨',21000,'상의',40),(9,'땡스투맨투맨',20500,'상의',40),(10,'러디원피스',22000,'원피스',40),(11,'체크벨트스커트',25000,'하의',40),(12,'레오기모후드집업',35000,'아우터',40),(13,'룬지기모코튼팬츠',32000,'하의',40),(14,'데님멜빵원피스',33000,'원피스',40),(15,'마크스웨이드부츠',55000,'신발',40),(16,'매일매일폴라티',15000,'상의',40),(17,'메르시목걸이',13000,'악세서리',40),(18,'모아쉬폰롱스커트',20000,'하의',40),(19,'미니꽃집게핀',14000,'악세서리',40),(20,'밀로가죽빵모자',23000,'악세서리',40),(21,'밀크푸딩맨투맨',25000,'상의',40),(22,'베스트체크원피스',29000,'원피스',40),(23,'보들보들기모후드',16000,'상의',40),(24,'보이스앵클부츠',37500,'신발',40),(25,'봉봉캔디헤어핀',10000,'악세서리',40),(26,'체크밴딩스커트',22000,'하의',40),(27,'뽀글이볼캡',23000,'악세서리',40),(28,'뽀글후리스집업',35000,'아우터',40),(29,'산타포켓양털자켓',42000,'아우터',40),(30,'세일러카라원피스',22000,'원피스',40),(31,'스테인니트베스트',21000,'아우터',40),(32,'심플모직자켓',53000,'아우터',40),(33,'아렌스체크원피스',30000,'원피스',40),(34,'아이돈노벙거지',19000,'악세서리',40),(35,'안나멜빵원피스',29500,'원피스',40),(36,'언제나롱패딩',49000,'아우터',40),(37,'에디기모코튼팬츠',32000,'하의',40),(38,'엘레나벨트원피스',20000,'원피스',40),(39,'와플한입원피스',20000,'원피스',40),(40,'웨이팅샌들',32000,'신발',40),(41,'융털레깅스',8000,'하의',40),(42,'제인오버핏니트',22000,'상의',40),(43,'젤리빈니트비니',14000,'악세서리',40),(44,'꽈배기가디건',33000,'아우터',40),(45,'클래식롱스커트',19000,'하의',40),(46,'터틀넥기모맨투맨',20000,'상의',40),(47,'텐드싱글코트',55000,'아우터',40),(48,'투밸트슬리퍼',28000,'신발',40),(49,'파워후리스후드티',15900,'상의',40),(50,'팽디니트벙거지',24000,'악세서리',40),(51,'페리밴딩울스커트',34000,'하의',40),(52,'펜디원피스(린넨)',27000,'원피스',40),(53,'포링브이넥가디건',32000,'아우터',40),(54,'폴레벨트셋스커트',23000,'하의',40),(55,'프롬유패딩조끼',32000,'아우터',40),(56,'피키스트랩샌들',22000,'신발',40),(57,'하이핏스니커즈',27000,'신발',40),(58,'하핑플랫슈즈',38000,'신발',40),(59,'햇살아래로퍼',32000,'신발',40),(60,'후리스벌룬맨투맨',23000,'상의',40);
/*!40000 ALTER TABLE `product_data` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-28  5:46:29
