import javax.persistence.*;
import java.util.List;

@Entity
public class CategorieDeProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    @OneToMany(mappedBy = "categorie")
    private List<Produit> produits;

}
