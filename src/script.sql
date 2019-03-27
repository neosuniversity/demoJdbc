create database inventory;

CREATE TABLE inventory.`proveedor` (
  `id` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `direccion` varchar(300) NOT NULL,
  `telefono` varchar(50) DEFAULT NULL,
   `email` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB;