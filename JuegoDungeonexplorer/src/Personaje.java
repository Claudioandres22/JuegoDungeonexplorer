import contenidoSalas.GameObject;
import contenidoSalas.Pocion;
import contenidoSalas.CajaCarton;


import java.util.ArrayList;
import java.util.List;

// clase: jugador , los atributos los hice priv para encapsularlos
// atributos: int vidas (entero ya que son 3) e inventario ..
public class Personaje {
    private String nombreDelJugador;
    private int vidas;
    private List<GameObject> inventario;
    private boolean protegidoConCaja;


    //Constructor1 (instanciar) con vidas iniciales e inventario
    public Personaje(int vidas) {
        this.vidas = vidas;
        this.inventario = new ArrayList<>();
    }
    //Constructor2 blanco con 3 vidas
    public Personaje() {
        this.vidas = 3;//3 vidas
        this.inventario = new ArrayList<>();
    }
    // Get nombre de jugador
    public String getNombreDelJugador() {
        return nombreDelJugador;
    }
    //  Set nombre de jugador
    public void setNombreDelJugador(String nombreDelJugador) {
        this.nombreDelJugador = nombreDelJugador;
    }
    // get para las vidas
    public int getVidas() {
        return vidas;
    }
    // get para uso del inventario durante el juego
    public List<GameObject> getInventario() {
        return inventario;
    }
    // (AGREGAR) objeto al inventario
    public void agregar(GameObject objeto) {
        inventario.add(objeto);
    }
    //(BUSCAR) para buscar objeto en el inventario
    public void buscar(GameObject objeto) {
        if (inventario.contains(objeto)) {
            System.out.println("El objeto: " + objeto.getNombreObjeto() + "está en el inventario.");
        } else {
            System.out.println("El objeto: " + objeto.getNombreObjeto() + "no está en el inventario.");
        }
    }
    // RECOGER OBJETOS: agrega objetos al inventario
    public void recoger(GameObject objeto) {
        inventario.add(objeto);
        System.out.println("Has recogido: " + objeto.getNombreObjeto());
    }
    // (USAR POCION + HEAL PARA CURAR 1 DE VIDA
    public void usarPocion() {
        Pocion pocion = new Pocion("Pocion"," cura vida");
        if (inventario.contains(pocion)) {
            heal(1);
            inventario.remove(pocion);
            System.out.println("Te has curado con la Poción que recibiste.");
        } else {
            System.out.println("No tienes ninguna Poción en tu inventario.");
        }
    }
    // SALUD: (+) metodo heal para aumentar vidas cuando se cure ***
    public void heal(int cantidad) {
        vidas++; //aumenta en 1
    }
    //SALUD: (-) if para restar daño
    public void recibirDanio(int Danio) {
        vidas --; //resta una vida
        if (vidas <= 0) { // si llega a 0 muere y aparece el mensaje
            System.out.println("¡Has sido derrotado! Quedaste atrapado para siempre en los oscuros confines de la mansión embrujada. Tus gritos se pierden en el eco eterno de sus muros, condenado a deambular entre las sombras por toda la eternidad");
        }
    }
    //Protegerse con una caja de carton
    public void protegerseConCaja() {
        boolean tieneCajaCarton = false;
        for (GameObject objeto : inventario) {
            if (objeto.getClass().equals(CajaCarton.class)) {
                tieneCajaCarton = true;
                break;
            }
        }
        if (tieneCajaCarton) {
            protegidoConCaja = true;
            System.out.println("Te has protegido con una caja de cartón. El enemigo no se da cuenta de tu movimiento, Snake estaría orgulloso de ti.");
        } else {
            System.out.println("No tienes una caja de cartón en tu inventario para protegerte.");
        }
    }
}
