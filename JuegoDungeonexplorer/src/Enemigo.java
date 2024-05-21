public class Enemigo {
    private String descripcion;

    public Enemigo(String descripcion) {
        this.descripcion = descripcion;
    }

    public Enemigo() {
        this.descripcion = "Un enemigo misterioso";
    }

    public void atacar(Personaje personaje) {
        System.out.println(descripcion);
        personaje.recibirDanio(1);
    }
}