import java.util.Scanner;

public class ConsultandoGastos{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String linha1 = "";
        String linha2 = "";
        String mesSelecionado = "";

        linha1 = sc.nextLine();
        linha2 = sc.nextLine();
        mesSelecionado = sc.nextLine();

        String[] mes = linha1.split(" ");
        String[] gastos = linha2.split(" ");


        imprimindoValor(mes, gastos, mesSelecionado);


    }

    public static void imprimindoValor(String[] arr, String[] arr1, String mesString){
        int valor = 0;
        for(int i = 0; i < arr.length; i++){
            if(mesString.equals(arr[i])){
                valor = Integer.parseInt(arr1[i]);
            }
        }
        System.out.println(valor);
    }
}