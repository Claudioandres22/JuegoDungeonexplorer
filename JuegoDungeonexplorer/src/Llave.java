public class Llave extends GameObject {
    public Llave(String nombreObjeto, String descripcion) {
        super(nombreObjeto, descripcion);
    }

    @Override
    public void usar(Personaje personaje) {
        System.out.println("Has usado la " + getNombreObjeto());
        // Implementa la lógica para usar la llave
    }
}
