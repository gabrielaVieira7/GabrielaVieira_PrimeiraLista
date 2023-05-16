/*leia 4 números e soma os números e mostre o resultado
Autora: Gabriela
Data: 08/05/2023
 
*/

//importar a classe Scanner
import java.util.Scanner;

//classe principal
public class Exercicio1 {

    //metodo que será executado primeiro
        public static void main (String [] args){

        //instancia um objeto "leitor"
        Scanner leitor = new Scanner (System.in);

        //cria as variaveis que receberão notas
        int var, var1, var2, var3;
        float res;

        //inicialização das variáveis
        res = (float) 0.0;
        var = var1 = var2 = var = 0;

        System.out.println("insira 4 números");

        //Lê as notas
        var= leitor.nextInt();
        var1 = leitor.nextInt();
        var2 = leitor.nextInt();
        var3 = leitor.nextInt();

        //calcule a média
        res = (var + var1 + var2 + var3);

             System.out.println("O resultado é " + res);

                leitor.close();

    }
}
    

