
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Personaje jugador = new Personaje();
        ControladorDeNiveles nivelController = new ControladorDeNiveles();

        System.out.print("Ingresa el nombre del jugador: ");
        String nombre = scanner.nextLine();
        jugador.setNombreDelJugador(nombre);


        System.out.println("Escribe '!help' para ver opciones:");
        System.out.println("Te despiertas con la cabeza confundida y el corazón latiendo con fuerza\n" +
                "miras a tu alrededor \n" +
                "la oscuridad es asfixiante, apenas rota por la débil luz de la luna que se filtra por una ventana rota\n" +
                "Exploras la habitación con manos temblorosas. Encuentras una linterna en una esquina, su luz tenue parpadea débilmente. \n" +
                "Junto a ella, una nota arrugada y amarillenta yace en el suelo polvoriento. Con mano temblorosa, recoges ambos objetos y examinas la nota.");
        System.out.println("Para escapar de esta casa del terror, busca la llave del jardín escondida. \n" +
                "Pero ten cuidado, los pasillos están llenos de peligros y secretos. No todo lo que ves es lo que parece.");


        mostrarOpciones();

        boolean running = true;
        while (running) {
            System.out.print("Selecciona una opción: ");
            String opcion = scanner.nextLine().toLowerCase();

            switch (opcion) {
                case "avanzar":
                    nivelController.nextroom();

                    break;
                case "retroceder":
                    nivelController.backtroom();
                    break;
                case "estatus":
                    mostrarEstado(jugador);
                    break;
                case "recoger":
                    System.out.print("Que desea recoger? ");
                    nivelController.getroomActual().recoger(scanner.nextLine(),jugador);

                    break;
                case "usar":
                    System.out.print("Que desea usar? ");
                    String palabraClave= scanner.nextLine();
                    jugador.usar(palabraClave);
                    if(palabraClave.equals("llave")){
                        nivelController.setKeyisUsed(true);
                    }

                    break;
                case "help":
                    mostrarOpciones();
                    break;
                case "salir":
                    running=false;
                    break;
                default:

                    break;
            }
        }

        scanner.close();
    }

    private static void mostrarOpciones() {
        System.out.println("\nComandos");
        System.out.println(" - avanzar");
        System.out.println(" - retroceder");
        System.out.println(" - estatus");
        System.out.println(" - recoger");
        System.out.println(" - usar");
        System.out.println(" - help");
        System.out.println(" - salir");
    }

    private static void mostrarEstado(Personaje jugador) {
        System.out.println("\nEstado actual del jugador:");
        System.out.println("Vidas: " + jugador.getVidas());
        System.out.println("Inventario: " + jugador.getInventario());
    }
}
