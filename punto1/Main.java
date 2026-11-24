public class Main {
    public static void main(String[] args) {
        LibroDigital libro = new LibroDigital("Don Quijote de la Mancha");
        Audiolibro audio = new Audiolibro("El Principito");

        libro.mostrarDescripcion();
        System.out.println();
        audio.mostrarDescripcion();
    }
}
