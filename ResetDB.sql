-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
-- -----------------------------------------------------
-- Schema LegoDB
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema LegoDB
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `LegoDB` DEFAULT CHARACTER SET latin1 ;
USE `LegoDB` ;

-- -----------------------------------------------------
-- Table `LegoDB`.`user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `LegoDB`.`user`;
DROP TABLE IF EXISTS `LegoDB`.`UsersTest`;
CREATE TABLE IF NOT EXISTS `LegoDB`.`user` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(90) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 19
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `mydb`.`Order`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `LegoDB`.`Order`;
DROP TABLE IF EXISTS `LegoDB`.`OrderDetails`;

CREATE TABLE IF NOT EXISTS `LegoDB`.`Order` (
  `OrderID` INT NOT NULL,
  `Height` INT NOT NULL,
  `Length X` INT NOT NULL,
  `Length Y` INT NOT NULL,
  `noBricks` INT NOT NULL,
  `TotalPrice` INT NOT NULL,
  `Status` ENUM('finished', 'unfinished') NOT NULL,
  `Created` DATETIME NOT NULL,
  `user_id` INT(11) NOT NULL,
  PRIMARY KEY (`OrderID`, `user_id`),
  INDEX `fk_Order_user_idx` (`user_id` ASC),
  CONSTRAINT `fk_Order_user`
    FOREIGN KEY (`user_id`)
    REFERENCES `LegoDB`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

USE `LegoDB` ;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
