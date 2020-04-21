ALTER TABLE biblioteca.prestamo ADD fechadevolucion DATE NOT NULL;

ALTER TABLE biblioteca.prestamo MODIFY COLUMN fechasolicitud DATE NOT NULL;

ALTER TABLE biblioteca.prestamo CHANGE idlibros idlibros int NOT NULL AFTER idprestamo;
ALTER TABLE biblioteca.prestamo CHANGE idSolicitantes idSolicitantes int NOT NULL AFTER idlibros;
ALTER TABLE biblioteca.prestamo CHANGE fechadevolucion fechadevolucion date NOT NULL AFTER fechasolicitud;
