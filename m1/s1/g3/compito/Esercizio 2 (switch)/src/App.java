public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int numero = 3;

        switch (numero) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Due");
                break;
            case 3:
                System.out.println("Tre");
                break;
            default:
                System.out.println("Errore, il numero dev'essere compreso tra 0 e 3");
        }
    }
}
