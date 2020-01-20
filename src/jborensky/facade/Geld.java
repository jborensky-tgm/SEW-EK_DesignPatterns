/**
 * Zweck
 * @author BORJR <jborensky@student.tgm.ac.at>
 * @version 20.01.2020 
 */
package jborensky.facade;

public class Geld implements Organisation {
	private String geld;
	
	public Geld(int i) {
		setGeld(i);
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
	  String output = String.format("Geld-Status: %s", geld);
      System.out.println(output);
   }
}