import java.util.ArrayList;
import java.util.List;

public class Personaje {
    private String nombreDelJugador;
    private int vidas;
    private List<GameObject> inventario;
    private boolean protegidoConCaja;

    public Personaje(int vidas) {
        this.vidas = vidas;
        this.inventario = new ArrayList<>();
    }

    public Personaje() {
        this.vidas = 3;
        this.inventario = new ArrayList<>();
    }

    public String getNombreDelJugador() {
        return nombreDelJugador;
    }

    public void setNombreDelJugador(String nombreDelJugador) {
        this.nombreDelJugador = nombreDelJugador;
    }

    public int getVidas() {
        return vidas;
    }

    public List<GameObject> getInventario() {
        return inventario;
    }

    public void setProtegidoConCaja(boolean p) {
        this.protegidoConCaja = p;
    }

    public void agregar(GameObject objeto) {
        inventario.add(objeto);
    }

    public void usar(String objetoausar) {
        for (GameObject objeto : inventario) {
            if (objeto.getNombreObjeto().equals(objetoausar)) {
                objeto.usar(this);
                break;
            }
        }
    }

    public void heal() {
        vidas++;
    }

    public void recibirDanio(int Danio) {
        if (protegidoConCaja) {
            System.out.println("El enemigo no te detectó.");
        } else {
            vidas--;
            if (vidas <= 0) {
                System.out.println("¡Has sido derrotado! Quedaste atrapado para siempre en los oscuros confines de la mansión embrujada. Tus gritos se pierden en el eco eterno de sus muros, condenado a deambular entre las sombras por toda la eternidad.");
            }
        }
    }
}
