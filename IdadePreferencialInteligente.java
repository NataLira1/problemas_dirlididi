
public class IdadePreferencialInteligente {
     /**
    * Laboratório de Programação 2 - Lab 1
    * 
    * Natã Cavalcante Brito Lira - 122210426
    */
    public static void main(String[] args) {  // Definindo uma função
        int idade;
	    int nasci = 2003;
	    int atual = 2023;
        int x = 1;
	    boolean gestante = false;

	idade = atual - nasci;

        if (idade > 60) {
            System.out.println("Preferencial Idoso.");
        } else {
            if(gestante){
                System.out.println("Preferencial Gestante.");
            } 
            if(x >= 1){
                System.out.println("Preferencial pois está com " + x + "crianças de colo.");
            }
        System.out.println("Voce tem " + idade + " anos. Voce ainda nao pode usar o atendimento especial.");
        }
    }
}
