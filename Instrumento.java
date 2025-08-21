public class Instrumento {
    private String clave;
    private String nombre;
    private String tipo;
    private String condicion;
    private String autor;

    public Instrumento(String clave, String nombre, String tipo, String condicion, String autor) {
        this.clave = clave;
        this.nombre = nombre;
        this.tipo = tipo;
        this.condicion = condicion;
        this.autor = autor;
    }

    public String getClave() { return clave; }

    @Override
    public String toString() {
        return clave + " | " + nombre + " | " + tipo + " | " + condicion + " | " + autor;
    }
}
