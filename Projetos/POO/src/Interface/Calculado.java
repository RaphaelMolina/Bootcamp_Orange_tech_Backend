package Interface;


//Esta classe implementa a classe OperacaoMatematica e com isso pode utilizar seus métodos.
public class Calculado implements OperacaoMatematica {

    @Override
    public void soma(double operando1, double operando2) {
        // TODO Auto-generated method stub
        System.out.println("Soma: " + (operando1 + operando2));
        
    }

    @Override
    public void subtracao(double operando1, double operando2) {
        // TODO Auto-generated method stub
        System.out.println("Subtração: " + (operando1 - operando2));
        
    }

    @Override
    public void multiplicacao(double operando1, double operando2) {
        // TODO Auto-generated method stub
        System.out.println("Multiplicação: " + (operando1 * operando2));
        
    }

    @Override
    public void divisao(double operando1, double operando2) {
        // TODO Auto-generated method stub
        System.out.println("Divisão: " + (operando1 / operando2));
        
    }
    
}
