package exercise;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( name = "persona")
public class Persona {

    @id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cognome")
    private String cognome;

    @Column(name = "email")
    private String email;

    @Column(name = "nascita")
    private Date nascita;

    @Column(name = "sesso")
    private String sesso;


    public Persona(String nome, String cognome, String email, Date nascita, String sesso){
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.nascita = nascita;
        this.sesso = sesso;
    }




}   

