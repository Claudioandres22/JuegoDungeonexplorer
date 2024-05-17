package contenidoSalas;

public class salaEnemigo implements room {

    private String nombreEnemigo;


    public String getnombreEnemigo() {
        return nombreEnemigo;
    }


    @Override
    public void descripcionSala() {
        System.out.println("Llegas a una sala con poca luz, recibes un fuerte golpe un " + nombreEnemigo + "te golpeó");
    }

    @Override
    public void buscar() {
        System.out.println("No puedes buscar, recibiste un impacto que te dejó tambaleando");

    }

    @Override
    public void recoger(String n) {
        System.out.println("Tus manos no responden, intenta avanzar de sala");
    }


}
