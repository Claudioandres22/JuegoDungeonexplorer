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

    // set protegido
    public void setProtegidoConCaja(boolean p){
        this.protegidoConCaja = p;
    }

    // (AGREGAR) objeto al inventario
    public void agregar(GameObject objeto) {
        inventario.add(objeto);
    }


    public void usar(String objetoausar){
        for (GameObject objeto : inventario) {
            if (objeto.getNombreObjeto().equals(objetoausar)) {
                objeto.usar(this);
                break;
            }
        }
    }
    // SALUD: (+) metodo heal para aumentar vidas cuando se cure ***
    public void heal() {

        vidas++; //aumenta en 1
    }
    //SALUD: (-) if para restar daño
    public void recibirDanio(int Danio) {
        if(protegidoConCaja){
            System.out.println("el enemigo no te detecto");
        }else {
            vidas --; //resta una vida
            if (vidas <= 0) { // si llega a 0 muere y aparece el mensaje
                System.out.println("¡Has sido derrotado! Quedaste atrapado para siempre en los oscuros confines de la mansión embrujada. Tus gritos se pierden en el eco eterno de sus muros, condenado a deambular entre las sombras por toda la eternidad");
            }
        }
    }

}
