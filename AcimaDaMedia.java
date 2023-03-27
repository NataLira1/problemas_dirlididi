
import java.util.Scanner; 
import java.util.Arrays;

public class AcimaDaMedia {
     /**
    * Laboratório de Programação 2 - Lab 1
    * 
    * Natã Cavalcante Brito Lira - 122210426
    */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float acumulador = 0;
        float media = 0;
        
        //System.out.println("Digite uma linha de números: ");
        String linha = sc.nextLine();
        String[] valores = linha.split(" ");
        int[] resultado = new int[valores.length];
        int quantAcimaDaMedia = 0;

        int[] numInt = new int[valores.length];

        for(int i = 0; i < valores.length; i++){
            numInt[i]= Integer.parseInt(valores[i]);
        }
        //System.out.println(Arrays.toString(numInt));
        
        for(int j = 0; j < numInt.length; j++){
            acumulador = acumulador + numInt[j];
        }
        media = acumulador/numInt.length;

        for(int k = 0; k < numInt.length; k++){
            if(numInt[k] > media){
                System.out.print(numInt[k] + " ");
                //resultado [k] = numInt[k];
            }
            
        }
        //System.out.println(Arrays.toString(resultado));
    }
}