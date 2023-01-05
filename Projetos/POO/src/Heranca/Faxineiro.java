package Heranca;

//É uma extensão(Classe filho) da Classe Funcionário.
public class Faxineiro extends Funcionario {
    
    //Sobre escrevendo o método da Classe Funcionário.
    @Override
    public void metado1(){
        System.out.println("Método 1 da Classe Faxineiro");
    }
    
    //Sobre escrevendo o método da Classe Funcionário.
    @Override
    public void metado2(){
        System.out.println("Método 2 da Classe Faxineiro");
    }
    
}
