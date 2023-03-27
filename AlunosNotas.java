import java.util.Scanner;

public class AlunosNotas {
     /**
    * Laboratório de Programação 2 - Lab 1
    * 
    * Natã Cavalcante Brito Lira - 122210426
    */
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String linhaNN = ""; 
        String condicaoSaida = "";
        int nota;
        int maiorNota = Integer.MIN_VALUE;
        int menorNota = Integer.MAX_VALUE;
        int quantNotas = 0;
        int quantAcima = 0;
        int quantAbaixo = 0;
        int acumulador = 0;
        int notas[] = new int[1000];

        while(!(linhaNN.equals("-"))){

            linhaNN = sc.nextLine();
            String nomeEnota[] = linhaNN.split(" ");
        
            if(nomeEnota.length > 1){
                nota = Integer.parseInt(linhaNN.split(" ")[1]);
                if (nota >= 0 && nota <= 1000){
                    if(nota > maiorNota){
                    maiorNota = nota;
                    }
                    if(nota < menorNota){
                        menorNota = nota;
                    }
                    
                    notas[quantNotas] += nota;
                    quantNotas++;
                    if(nota >= 700){
                        quantAcima++;
                    }else{
                        quantAbaixo++;
                    }
                }else{
                    System.out.println("Nota Inválida!, Tente novamente");
                }
                
            }
        }
        for(int j = 0; j < quantNotas; j++){
            acumulador += notas[j];
        }
        int media = acumulador / quantNotas;
        
        String[] exemplo = {"maior: ", "menor: ", "media: ", "acima: ", "abaixo: "}; 
        int[] exemlo1 = {maiorNota, menorNota, media, quantAcima, quantAbaixo};

        imprimindoarray(exemplo, exemlo1);
    }
   
    public static void imprimindoarray(String[] arr, int[] arr1){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + arr1[i]);
        }
    }
}