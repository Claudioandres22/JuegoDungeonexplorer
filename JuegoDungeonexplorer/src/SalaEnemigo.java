public class SalaEnemigo extends Room {
    private String enemigo;

    public SalaEnemigo(String enemigo) {
        this.enemigo = enemigo;
    }

    @Override
    public void examinar() {
        System.out.println("No puedes examinar la habitación mientras estás en peligro.");
    }

    @Override
    public void buscar() {
        System.out.println("Estás buscando en la sala, pero hay un " + enemigo + " aquí.");
        // Implementa la lógica de búsqueda si es necesario
    }

    @Override
    public void descripcionSala() {
        System.out.println("¡Cuidado! Hay un " + enemigo + " en esta sala.");
    }

    @Override
    public String getSalida() {
        return "";
    }
}
