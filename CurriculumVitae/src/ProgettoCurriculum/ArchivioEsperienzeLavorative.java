
import java.util.*;

public class ArchivioEsperienzeLavorative 
{
	static int indice = 0;
	
	static ArrayList<EsperienzaLavorativa> listaEsperienzeLavorative = new ArrayList<EsperienzaLavorativa>();
	
	public static void aggiungiEsperienzaLavorativa (EsperienzaLavorativa l)
	{
		listaEsperienzeLavorative.add (l);
		indice = indice + 1;
	}
	
	public static void rimuoviEsperienzaLavorativa(String id)
	{
		
		for (EsperienzaLavorativa a: listaEsperienzeLavorative ) 
		{
			if ( id.equals(a.getId()) ) 
			{
					listaEsperienzeLavorative.remove(a);
			}
		}
	}
	
	public static void stampaEsperienzeLavorative()
	{
		for (int i = 0; i < listaEsperienzeLavorative.size(); i ++) 
		{
			listaEsperienzeLavorative .toString();
		}
	}
	
}
