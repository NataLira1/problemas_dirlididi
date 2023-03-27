import java.util.Scanner;
import java.util.Arrays;

public class Wally{
    /**
    * Laboratório de Programação 2 - Lab 1
    * 
    * Natã Cavalcante Brito Lira - 122210426
    */

    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        String listaDeNomes = "";
        String atualizado = "";
        int quantNomes = 0;
    
        while(!(listaDeNomes.equals("wally"))){
        
        listaDeNomes = sc.nextLine();
        String nomes[] = listaDeNomes.split(" ");
        
        for(int i=0; i < nomes.length ; i++){
            if(nomes[i].length() == 5){
                atualizado = nomes[i];
                quantNomes++;
            } 
        }
        if(quantNomes == 0){
            System.out.println("?");
        }else if (!(atualizado.equals("wally"))){
            System.out.println(atualizado);
        }

        //Me perdoem pelo "break" colocado no código enviado antes, pensei mais um pouco rsrsrsrs

        quantNomes = 0;

        }

    }
}
