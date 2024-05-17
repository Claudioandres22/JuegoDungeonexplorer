package contenidoSalas;

public class salaVacia implements room {
    public salaVacia() {
    }

    @Override
        public void descripcionSala() {
            System.out.println("Llegas a una sala vacía, debes seguir explorando");
        }
        @Override
        public void buscar() {
            System.out.println("Buscas, pero no encuentras nada.");
        }
        @Override
        public void recoger(String m) {
            System.out.println("No hay nada para recoger en este lugar");
        }


}
