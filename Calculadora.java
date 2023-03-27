import java.util.Scanner;

public class Calculadora{
     /**
    * Laboratório de Programação 2 - Lab 1
    * 
    * Natã Cavalcante Brito Lira - 122210426
    */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String operador = sc.nextLine();
        float soma,diferenca,mult, div;
        
        if (operador.equals("+") || operador.equals("-") || operador.equals("*") || operador.equals("/")){
            float num1 = sc.nextFloat();
            float num2 = sc.nextFloat();
            if(operador.equals("+")){
                soma = num1 + num2;
                System.out.println("RESULTADO: " + soma);
            }else if(operador.equals("-")){
                diferenca = num1 - num2;
                System.out.println("RESULTADO: " + diferenca);
            }else if(operador.equals("*")){
                mult = num1 * num2;
                System.out.println("RESULTADO: " + mult);
            }else{
                if(num2 == 0){
                    System.out.println("ERRO");
                }else{
                    div = num1/num2;
                    System.out.println("RESULTADO: " + div);
                }
            }
        }else{
            System.out.println("ENTRADA INVALIDA");
        }
    }
}