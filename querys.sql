ALTER TABLE biblioteca.componenteprogramaticos ADD anio INT NOT NULL;

ALTER TABLE biblioteca.fichainscripcion CHANGE nacionalidad2 acuerdo_uso_imagen BOOL DEFAULT false NOT NULL;
ALTER TABLE biblioteca.fichainscripcion MODIFY COLUMN acuerdo_uso_imagen BOOL DEFAULT false NOT NULL;

ALTER TABLE biblioteca.fichainscripcion ADD fechainscripcion DATE NOT NULL;

ALTER TABLE biblioteca.fichainscripcion CHANGE fechainscripcion fecha_inscripcion date NOT NULL;

drop table biblioteca.devolucion;