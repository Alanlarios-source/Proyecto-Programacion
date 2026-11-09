import java.util.Scanner;

public class Ejercicio47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese n1: ");
        int n1 = scanner.nextInt();
        System.out.print("Ingrese n2: ");
        int n2 = scanner.nextInt();
        System.out.print("Ingrese n3: ");
        int n3 = scanner.nextInt();
        
        boolean alMenosUnPar = ((((n1 % 2) == 0) || ((n2 % 2) == 0)) || ((n3 % 2) == 0));
        
        System.out.println("¿Al menos uno de los tres numeros es par?: " + alMenosUnPar);
        scanner.close();
    }
}