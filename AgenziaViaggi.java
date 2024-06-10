import java.util.*;

public class AgenziaViaggi {

	// ArrayList di oggetti di tipo Volo --> contiene tutti i voli che venogno
	// aggiunti
	ArrayList<Volo> voli = new ArrayList<Volo>();

	// riceve i dati necessari e aggiunge un nuovo oggetto all'ArrayList
	public void addFlight(Volo volo) {

		voli.add(volo);
		System.out.println(" Volo aggiunto con successo");
	}

	// metodo per visualizzare i voli nazionali o internazionli (riceve la variabile
	// nazionale --> per decidere che cosa visualizzare)
	public void viewFlights(boolean nazionale) {

		// variabile per capire se è presente un volo nazionale o internazionale
		// nell'ArrayList. c rimane =0 allora viene stampato un messaggio per dire che
		// non sono presenti voli di quella categoria
		int c = 0;

		// controllo per eventuale ArrayList vuoto
		if (voli.isEmpty() == false) {
			System.out.println(" indice | compagnia | destinazione | nazionale/internazionale | prenotato");

			// stampa dei voli con seleizone di quali stampare in base a variabile nazionale
			for (int i = 0; i < voli.size(); i++) {
				if (voli.get(i).getNazionale() == nazionale) {
					c++;
					if (nazionale == true) {
						System.out.println(" " + (i) + ". " + voli.get(i).getCompany() + " | "
								+ voli.get(i).getDestinazione() + " | nazionale | " + voli.get(i).getPrenotato());
					} else {
						System.out.println(" " + (i) + ". " + voli.get(i).getCompany() + " | "
								+ voli.get(i).getDestinazione() + " | internazionale | " + voli.get(i).getPrenotato());
					}
				}
			}

			if (c == 0) {
				// feedback nel caso non siano presenti voli del tipo nazionali o internazionali
				System.out.println("Non sono presenti voli di questa tipologia.");
			}
		} else {
			// feedback nel caso non siano presenti voli nell'ArrayList
			System.out.println("Impossibile visualizare voli disponibili: nessun volo presente");
		}
	}

	// metodo per prenotare un volo
	public void bookFlight(int indice) {

		// controllo di indice inserito da user valido
		if (indice >= 0 && indice < voli.size()) {
			// attibuto prenotato --> da false diventa true
			voli.get(indice).prenota();
			// conferma operazione eseguita
			System.out.println(" Volo prenotato con successo: " + (indice) + ". " + voli.get(indice).getCompany()
					+ " | " + voli.get(indice).getDestinazione());
		} else {
			// feedback per indice inserito non valido
			System.out.println(" indice inserito non valido");
		}
	}

	// metodo per cancellare prenotazione volo
	public void cancelFlightBooking(int indice) {
		// controllo di indice inserito da user valido
		if (indice >= 0 && indice < voli.size()) {
			// attibuto prenotato --> da true diventa false
			voli.get(indice).cancellaPrenotazione();
			// conferma operazione eseguita
			System.out.println(" Prenotazione volo cancellata con successo: " + (indice) + ". "
					+ voli.get(indice).getCompany() + " | " + voli.get(indice).getDestinazione());
		} else {
			// feedback per indice inserito non valido
			System.out.println(" indice inserito non valido");
		}
	}

}
