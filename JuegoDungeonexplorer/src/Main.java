
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
                    //usar la funcion del nivelcontroller de avanzar

                    if(nivelController.getIndex().equals("2.0")||nivelController.getIndex().equals("2.2")||nivelController.getIndex().equals("3.2")||nivelController.getIndex().equals("5.0")||nivelController.getIndex().equals("6.1")){
                        //llamar a la funcion de recibir daño de jugador
                    }

                    break;
                case "retroceder":
                    //usar la funcion del nivelcontroller de retroceder
                    if(nivelController.getIndex().equals("2.0")||nivelController.getIndex().equals("2.2")||nivelController.getIndex().equals("3.2")||nivelController.getIndex().equals("5.0")||nivelController.getIndex().equals("6.1")){
                        //llamar a la funcion de recibir daño de jugador
                    }
                    break;
                case "estatus":
                    mostrarEstado(jugador);
                    break;
                case "recoger":
                    System.out.print("Que desea recoger? ");
                    //llamar al controlador,conseguir el roomactual y llamar a su funcion recoger


                    break;
                case "usar":
                    System.out.print("Que desea usar? ");
                    String palabraClave= scanner.nextLine();
                   //llamar a la funcion del jugador "usar" y pasarle el argumento palabra clave
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
                    //agregar algun sout que represente una opcion no esperada

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
