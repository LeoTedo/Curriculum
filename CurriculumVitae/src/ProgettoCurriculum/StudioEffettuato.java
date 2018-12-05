

import java.time.LocalDate;

public class StudioEffettuato extends Curriculum
{
	private String nomeIst;
	private int anniSt;
	private String diplomaCons;
	
	public StudioEffettuato(String id, LocalDate dataInizio, LocalDate dataFine, String descrizione,
			String nomeIst, int anniSt, String diplomaCons) 
	{
		super(id, dataInizio, dataFine, descrizione);
		this.nomeIst = nomeIst;
		this.anniSt = anniSt;
		this.diplomaCons = diplomaCons;
	}

	public String getNomeIst()
	{
		return nomeIst;
	}

	public void setNomeIst(String nomeIst)
	{
		this.nomeIst = nomeIst;
	}

	public int getAnniSt() 
	{
		return anniSt;
	}

	public void setAnniSt(int anniSt) 
	{
		this.anniSt = anniSt;
	}

	public String getDiplomaCons() 
	{
		return diplomaCons;
	}

	public void setDiplomaCons(String diplomaCons) 
	{
		this.diplomaCons = diplomaCons;
	}
}
