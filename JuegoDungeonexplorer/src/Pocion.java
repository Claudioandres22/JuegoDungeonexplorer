public class Pocion extends GameObject {


    public Pocion(String nombreObjeto, String descripcionObjeto) {

        super(nombreObjeto, descripcionObjeto);
    }
//Funcion de usar poción, personaje se hizo para que funcione
    @Override
    public void usar(Personaje p) {
        p.heal();
        System.out.println("Has tomado la poción, has recuperado 1 vida");
    }

    @Override
    public String getDescripcionObjeto() {

        return super.getDescripcionObjeto();
    }
}
