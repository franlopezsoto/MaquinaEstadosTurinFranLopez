package Projecto;

// Clase que contiene un programa que nunca se detiene.
public class NoDetiene {
    // Método principal que ejecuta un bucle infinito.
    // Muestra el valor de un contador que se incrementa en cada iteración.
    public static void main(String[] args) {
        int num = 1; // Inicializamos el contador en 1
        while (true) { // Bucle infinito
            System.out.println(num); // Mostramos el contador
            num++; // Incrementamos el contador
        }
        // Este programa nunca se detiene
    }
}
