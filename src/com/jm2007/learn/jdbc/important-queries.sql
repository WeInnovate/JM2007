CREATE TABLE JM2007_USER(ID NUMBER, NAME VARCHAR(200));
INSERT INTO JM2007_USER VALUES(1, 'Amit');
INSERT INTO JM2007_USER VALUES(2, 'Akshay');
SELECT * FROM JM2007_USER;
DELETE FROM JM2007_USER WHERE ID = 4;
UPDATE JM2007_USER SET NAME = 'Amit Robert' WHERE ID = 1;
DROP TABLE JM2007_USER3;

CREATE TABLE JM2007_MY_PROFILE (NAME VARCHAR, IMG BLOB);
SELECT * FROM JM2007_MY_PROFILE; 