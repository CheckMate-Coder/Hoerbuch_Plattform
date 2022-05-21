import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;


@Entity
@DiscriminatorValue("Premiumaccount")
public class Premiumaccount extends Account{
	@Column(name="beitrag")
	private double beitrag;
	public Premiumaccount() {
		super();
	}
	public Premiumaccount(String benutzername, String emailAdresse, double beitrag) {
		super(benutzername, emailAdresse);
		this.beitrag=beitrag;
	}

	public double getBeitrag()
	{
		return beitrag;
	}

	public void setBeitrag(double beitrag)
	{
		this.beitrag = beitrag;
	}

}



	
