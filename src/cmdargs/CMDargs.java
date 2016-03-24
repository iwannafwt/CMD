/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmdargs;

/**
 *
 * @author ΙΩΑΝΝΑ
 */
public class CMDargs {

    /** 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        hand hand = new hand();
        
        // einai ta kleidia pou exw orisei
        hand.registerKey("iwanna"); 
        hand.registerKey("katerina");
        
        boolean f = hand.insArgs(args);
        
       //ean to f einai true tote tipwnei 
        if (f){
            System.out.println("Value for iwanna : " + hand.getDataWithKey("iwanna"));
            System.out.println("Value for katerina : " + hand.getDataWithKey("katerina"));
        } else {
            System.out.println("An error was here.. or there..");
        }        
    }
}
