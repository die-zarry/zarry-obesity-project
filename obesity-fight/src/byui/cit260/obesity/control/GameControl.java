/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.control;

import byui.cit260.obesity.model.Player;
import byui.cit260.obesity.control.GameControl;

/**
 *
 * @author wdc
 */
public class GameControl {
      

    public static Player createPlayer(String Name) { 
        if(Name == null){
        return null;
       }
    Player player = new Player ();
    player.setName(Name);
    
    obesity.setPlayer(player);// save the palyer 
    return player;
    }
public static void createNewGame(Player player){
    System.out.println("\n *** displayMenu stub function called");
}
    private static class obesity {

        private static void setPlayer(Player player) {
            System.out.println("\n Display the gameContol");
        }

  
        

        public obesity() {
        }
    }
    
}

