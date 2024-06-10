import java.util.*;

public class Start {

	public static void main(String[] args) {

		// oggetto tipo Scanner per gli input
		Scanner keyboard = new Scanner(System.in);

		// oggetto tipo AgenziaViaggi per richiamare i metodi della classe
		AgenziaViaggi av = new AgenziaViaggi();

		String destinazione, compagnia;
		Boolean nazionale, prenotato;

		// variabile per il do-while --> se = 7 allora l'esecuzione esce dal do-while
		int c = 0;

		do {
			// menu per utilizzo delle funzionalità --> user inserisce un numero in base
			// allazione che desidera effettuare
			System.out.println("\nscegli un'opzione dal menu:\r\n" + "1. Aggiungi volo nazionale\r\n"
					+ "2. Aggiungi volo internazionale\r\n" + "3. Visualizza voli nazionali disponibili\r\n"
					+ "4. Visualizza voli internazionali disponibili\r\n" + "5. Prenota un volo\r\n"
					+ "6. Cancella la prenotazione di un volo\r\n" + "7. Esci");
			c = keyboard.nextInt();

			switch (c) {
			// aggiunge un volo nazionale
			case 1:
				// input dei dati necessari
				System.out.print(" Inserisci la destinazione: ");
				destinazione = keyboard.next();
				System.out.print(" Inserisci la compagnia aerea: ");
				compagnia = keyboard.next();
				nazionale = true;
				prenotato = false;

				// aggiunta effettiva dal nuovo volo nell'ArrayList in classe AgenziaViaggi
				av.addFlight(new Volo(destinazione, compagnia, nazionale, prenotato));
				break;

			// aggiunge un volo internazionale
			case 2:
				// input dei dati necessari
				System.out.print(" Inserisci la destinazione: ");
				destinazione = keyboard.next();
				System.out.print(" Inserisci la compagnia aerea: ");
				compagnia = keyboard.next();
				nazionale = false;
				prenotato = false;

				// aggiunta effettiva dal nuovo volo nell'ArrayList in classe AgenziaViaggi
				av.addFlight(new Volo(destinazione, compagnia, nazionale, prenotato));
				break;

			// visualizza voli nazionali
			case 3:
				// nel metodo in calsse AgenziaViaggi stampa solo oggetti di tipo Volo che hanno
				// attributo nazionale = true
				nazionale = true;
				av.viewFlights(nazionale);
				break;

			// visualizza voli internazionali
			case 4:
				// nel metodo in calsse AgenziaViaggi stampa solo oggetti di tipo Volo che hanno
				// attributo nazionale = false
				nazionale = false;
				av.viewFlights(nazionale);
				break;

			// prenota un volo dopo richiedere in input il suo indice
			case 5:
				System.out.print(" Inserisci l'indice del volo che desideri prenotare: ");
				int indice = keyboard.nextInt();
				av.bookFlight(indice);
				break;

			// cancella prenotazione di un volo dopo richiedere in input il suo indice
			case 6:
				System.out.print(" Inserisci l'indice del volo che desideri prenotare: ");
				int indice1 = keyboard.nextInt();
				av.cancelFlightBooking(indice1);
				break;

			// uscita dal programma --> input di c =7 quindi l'esecuzione esce dal do-shile
			// e il programma termina
			case 7:
				System.out.println("\nDisconnessione in corso");
				break;

			// se c<1 or c>7 --> nessun case presente nellop switch --> feedback per lo user
			default:
				System.out.println("valore inserito non valido: riprovare");
				break;
			}
		} while (c != 7);

		keyboard.close();
	}

}
