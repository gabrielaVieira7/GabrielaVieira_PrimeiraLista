/*Calcula o perímetro a partir de um r inserido pelo usuário
Autora: Gabriela
Data: 14/05/2023
 
*/

//importar a classe Scanner
import java.util.Scanner;

//classe principal
public class Exercicio6{

    //metodo que será executado primeiro
        public static void main (String [] args){

        //instancia um objeto "leitor"
        Scanner leitor = new Scanner (System.in);
            //cria as variaveis 
    float raio, res;

    //inicialização das variáveis
    raio = (float) 0.0;
    res = (float) 0.0;

    // Mostra o que fazer ao usuário
    System.out.println ("Insira o raio do círculo: ");


    // Lê o próximo valor inserido
    raio =  leitor.nextFloat();

    // Calcula o perímetro
    res = (float) 6.28 * raio; 

    // Mostra o resultado da conta
    System.out.println ("O perímetro do raio inserido é: " + res);
        

        leitor.close();

    }
}