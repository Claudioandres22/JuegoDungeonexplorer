public abstract class room {

    public String descripcion;
    public GameObject objeto=null;

    public room(String descripcion, GameObject objeto) {
        this.descripcion = descripcion;
        this.objeto = objeto;
    }

    public room(String descripcion) {
        this.descripcion = descripcion;
    }

    public GameObject getObjeto() {
        return objeto;
    }

    public void setObjeto(GameObject objeto) {
        this.objeto = objeto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String descripcionSala(){
        return null;
    }
    public void buscar(){}
    public void recoger(String n,Personaje pj){}

}
