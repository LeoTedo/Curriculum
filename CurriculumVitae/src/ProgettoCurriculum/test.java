

import java.time.LocalDate;
import java.util.Scanner;

public class test 
{
	public static Scanner sc;
	public static void main(String[] args) 
	{
		String nome;
		String cognome;
		LocalDate dataNascita;
		int giorno;
		int mese;
		int anno;
		int menu;
		String id;
		LocalDate dataInizio;
		LocalDate dataFine;
		String descrizione;
		String nomeAzienda;
		float stNetto;
		boolean corsiAgg = false;
		String tipoC = "No corsi di aggiornamento";
		String nomeIst;
		int anniSt;
		String diplomaCons = "No diploma conseguito";
		boolean diploma = false;
		int durataDip = 0;
		int votoDip = 0;
		int loop = 0;
		
		sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		nome = sc.nextLine();
		System.out.print("Cognome: ");
		cognome = sc.nextLine();
		System.out.println("<Data di Nascita>");
		System.out.print("Giorno: ");
		giorno = sc.nextInt();
		sc.nextLine();
		System.out.print("Mese: ");
		mese = sc.nextInt();
		sc.nextLine();
		System.out.print("Anno: ");
		anno = sc.nextInt();
		sc.nextLine();
		dataDiNascita = LocalDate.of(anno, mese, giorno);
		
		while(loop == 0)
		{
		System.out.println("Scegli un opzione");
		System.out.println("1 per Inserire un'esperienza lavorativa");
		System.out.println("2 per Inserire uno studio effettuato");
		System.out.println("3 per Rimuovere una voce selezionando un id");
		System.out.println("4 per Stampare l'intero Curriculum");
		
		menu = sc.nextInt();
		sc.nextLine();
		
		switch(menu)
		{
			case 1:
				
				System.out.print("Inserisci nome dell'azienda dove hai effettuato l'esperienza: ");
				nomeAzienda = sc.nextLine();
				
				System.out.println("<Data Inizio Esperienza Lavorativa>");
				System.out.print("Giorno: ");
				giorno = sc.nextInt();
				sc.nextLine();
				System.out.print("Mese: ");
				mese = sc.nextInt();
				sc.nextLine();
				System.out.print("Anno: ");
				anno = sc.nextInt();
				sc.nextLine();
				dataInizio = LocalDate.of(anno, mese, giorno);
				
				System.out.println("<Data Fine Esperienza Lavorativa>");
				System.out.print("Giorno: ");
				giorno = sc.nextInt();
				sc.nextLine();
				System.out.print("Mese: ");
				mese = sc.nextInt();
				sc.nextLine();
				System.out.print("Anno: ");
				anno = sc.nextInt();
				sc.nextLine();
				dataFine = LocalDate.of(anno, mese, giorno);
				
				System.out.print("Inserisci lo stipendio netto mensile percepito: ");
				stipendioNetto = sc.nextFloat();
				sc.nextLine();
				
				System.out.println("Hai effettuato dei corsi di aggiornamento");
				System.out.println("1 se Si");
				System.out.println("2 se No");
				menu = sc.nextInt();
				sc.nextLine();
				switch(menu) 
				{
				case 1:
					corsiAggiornamento = true;
					System.out.println("Che tipo di corso hai effettuato?");
					tipoCorso = sc.nextLine();
					break;
				case 2:
					corsiAggiornamento = false;
					break;
				default:
					System.out.println(menu + " non corrisponde a nessuna voce del menu");
					System.out.println("Che tipo di corso hai effettuato?");
					System.out.println("1 se Si");
					System.out.println("2 se No");
					menu = sc.nextInt();
					sc.nextLine();
					break;
				}
				
				System.out.println("Inserisci una descrizione dell'esperienza lavorativa: ");
				descrizione = sc.nextLine();
				
				System.out.print("Inserisci un id per questa esperienza lavorativa: ");
				id = sc.nextLine();
				
				EsperienzaLavorativa l = new EsperienzaLavorativa(id, dataInizio, dataFine, descrizione, nomeAzienda, stNetto, corsiAgg, tipoC);
				
				ArchivioEsperienzeLavorative.aggiungiEsperienzaLavorativa(l);
				
				break;
			case 2:
				
				System.out.print("Qual'è il nome dell'istituto dove hai studiato: ");
				nomeIstituto = sc.nextLine();
				
				System.out.print("Per quanti anni hai studiato li: ");
				anniStudio = sc.nextInt();
				
				System.out.println("<Data Inizio Studio>");
				System.out.print("Giorno: ");
				giorno = sc.nextInt();
				sc.nextLine();
				System.out.print("Mese: ");
				mese = sc.nextInt();
				sc.nextLine();
				System.out.print("Anno: ");
				anno = sc.nextInt();
				sc.nextLine();
				dataInizio = LocalDate.of(anno, mese, giorno);
				
				System.out.println("<Data Fine Studio>");
				System.out.print("Giorno: ");
				giorno = sc.nextInt();
				sc.nextLine();
				System.out.print("Mese: ");
				mese = sc.nextInt();
				sc.nextLine();
				System.out.print("Anno: ");
				anno = sc.nextInt();
				sc.nextLine();
				dataFine = LocalDate.of(anno, mese, giorno);
	
				System.out.println("Inserisci una descrizione per questo studio: ");
				descrizione = sc.nextLine();
				
				System.out.print("Inserisci un id per questo studio: ");
				id = sc.nextLine();
				
				System.out.println("Hai conseguito il diploma:");
				System.out.println("1 se Si");
				System.out.println("2 se No");
				menu = sc.nextInt();
				sc.nextLine();
				switch(menu)
				{
				case 1:
					diploma = true;
					
					System.out.print("Quale diploma hai conseguito: ");
					diplomaConseguito = sc.nextLine();
					
					System.out.print("Quale voto hai preso: ");
					votoDiploma = sc.nextInt();
					sc.nextLine();
					
					System.out.print("Quanto dura il diploma: ");
					durataDiploma = sc.nextInt();
					sc.nextLine();				
					break;
				case 2:
					diploma = false;				
					break;
				default:
					System.out.println(menu + " non corrisponde a nessuna voce del menu");
					System.out.println("Hai conseguito il diploma:");
					System.out.println("1 se Si");
					System.out.println("2 se No");
					menu = sc.nextInt();
					break;
				}
	
				StudioEffettuato d = new Diploma(id, dataInizio, dataFine, descrizione, nomeIstituto, anniStudio, diplomaConseguito, diploma, durataDip, votoDip);
				
				ArchivioStudiEffettuati.aggiungiStudio (d);
				
				break;
			case 3:
				
				System.out.println("Cosa desideri rimuovere?");
				System.out.println("1 per Un'esperienza lavorativa");
				System.out.println("2 per Uno studio effettuato");
				menu = sc.nextInt();
				sc.nextLine();
				switch(menu)
				{
				case 1:
					System.out.println("Inserisci l'id dell'esperienza lavorativa che desideri rimuovere");
					id = sc.nextLine();	
					
					ArchivioEsperienzeLavorative.rimuoviEsperienzaLavorativa(id);
					
					break;
				case 2:
					System.out.println("Inserisci l'id dello studio che desideri rimuovere");
					id = sc.nextLine();	
					
					ArchivioStudiEffettuati.rimuoviStudioEffettuato(id);
					
					break;
				default:
					System.out.println(menu + " non corrisponde a nessuna voce del menu");
					System.out.println("Cosa desideri rimuovere?");
					System.out.println("1 per Un'esperienza lavorativa");
					System.out.println("2 per Uno studio effettuato");
					menu = sc.nextInt();
					break;
				}
				
				break;
			case 4:
				
				System.out.println("Nome: " + nome);
				System.out.println("Cognome: " + cognome);
				System.out.println("Data di Nascita: " + dataDiNascita);
				System.out.println("");
				System.out.println("<Studi Effettuati>");
				ArchivioStudiEffettuati.stampaStudiEffettuati();
				System.out.println("");
				System.out.println("<Esperienze Lavorative>");
				ArchivioEsperienzeLavorative.stampaEsperienzeLavorative();
				break;
			default:
				System.out.println(menu + " non corrisponde a nessuna voce del menu");
				break;
			}
		}
	}
}
