package Projecto;


// Clase que contiene un programa que se detiene después de imprimir del 10 al 1.
public class SeDetiene {
    // Método principal que ejecuta un bucle que se detiene después de imprimir del 10 al 1.
    // Muestra el valor de un contador que se decrementa en cada iteración.
    public static void main(String[] args) {
        int num = 10; // Inicializamos el contador en 10
        while (num > 0) { // Mientras el contador sea mayor que 0
            System.out.println(num); // Mostramos el contador
            num--; // Decrementamos el contador
        }
        // Al llegar a cero, el programa se detiene
    }
}
