import javax.persistence.*;

@Entity
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String rue;

    @Column(nullable = false)
    private String numero;

    @Column(nullable = false)
    private String codePostal;

    @Column(nullable = false)
    private String ville;

}
