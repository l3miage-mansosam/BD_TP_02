import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date date;

    @Column(nullable = false)
    private Double montantTotal;

    @ManyToOne
    private Client client;

    @OneToMany(mappedBy = "commande")
    private List<Produit> produits;

}
