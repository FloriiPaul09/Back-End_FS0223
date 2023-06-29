public class Dipendente {

    static double stipendioBase = 1000;
    private String matricola;
    private double stipendio;
    public double importoOrarioStraordinario;
    
    private enum Level{
        OPERAIO, IMPIEGATO, QUADRO, DIRIGENTE
    };
    private Level livello;
    
    public enum Department {
        PRODUZIONE, AMMINISTRAZIONE, VENDITE
    };
    public Department dipartimento;


    public void Cerca(String matricola,
                        Department dipartimento){
        this.matricola = matricola;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.livello = Level.OPERAIO;
        this.dipartimento = dipartimento;
    }

    public void Dipende(String matricola, double stipendio, 
                        double importoOrarioStraordinario, Level livello, 
                        Department dipartimento){
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;                    
    }

    public void stampaDatiDipendente(){
        System.out.println("La matricola e': " + matricola);
        System.out.println("Lo stipendio e': " + stipendio);
        System.out.println("L'importo per gli straordinari e': " + importoOrarioStraordinario); //
        System.out.println("Il livello e': " + livello);
        System.out.println("Il dipartimento e': " + dipartimento);
    };

    public void promozione(){
        switch(livello) {
            case OPERAIO:
                livello = Level.IMPIEGATO;
                stipendioBase *= 1.2;
                break;
            case IMPIEGATO:
                livello = Level.QUADRO;
                stipendioBase *= 1.5;
                break;
            case QUADRO:
                livello = Level.DIRIGENTE;
                stipendioBase *= 2;
                break;
            case DIRIGENTE:
                System.out.println("Errore, non ci sono livelli piu alti");
                break;
            default:
            System.out.println("Errore");
        }
    };


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
