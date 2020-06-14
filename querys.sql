ALTER TABLE biblioteca.componenteprogramaticos ADD anio INT NOT NULL;

ALTER TABLE biblioteca.fichainscripcion CHANGE nacionalidad2 acuerdo_uso_imagen BOOL DEFAULT false NOT NULL;
ALTER TABLE biblioteca.fichainscripcion MODIFY COLUMN acuerdo_uso_imagen BOOL DEFAULT false NOT NULL;

ALTER TABLE biblioteca.fichainscripcion ADD fechainscripcion DATE NOT NULL;

ALTER TABLE biblioteca.fichainscripcion CHANGE fechainscripcion fecha_inscripcion date NOT NULL;

drop table biblioteca.devolucion;


-- biblioteca.ficha_laboratorio definition

CREATE TABLE `ficha_laboratorio` (
  `ficha_laboratorio_id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_inscrito` varchar(55) NOT NULL,
  `rut_inscrito` varchar(55) NOT NULL,
  `direccion_inscrito` varchar(70) NOT NULL,
  `telefono_inscrito` varchar(20) NOT NULL,
  `email_inscrito` varchar(55) DEFAULT NULL,
  `id_laboratorio` int(11) NOT NULL,
  `tieneficha` tinyint(1) DEFAULT NULL,
  `fecha_inscripionlab` varchar(55) DEFAULT NULL,
  PRIMARY KEY (`ficha_laboratorio_id`),
  KEY `id_laboratorio` (`id_laboratorio`),
  CONSTRAINT `ficha_laboratorio_ibfk_1` FOREIGN KEY (`id_laboratorio`) REFERENCES `componenteprogramaticos` (`idComponenteprogramaticos`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

SET lc_time_names = 'es_ES';