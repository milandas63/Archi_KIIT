DROP DATABASE IF EXISTS record;
CREATE DATABASE IF NOT EXISTS record;
USE record;


# Location
SELECT 'LOCATION';
CREATE TABLE IF NOT EXISTS location(
                location_id      INT(6)          NOT NULL AUTO_INCREMENT,
                location_desc    VARCHAR(30)     NOT NULL UNIQUE,
                location_abbr    VARCHAR(10),
                PRIMARY KEY(location_id)
);
INSERT INTO location VALUES
      (1, 'Cuttack', 'CTC'),
      (2, 'Bhubaneswar', 'BBSR'),
      (3, 'Berhampur', 'BAM'),
      (4, 'Jeypore', 'JEY'),
      (5, 'Rourkela', 'RKL');
                

# Relationship
SELECT 'RELATIONSHIP';
CREATE TABLE IF NOT EXISTS relation (
    relation_id          INT(6)      NOT NULL AUTO_INCREMENT,
    relation_desc        VARCHAR(30) NOT NULL UNIQUE,
    PRIMARY KEY (relation_id)
);
INSERT INTO relation VALUES
       (1, 'Sibling'),
       (2, 'Cousin'),
       (3, 'School Friend');


# Contact table
SELECT 'CONTACT';
CREATE TABLE IF NOT EXISTS contact (
                slno        INT(6)          NOT NULL AUTO_INCREMENT,
                name        VARCHAR(30)     NOT NULL UNIQUE,
                gender      ENUM('F','M')   NOT NULL,
                dob         DATE            DEFAULT NULL,
                email_id    VARCHAR(30),
                mobile_no   VARCHAR(12),
                location_id INT(6)          NOT NULL REFERENCES location(location_id),
		relation_id INT(6)          NOT NULL REFERENCES relation(relation_id),
                PRIMARY KEY(slno)
            );

INSERT INTO contact(name,gender,dob,email_id,mobile_no,location_id, relation_id) VALUES
                ('Alice', 'F', '2007-11-25', 'alice04@gmail.com', '7978665518', 1, 1),
                ('Akash', 'M', '2007-10-20', 'akash01@gmail.com', '7978556610', 2, 2),
                ('Amoha', 'F', '2007-11-8', 'amoha05@gmail.com', '7978665519',  3, 3),
                ('Liya', 'F', '2007-10-25', 'liya09@gmail.com', '7978665518',   2, 1),
                ('Danish', 'M', '2007-9-25', 'danish01gmail.com', '7978665518', 4, 1 ),
                ('Lucky', 'M', '2007-6-25', 'lucky09@gmail.com', '7978776610',  5, 2);


SELECT c.slno,c.name,c.gender,c.dob,c.mobile_no,l.location_desc,r.relation_desc FROM contact AS c
LEFT JOIN location AS l ON c.location_id=l.location_id
LEFT JOIN relation AS r ON c.relation_id=r.relation_id;


