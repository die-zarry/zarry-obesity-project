/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.control;

import byui.cit260.obesity.model.Player;


/**
 *
 * @author wdc
 */
public class GameControl {
      

    public static Player createPlayer(String name) { 
     if(name == null){
         return null;
    }
    Player player = new Player ();
    player.setName(name);
    
    obesity.setPlayer(player);// save the player 
    return player;
    }

    public static void createNewGame(Player player) {
      System.out.println("\n **** create New Game stub function called");
    }

    public static void createGameOjectif(Player player) {
        System.out.println("\n**** dysplay stubb function () called*****");
    }


    

    private static class obesity {

        private static void setPlayer(Player player) {
            System.out.println("\n Display the gameContol");
        }

        public obesity() {
        }
    }
   
    
}

