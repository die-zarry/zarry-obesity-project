/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obesity.fight;

import byui.cit260.obesity.model.Game;
import byui.cit260.obesity.model.Player;
import citbyui.cit260.obesity.view.StartProgramView;






/**
 *
 * @author wdc
 */
public class Obesity {
  private static Game currentGame = null;
  private static Player player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Obesity.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Obesity.player = player;
    }
  
  

    public static void main(String[] args) {
    
   // create StartProgramView0rig and display start program view
   StartProgramView startProgramView = new StartProgramView();
  startProgramView.displayStartProgramView();
  
    } 
   
}
