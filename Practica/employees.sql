CREATE TABLE `indragt2`.`employees` (
  `EMPLOYEE_ID` INT NOT NULL,
  `FIRST_NAME` VARCHAR(45) NULL,
  `LAST_NAME` VARCHAR(45) NOT NULL,
  `EMAIL` VARCHAR(45) NOT NULL,
  `PHONE_INT` VARCHAR(45) NULL,
  `HIRE_DATE` DATE NULL,
  `JOB_ID` VARCHAR(45) NOT NULL,
  `SALARY` INT NULL,
  `COMMISSION_PCT` INT NULL,
  `MANAGER_ID` INT NULL,
  `DEPARTMENT_ID` INT NULL,
  `BONUS` VARCHAR(45) NULL,
  PRIMARY KEY (`EMPLOYEE_ID`),
  UNIQUE INDEX `EMAIL_UNIQUE` (`EMAIL` ASC) VISIBLE);