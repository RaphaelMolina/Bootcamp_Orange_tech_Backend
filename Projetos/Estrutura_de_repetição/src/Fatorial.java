import java.util.Scanner;

public class Fatorial {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Fatorial: ");
        int fatorial = scan.nextInt();
        int resultado = 1;
        for(int i = fatorial; i >= 1; i--){
            resultado *= i;

        }
        System.out.println(fatorial + "! = "+ resultado);
        scan.close();
    }
}
