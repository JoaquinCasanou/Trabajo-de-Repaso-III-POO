public class Main {
    public static void main(String[] args) {
        LibroDigital libro = new LibroDigital("Los Juegos del Hambre");
        Audiolibro audio = new Audiolibro("El Principito");

        libro.mostrarDescripcion();
        System.out.println();
        audio.mostrarDescripcion();
    }
}
