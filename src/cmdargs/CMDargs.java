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
        Compare com = new Compare();

        com.compare(hand.insArgs(args), hand.staderList());
    }

}
