import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner num = new Scanner(System.in);
        System.out.println("Inserisci un numero. . . .");


        int number = num.nextInt();
        
        for (int i = number; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
