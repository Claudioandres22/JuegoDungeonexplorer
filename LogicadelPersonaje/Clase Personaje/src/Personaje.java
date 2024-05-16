import java.util.ArrayList;
import java.util.List;

// clase: jugador , los atributos los hice priv para encapsularlos
// atributos: int vidas (entero ya que son 3) e inventario vacio..
public abstract class Personaje {
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
// para ver si el objeto esta en el inventario
    public boolean buscar(String objeto) {
        return inventario.contains(objeto);
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
}