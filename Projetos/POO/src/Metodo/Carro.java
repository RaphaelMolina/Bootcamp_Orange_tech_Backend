package Metodo;

//É uma extensão(Classe filho) da Classe Veiculo.
public class Carro extends Veiculo {
    //Atributos:
    String cor;
    String modelo;
    int capacidadeTanque;

    //Construtor da Classe sem parâmetros = construtor padrão, não precisa ser declarado o Java já declara por trás.
    public Carro() {

    }

    //Construtor da Classe com parâmetros.
    public Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    //Método para pegar a cor. 
    public String getCor() {
        return cor;
    }

    //Método para setar uma nova cor.
    public void setCor(String cor) {
        this.cor = cor;
    }

    //Método para pegar o modelo. 
    public String getModelo() {
        return modelo;
    }

    //Método para setar um novo modelo.
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //Método para pegar a capacidade.
    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    //Método para setar uma nova capacidade.
    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    //Método para calcular o valor para encher o tanque.
    public double valorTotalTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }
}
