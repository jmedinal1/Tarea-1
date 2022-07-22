import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese un nombre");
        nombre = teclado.nextLine();
        System.out.println("¡ Bienvenido a Progra 2 2022: " + nombre + " !");
    }
}
