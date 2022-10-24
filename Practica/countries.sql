CREATE TABLE `indragt2`.`countries` (
  `COUNTRY_ID` VARCHAR(2) NOT NULL,
  `COUNTRY_NAME` VARCHAR(45) NULL,
  `REGION_ID` INT NULL,
  PRIMARY KEY (`COUNTRY_ID`));

INSERT INTO `indragt2`.`countries` (`COUNTRY_ID`, `COUNTRY_NAME`, `REGION_ID`) VALUES ('CA', 'Canada', '2');
INSERT INTO `indragt2`.`countries` (`COUNTRY_ID`, `COUNTRY_NAME`, `REGION_ID`) VALUES ('DE', 'Germany', '1');
INSERT INTO `indragt2`.`countries` (`COUNTRY_ID`, `COUNTRY_NAME`, `REGION_ID`) VALUES ('UK', 'United Kingdom', '1');
INSERT INTO `indragt2`.`countries` (`COUNTRY_ID`, `COUNTRY_NAME`, `REGION_ID`) VALUES ('US', 'United States', '2');
INSERT INTO `indragt2`.`countries` (`COUNTRY_ID`, `COUNTRY_NAME`, `REGION_ID`) VALUES ('AR', 'Argentina', '3');
