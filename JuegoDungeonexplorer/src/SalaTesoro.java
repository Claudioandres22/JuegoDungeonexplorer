import java.util.Random;

public class SalaTesoro extends Room {
    private GameObject objeto;

    public SalaTesoro(GameObject objeto) {
        this.objeto = objeto;
    }

    public void setObjeto(GameObject objeto) {
        this.objeto = objeto;
    }

    @Override
    public void examinar() {
        Random rand = new Random();
        int chance = rand.nextInt(2); // Genera un número aleatorio entre 0 y 1

        if (chance == 0) {
            System.out.println("No has encontrado nada de valor en la sala.");
        } else {
            System.out.println("¡Has encontrado un tesoro escondido en la sala!");
        }
    }

    @Override
    public void buscar() {
        System.out.println("Buscando en la sala de tesoro...");
        // Implementa la lógica de búsqueda si es necesario
    }

    @Override
    public void descripcionSala() {
        System.out.println("Estás en una sala con un tesoro.");
        if (objeto != null) {
            System.out.println("Hay un objeto aquí: " + objeto.getDescripcionObjeto());
        } else {
            System.out.println("No hay ningún objeto en esta sala.");
        }
    }

    @Override
    public String getSalida() {
        return "";
    }
}
