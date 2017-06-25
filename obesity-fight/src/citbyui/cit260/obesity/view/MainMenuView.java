package citbyui.cit260.obesity.view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import byui.cit260.obesity.control.GameControl;
import byui.cit260.obesity.control.IndividualBmiControl;
import byui.cit260.obesity.model.GameMenuView;
import citbyui.cit260.obesity.view.HelpMenuView;
import java.util.Scanner;
import obesity.fight.Obesity;

/**
 *
 * @author wdc
 */
public class MainMenuView extends View {
           public MainMenuView(){
                super("\n                            "
                + "\n------------------------------------"
                + "\n| Main Menu                         |"
                +"\nN - Start new Game"
                +"\nG- Get and start saved game"
                +"\nH - Get help on how to play the game"
                +"\nS - Save game"
                +"\nQ- Quit"
                +"\n--------------------------------------");
            }

    /**
     * display the start program view
     *
     */
     @Override 
    public boolean doAction(String value) {
        value = value.toUpperCase(); // convert to all upper case
               return false;
        
    
    }
    private void startNewGame() {
        // Create  new game
       GameControl.createNewGame(Obesity.getPlayer());
      // display the game view
       GameMenuView gameMenu = new GameMenuView();
     gameMenu.dysplayMenu();
    }
    private void createGameMenu() {
        // Display the game Menu View
     System.out.println("****createGame menu function called ");   
    }
    
 private void displayHelpMenu() {
       GameControl.createNewGame(Obesity.getPlayer());
       // dysplay help menu
       HelpMenuView helpMenu = new HelpMenuView();
       helpMenu.display();    }
 
    private void saveGame() {
        System.out.println("****saveGame function called "); 
    }

    private void displayBmiMenu() {
        GameControl.createNewGame(Obesity.getPlayer());
       // dysplay BMI menu
        BmiMenuView BmiMenu = new BmiMenuView();
       BmiMenu.display(); 
    }


    private void displayIndividualBmiControl() {
     GameControl.createNewGame(Obesity.getInput());
       // dysplay Individual BMI
       IndividualBmiControl IndividualBmiControlMenu = new IndividualBmiControl();
       IndividualBmiControlMenu.displayIndividualBmiControl();  
    }

    private static class CalcBmiOfIndividualMenuView {

        public CalcBmiOfIndividualMenuView() {
        }  
    }

}

    
