package exercise;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "location")
public class Location {
    @id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "citta")
    private String citta;
}
