CREATE TABLE `indragt2`.`department` (
  `department_id` INT NOT NULL,
  `location_id` INT NOT NULL,
  PRIMARY KEY (`department_id`, `location_id`));

INSERT INTO `indragt2`.`department` (`department_id`, `location_id`) VALUES ('90', '1400');
INSERT INTO `indragt2`.`department` (`department_id`, `location_id`) VALUES ('60', '1500');
INSERT INTO `indragt2`.`department` (`department_id`, `location_id`) VALUES ('50', '1700');
INSERT INTO `indragt2`.`department` (`department_id`, `location_id`) VALUES ('80', '1800');
INSERT INTO `indragt2`.`department` (`department_id`, `location_id`) VALUES ('10', '2500');
INSERT INTO `indragt2`.`department` (`department_id`, `location_id`) VALUES ('20', '1400');
INSERT INTO `indragt2`.`department` (`department_id`, `location_id`) VALUES ('110', '1700');

