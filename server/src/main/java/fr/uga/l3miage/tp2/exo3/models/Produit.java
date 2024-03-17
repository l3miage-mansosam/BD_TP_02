import javax.persistence.*;

@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private Double prix;

    @Column(nullable = false)
    private int quantite;

    @ManyToOne
    private Commande commande;

    @ManyToOne
    private CategorieDeProduit categorie;

}
