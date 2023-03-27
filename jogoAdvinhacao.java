import java.util.Scanner;

public class jogoAdvinhacao {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int tentativa = 0;

        num = sc.nextInt();

        while(num != tentativa){

            tentativa = sc.nextInt();

            if(tentativa > num){
                System.out.println("MAIOR");
            }else if(tentativa < num){
                System.out.println("MENOR");
            }
        }
        System.out.println("ACERTOU");
    }
}
