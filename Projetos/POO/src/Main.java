//Importações para conseguir utilizar o que esta dentro das pastas e dentro das Classes:
// import Heranca.Faxineiro;
// import Heranca.Funcionario;
// import Heranca.Gerente;
// import Heranca.Vendedor;
// import Metodo.Carro;

//Classe principal para a execução das outras classes:
public class Main {

    //Método principal para conseguir executar: 
    public static void main(String[] args) {
        //Instanciando o objeto veiculo com o construtor padrão.
        // Carro veiculo = new Carro();
          
        //Setando a cor, mode o capacidade do tanque do objeto.
        // veiculo.setCor("Azul");
        // veiculo.setModelo("BMW Série 3");
        // veiculo.setCapacidadeTanque(60);

        //Retornando o que foi setado e calculando o valor para encher o tanque.
        // System.out.println(veiculo.getModelo());
        // System.out.println(veiculo.getCor());
        // System.out.println(veiculo.getCapacidadeTanque());
        // System.out.println(veiculo.valorTotalTanque(6.4));
        
        //Instanciando o objeto car com o construtor com parâmetros.
        // Carro car = new Carro("Preto", "Mercedez", 70);
        
        //Retornando o que foi setado e calculando o valor para encher o tanque.
        // System.out.println(car.getModelo());
        // System.out.println(car.getCor());
        // System.out.println(car.getCapacidadeTanque());
        // System.out.println(car.valorTotalTanque(6.4));

        //Instanciando o objeto funcionarioA com o construtor padrão da classe Funcionario, sem UpCast ou DownCast.
        // Funcionario funcionarioA = new Funcionario();
        
        //UpCast: Gerente, Vendedor e Faxineiro são subtipos de Funcionário.
        // Classe Funcionario é o Super tipo das classes Gerente, Vendedor e Faxineiro.
        //gerente é um novo objeto da Classe Gerente e é do tipo Funcionario. 
        //faxineiroA é um novo objeto da Classe Faxineiro e é do tipo Funcionario. 
        //vendedor é um novo objeto da Classe Vendedor e é do tipo Funcionario. 
        // Funcionario gerente     = new Gerente();
        // Funcionario vendedor    = new Vendedor();
        // Funcionario faxineiroA   = new Faxineiro();

        //DownCast Não utilizar.
        // Gerente gerente2 = new Funcionario();//Errado.
        // Vendedor vendedor2 = (Vendedor) new Funcionario();//Exibe um erro ao executar. 

        //Instanciando um vetor funcionarios com o construtor padrão da classe Funcionario.
        //Esse vetor foi instanciado com três objetos, um da Classe Gerente, um da Classe Faxineiro e um da Classe Funcionario. 
        // Funcionario[] funcionarios = new Funcionario[]{new Gerente(), new Faxineiro(), new Funcionario()};

        //foreach em cima do vetor funcionarios, para usar o método metado1 de cada objeto do vetor.
        // for (Funcionario funcionario : funcionarios) {
        //     funcionario.metado1();
        // }
        
        // System.out.println();

        //foreach em cima do vetor funcionarios, para usar o método metado2 de cada objeto do vetor.
        // for (Funcionario funcionario : funcionarios) {
        //     funcionario.metado2();
        // }

        // System.out.println();

        //Instanciando o objeto faxineiro com o construtor padrão da classe Faxineiro.
        // Faxineiro faxineiro = new Faxineiro();

        //Chamando o método metado2 da Classe Faxineiro com o objeto faxineiro.
        // faxineiro.metado2();

    }
}
