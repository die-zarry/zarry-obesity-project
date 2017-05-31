/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obesity.fight;

import byui.cit260.obesity.model.Player;

/**
 *
 * @author wdc
 */
public class Obesity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Player playerOne = new Player ();
    
    playerOne.setName("Zarry die");
    playerOne.setBestTime(6.00);
    
    String playerInfo = playerOne.toString();
    System.out.println(playerInfo);
    
    } 
   
}
