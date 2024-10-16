import java.util.*;

public class Biblioteca {
    private HashMap<Usuario, ArrayList<Libro>> prestamos;

    public Biblioteca() {
        this.prestamos = new HashMap<>();
    }

    public void prestarLibro(Usuario usuario, Libro libro) {
        if (!prestamos.containsKey(usuario)) {
            prestamos.put(usuario, new ArrayList<>());
        }
        prestamos.get(usuario).add(libro);
        System.out.println(libro.getTitulo() + " ha sido prestado al usuario:  " + usuario.getNombre());
    }

    public void devolverLibro(Usuario usuario, Libro libro) {
        if (prestamos.containsKey(usuario) && prestamos.get(usuario).contains(libro)) {
            prestamos.get(usuario).remove(libro);
            System.out.println(libro.getTitulo() + " ha sido devuelto por el usuario: " + usuario.getNombre());
        } else {
            System.out.println("Este libro no está registrado en los préstamos del usuario: " + usuario.getNombre());
        }
    }

    public void mostrarLibrosPrestados(Usuario usuario) {
        if (prestamos.containsKey(usuario) && !prestamos.get(usuario).isEmpty()) {
            System.out.println("Los libros prestados al usuario " + usuario.getNombre() + " son:");
            for (Libro libro : prestamos.get(usuario)) {
                System.out.println(libro.getTitulo());
            }
        } else {
            System.out.println(usuario.getNombre() + " no tiene libros prestados.");
        }
    }
}

