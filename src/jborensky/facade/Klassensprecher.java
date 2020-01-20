/**
 * Zweck
 * @author BORJR <jborensky@student.tgm.ac.at>
 * @version 20.01.2020 
 */
package jborensky.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Klassensprecher {
   private List<Schueler> fehlstunden;
   private Map<String, Veranstaltung> ver;   
   private Map<String, Geld> verGeld;

   public Klassensprecher() {
	  fehlstunden = new ArrayList<>();
	  fehlstunden.add(new Schueler("Ahmed", "Öztürk", 0));
	  for (Schueler s: fehlstunden) {
		  if (s.getNName().equals("Öztürk")) {
			  Schueler schueler = s;
			  schueler.addFehlstunden(1,200);
			  fehlstunden.remove(s);
			  fehlstunden.add(schueler);
		  }
	  }
	  ver = new TreeMap<>();
	  ver.put("Exkursion", new Veranstaltung("Exkursion - Shades Tour, PRUL", 0));
	  verGeld = new TreeMap<>();
	  verGeld.put("Exkursion", new Geld(0));
	  
   }

   public void infoFehlstunden(String name, int uw){
      for (Schueler f:fehlstunden) {
    	  if(f.getNName().equals(name)) {
    		  f.fehl(uw).info();
    	  }
      }
   }
   public void infoVeranstaltung(String name){
      this.ver.get(name).info();
   }
   public void infoGeld(String name){
      this.verGeld.get(name).info();
   }
}
