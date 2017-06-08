/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.obesity.view;

import byui.cit260.obesity.control.GameControl;
import byui.cit260.obesity.model.GameMenuView;
import java.util.Scanner;

/**
 *
 * @author wdc
 */
public class HelpMenuView {
    
    private String menu;
    private String promptMessage;
    public HelpMenuView(){
    this.menu = "\n"
                +"\n------------------------------------"
                + "\n| Main Menu                         |"
                +"\nL - The goal of the game"
                +"\nC-  calorie amount per meal "
                +"\nE - The level of exercice to burn an amount of calorie"
                +"\nD - diet that is appropriate"
                +"\nB-  how to interpret the body mass index" 
                +"\nR - range og the body mass index"
                +"\nQ - quit the game"
                +"\n--------------------------------------";
            
            
            }

    public void displayHelpMenuView() {
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
        case "L": // the goal of the game
              this.GoalOftheGame();
              break;
        case "C": //calorie amount per meal
               this.CalorieAmountMeal();
               break;
        case "E": // the level of exercice to be burn per execice
               this.LeveoOfExercice();
               break;
        case "D": // the appropriate diet definition
              this.DietDefintion();
              break;
        case "B": //The interpretation of BMI
            this.interpretationBmi();
               break;
        case "R": // range of BMI
               this.rangeOfBmi();
               break;
        case "Q": // quit the game
              this.QuitGame();
              break;
               
        default:
             System.out.println("\n****Invalid selection**** try again");

    }
        
        return false;
    
    }  


    private void GoalOftheGame() {
      System.out.println("****startExistingGame function called "); 
    }

    private void CalorieAmountMeal() {
      System.out.println("****startExistingGame function called ");
    }

    private void LeveoOfExercice() {
    System.out.println("****startExistingGame function called ");    
    }

    private void DietDefintion() {
     System.out.println("****startExistingGame function called ");  
    }

    private void interpretationBmi() {
       System.out.println("****startExistingGame function called "); 
    }

    private void rangeOfBmi() {
        System.out.println("****startExistingGame function called ");
    }

    private void QuitGame() {
      System.out.println("****startExistingGame function called ");  
    }
    
}
