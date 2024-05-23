import java.util.*;

public class ControladorDeNiveles {

    private boolean keyisUsed=false;
    public String index ="0.0";
    private final Map<String, room> niveles = new HashMap<>();
    private room roomActual;
    Scanner sc = new Scanner(System.in);
  
    //Iniciar el juego y niveles
    public void initGame(){
        //usen este como ejemplo para las otras salas tesoro
        niveles.put("0.0", new salaTesoro("",new Llave("llave","una llave oxidada")));
        niveles.put("1.0", new salaVacia("Estas en un pasillo largo que va hacia la izquierda y derecha",null));
        //usen este como ejemplo para las otras salas de enemigo
        niveles.put("2.0", new salaEnemigo("un viejo Mayordomo toma un cuchillo, te corta y desaparece",null));
        niveles.put("3.0", new salaVacia("Entras a una Habitacion llena de polvo y telas de araña no se ve que haya algo util aca",null));
        niveles.put("2.1", new salaTesoro("Parece que hay algo que podria ser util aca, quizas si uso buscar pueda encontrar algo",new CajaCarton("caja de carton","una caja de carton bastante grande quizas pueda esconderme aca")));
        niveles.put("2.2", new salaEnemigo("Una señora bastantante vieja te mira desde una esquina de la habitacion, le preguntas si esta bien, y salta hacia a ti, intenta morderte pero no tiene dientes",null));
        niveles.put("3.1", new salaTesoro("Parece que hay algo que podria ser util aca, quizas si uso buscar pueda encontrar algo",new Pocion("pocion","Liquido rojo parece bastante raro, pero mis conocimientos de gamer asocian a esto a recuperarme")));
        niveles.put("3.2", new salaEnemigo("un niño aparece, se ve bastante tierno...pero empieza a levitar empieza a hablar en latin y luego empieza a lanzar cosas con telequinesis",null));
        niveles.put("4.0", new salaVacia("entras y parece que aca no hay nada... puedes descansar,esta lugar esta loco concluyes, solo quieres escapar",null));
        niveles.put("5.0", new salaEnemigo("Parece que te topas con el señor de la casa, te intenta ahorcar",null));
        niveles.put("6.0", new salaVacia("has logrado escapar por poco pero no hay tiempo necesitar tomar una decision hay una puerta que parece que da a la salida y que dice armas",null));
        niveles.put("6.1", new salaEnemigo("te topas con toda la familia que esta tomando las armas para poder buscarte y matarte",null));
        niveles.put("6.2", new salaVacia("Has logrado salir, pero te topas con el jardinero quien te lanza la podadora y justo en ese momento te despiertas, te das cuenta que era todo un sueño, pero te miras y estas meado y cagado por la pesadilla que tuviste",null));

        roomActual = niveles.get("0.0");

    }

    public ControladorDeNiveles() {
        initGame();
    }

    public boolean isKeyisUsed() {
        return keyisUsed;
    }

    public String getIndex() {
        return index;
    }

