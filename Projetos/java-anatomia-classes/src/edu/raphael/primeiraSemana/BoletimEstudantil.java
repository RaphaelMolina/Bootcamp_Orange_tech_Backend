package edu.raphael.primeiraSemana;
public class BoletimEstudantil {
    
    public static void main(String [] args){
        int mediaFinal = 6;
        if(mediaFinal < 6)
            System.out.print("Reprovado!");
        else if(mediaFinal == 6)
            System.out.print("Prova Minerva");
        else
            System.out.print("Aprovado!");

    }
}
