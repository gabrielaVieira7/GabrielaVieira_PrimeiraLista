/*leia 4 números e calcule o quadrado de cada um e depois some todos os valores
Autora: Gabriela
Data: 14/05/2023
 
*/

//importar a classe Scanner
import java.util.Scanner;

//classe principal
public class Exercicio2 {

    //metodo que será executado primeiro
        public static void main (String [] args){

        //instancia um objeto "leitor"
        Scanner leitor = new Scanner (System.in);

        //cria as variaveis que receberão os números
        int var, var1, var2, var3, res;

        //inicialização das variáveis
        res = var = var1 = var2 = var = 0;

        System.out.println("insira 4 números");

        //Lê as notas
        var= leitor.nextInt();
        var1 = leitor.nextInt();
        var2 = leitor.nextInt();
        var3 = leitor.nextInt();

        //calcule a média
        res = (var*2) + (var1*2) + (var2*2) + (var3*2);

            System.out.println("A soma dos quadrados é " + res);

                leitor.close();

    }
}