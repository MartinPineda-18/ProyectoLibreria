public class Main {
    public static void main(String[] args) {

        Libro L1 = new Libro("Lady Masacre", "Mario Mendoza", "5674");
        Libro L2 = new Libro("La melancolia de los feos", "Mario Mendoza", "9087");
        Libro L3 = new Libro("Akelarre", "Mario Mendoza", "0678");

        Usuario U1 = new Usuario("Paula Ortiz", 1020608973);
        Usuario U2 = new Usuario("Mateo Villegas ", 1043897034);

        Biblioteca biblioteca = new Biblioteca();

        // Prestar
        biblioteca.prestarLibro(U1, L1);
        biblioteca.prestarLibro(U1, L2);
        biblioteca.prestarLibro(U2, L3);

        // Mostrar prestados
        biblioteca.mostrarLibrosPrestados(U1);
        biblioteca.mostrarLibrosPrestados(U2);

        // Devolver
        biblioteca.devolverLibro(U1, L2);

        biblioteca.mostrarLibrosPrestados(U1);
    }
}
