
CREATE TABLE USER(
  USER_ID VARCHAR(36) PRIMARY KEY,
  FIRST_NAME VARCHAR(20),
  LAST_NAME VARCHAR(20),
  USERNAME VARCHAR(100) NOT NULL,
  PASSWORD VARCHAR(20) NOT NULL,
  EMAIL VARCHAR(100) NOT NULL
);
