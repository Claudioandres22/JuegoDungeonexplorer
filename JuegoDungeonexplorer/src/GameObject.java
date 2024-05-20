public abstract class GameObject {
    public String nombreObjeto;
    public String descripcionObjeto;


    public GameObject(String nombreObjeto, String descripcionObjeto) {
        this.nombreObjeto = nombreObjeto;
        this.descripcionObjeto = descripcionObjeto;
    }

    public GameObject() {
    }

    public String getNombreObjeto() {
        return nombreObjeto;
    }

    public void setNombreObjeto(String nombreObjeto) {
        this.nombreObjeto = nombreObjeto;
    }

    public String getDescripcionObjeto() {
        return descripcionObjeto;
    }

    public void setDescripcionObjeto(String descripcionObjeto) {
        this.descripcionObjeto = descripcionObjeto;
    }
    public void usar(Personaje p){}

}

