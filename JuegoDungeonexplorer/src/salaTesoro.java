
public class salaTesoro extends room {

    GameObject objeto;
    //Para agregar el objeto
    public void setObjeto(GameObject objeto) {
        this.objeto = objeto;
    }

    public salaTesoro(GameObject objeto) {
        this.objeto = objeto;
    }

    public salaTesoro(){

    }
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
