import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;




@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="ATyp", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("Account")
@Table(name ="Hib_Account")
public class Account {
	@Column(name="accountId")
	@Id
	@GeneratedValue
	private Long accountId;
	@Column(name="benutzername")
	private String benutzername;
	@Column(name="emailAdresse")
	private String emailAdresse;
	
	Account(){
		
	}
	Account(String benutzername, String emailAdresse)
	{
		this.benutzername = benutzername;
		this.emailAdresse = emailAdresse;
	}
	public String getBenutzername() {
		return benutzername;
	}
	public void setBenutzername(String benutzername) {
		this.benutzername = benutzername;
	}
	public String getEmailAdresse() {
		return emailAdresse;
	}

	public void setEmailAdresse(String emailAdresse) {
		this.emailAdresse = emailAdresse;
	}

	public long getAccountId() {
		return accountId;
	}
}


	

	
