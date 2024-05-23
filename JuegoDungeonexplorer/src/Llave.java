public class Llave extends GameObject {

    public Llave(String nombreObjeto, String descripcionObjeto) {

        super(nombreObjeto, descripcionObjeto);
    }

    @Override
    public String getDescripcionObjeto() {

        return super.getDescripcionObjeto();
    }

    @Override
    public void usar(Personaje p) {
        System.out.println("Introduciste la llave en la puerta, se ha abierto");
    }
}