import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "club_sportif")
public class ClubSportif {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "nom")
    private String nom;
    
    @Column(name = "description")
    private String description;
    
    @ManyToMany(mappedBy = "clubsSportifs")
    private Set<Etudiant> etudiants;
    

}
