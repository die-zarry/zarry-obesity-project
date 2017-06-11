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
public class HelpMenuView { 
    private String menu;
    public HelpMenuView(){
    this.menu = "\n"
                +"\n------------------------------------"
                + "\n| Main Menu                         |"
                +"\nL - The goal of the game"
                +"\nC-  calorie amount per meal "
                +"\nE - The level of exercice to burn an amount of calorie"
                +"\n--------------------------------------";
            
            
            }

     void displayHelpMenuView() {
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
       System.out.println("\n" + this.menu);
       
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
        case "L": // the goal of the game
              this.displayGoal();
              break;
        case "C": //calorie amount per meal
               this.displayCalorieAmount();
               break;
        case "E": // the level of exercice to be burn per execice
               this.displayExerciceLevel();
               break;
               
        case "I": // the range Body mass Index
               this.displayBmi();
               break;
               
        default:
             System.out.println("\n****Invalid selection**** try again");

    }
        
        return false;
    
    }  

    
    private void displayGoal() {
       System.out.println("**** displayGoal function called ***");  
    }

    private void displayCalorieAmount() {
       System.out.println("**** displayCalorieAmount function called ***");  
    }

    private void displayExerciceLevel() {
        System.out.println("**** displayExercice function called ***"); 
    }

    private void displayBmi() {
     System.out.println("**** displayBmi function called ***");   
    }

    
}

    
    

