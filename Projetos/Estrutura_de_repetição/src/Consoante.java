import java.util.Scanner;

public class Consoante {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] consoantes = new String[6];
        
        int quantidade = 0;
        int count = 0;
        do{
            System.out.print("Letra: ");
            String letra = scan.next();

            if(!(letra.equalsIgnoreCase("a")||
                letra.equalsIgnoreCase("e")||
                letra.equalsIgnoreCase("i")||
                letra.equalsIgnoreCase("o")||
                letra.equalsIgnoreCase("u"))){
                
                    consoantes[count] = letra;
                    quantidade++;
                }
                count++;
        }while(count < consoantes.length);

        System.out.println("\nConsoantes: ");
        for (String consoante : consoantes) {
            if(consoante != null){
                System.out.print(consoante + " ");
            }
            
        }
        System.out.println("\nQuantidade de consoante: " + quantidade);
        scan.close();
    }
}
