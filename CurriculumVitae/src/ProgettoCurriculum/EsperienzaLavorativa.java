

import java.time.LocalDate;

public class EsperienzaLavorativa extends Curriculum
{
	private String nomeAzienda;
	private float stNetto;
	private boolean corsiAgg;
	private String tipoC;
	
	public EsperienzaLavorativa(String id, LocalDate dataInizio, LocalDate dataFine, String descrizione,
			String nomeAzienda, float stNetto, boolean corsiAgg, String tipoC) 
	{
		super(id, dataInizio, dataFine, descrizione);
		this.nomeAzienda = nomeAzienda;
		this.stNetto = stNetto;
		this.corsiAgg = corsiAgg;
		this.tipoC = tipoC;
	}

	public String getNomeAzienda() 
	{
		return nomeAzienda;
	}

	public void setNomeAzienda(String nomeAzienda) 
	{
		this.nomeAzienda = nomeAzienda;
	}

	public float getStNetto() 
	{
		return stNetto;
	}

	public void setStNetto(float stNetto) 
	{
		this.stNetto = stNetto;
	}

	public boolean getCorsiAgg() 
	{
		return corsiAgg;
	}

	public void setCorsiAgg(boolean corsiAgg) 
	{
		this.corsiAgg = corsiAgg;
	}

	public String getTipoC() 
	{
		return tipoC;
	}

	public void setTipoC(String tipoC) 
	{
		this.tipoC = tipoC;
	}

	@Override
	public String toString() 
	{
		System.out.println("");
		System.out.println("Esperienza Lavorativa Effettuata a: " + nomeAzienda);
		System.out.println("Data di Inizio dell'Esperienza Lavorativa: " + super.getDataInizio());
		System.out.println("Data Fine dell'Esperienza Lavorativa: " + super.getDataFine());
		System.out.println("Stipendio Netto Mensile Conseguito: " + stNetto);
		if (corsiAgg = true)
		{
			System.out.println("Corso di Aggiornamento Effettuato: " + tipoC);
		}else 
		{
			System.out.println("Nessun Corso di Aggiornamento Effettuato");
		}
		System.out.println("Descriozione dell'Esperienza Lavorativa");
		return super.getDescrizione();
	}
	
}
