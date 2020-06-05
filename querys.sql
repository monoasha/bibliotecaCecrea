ALTER TABLE biblioteca.componenteprogramaticos ADD anio INT NOT NULL;

ALTER TABLE biblioteca.fichainscripcion CHANGE nacionalidad2 acuerdo_uso_imagen BOOL DEFAULT false NOT NULL;
ALTER TABLE biblioteca.fichainscripcion MODIFY COLUMN acuerdo_uso_imagen BOOL DEFAULT false NOT NULL;
