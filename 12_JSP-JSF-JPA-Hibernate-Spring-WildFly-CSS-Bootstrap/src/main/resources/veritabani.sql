CREATE DATABASE IF NOT EXISTS `huseyin_aydin_db`
				   DEFAULT CHARACTER SET utf8 ;

CREATE TABLE `huseyin_aydin_db`.`personel` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `adi` VARCHAR(45) NULL COMMENT '',
  `soyadi` VARCHAR(45) NULL COMMENT '',
  `cinsiyeti` VARCHAR(10) NULL COMMENT '',
  `eposta` VARCHAR(100) NULL COMMENT '',
  `numarasi` INT NULL COMMENT '',
  `parolasi` VARCHAR(100) NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '');
    
INSERT INTO `firmaveritabani`.`personel` 
(`adi`, `soyadi`, `cinsiyeti`, `eposta`, `numarasi`, `parolasi`) 
VALUES 
('Hüseyin', 'Aydın', '2', 'onetreetwobir@gmail.com', '2048', '111');

INSERT INTO `firmaveritabani`.`personel` 
(`adi`, `soyadi`,  `cinsiyeti`, `eposta`, `numarasi`, `parolasi`) 
VALUES 
('Hasan', 'Aydın', '2', 'onetreetwoiki@gmail.com', '101',  '222');

INSERT INTO `firmaveritabani`.`personel` 
(`adi`, `soyadi`,  `cinsiyeti`, `eposta`, `numarasi`, `parolasi`) 
VALUES 
('Boyacı', 'İbo', '2', 'onetreetwouc@gmail.com', '1326', '333');

SELECT * FROM `huseyin_aydin_db`.`personel`;