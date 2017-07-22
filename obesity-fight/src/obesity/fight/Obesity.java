/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obesity.fight;

import byui.cit260.obesity.model.Game;
import byui.cit260.obesity.model.Player;
import citbyui.cit260.obesity.view.StartProgramView;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;






/**
 *
 * @author wdc
 */
public class Obesity {
  private static Game currentGame = null;
  private static Player player = null;
  
  private static PrintWriter outFile = null;
  private static BufferedReader infile = null;
    
  private static PrintWriter logFile = null;
          private static BufferedReader inFile;

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Obesity.outFile = outFile;
    }

    public static BufferedReader getInfile() {
        return infile;
    }

    public static void setInfile(BufferedReader infile) {
        Obesity.infile = infile;
    }

  
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
  
  

    public static void main(String[] args) throws FileNotFoundException {
        
       
           
// create StartProgramView0rig and display start program view
   StartProgramView startProgramView = new StartProgramView();
  startProgramView.displayStartProgramView();
  
    
    }

    public static Player getInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
    
    
