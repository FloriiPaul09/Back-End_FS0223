import java.util.Scanner;

public class Rettangolo {

    double altezza;
    double base;

    public Rettangolo(double altezza, double base) {
        this.altezza = altezza;
        this.base = base;
    }

    public double perimetro() {
        return 2 * (base + altezza);
    };

    public double area(){
        return altezza * base;
    };

    public static void main(String[] args) throws Exception {
        System.out.println("Ciao, utente!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il numero di rettangoli che desideri calcolare");
        int numero = scanner.nextInt();


        for (int i = 0; i < numero; i++) {
            System.out.println("Rettangolo numero " + (i + 1));

            System.out.println("Inserisci l'altezza del rettangolo numero " + (i + 1));
            double altezza = scanner.nextDouble();

            System.out.println("Inserisci la base del rettangolo numero " + (i + 1));
            double base = scanner.nextDouble();

            Rettangolo rettangolo = new Rettangolo(altezza, base);

            double perimetro = rettangolo.perimetro();
            double area = rettangolo.area();

            System.out.println("Il perimetro del rettangolo numero " + (i + 1) + " e' " + perimetro);
            System.out.println("L'area del rettangolo numero " + (i + 1) + " e' " + area);

        };
    }
}
