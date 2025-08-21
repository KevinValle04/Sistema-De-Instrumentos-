import java.util.ArrayList;

public class Sistema {
    private ArrayList<Instrumento> instrumentos;

    public Sistema() {
        instrumentos = new ArrayList<>();
    }

    // Agregar instrumento
    public void agregarInstrumento(Instrumento i) {
        instrumentos.add(i);
    }

    // Eliminar por clave
    public void eliminarInstrumento(String clave) {
        instrumentos.removeIf(i -> i.getClave().equals(clave));
    }

    // Mostrar todos los instrumentos
    public void mostrarInstrumentos() {
        if (instrumentos.isEmpty()) {
            System.out.println("No hay instrumentos registrados.");
        } else {
            for (Instrumento i : instrumentos) {
                System.out.println(i);
            }
        }
    }
}
