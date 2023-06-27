


public class ECommerce {

    public class Articolo{
        
        int codArticolo;
        String descrizione;
        double prezzo;
        int quantitaMagazzino;
    }

    public class Cliente {
        int codCliente;
        String nome;
        String cognome;
        String email;
        String dataIscrizione;
    }

    public class Carrello{
        int codClienteAssociato;
        int codArticoli;
        double totCarrello;
    }

    public static void main(String[] args){
        System.out.println("E-Commerce");
    }

}
