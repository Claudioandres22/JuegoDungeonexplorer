public abstract class Room {
    public abstract void examinar();

    public abstract void buscar();

    public abstract void descripcionSala();

    public abstract String getSalida();

    public String getRetroceso() {
        return "";
    }
}