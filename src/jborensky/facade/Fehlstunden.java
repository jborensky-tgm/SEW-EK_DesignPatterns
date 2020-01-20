/**
 * Zweck
 * @author BORJR <jborensky@student.tgm.ac.at>
 * @version 20.01.2020 
 */
package jborensky.facade;

public class Fehlstunden implements Organisation {
	private int uw;
	/**
	 * @return the uw
	 */
	public int getUw() {
		return uw;
	}

	/**
	 * @param uw the uw to set
	 */
	public void setUw(int uw) {
		this.uw = uw;
	}

	/**
	 * @return the anz
	 */
	public int getAnz() {
		return anz;
	}

	private int anz;
	
	public Fehlstunden(int uw, int anz) {
		this.uw=uw;
		this.anz=anz;
	}
	
	public void setAnz(int anz) {
		this.anz = this.anz+anz;
	} 
	
   @Override
   public void info() {
	  String output = String.format("Fehlstunden (UW - %d): %d", this.uw, this.anz);
      System.out.println(output);
   }
}