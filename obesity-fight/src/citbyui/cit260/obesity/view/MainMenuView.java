/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.obesity.view;

import java.util.Scanner;

/**
 *
 * @author wdc
 */
public class MainMenuView {
    private String menu;
    private String promptMessage;

    public MainMenuView(){
    this.menu = "\n"
                + "\n------------------------------------"
                + "\n| Main Menu                         |"
                +"\nN - Start new Game"
                +"\nG- Get and start saved game"
                +"\nH - Get help on how to play the game"
                +"\nS - Save game"
                +"\nQ- Quit"
                +"\n--------------------------------------";
            
        
    }
    
    /**
     * display the start program view
     *
     */
    public void displayMainMenuView() {
        boolean done = false; // set flag to not done
        do{
            // prompt for  and get players name
            String menuOption = this.getMenuOption();
            if(menuOption.toUpperCase().equals("Q"))// user wants to quit
            return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
        }while(!done);
    }

    private String getMenuOption() {
        
        /*
        *ok get this to the getplayersAnme ()function
        */
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
        
     
    private boolean doAction(String choice) {
        choice = choice.toUpperCase(); //convert choice to upper case
    switch (choice){
        case "N": // create and start a new game
              this.startNewGame();
              break;
        case "G": // get and start an existing game
              this.startExistingGame();
              break;
        case "H": //display the help menu
               this.displayHelpMenu();
               break;
        case "S": // save curent game
               this.saveGame();
               break;
        default:
             System.out.println("\n****Invalid selection**** try again");

    }
        
        return false;
    
    }

    private void startNewGame() {
       System.out.println("****startNewGame function ");
    }

    private void startExistingGame() {
     System.out.println("****startExistingGame function called ");   
    }

    private void saveGame() {
        System.out.println("****startExistingGame function called "); 
    }

    private void displayHelpMenu() {
       System.out.println("****displayHelpmenu function called ");  
    }
         
    
    
}
