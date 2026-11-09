import java.util.Scanner;

public class Ejercicio46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el dia: ");
        int dia = scanner.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt();
        
        boolean fechaValida = (((mes >= 1) && (mes <= 12)) && ((dia >= 1) && (dia <= 31)));
        
        System.out.println("¿La fecha es valida simple?: " + fechaValida);
        scanner.close();
    }
}