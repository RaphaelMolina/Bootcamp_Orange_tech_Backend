package Pacotes;//Pasta em que o arquivo esta localizado.

//Importação da classe utilizada que esta fora do pacote.
import Pacotes.Nivel_2.Arquivo1;
// o acesso é através da importação.
public class Arquivo3 {
    Arquivo1 arquivo1;

    void metodo(){
        //Atributos public da Classe Arquivo1:
        arquivo1.atributo3 = " ";

        //Métodos public da Classe Arquivo1:
        arquivo1.metodo3();
    }
    
}
