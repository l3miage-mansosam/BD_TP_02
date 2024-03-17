import javax.persistence.*;

@Entity
@Table(name = "developer_miage")
public class DeveloperMiage {
    
    @Id
    @Column(name = "lastname")
    private String lastname;
    
    @Column(name = "firstname")
    private String firstname;
    
    @Column(name = "email")
    private String email;
    
}
