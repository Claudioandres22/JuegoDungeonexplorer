package contenidoSalas;

public abstract class salaGenerica {
    private String descripcion; //descripción de la sala? vacia, enemigo, recompensa más texto?
    private String objeto; // Poción, llave, protección? o hacer list?

    public salaGenerica(String descripcion, String objeto) {
        this.descripcion = descripcion;
        this.objeto = objeto;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getObjeto() {
        return objeto;
    }


    public class enemigo {
        private String nombre; //goblin?, rata?? blabla
        private int dano; //1 vida 2 vidas??

        public enemigo(String nombre, int dano) {
            this.nombre = nombre;
            this.dano = dano;
        }
        public String getNombre() {
            return nombre;
        }
        public int getDano() {
            return dano;
        }




    }
}