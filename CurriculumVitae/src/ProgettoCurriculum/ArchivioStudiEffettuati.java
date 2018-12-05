

import java.util.*;

public class ArchivioStudiEffettuati 
{
	static int indice = 0;
	
	static ArrayList<StudioEffettuato> listaStudiEffettuati = new ArrayList<StudioEffettuato>();
	
	public static void aggiungiStudio (StudioEffettuato s)
	{
		listaStudiEffettuati.add (s);
		indice = indice + 1;
	}
	
	public static void rimuoviStudioEffettuato(String id)
	{
		for (StudioEffettuato a: listaStudiEffettuati ) 
		{
			if ( id.equals(a.getId()) ) 
			{
				listaStudiEffettuati.remove(a);
			}
		}
	}
	
	public static void stampaStudiEffettuati()
	{
		for (int i = 0; i < listaStudiEffettuati.size(); i ++) 
		{
			listaStudiEffettuati .toString();
		}
	}
}
