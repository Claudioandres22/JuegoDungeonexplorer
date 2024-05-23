public abstract class GameObject {
    private String nombreObjeto;
    private String descripcionObjeto;

    public GameObject(String nombreObjeto, String descripcionObjeto) {
        this.nombreObjeto = nombreObjeto;
        this.descripcionObjeto = descripcionObjeto;
    }

    public String getNombreObjeto() {
        return nombreObjeto;
    }

    public String getDescripcionObjeto() {
        return descripcionObjeto;
    }

    public abstract void usar(Personaje personaje);
}
