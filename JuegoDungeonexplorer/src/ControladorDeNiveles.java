import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ControladorDeNiveles {
    private boolean keyIsUsed = false;
    private String index = "1.0"; // Comienza en la Sala Vacía
    private final Map<String, Room> niveles = new HashMap<>();
    private Room roomActual;
    private Scanner sc = new Scanner(System.in);
    private Personaje jugador;

    public ControladorDeNiveles(Personaje jugador) {
        this.jugador = jugador;
        initGame();
    }

    public void initGame() {
        niveles.put("0.0", new SalaTesoro(new Llave("Llave", "Una llave dorada un poco oxidada")));
        niveles.put("1.0", new SalaVacia());
        niveles.put("2.0", new SalaEnemigo("Mayordomo"));
        niveles.put("3.0", new SalaVacia());
        niveles.put("2.1", new SalaTesoro(new Vela("Vela", "Una vela antigua que parece estar encantada")));
        niveles.put("2.2", new SalaEnemigo("Bestia misteriosa"));
        niveles.put("3.1", new SalaTesoro(new AguaBendita("Agua Bendita", "Un frasco de agua bendita")));
        niveles.put("3.2", new SalaEnemigo("Guardián"));
        niveles.put("4.0", new SalaVacia());
        niveles.put("5.0", new SalaEnemigo("Espectro"));
        niveles.put("6.0", new SalaVacia());
        niveles.put("6.1", new SalaEnemigo("Ente oscuro"));
        niveles.put("6.2", new SalaVacia());

        roomActual = niveles.get(index);
    }

    public void examinar() {
        System.out.println("¿Qué ves en la habitación?");
        roomActual.examinar();
    }

    public void avanzar() {
        if (roomActual.getSalida() != null) {
            index = roomActual.getSalida();
            roomActual = niveles.get(index);
        } else {
            System.out.println("No puedes avanzar desde aquí.");
        }
    }

    public void retroceder() {
        if (roomActual.getRetroceso() != null) {
            index = roomActual.getRetroceso();
            roomActual = niveles.get(index);
        } else {
            System.out.println("No puedes retroceder desde aquí.");
        }
    }

    public void mostrarDescripcionHabitacion() {
        System.out.println("Descripción de la habitación actual:");
        roomActual.descripcionSala();
    }

    public void buscar() {
        System.out.println("Estás buscando en la habitación...");
        roomActual.buscar();
    }
}
