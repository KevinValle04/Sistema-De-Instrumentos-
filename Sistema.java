import java.util.ArrayList;

public class Sistema {
    private ArrayList<Instrumento> instrumentos;

    public Sistema() {
        instrumentos = new ArrayList<>();
    }

    public void agregarInstrumento(Instrumento i) {
        instrumentos.add(i);
    }

    public void eliminarInstrumento(String clave) {
        instrumentos.removeIf(i -> i.getClave().equals(clave));
    }

    public String mostrarInstrumentos() {
        if (instrumentos.isEmpty()) {
            return "No hay instrumentos registrados.";
        }
        StringBuilder sb = new StringBuilder();
        for (Instrumento i : instrumentos) {
            sb.append(i).append("\n");
        }
        return sb.toString();
    }
}

