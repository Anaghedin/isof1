import java.util.Scanner;

public class maior10 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = ler.nextInt();
        if (n > 10){
            System.out.println("O número digitado é maior que 10");
        } else {
            System.out.println("O número digitado não é maior que 10");
        }

    }

}
