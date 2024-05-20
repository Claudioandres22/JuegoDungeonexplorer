public class CajaCarton extends GameObject {

    public CajaCarton(String nombreObjeto, String descripcionObjeto) {
        super(nombreObjeto, descripcionObjeto);
    }

    @Override
    public String getDescripcionObjeto() {
        return super.getDescripcionObjeto();
    }

    @Override
    public void usar(Personaje p) {
        System.out.println("empizas a gatear con la caja encima, no creo que nadie sea lo suficiente perspicaz para darse cuenta");
        System.out.println("Snake estaria orgulloso de ti");
        p.setProtegidoConCaja(true);

    }
}
