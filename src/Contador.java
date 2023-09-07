import java.util.Scanner;


public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro");
        int firstNumberTyped = sc.nextInt();

        System.out.println("Digite o segundo número inteiro");
        int secondNumberTyped = sc.nextInt();

        try {
            count(firstNumberTyped, secondNumberTyped);
        } catch(ParametrosInvalidosException ex) {
            System.out.println(ex.getMessage());
        }

    
        sc.close();
    }

    static void count(int firstNumberTyped, int secondNumberTyped) throws ParametrosInvalidosException{

        if(secondNumberTyped < firstNumberTyped) {
            throw new ParametrosInvalidosException();
        }

        int result = secondNumberTyped - firstNumberTyped;
        for (int i = 1; i <= result; i++) {
            System.out.println("Imprimindo o número " + i);
           
        }

    }
   
}