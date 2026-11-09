import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la hora en formato 24h: ");
        int hora = scanner.nextInt();
        
        boolean esHoraValida = ((hora >= 0) && (hora <= 23));
        
        System.out.println("¿Es una hora valida (0 a 23)?: " + esHoraValida);
        scanner.close();
    }
}