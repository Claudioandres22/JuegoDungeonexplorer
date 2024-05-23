
public class salaTesoro extends room {

    public salaTesoro(String descripcion, GameObject objeto) {
        super(descripcion, objeto);
    }

    @Override
    public String descripcionSala() {
        return descripcion;
    }

    @Override
    public void buscar() {
        if (objeto != null) {
            System.out.println("Encontraste " +objeto.getNombreObjeto() +": "+ objeto.getDescripcionObjeto());
        } else {
            System.out.println("No has encontrado nada");
        }

    }

    @Override
    public void recoger(String nombreObjeto,Personaje p) {
        if (objeto.getNombreObjeto().equals(nombreObjeto) && objeto != null) {
            System.out.println("Recogiste: " + nombreObjeto);
            p.agregar(objeto);
            objeto = null;
        } else {
            System.out.println("No existe ese objeto");
        }
    }

}
