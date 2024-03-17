import javax.persistence.*;
import java.util.List;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String email;

    @OneToOne
    private Adresse adresse;

    @OneToMany(mappedBy = "client")
    private List<Commande> commandes;

}
