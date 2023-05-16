/*Converte um valor em reais para dólar
Autora: Gabriela
Data: 14/05/2023
 
*/

//importar a classe Scanner
import java.util.Scanner;

//classe principal
public class GabrielaVieira_Exercicio3 {

    //metodo que será executado primeiro
        public static void main (String [] args){

        //instancia um objeto "leitor"
        Scanner leitor = new Scanner (System.in);

        //cria as variaveis que receberão notas
        double cotação, valorReais;
        Float res;

        //inicialização das variáveis
        cotação = 0;
        System.out.println("digite o cotação atual do dolar");

        valorReais= 0;
        System.out.println("digite o valor em reais que converter para dólar");
        res = (float) 0.0;


        //Lê as notas
        cotação= leitor.nextDouble();
        valorReais = leitor.nextDouble();
        
        
        //calcule a média
        res = (float) (cotação * valorReais );

            System.out.println("O valor convertido em dólares é " + res);

                leitor.close();

    }
}