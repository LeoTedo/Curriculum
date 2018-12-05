

import java.time.LocalDate;

public class Curriculum 
{
	private String id;
	private LocalDate dataInizio;
	private LocalDate dataFine;
	private String descrizione;
	
	public Curriculum(String id, LocalDate dataInizio, LocalDate dataFine, String descrizione) 
	{
		super();
		this.id = id;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		this.descrizione = descrizione;
	}

	public String getId() 
	{
		return id;
	}

	public void setId(String id) 
	{
		this.id = id;
	}

	public LocalDate getDataInizio() 
	{
		return dataInizio;
	}

	public void setDataInizio(LocalDate dataInizio) 
	{
		this.dataInizio = dataInizio;
	}

	public LocalDate getDataFine() 
	{
		return dataFine;
	}

	public void setDataFine(LocalDate dataFine) 
	{
		this.dataFine = dataFine;
	}

	public String getDescrizione() 
	{
		return descrizione;
	}

	public void setDescrizione(String descrizione) 
	{
		this.descrizione = descrizione;
	}
}
