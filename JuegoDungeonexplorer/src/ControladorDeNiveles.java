import java.util.*;

public class ControladorDeNiveles {

    private boolean keyisUsed=false;
    public String index ="0.0";
    private final Map<String, room> niveles = new HashMap<>();
    private room roomActual;
    Scanner sc = new Scanner(System.in);
  
    //Iniciar el juego y niveles
    public void initGame(){
        niveles.put("0.0", new salaTesoro(new Llave("llave","una llave dorada un poco oxidada")));
        niveles.put("1.0", new salaVacia());
        niveles.put("2.0", new salaEnemigo("Mayordomo"));
        niveles.put("3.0", new salaVacia());
        niveles.put("2.1", new salaTesoro());
        niveles.put("2.2", new salaEnemigo());
        niveles.put("3.1", new salaTesoro());
        niveles.put("3.2", new salaEnemigo());
        niveles.put("4.0", new salaVacia());
        niveles.put("5.0", new salaEnemigo());
        niveles.put("6.0", new salaVacia());
        niveles.put("6.1", new salaEnemigo());
        niveles.put("6.2", new salaVacia());

        roomActual = new salaTesoro();

    }

    public ControladorDeNiveles() {
        initGame();
    }

    public boolean isKeyisUsed() {
        return keyisUsed;
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
                        System.out.println("elige opcion 1 o opcion 2 ");
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
                        System.out.println("elige opcion 1 o opcion 2 ");
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
                        System.out.println("elige opcion 1 o opcion 2 ");
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
                            System.out.println("elige opcion 1 o opcion 2");
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
        roomActual.descripcionSala();
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
                    System.out.println("elige opcion 1 o opcion 2 opcion 3 opcion 4");
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

