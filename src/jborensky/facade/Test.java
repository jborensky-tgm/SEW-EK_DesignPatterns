/**
 * Zweck
 * @author BORJR <jborensky@student.tgm.ac.at>
 * @version 20.01.2020 
 */
package jborensky.facade;

public class Test {
   public static void main(String[] args) {
      Klassensprecher jborensky = new Klassensprecher();
      jborensky.infoVeranstaltung("Exkursion");
      jborensky.infoGeld("Exkursion");
      jborensky.infoFehlstunden("Öztürk", 1);		
   }
}
