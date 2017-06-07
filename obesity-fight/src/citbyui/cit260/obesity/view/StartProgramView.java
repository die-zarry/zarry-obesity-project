/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.obesity.view;

import byui.cit260.obesity.control.GameControl;
import byui.cit260.obesity.model.Player;
import java.util.Scanner;
import static sun.audio.AudioPlayer.player;

/**
 *
 * @author wdc
 */
public class StartProgramView {
    private String promptMessage;

    public StartProgramView(){
this.promptMessage = "\nPlease enter your name: ";
    // display the banner when view is created
     this.displayBanner();
    }

    private void displayBanner() {
    System.out.println(
     "\n********************"
   + "\n*                    *"
   + "\n* This is the game to fight Obesity*"
   + "\n* In this game you will fight against obesity by contolling your diet *"
   +"\n* and by selecting the appropriate exercice to do. *"
   + "\n* Your goal is to fight aganst obesity*"
   + "\n* your action will be the food you eat and the appropriate selected excercice*"
   + "\n* you will measure your performance( winning or lossing)either according to your weight*"
   + "\n*loss or gain durring a specific period of time*"
   + "\n* or the amount of calorie in and out for a certain period*"
   +"\n* Your will learn about your BMI as your enter your weight, height and age*"
   + "\n* a panoply of choice will be display based on your BMI*"
   +"\n* your BMI will be in a range from Severe thin to obesity type III*"
   + "\n* you will build your meal and choose the approprate workout based on your BMI *"
   +"\n*******************"
   +"\n* Good luck and have fun in this adventure.*"
   +"\n****                                                                       *"
   +"\n************************************************************************************"
    );
    }

    /***
     * display the start program view
     */
    public void displayStartProgramView() {
      boolean done = false; // set flag to not done
      do {
          // prompt for and get players name
          String playersName = this.getPlayersName();
      
          if (playersName.toUpperCase().equals("Q")) // user wants to quit
           return; // exit the game
          
         // do the requested action and display the next view
           done = this.doAction(playersName);
           
      } while(!done);
           
    }

    private String getPlayersName() {
     
       Scanner keyboard = new Scanner (System.in); //get infile keyborad 
       String  value = ""; // value to be return 
       boolean valid = false; // initiallize to not valaid
       
       while (!valid) { // loop while invalid is entered
       System.out.println("\n" + this.promptMessage);
       
       value = keyboard.nextLine();// get next line type on keyboard
       value = value.trim(); // trim off leading and trailing blanks
       
       
       if (value.length() < 1) { // value is blank
           System.out.println("\nIvalid value: value can not be one blank");
       continue;
      
       }
       break; // end the loop
       }
       return value; // return the value entered
    }    
  

    private boolean doAction(String playersName) {
        if (playersName.length() < 2) {
       System.out.println("\nInvalid players name:"
               + "The name must be gretaer than one character in length");
        return false;
         }
    
    // call createPlayer () control function
    Player player = GameControl.createPlayer(playersName);
    if(player == null){// if successful
    System.out.println("\nError creating the player.");
    return false;
    }
    // display next view
    this.displayNextView();
    return true; // sucess!
    }

    private void displayNextView() {
    
     // display a custom welcome message
     System.out.println("\n==================================="
                       + "\n welcome to the game" + player.getName()
                       +"\n we hope you have a lot of fun!"
                       +"\n================================="
                        );
    // create MainMenuView object
    MainMenuView mainMenuView = new MainMenuView();
           
     // Display the main menu view
      mainMenuView.displayMainMenuView();
    
       
    }
}
 


      
    


