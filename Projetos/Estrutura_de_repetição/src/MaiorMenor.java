import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;
        int soma = 0;
        do {
            System.out.print("Número: ");
            numero = scan.nextInt();
            soma += numero;
            if(numero > maior) maior = numero;
            count ++;
        } while (count < 5);

        System.out.println("Maior número: " + maior);
        System.out.println("Média: " + (soma/count));
        
        scan.close();
    }
}
