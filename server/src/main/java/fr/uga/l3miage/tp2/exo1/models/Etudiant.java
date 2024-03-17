import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "etudiant")
public class Etudiant {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "agalan")
    private Long agalan;
    
    @Column(name = "nom")
    private String nom;
    
    @Column(name = "email")
    private String email;
    
    @ManyToMany
    private Set<ClubSportif> clubsSportifs ;
    

}
