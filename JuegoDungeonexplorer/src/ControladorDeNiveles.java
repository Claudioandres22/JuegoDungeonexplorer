import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControladorDeNiveles {

    public String index ="0.0";
    List<String> misniveles = new ArrayList<>();
    String idroomactual;
    Scanner sc = new Scanner(System.in);

    //Iniciar el juego y niveles
    public void initGame(){
        misniveles.add("rewardRoom");//0
        misniveles.add("emptyblockroom");//1
        misniveles.add("Enemyroom");//2
        misniveles.add("empetyroom");//3
        misniveles.add("rewardroom");//4
        misniveles.add("enemyroom");//5
        misniveles.add("rewardroom");//6
        misniveles.add("enemyroom");//7
        misniveles.add("emptyroom");//8
        misniveles.add("enemyroom");//9
        misniveles.add("emptyroom");//10
        misniveles.add("enemyroom");//11
        misniveles.add("emptyroom");//12


        idroomactual = misniveles(0);
    }

    public String misniveles(int i) {
        return misniveles.get(i);
    }
    //Leer el Nivel
    public void readlevel(){
        System.out.println(idroomactual);
    }
    //SubMenu
    public int opcion;
    //Avanzar
    public void nextroom() {
        switch (index) {
            case "0.0": //room1.0
                idroomactual = misniveles.get(1);
                index = "1.0";
                readlevel();
                break;

            case "1.0":
                do {
                    System.out.println("elige opcion 1 o opcion 2 ");
                    opcion= sc.nextInt();
                    sc.nextLine();
                }while (opcion<0 || opcion>2);
                if (opcion == 1) {//Room2.0
                    idroomactual = misniveles.get(2);
                    index = "2.0";
                } else if (opcion == 2) {//room3.0
                    idroomactual = misniveles.get(3);
                    index ="3.0";
                }
                break;

            case "2.0":
                do {
                    System.out.println("elige opcion 1 o opcion 2 ");
                    opcion= sc.nextInt();
                    sc.nextLine();
                }while (opcion<0 || opcion>2);
                if (opcion == 1) {//room 2.1
                    idroomactual = misniveles.get(4);
                    index = "2.1";
                } else if (opcion == 2) {//room 2.2
                    idroomactual = misniveles.get(5);
                    index = "2.2";
                }
                break;

            case "2.1", "2.2","3.1","3.2":
                idroomactual = misniveles.get(8);
                index = "4.0";
                break;
            case "3.0":
                do {
                    System.out.println("elige opcion 1 o opcion 2 ");
                    opcion= sc.nextInt();
                    sc.nextLine();
                }while (opcion<0 || opcion>2);
                if (opcion == 1) {//room 3.1
                    idroomactual = misniveles.get(6);
                    index = "3.1";
                } else if (opcion == 2) {//room 3.2
                    idroomactual = misniveles.get(7);
                    index = "3.2";
                }
                break;
            case "4.0":
                idroomactual = misniveles.get(9);
                index = "5.0";
                break;
            case "5.0":
                idroomactual = misniveles.get(10);
                index = "6.0";
                break;
            case "6.0":
                do {
                    System.out.println("elige opcion 1 o opcion 2");
                    opcion= sc.nextInt();
                    sc.nextLine();
                }while (opcion<0 || opcion>2);
                if (opcion == 1) {//room 3.1
                    idroomactual = misniveles.get(11);
                    index = "6.1";
                } else if (opcion == 2) {//room 3.2
                    idroomactual = misniveles.get(12);
                    index = "6.2";
                }
                break;
            case "6.1":
                System.out.println("no hay salida");
                break;
            case "6.2":
                System.out.println("Despertaste del sueño");
                break;
        }
    }
    //Retroceder
    public void backtroom() {
        switch (index) {
            case "0.0": //room 1.0
                System.out.println("No puedes retroceder, la ventana no se ve que se pueda abrir, solo queda la pasar por la puerta");
                break;

            case "1.0":
                idroomactual = misniveles.get(0);
                index = "0.0";
                break;
            case "2.1", "2.2":
                idroomactual = misniveles.get(2);
                index = "2.0";
                break;
            case "3.0","2.0":
                idroomactual = misniveles.get(1);
                index = "1.0";
                break;
            case "3.1","3.2":
                idroomactual = misniveles.get(3);
                index = "3.0";
                break;

            case "4.0":
                do {
                    System.out.println("elige opcion 1 o opcion 2 opcion 3 opcion 4");
                    opcion= sc.nextInt();
                    sc.nextLine();
                }while (opcion<0 || opcion>4);
                if (opcion==1) {
                    idroomactual = misniveles.get(4);
                    index = "2.1";

                } else if (opcion==2) {
                    idroomactual = misniveles.get(5);
                    index = "2.2";

                } else if (opcion==3) {
                    idroomactual = misniveles.get(6);
                    index = "3.1";

                } else if (opcion==4) {
                    idroomactual = misniveles.get(7);
                    index = "3.2";

                }
                break;
            case "5.0":
                idroomactual = misniveles.get(8);
                index = "4.0";
                break;
            case "6.0":
                idroomactual = misniveles.get(9);
                index = "5.0";

                break;
            case "6.1", "6.2":
                idroomactual = misniveles.get(10);
                index = "6.0";
                break;
        }
    }

}