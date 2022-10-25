ALTER TABLE `indragt2`.`department` 
ADD COLUMN `department_name` VARCHAR(45) NULL AFTER `location_id`, RENAME TO  `indragt2`.`departments` ;
ALTER TABLE `indragt2`.`departments` 
ADD COLUMN `manager_id` INT NULL AFTER `department_name`,
CHANGE COLUMN `department_name` `department_name` VARCHAR(45) NULL ;

UPDATE `indragt2`.`departments` SET `department_name` = 'Administration', `manager_id` = '200' WHERE (`department_id` = '10') and (`location_id` = '2500');
UPDATE `indragt2`.`departments` SET `department_name` = 'Marketing', `manager_id` = '201' WHERE (`department_id` = '20') and (`location_id` = '1400');
UPDATE `indragt2`.`departments` SET `department_name` = 'Shipping', `manager_id` = '124' WHERE (`department_id` = '50') and (`location_id` = '1700');
UPDATE `indragt2`.`departments` SET `department_name` = 'IT', `manager_id` = '103' WHERE (`department_id` = '60') and (`location_id` = '1500');
UPDATE `indragt2`.`departments` SET `department_name` = 'Sales', `manager_id` = '149' WHERE (`department_id` = '80') and (`location_id` = '1800');
UPDATE `indragt2`.`departments` SET `department_name` = 'Executive', `manager_id` = '100' WHERE (`department_id` = '90') and (`location_id` = '1400');
UPDATE `indragt2`.`departments` SET `department_name` = 'Accounting', `manager_id` = '205' WHERE (`department_id` = '110') and (`location_id` = '1700');
INSERT INTO `indragt2`.`departments` (`department_id`, `location_id`, `department_name`) VALUES ('190', '1700', 'Contracting');

ALTER TABLE `indragt2`.`departments` 
ADD INDEX `fk_locations_idx` (`location_id` ASC) VISIBLE;
;
ALTER TABLE `indragt2`.`departments` 
ADD CONSTRAINT `fk_locations`
  FOREIGN KEY (`location_id`)
  REFERENCES `indragt2`.`locations` (`LOCATION_ID`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;