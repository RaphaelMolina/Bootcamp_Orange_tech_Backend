package edu.raphael.segundaSemana;

// public class AboutMe {
//     public static void main(String[] args) {
//         //os argumentos começam com indice 0
//         String nome = args [0];
//         String sobrenome = args [1];
//         int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
//         double altura = Double.valueOf(args[3]);

//         System.out.println("Ola, me chamo " + nome + " " + sobrenome);
//         System.out.println("Tenho " + idade + " anos ");
//         System.out.println("Minha altura eh " + altura + "cm ");
//     }
// }

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("\nDigite seu nome: ");
        String nome = scanner.next();
        
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("\nOla, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        
        scanner.close();   
    }
}
