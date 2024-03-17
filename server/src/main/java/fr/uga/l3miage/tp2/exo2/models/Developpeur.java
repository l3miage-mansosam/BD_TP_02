import javax.persistence.*;

@Entity
@DiscriminatorValue("developpeur")
public class Developpeur extends Employe {
    
    @Column(name = "langage_prefere")
    private String langagePrefere;
    
    @Column(name = "niveau_competence")
    private String niveauCompetence;
    
}
