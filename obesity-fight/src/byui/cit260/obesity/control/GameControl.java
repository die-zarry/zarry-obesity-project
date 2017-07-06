/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.control;

import byui.cit260.obesity.model.Game;
import byui.cit260.obesity.model.Player;
import java.util.Map;
import obesity.fight.Obesity;

/**
 *
 * @author wdc
 */
public class GameControl {

    public static void createNewGame(Player player) { 
     
    
    Game game = new Game(); // create new game
    Obesity.setCurrentGame(game);// save in Obesity
    
    game.setPlayer(player); // save player
    
    // create the inventory list and save in the game
    

    }
    


    
    
    
    

    public static void createGameOjectif(Player player) {
        System.out.println("\n**** dysplay stubb function () called*****");
    }

    private static void createInventoryList() {
        System.out.println("*****InventoryItem () function called*****");
    }

    public static Player createPlayer(String playersName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

   
    private static class obesity {

        private static void setPlayer(Player player) {
            System.out.println("\n Display the gameContol");
        }

    }

    private static class InventoryItem {

        public InventoryItem() {
        }
    }

    private static class Body {

        public Body() {
        }
    }
 

}