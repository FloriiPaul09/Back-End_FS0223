public class Caratteri {

    public static boolean areEven(String parola){
        int caratteri = parola.length();

        return caratteri % 2 == 0;
    };

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, there!");

        String parola = "Salve";

        if (areEven(parola)){
            System.out.println("La parola ha un numero di caratteri pari");
        } else {
            System.out.println("La parola ha un numero di caratteri dispari");
        }
    }
}
