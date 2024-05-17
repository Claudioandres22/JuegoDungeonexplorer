import java.util.*;

public class ControladorDeNiveles {

    private boolean keyisUsed=false;
    public String index ="0.0";
    private final Map<String, String> niveles = new HashMap<>();
    String idRoomActual;
    Scanner sc = new Scanner(System.in);

    //Iniciar el juego y niveles
    public void initGame(){
        niveles.put("0.0", "rewardRoom");
        niveles.put("1.0", "emptyBlockRoom");
        niveles.put("2.0", "enemyRoom");
        niveles.put("3.0", "emptyRoom");
        niveles.put("2.1", "rewardRoom");
        niveles.put("2.2", "enemyRoom");
        niveles.put("3.1", "rewardRoom");
        niveles.put("3.2", "enemyRoom");
        niveles.put("4.0", "emptyRoom");
        niveles.put("5.0", "enemyRoom");
        niveles.put("6.0", "emptyRoom");
        niveles.put("6.1", "enemyRoom");
        niveles.put("6.2", "emptyRoom");

        idRoomActual = niveles.get("0.0");

    }

    public ControladorDeNiveles() {
        initGame();
    }

    public ControladorDeNiveles(boolean keyisUsed) {
        this.keyisUsed = keyisUsed;
    }

    public boolean isKeyisUsed() {
        return keyisUsed;
    }

    public void setKeyisUsed(boolean keyisUsed) {
        this.keyisUsed = keyisUsed;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getIdroomactual() {
        return idRoomActual;
    }

    public void setIdroomactual(String idroomactual) {
        this.idRoomActual = idroomactual;
    }

    //Leer el Nivel
    public void readlevel(){
        System.out.println(idRoomActual);
    }
    //SubMenu
    public int opcion;
    //Avanzar
    public void nextroom() {
        switch (index) {
                case "0.0": //room1.0
                    if(keyisUsed){
                        idRoomActual = niveles.get("1.0");
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
                    idRoomActual = niveles.get("2.0");
                } else if (opcion == 2) {//room3.0
                    idRoomActual = niveles.get("3.0");
                }
                break;
                case "2.0":
                    do {
                        System.out.println("elige opcion 1 o opcion 2 ");
                        opcion= sc.nextInt();
                        sc.nextLine();
                    }while (opcion<0 || opcion>2);
                if (opcion == 1) {//room 2.1
                    idRoomActual = niveles.get("2.1");
                } else if (opcion == 2) {//room 2.2
                    idRoomActual = niveles.get("2.2");
                }
                break;
                case "2.1", "2.2","3.1","3.2":
                        idRoomActual = niveles.get("4.0");
                    break;
                case "3.0":
                    do {
                        System.out.println("elige opcion 1 o opcion 2 ");
                        opcion= sc.nextInt();
                        sc.nextLine();
                    }while (opcion<0 || opcion>2);
                    if (opcion == 1) {//room 3.1
                    idRoomActual = niveles.get("3.1");
                     } else if (opcion == 2) {//room 3.2
                    idRoomActual = niveles.get("3.2");
                    }
                break;
            case "4.0":
                idRoomActual = niveles.get("5.0");
                break;
                case "5.0":

                    idRoomActual = niveles.get("6.0");
                    break;
                    case "6.0":
                        do {
                            System.out.println("elige opcion 1 o opcion 2");
                            opcion= sc.nextInt();
                            sc.nextLine();
                        }while (opcion<0 || opcion>2);
                        if (opcion == 1) {//room 3.1
                            idRoomActual = niveles.get("6.1");
                        } else if (opcion == 2) {//room 3.2
                            idRoomActual = niveles.get("6.2");
                        }
                        break;
                        case "6.1":
                            System.out.println("no hay salida");
                            break;
            case "6.2":
                System.out.println("Despertaste del sueño");
                break;
        }
        index = getIndex(idRoomActual);
        readlevel();
    }
    //Retroceder
    public void backtroom() {
        switch (index) {
            case "0.0": //room 1.0
                System.out.println("No puedes retroceder, la ventana no se ve que se pueda abrir, solo queda la pasar por la puerta");
                break;
            case "1.0":
                idRoomActual = niveles.get("0.0");
                break;
            case "2.1", "2.2":
                idRoomActual = niveles.get("2.0");
                break;
            case "3.0","2.0":
                idRoomActual = niveles.get("1.0");
                break;
            case "3.1","3.2":
                idRoomActual = niveles.get("3.0");
                break;
            case "4.0":
                do {
                    System.out.println("elige opcion 1 o opcion 2 opcion 3 opcion 4");
                    opcion= sc.nextInt();
                    sc.nextLine();
                }while (opcion<0 || opcion>4);
                if (opcion==1) {
                    idRoomActual = niveles.get("2.1");

                } else if (opcion==2) {
                    idRoomActual = niveles.get("2.2");

                } else if (opcion==3) {
                    idRoomActual = niveles.get("3.1");

                } else if (opcion==4) {
                    idRoomActual = niveles.get("3.2");
                }
                break;
            case "5.0":
                idRoomActual = niveles.get("4.0");
                break;
            case "6.0":
                idRoomActual = niveles.get("5.0");
                break;
            case "6.1", "6.2":
                idRoomActual = niveles.get("6.0");
                break;
        }
        index = getIndex(idRoomActual);
        readlevel();
    }

    public String getIndex(String room) {
        for (Map.Entry<String, String> entry : niveles.entrySet()) {
            if (entry.getValue().equals(room)) {
                return entry.getKey();
            }
        }
        return null;
    }
}


