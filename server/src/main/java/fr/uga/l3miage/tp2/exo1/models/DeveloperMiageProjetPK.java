import java.io.Serializable;
import javax.persistence.*;

public class DeveloperMiageProjetPK implements Serializable {
    
    @ManyToOne
    @JoinColumn(name = "developer_lastname", referencedColumnName = "lastname")
    private DeveloperMiage developerMiage;
    
    @ManyToOne
    @JoinColumn(name = "projet_id", referencedColumnName = "id")
    private Projet projet;
    
}
