package edu.raphael.segundaSemana;

public class MinhaClasse {

    public static void main(String[] args) {
        String nome = "Raphael";
        String sobrenome = "Molina";

        String nomeCompleto = nomeCompleto(nome, sobrenome);
        System.out.print(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {

        return "Resultado do método = " + primeiroNome.concat(" ").concat(segundoNome);

    }

}
