import javax.persistence.*;

@Entity
@DiscriminatorValue("manager")
public class Manager extends Employe {
    
    @Column(name = "niveau_gestion")
    private String niveauGestion;
    
}
