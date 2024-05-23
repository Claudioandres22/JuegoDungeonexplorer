

public class salaVacia extends room {

    public salaVacia(String descripcion, GameObject objeto) {
        super(descripcion, objeto);
    }


    @Override
        public String descripcionSala() {
            return descripcion;
        }
        @Override
        public void buscar() {
            System.out.println("Buscas, pero no encuentras nada.");
        }
        @Override
        public void recoger(String m,Personaje p) {
            System.out.println("No hay nada para recoger en este lugar");
        }


}
