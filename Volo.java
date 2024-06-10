
public class Volo {

	// attributi di oggetto Volo
	private String destinazione;
	private String company;
	private Boolean nazionale;
	private Boolean prenotato;

	// costruttore per nuovo oggetto Volo
	Volo(String destinazione, String company, Boolean nazionale, Boolean prenotato) {
		this.destinazione = destinazione;
		this.company = company;
		this.nazionale = nazionale;
		this.prenotato = prenotato;
	}

	public String getDestinazione() {
		return destinazione;
	}

	public String getCompany() {
		return company;
	}

	public Boolean getNazionale() {
		return nazionale;
	}

	public Boolean getPrenotato() {
		return prenotato;
	}

	public void prenota() {
		prenotato = true;
	}

	public void cancellaPrenotazione() {
		prenotato = false;
	}

}
