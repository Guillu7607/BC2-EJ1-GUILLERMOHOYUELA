public class TestLibro {
    public static void main(String[] args) {
        Libro miLibro = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        miLibro.mostrarInfo();
        miLibro.setAnio(1970);
        System.out.println("Año modificado: " + miLibro.getAnio());
    }
}