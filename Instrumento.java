public class Instrumento {
    private String clave;
    private String nombre;
    private String tipo;       // identificar o manejar
    private String condicion;  // ansiedad o estrés
    private String autor;

    // Constructor sencillo
    public Instrumento(String clave, String nombre, String tipo, String condicion, String autor) {
        this.clave = clave;
        this.nombre = nombre;
        this.tipo = tipo;
        this.condicion = condicion;
        this.autor = autor;
    }

    public String getClave() {
        return clave;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return clave + " | " + nombre + " | " + tipo + " | " + condicion + " | " + autor;
    }
}
