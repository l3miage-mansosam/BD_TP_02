import javax.persistence.*;

@Entity
@Table(name = "developer_miage_projet")
@IdClass(DeveloperMiageProjetPK.class)
public class DeveloperMiageProjet {
    
    @Id
    @ManyToOne
    private DeveloperMiage developerMiage;
    
    @Id
    @ManyToOne
    private Projet projet;
    
}
