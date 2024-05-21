public class AguaBendita extends GameObject {
    public AguaBendita(String nombreObjeto, String descripcion) {
        super(nombreObjeto, descripcion);
    }

    @Override
    public void usar(Personaje personaje) {
        System.out.println("Has usado el " + getNombreObjeto());
        // Implementa la lógica para usar el agua bendita
    }
}

