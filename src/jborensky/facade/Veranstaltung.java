/**
 * Zweck
 * @author BORJR <jborensky@student.tgm.ac.at>
 * @version 20.01.2020 
 */
package jborensky.facade;

import java.util.Map;
import java.util.TreeMap;

public class Veranstaltung implements Organisation {
	private String beschreibung;
	private String status;
	private String geld;
	
	public Veranstaltung(String s, int status) {
		this.beschreibung = s;
		this.setStatus(status);
	}
	
	public void setStatus(int i) {
		switch(i) {
			case 0: this.status="in Planung"; break;
			case 1: this.status="genehmigt"; break;
			case 2: this.status="erledigt"; break;
			default: this.status="unbekannt";break;
		}
	}
	
	public void setGeld(int i) {
		switch(i) {
			case 0: this.geld="nicht eingesammelt"; break;
			case 1: this.geld="eingesammelt"; break;
			case 2: this.geld="übergeben"; break;
			default: this.geld="unbekannt";break;
		}
	}
	
   @Override
   public void info() {
	  String output = String.format("Beschreibung: %s \nStatus: %s", beschreibung, status);
      System.out.println(output);
   }

/**
 * @return the geld
 */
public String getGeld() {
	return geld;
}

/**
 * @param geld the geld to set
 */
public void setGeld(String geld) {
	this.geld = geld;
}
}