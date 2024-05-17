import java.util.ArrayList;
import java.util.List;

// clase: jugador , los atributos los hice priv para encapsularlos
// atributos: int vidas (entero ya que son 3) e inventario vacio..
public class Personaje {
    private String nombreJugador;
    private int vidas;
    private List<String> inventario;

    //constructor (instanciar) para cuando pida el nombre aparezca las vidas e inventario
    public Personaje(String nombreJugador, int vidas) {
        this.nombreJugador = nombreJugador;
        this.vidas = vidas;
        this.inventario = new ArrayList<>();
    }
    public String getNombreJugador() {
        return nombreJugador;
    }
    public int getVidas() {
        return vidas;
    }
    public void setVidas(int vidas) {
        this.vidas = vidas; // esto sirve para actualizar cuando gane o pierda vidas
    }

// aqui podemos hacer uso del inventario durante el juego
    public List<String> getInventario() {
        return inventario;
    }
// agg objeto al inventario
    public void agregar(String objeto) {
        inventario.add(objeto);
    }

// si esta la wea en el inventario lo usa y si no nopo
    public boolean usar(String objeto) {
        if (inventario.contains(objeto)) {
            inventario.remove(objeto);
            return true;
        } else {
            return false;
        }
    }
//recibir daño
    public void recibirDanio(int Danio) {
        vidas -= Danio ; //resta valor del daño recibido a las vidas
        if (vidas <= 0) { // si llega a 0 muere y aparece el mensaje
           System.out.println("¡Has sido derrotado! Quedaste atrapado para siempre en los oscuros confines de la mansión embrujada. Tus gritos se pierden en el eco eterno de sus muros, condenado a deambular entre las sombras por toda la eternidad");
        }
    }

}