import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidade;
        int numero;
        int par = 0, impar = 0;
        
        System.out.print("Quantidade de números: ");
        quantidade = scan.nextInt();

        int count = 0;

        do {
            System.out.print("Número: ");
            numero = scan.nextInt();
            if(numero % 2 == 0) par ++;
            else impar ++;
            count ++;
        } while(count < quantidade);
        System.out.println("Quantidade Par: " + par);
        System.out.println("Quantidade Ímpar: " + impar);
        scan.close();
    }
}
