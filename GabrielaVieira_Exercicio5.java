/*Classifique uma pessoas pela idade
Autora: Gabriela
Data: 14/05/2023
 
*/

//importar a classe Scanner
import java.util.Scanner;

//classe principal
public class GabrielaVieira_Exercicio5 {

    //metodo que será executado primeiro
        public static void main (String [] args){

        //instancia um objeto "leitor"
        Scanner leitor = new Scanner (System.in);

        //cria as variaveis que receberão notas
        int idade;

        //inicialização das variáveis
        idade = 0;

        System.out.println("insira sua idade");

        //Lê as notas
        idade = leitor.nextInt();

        //mostra se a pessoa é idoso ou adulto ou adolescente ou criança
        if (idade >= 66)
            System.out.println( "você é idoso");

        else if (idade > 19)
            System.out.println( "você é adulto");
        else if (idade >= 12)
            System.out.println("voce é adolescente");
            
            else if (idade >= 0)    
         System.out.println("voce é criança");
            
                leitor.close();

    }
}
