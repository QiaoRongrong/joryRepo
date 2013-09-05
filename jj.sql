SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `eshop` DEFAULT CHARACTER SET utf8mb4 ;
USE `eshop` ;

-- -----------------------------------------------------
-- Table `eshop`.`User`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `eshop`.`User` (
  `id` INT NOT NULL ,
  `name` VARCHAR(45) NULL ,
  `gender` VARCHAR(45) NULL ,
  `phoneNum` VARCHAR(45) NULL ,
  `pwd` VARCHAR(45) NULL ,
  `email` VARCHAR(45) NULL ,
  `addr1` VARCHAR(45) NULL ,
  `addr2` VARCHAR(45) NULL ,
  `registerDate` DATE NULL ,
  `lastShoppingDate` DATE NULL ,
  `lastLoginDate` DATE NULL ,
  PRIMARY KEY (`id`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `eshop`.`production`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `eshop`.`production` (
  `id` INT NOT NULL ,
  `name` VARCHAR(45) NULL ,
  `desc` VARCHAR(45) NULL ,
  `priceByPiece` MEDIUMTEXT NULL ,
  `priceByWeight` MEDIUMTEXT NULL ,
  `priceByBox` MEDIUMTEXT NULL ,
  `picOne` BLOB NULL ,
  `picTwo` BLOB NULL ,
  `picThree` BLOB NULL ,
  `stock` TINYINT(1) NULL COMMENT ' /* comment truncated */ /*false: empty
true; not empty*/' ,
  PRIMARY KEY (`id`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `eshop`.`cart`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `eshop`.`cart` (
  `id` INT NOT NULL ,
  `amount` VARCHAR(45) NULL ,
  `price` MEDIUMTEXT NULL ,
  `carriageFee` MEDIUMTEXT NULL ,
  `totalPrice` MEDIUMTEXT NULL ,
  `goodsIds` VARCHAR(45) NULL ,
  PRIMARY KEY (`id`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `eshop`.`promotion`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `eshop`.`promotion` (
  `id` INT NOT NULL ,
  `name` VARCHAR(45) NULL ,
  `gift_num` INT NULL ,
  `conditions` VARCHAR(45) NULL ,
  `discountRate` FLOAT NULL ,
  `desc` VARCHAR(99) NULL ,
  PRIMARY KEY (`id`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `eshop`.`order`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `eshop`.`order` (
  `id` INT NOT NULL ,
  `produnctionIds` VARCHAR(45) NULL ,
  `amount` VARCHAR(45) NULL ,
  `status` TINYINT NULL COMMENT ' /* comment truncated */ /*0.unpaid
1.paid
2.delivered
3.receivced
4.finished*/' ,
  `phoneNum` VARCHAR(45) NULL ,
  `addr` VARCHAR(80) NULL ,
  `createDate` DATETIME NULL ,
  `deliveryDate` DATETIME NULL ,
  `reveiveDate` DATETIME NULL ,
  `carriageFee` VARCHAR(45) NULL ,
  `totalPrice` VARCHAR(45) NULL ,
  `operator` VARCHAR(45) NULL ,
  PRIMARY KEY (`id`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `eshop`.`gift`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `eshop`.`gift` (
  `id` INT NOT NULL ,
  `name` VARCHAR(45) NULL ,
  `pic` BLOB NULL ,
  `desc` VARCHAR(99) NULL ,
  PRIMARY KEY (`id`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `eshop`.`supplier`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `eshop`.`supplier` (
  `id` INT NOT NULL ,
  `name` VARCHAR(45) NULL ,
  `addr` VARCHAR(45) NULL ,
  `tel` VARCHAR(45) NULL ,
  `pic` BLOB NULL ,
  `review` VARCHAR(45) NULL ,
  `rating` TINYINT NULL ,
  PRIMARY KEY (`id`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `eshop`.`membership`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `eshop`.`membership` (
  `level` INT NOT NULL ,
  `discountRate` FLOAT NULL ,
  PRIMARY KEY (`level`) )
ENGINE = InnoDB;

USE `eshop` ;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
