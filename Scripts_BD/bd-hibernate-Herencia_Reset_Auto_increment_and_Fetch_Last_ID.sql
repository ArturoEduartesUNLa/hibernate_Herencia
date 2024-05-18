DELETE FROM `unla_test`.prestamo  c WHERE c.idCliente > 2;
DELETE FROM `unla_test`.cliente  c WHERE c.idCliente > 2;

/* reset counter of autoincremento to last inserted */ 
ALTER TABLE `unla_test`.cliente AUTO_INCREMENT = 0;

/* Deleted and again create AUTO-INCREMENT field
 
ALTER TABLE `unla_test`.cliente DROP idCliente;
ALTER TABLE `unla_test`.cliente 
ADD idCliente INT UNSIGNED NOT NULL AUTO_INCREMENT FIRST,
ADD PRIMARY KEY (idCliente);

*/

 # Line comment with "#" SELECT * FROM `unla_test`.cliente WHERE idCliente = LAST_INSERT_ID();

-- line comment with "-- " return last record inserted in table
/* Multiline comment with "/*" 
 * This is a Multiline comment
*/

/* return last record inserted in table */
/*SELECT * from `unla_test`.cliente ORDER BY idCliente DESC LIMIT 1;*/

