import java.util.ArrayList;
import java.util.List;

// clase: jugador , los atributos los hice priv para encapsularlos
// atributos: int vidas (entero ya que son 3) e inventario vacio..
public class Personaje {
    private String nombreDelJugador;
    private int vidas;
    private List<String> inventario;

//Constructor1 (instanciar) con vidas iniciales e inventario
    public Personaje(int vidas) {
        this.vidas = vidas;
        this.inventario = new ArrayList<>();
    }
//Constructor 2 blanco con 3 vidas
    public Personaje() {
        this.vidas = 3;//3 vidas
    }
// Get nombre de jugador
    public String getNombreDelJugador() {
        return nombreDelJugador;
    }
//  Set nombre de jugador
    public void setNombreDelJugador(String nombreDelJugador) {
        this.nombreDelJugador = nombreDelJugador;
    }
// muestra las vidas actuales del personaje
    public int getVidas() {
        return vidas;
    }
// aqui podemos hacer uso del inventario durante el juego
    public List<String> getInventario() {
        return inventario;
    }
// (AGREGAR) objeto al inventario
    public void agregar(String objeto) {
        inventario.add(objeto);
    }
 //(BUSCAR) para ver si el objeto esta en el inventario
    public void buscar(String objeto) {
        if (inventario.contains(objeto)) {
            System.out.println("El objeto: " + objeto + "está en el inventario.");
        } else {
            System.out.println("El objeto: " + objeto + "no está en el inventario.");
        }
    }
//(USAR) si esta la wea en el inventario lo usa y si no nopo
    public void usar(String objeto) {
        if (inventario.contains(objeto)) {
            inventario.remove(objeto); // lo elimina si esta presente
            System.out.println("Usaste el objeto:" + objeto);
        } else {
            System.out.println("El Objeto:" + objeto+ " no esta disponible");
        }
    }
// SALUD: (+) heal para aumentar vidas cuando se cure ***
    public void heal() {
        vidas++; //aumenta en 1
    }
//SALUD: (-) if para restar daño
    public void recibirDanio(int Danio) {
        vidas --; //resta una vida
        if (vidas <= 0) { // si llega a 0 muere y aparece el mensaje
           System.out.println("¡Has sido derrotado! Quedaste atrapado para siempre en los oscuros confines de la mansión embrujada. Tus gritos se pierden en el eco eterno de sus muros, condenado a deambular entre las sombras por toda la eternidad");
        }
    }

}