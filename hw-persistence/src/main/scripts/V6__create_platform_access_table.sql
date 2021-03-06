CREATE TABLE KEY_FILE (
  ID          INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
  PROTOCOL    VARCHAR(256),
  PATH        VARCHAR(2048),
  DESCRIPTION VARCHAR(2048)
);


CREATE TABLE PLATFORM_ACCESS (
  ID          INT           NOT NULL PRIMARY KEY,
  PORT        INT           NOT NULL,
  USER_NAME   VARCHAR(256),
  PASSWORD    VARCHAR(2048),
  KEY_FILE_ID INT,
  FOREIGN KEY PLATFORM_ACCESS_PLATFORM_FK (ID) REFERENCES PLATFORM (ID)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  FOREIGN KEY PLATFORM_ACCESS_KEY_FILE_FK (KEY_FILE_ID) REFERENCES KEY_FILE (ID)
    ON DELETE SET NULL
    ON UPDATE CASCADE
);
