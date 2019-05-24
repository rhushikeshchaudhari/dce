
CREATE USER 'otheruser'@'%' IDENTIFIED BY 'pass1234';

GRANT SELECT ON DCE.* TO 'otheruser'@'%';

GRANT INSERT ON DCE.*TO 'otheruser'@'%';

GRANT DELETE ON DCE.*TO 'otheruser'@'%';

GRANT CREATE ON DCE.*TO 'otheruser'@'%';

GRANT UPDATE ON DCE.*TO 'otheruser'@'%';

GRANT ALTER ON DCE.*TO 'otheruser'@'%';

