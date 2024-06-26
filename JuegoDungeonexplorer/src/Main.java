
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Personaje jugador = new Personaje();
        ControladorDeNiveles nivelController = new ControladorDeNiveles();
        System.out.println("Juego hecho por Carlos - Elias - Constanza - Claudio ©");
        System.out.print("Ingresa el nombre del jugador: ");
        String nombre = scanner.nextLine();
        jugador.setNombreDelJugador(nombre);


        System.out.println("Escribe '!help' para ver opciones:");
        System.out.println(nombre + " despertaste con la cabeza confundida y el corazón latiendo con fuerza\n" +
                "miras a tu alrededor \n" +
                "la oscuridad es asfixiante, apenas rota por la débil luz de la luna que se filtra por una ventana rota\n" +
                "Exploras la habitación con manos temblorosas. Encuentras una linterna en una esquina, su luz tenue parpadea débilmente. \n" +
                "Junto a ella, una nota arrugada y amarillenta yace en el suelo polvoriento. Con mano temblorosa, recoges ambos objetos y examinas la nota.");
        System.out.println("\"Para escapar de esta casa del terror, busca la llave del jardín escondida. \n" +
                "Pero ten cuidado, los pasillos están llenos de peligros y secretos. No todo lo que ves es lo que parece.\"");


        System.out.println("-------------------------");
        System.out.println("!help para ver opciones");
        System.out.println("-------------------------");

        boolean running = true;
        while (running) {
            System.out.print("Escribe un Comando: ");
            String opcion = scanner.nextLine().toLowerCase();

            switch (opcion) {
                case "avanzar":
                    //usar la funcion del nivelcontroller de avanzar
                    nivelController.nextroom();
                    if(nivelController.getIndex().equals("2.0")||nivelController.getIndex().equals("2.2")||nivelController.getIndex().equals("3.2")||nivelController.getIndex().equals("5.0")||nivelController.getIndex().equals("6.1")){
                        //llamar a la funcion de recibir daño de jugador
                        jugador.recibirDanio(1);
                    }

                    break;
                case "retroceder":
                    //usar la funcion del nivelcontroller de retroceder
                    nivelController.backtroom();
                    if(nivelController.getIndex().equals("2.0")||nivelController.getIndex().equals("2.2")||nivelController.getIndex().equals("3.2")||nivelController.getIndex().equals("5.0")||nivelController.getIndex().equals("6.1")){
                        //llamar a la funcion de recibir daño de jugador
                        jugador.recibirDanio(1);
                    }
                    break;
                case "estatus":
                    mostrarEstado(jugador);
                    break;
                case "recoger":
                    System.out.print("Que desea recoger? ");
                    //llamar al controlador,conseguir el roomactual y llamar a su funcion recoger
                    nivelController.getroomActual().recoger(scanner.nextLine(),jugador);
                    break;
                case "buscar":
                    //llamar al controlador,conseguir el roomactual y llamar a su funcion recoger
                    nivelController.getroomActual().buscar();
                    System.out.println("tip! usa el comando recoger y luego cuando te pregunte que cosa, escribes el nombre del objeto");

                    break;
                case "usar":
                    System.out.print("Que desea usar? ");
                    String palabraClave= scanner.nextLine();
                    jugador.usar(palabraClave);
                   //llamar a la funcion del jugador "usar" y pasarle el argumento palabra clave
                    if(palabraClave.equals("llave")){

                        nivelController.setKeyisUsed(true);
                    }
                    break;
                case "!help":
                    mostrarOpciones();
                    break;
                case "salir":
                    running=false;
                    break;
                default:
                    //agregar algun sout que represente una opcion no esperada
                    System.out.println("comando no esperado, por favor use el comando help para saber los comandos que puedes usar");
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
        System.out.println(" - buscar");
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
