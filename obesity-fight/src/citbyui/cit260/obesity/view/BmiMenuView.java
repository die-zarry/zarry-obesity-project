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
public class BmiMenuView {
private String menu;
public BmiMenuView(){
this.menu = "\n"
                +"\n------------------------------------"
                + "\n| Main Menu                         |"
                +"\nM-  range of body mass Index (BMI)"
                +"\nU- with a BMI of : you're underweight  "
                +"\nO - with a BMI of : you're overweight "
                +"\nB - with a BMI of : you're Obese"
                +"\nB1-  with a BMI of : your're obese with type I" 
                +"\nB2 - with a BMI of : you're you're obese with type II"
                +"'nB3  -with a BMI of : you're you're obese with type 3"
                +"\n--------------------------------------";
            
            
            }

   public void displayBmiMenuView() {
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
        case "m": // BMI range
              this.displayBmiRange();
              break;
        case "U": // Underweight BMI
               this.displayUnderweight();
               break;
        case "O": // overweight BMi
               this.displayOverweight();
               break;
        case "B": // obese BMI  
              this.displayObese();
              break;
        case "B1": //obesity type one
               this.displayObeseFirst();
               break;
        case "B2": // obesity type two
               this.displayObeseSecond();
               break; 
               
        case "B3": // obesity type three
               this.displayObeseThird();
               break;
        default:
             System.out.println("\n****Invalid selection**** try again");

    }
        
        return false;
    
    }  

    private void displayBmiRange() {
        System.out.println("****displayBmiRange function called ");
    }

    private void displayUnderweight() {
        System.out.println("****displayUnderweight function called ");
    }

    private void displayOverweight() {
      System.out.println("****displayOverweight function called ");  
    }

    private void displayObese() {
        System.out.println("****displayObese function called ");
    }

    private void displayObeseFirst() {
    System.out.println("****displayObeseFirst function called ");   
    
    }

    private void displayObeseSecond() {
   System.out.println("****displayObeseSecond function called ");
    }

    private void displayObeseThird() {
        System.out.println("****displayObeseThird function called ");
    }
        
        
    }
    

