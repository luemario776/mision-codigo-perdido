package misioncodigoperdido;

public class Heroe {

	String nombre;
    int nivel;
    int poder;

    public Heroe(String nombre, int nivel, int poder) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.poder = poder;
    }

    public void entrenar() {
        poder += 10;
        System.out.println(nombre + " ha completado su entrenamiento!");
        System.out.println("Su poder aumentó a: " + poder);
    }

    public void mostrarStats() {
        System.out.println("═══════════════════════════════");
        System.out.println("HEROE: " + nombre);
        System.out.println("NIVEL: " + nivel);
        System.out.println("PODER: " + poder);
        System.out.println("═══════════════════════════════");
    }
}
