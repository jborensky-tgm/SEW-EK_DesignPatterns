/**
 * Zweck
 * @author BORJR <jborensky@student.tgm.ac.at>
 * @version 20.01.2020 
 */
package jborensky.facade;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Schueler {
	private ArrayList<Fehlstunden> fehlstunden;
	private String vname;
	private String nname;
	private int knr;
	
	public Schueler(String v, String n, int k) {
		this.vname = v;
		this.nname = n;
		this.knr = k;
		this.fehlstunden = new ArrayList<Fehlstunden>();
	}
	
	public void addFehlstunden(int uw, int fehl) {
		boolean vorhanden = false;
		for (Fehlstunden f: this.fehlstunden) {
			if (f.getUw() == uw) {
				vorhanden = true;
				Fehlstunden fneu = f;
				fneu.setAnz(fehl);
				this.fehlstunden.remove(f);
				this.fehlstunden.add(fneu);
			}
		}
		if (vorhanden==false) this.fehlstunden.add(new Fehlstunden(uw,fehl));
	}
	
	public Fehlstunden fehl(int uw) {
		for (Fehlstunden f: this.fehlstunden) {
			if (f.getUw() == uw) {
				return f;
			}
		}
		return new Fehlstunden(uw, 0);
	}
	
	/**
	 * @param uw Unterrichtswoche
	 * @return
	 */
	public int getFehlstunden(int uw) {
		for (Fehlstunden f: this.fehlstunden) {
			if (f.getUw() == uw) {
				return f.getAnz();
			}
		}
		return 0;
	}
	
	/**
	 * @return
	 */
	public String getName() {
		return this.vname + " " + this.nname;
	}
	
	/**
	 * @return
	 */
	public String getNName() {
		return this.nname;
	}
}
