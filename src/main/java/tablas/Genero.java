package tablas;

public class Genero {

    private String nombre;
    private Long Id;

    public Genero(Long Id, String nombre) {
        this.nombre = nombre;
        this.Id = Id;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String toString() {
        return this.nombre;
    }

}