    public void setKeyisUsed(boolean keyisUsed) {
        this.keyisUsed = keyisUsed;
    }
    public room getroomActual() {
        return roomActual;
    }
    //SubMenu
    public int opcion;
    //Avanzar
    public void nextroom() {
        switch (index) {
                case "0.0": //room1.0
                    if(keyisUsed){
                        roomActual = niveles.get("1.0");
                        index="1.0";
                        keyisUsed=false;
                    }else{
                        System.out.println("La Puerta esta con llave no se puede abrir");
                    }
                break;
                case "1.0":
                    do {
                        System.out.println("Vaya hay dos Caminos, por favor seleccione 1 o 2 de que camino quiere tomar");
                        System.out.println("1-pasillo izquierda");
                        System.out.println("2-pasillo derecho");
                        opcion= sc.nextInt();
                        sc.nextLine();
                    }while (opcion<0 || opcion>2);
                if (opcion == 1) {//Room2.0
                    roomActual = niveles.get("2.0");
                    index="2.0";
                } else if (opcion == 2) {//room3.0
                    roomActual = niveles.get("3.0");
                    index="3.0";
                }
                break;
                case "2.0":
                    do {
                        System.out.println("Vaya hay dos Caminos, por favor seleccione 1 o 2 de que camino quiere tomar");
                        System.out.println("1-Seguir por el pasillo");
                        System.out.println("2-Habitacion sospechosa");
                        opcion= sc.nextInt();
                        sc.nextLine();
                    }while (opcion<0 || opcion>2);
                if (opcion == 1) {//room 2.1
                    roomActual = niveles.get("2.1");
                    index="2.1";
                } else if (opcion == 2) {//room 2.2
                    roomActual = niveles.get("2.2");
                    index="2.2";
                }
                break;
                case "2.1", "2.2","3.1","3.2"://room 4.0
                    roomActual = niveles.get("4.0");
                        index = "4.0";
                    break;
                case "3.0":
                    do {
                        System.out.println("Vaya hay dos Caminos, por favor seleccione 1 o 2 de que camino quiere tomar");
                        System.out.println("1-Seguir por el pasillo");
                        System.out.println("2-Habitacion lujosa");
                        opcion= sc.nextInt();
                        sc.nextLine();
                    }while (opcion<0 || opcion>2);
                    if (opcion == 1) {//room 3.1
                        roomActual = niveles.get("3.1");
                    index="3.1";
                     } else if (opcion == 2) {//room 3.2
                        roomActual = niveles.get("3.2");
                    index="3.2";
                    }
                break;
            case "4.0"://room 5.0
                if(keyisUsed){
                    roomActual = niveles.get("5.0");
                    index="5.0";
                    keyisUsed=false;
                }else{
                    System.out.println("La Puerta esta con llave no se puede abrir");
                }
                break;
                case "5.0"://room 6.0
                    roomActual = niveles.get("6.0");
                    index="6.0";
                    break;
                    case "6.0":
                        do {
                            System.out.println("Vaya hay dos Caminos, por favor seleccione 1 o 2 de que camino quiere tomar");
                            System.out.println("1-Puerta Principal");
                            System.out.println("2-Cuarto de armas");
                            opcion= sc.nextInt();
                            sc.nextLine();
                        }while (opcion<0 || opcion>2);
                        if (opcion == 1) {//room 6.1
                            roomActual = niveles.get("6.1");
                            index="6.1";
                        } else if (opcion == 2) {//room 6.2
                            roomActual = niveles.get("6.2");
                            index="6.2";
                        }
                        break;
                        case "6.1":
                            System.out.println("no hay salida");

                            break;
            case "6.2":
                System.out.println("Despertaste del sueño");
                break;
        }
        //cada caso hara un sout de la descripcion de la sala revisen la funcion descripcion de cada sala para saber que sucede cuando es llamada
        System.out.println(roomActual.getDescripcion());

    }
    //Retroceder
    public void backtroom() {
        switch (index) {
            case "0.0": //room 1.0
                System.out.println("No puedes retroceder, la ventana no se ve que se pueda abrir, solo queda la pasar por la puerta");
                break;
            case "1.0":
                roomActual = niveles.get("0.0");
                index="0.0";
                break;
            case "2.1", "2.2":
                roomActual = niveles.get("2.0");
                index="2.0";
                break;
            case "3.0","2.0":
                roomActual = niveles.get("1.0");
                index="1.0";
                break;
            case "3.1","3.2":
                roomActual = niveles.get("3.0");
                index="3.0";
                break;
            case "4.0":
                do {
                    System.out.println("Vaya hay dos Caminos, por favor seleccione 1 o 2 de que camino quiere tomar");
                    System.out.println("1");
                    System.out.println("2");
                    System.out.println("3");
                    System.out.println("4");
                    opcion= sc.nextInt();
                    sc.nextLine();
                }while (opcion<0 || opcion>4);
                if (opcion==1) {
                    roomActual = niveles.get("2.1");
                    index="2.1";

                } else if (opcion==2) {
                    roomActual = niveles.get("2.2");
                    index="2.2";

                } else if (opcion==3) {
                    roomActual = niveles.get("3.1");
                    index="3.1";

                } else if (opcion==4) {
                    roomActual = niveles.get("3.2");
                    index="3.2";
                }
                break;
            case "5.0":
                roomActual = niveles.get("4.0");
                index="4.0";
                break;
            case "6.0":
                roomActual = niveles.get("5.0");
                index="5.0";
                break;
            case "6.1", "6.2":
                roomActual = niveles.get("6.0");
                index="6.0";
                break;
        }
        roomActual.descripcionSala();
    }

}

