import java.util.Scanner;
public class CiclosSinPar {
    public static void main(String[]args){
    
        
       Scanner reader = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        do {
        System.out.println("Introduce un numero:");
        numero1 = reader.nextInt();
        System.out.println("Introduce otro numero:");
        numero2 = reader.nextInt();
        }while(numero1!=numero2);
        System.out.println("Los numeros son iguales");
        
        
    }
}
