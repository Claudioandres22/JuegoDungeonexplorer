package contenidoSalas;

public class salaTesoro implements room {

    GameObject objeto;
    @Override
    public void descripcionSala() {
        System.out.println("Llegas a una sala donde te llama la atención un agujero en la pared, deberías investigar");
    }

    @Override
    public void buscar() {
        if (objeto != null) {
            System.out.println("Encontraste: " + objeto.getNombreObjeto());
        } else {
            System.out.println("No has encontrado nada");
        }
    }

    @Override
    public void recoger(String nombreObjeto) {
        if (objeto.getNombreObjeto().equals(nombreObjeto) && objeto != null) {
            System.out.println("Recogiste: " + nombreObjeto);
            //Personaje.add(nombreObjeto)
            objeto = null;
        } else {
            System.out.println("No existe ese objeto");
        }
    }

}
