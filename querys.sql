INSERT INTO biblioteca.cargo (nombrecargo) VALUES ('ADMIN'),('USER');

INSERT INTO biblioteca.usuario (nombre,contacto,contraseña,Rutusuario,cargo_idcargo) VALUES 
('sofi','soofi.011@gmail.com','682fda8e3d6b49f01395fb78061929ff','191290526',1),
('user','soofi.011@gmail.com','682fda8e3d6b49f01395fb78061929ff','191290526',2);

ALTER TABLE biblioteca.fichainscripcion ADD fecha_nacimiento DATE NOT NULL;
