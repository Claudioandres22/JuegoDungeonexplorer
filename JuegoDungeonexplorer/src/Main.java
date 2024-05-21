import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicialización del jugador y del controlador de niveles
        Personaje jugador = new Personaje();
        ControladorDeNiveles nivelController = new ControladorDeNiveles(jugador);

        // Solicitamos el nombre del jugador una vez al inicio del juego
        System.out.print("Ingresa el nombre del jugador: ");
        String nombre = scanner.nextLine();
        jugador.setNombreDelJugador(nombre);

        // Mostramos la introducción del juego
        mostrarIntroduccion();

        // Bucle principal del juego
        while (true) {
            // Mostramos la descripción de la habitación actual
            nivelController.mostrarDescripcionHabitacion();

            // Mostramos las opciones disponibles para el jugador
            mostrarOpciones();

            // Solicitamos la acción al jugador
            System.out.print("Ingrese su acción: ");
            String accion = scanner.nextLine();

            // Realizamos la acción seleccionada por el jugador
            switch (accion.toLowerCase()) {
                case "avanzar":
                    nivelController.avanzar();
                    break;
                case "retroceder":
                    nivelController.retroceder();
                    break;
                case "examinar":
                    nivelController.examinar();
                    break;
                case "buscar":
                    nivelController.buscar();
                    break;
                case "salir":
                    System.out.println("Gracias por jugar. ¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                case "help":
                    mostrarOpciones();
                    break;
                default:
                    System.out.println("Comando no reconocido. Escribe 'help' para ver las opciones disponibles.");
            }
        }
    }

    public static void mostrarIntroduccion() {
        // Mostrar la introducción del juego
        System.out.println("Te despiertas con la cabeza confundida y el corazón latiendo con fuerza\n" +
                "miras a tu alrededor \n" +
                "la oscuridad es asfixiante, apenas rota por la débil luz de la luna que se filtra por una ventana rota\n" +
                "Exploras la habitación con manos temblorosas. Encuentras una linterna en una esquina, su luz tenue parpadea débilmente. \n" +
                "Junto a ella, una nota arrugada y amarillenta yace en el suelo polvoriento. Con mano temblorosa, recoges ambos objetos y examinas la nota.");
        System.out.println("Para escapar de esta casa del terror, busca la llave del jardín escondida. \n" +
                "Pero ten cuidado, los pasillos están llenos de peligros y secretos. No todo lo que ves es lo que parece.");
    }

    public static void mostrarOpciones() {
        // Mostrar las opciones disponibles para el jugador
        System.out.println("Comandos disponibles:");
        System.out.println("avanzar - Avanzar a la siguiente habitación.");
        System.out.println("retroceder - Retroceder a la habitación anterior.");
        System.out.println("examinar - Examinar la habitación en busca de pistas.");
        System.out.println("buscar - Buscar objetos ocultos en la habitación.");
        System.out.println("salir - Salir del juego.");
    }
}
