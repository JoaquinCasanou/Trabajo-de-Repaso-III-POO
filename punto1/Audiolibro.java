public class Audiolibro extends MaterialDigital {

    public Audiolibro(String titulo) {
        super(titulo);
    }

    @Override
    public void mostrarDescripcion() {
        System.out.println(getTitulo());
        System.out.println("Se puede escuchar");
    }
}
