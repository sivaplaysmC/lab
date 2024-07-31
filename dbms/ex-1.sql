CREATE TABLE MY_EMPLOYEE(
  ID NUMBER(4) NOT NULL,
  last_name VARCHAR(25),
  first_name VARCHAR(25),
  UserId VARCHAR(25),
  salary NUMBER(9,2)
);

INSERT INTO MY_EMPLOYEE  VALUES ( 1, 'Patel', 'Ralph', 'rpatel', 895 );
INSERT INTO MY_EMPLOYEE  VALUES ( 2, 'Dancs', 'Betty', 'bdancs', 860 );

SELECT * FROM MY_EMPLOYEE;

INSERT INTO MY_EMPLOYEE  VALUES ( 3, 'Biri', 'Ben', NULL, 1100 );
INSERT INTO MY_EMPLOYEE  VALUES ( 4, 'Newman', 'Chad', NULL, 750 );

UPDATE MY_EMPLOYEE SET UserId = CONCAT(LOWER(SUBSTR(first_name, 1, 1)), LOWER(SUBSTR(last_name, 1, 7)));

DELETE FROM MY_EMPLOYEE WHERE ID = 2;

UPDATE MY_EMPLOYEE SET last_name = '', first_name = '' ,UserID='' ,salary=0 where ID = 4;

COMMIT;

UPDATE MY_EMPLOYEE SET last_name = 'Drexler' where ID = 3;

UPDATE MY_EMPLOYEE SET salary = 1000 where salary < 900;


