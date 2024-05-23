public class SalaVacia extends Room {
    @Override
    public void examinar() {
        System.out.println("No has encontrado nada en la sala vacía.");
    }

    @Override
    public void buscar() {
        System.out.println("Buscando en la sala vacía...");
        // Implementa la lógica de búsqueda si es necesario
    }

    @Override
    public void descripcionSala() {
        System.out.println("Estás en una sala vacía. No parece haber nada interesante aquí.");
    }

    @Override
    public String getSalida() {
        return "";
    }
}

