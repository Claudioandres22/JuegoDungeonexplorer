

public class salaEnemigo extends room {


    public salaEnemigo(String descripcion, GameObject objeto) {
        super(descripcion, objeto);

    }



    @Override
    public String  descripcionSala() {
        return descripcion;
    }

    @Override
    public void buscar() {
        System.out.println("No puedes buscar, recibiste un impacto que te dejó tambaleando");
    }

    @Override
    public void recoger(String n,Personaje p) {
        System.out.println("Tus manos no responden, intenta avanzar de sala");
    }


}
