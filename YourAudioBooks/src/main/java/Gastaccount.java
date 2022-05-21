import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;


@Entity
@DiscriminatorValue("Gastaccount")
public class Gastaccount extends Account{
	@Column(name="werbung")
	private String werbung;
	public Gastaccount() {
		super();
	}
	public Gastaccount(String benutzername, String emailAdresse, String werbung) {
		super(benutzername, emailAdresse);
		this.werbung=werbung;
	}

	public String getWerbung()
	{
		return werbung;
	}

	public void setWerbung(String werbung)
	{
		this.werbung = werbung;
	}

}



	
