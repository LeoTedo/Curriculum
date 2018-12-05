

import java.time.LocalDate;

public class Diploma extends StudioEffettuato 
{
	private boolean diploma;
	private int durataDip;
	private int votoDip;
	
	public Diploma(String id, LocalDate dataInizio, LocalDate dataFine, String descrizione, String nomeIstituto,
			int anniStudio, String diplomaConseguito, boolean diploma, int durataDip,
			int votoDip) 
	{
		super(id, dataInizio, dataFine, descrizione, nomeIstituto, anniStudio, diplomaConseguito);
		this.diploma = diploma;
		this.durataDip = durataDip;
		this.votoDip = votoDip;
	}

	public boolean isDiploma() {
		return diploma;
	}

	public void setDiploma(boolean diploma) {
		this.diploma = diploma;
	}

	public int getDurataDiploma() {
		return durataDip;
	}

	public void setDurataDiploma(int durataDip) {
		this.durataDip = durataDip;
	}

	public int getVotoDiploma() {
		return votoDip;
	}

	public void setVotoDiploma(int votoDip) {
		this.votoDip = votoDip;
	}

	@Override
	public String toString() 
	{
		System.out.println("");
		System.out.println("Studi effettuati a: " + super.getNomeIstituto());
		System.out.println("Anni di Studio: " + super.getAnniStudio());
		System.out.println("Data Inizio Studio: " + super.getDataInizio());
		System.out.println("Data Fine Studio: " + super.getDataFine());
		if (diploma = true)
		{
			System.out.println("Tipo di Diploma: " + super.getDiplomaConseguito());
			System.out.println("Durata del Diploma: " + durataDip);
			System.out.println("Voto: " + votoDip);
		}else 
		{
			System.out.println("Diploma non Conseguito");
		}
		System.out.println("Descrizione dello Studio Effettuato:");
		return super.getDescrizione();
	}
}
