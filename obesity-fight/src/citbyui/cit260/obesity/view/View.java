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
public abstract class View implements ViewInterface{
    
 protected String displayMessage;
 
 public View(){
     
 }
    
public View(String message){
this.displayMessage = message;
}
@Override
        public void display(){
boolean done = false; // set flag to not done
        do{
            // prompt for  and get players name
            String value = this.getInput();
            if(value.toUpperCase().equals("Q"))// user wants to quit
            return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(value);
        }while(!done);
    }
    
        @Override
        public String getInput(){
         
      Scanner keyboard = new Scanner (System.in); //get infile keyborad 
      boolean valid = false;
      String  value = null; // value to be return 
       
       // while a valid name has not been retrieved
       
       System.out.println("\n" + this.displayMessage);
       
       // get the value entered form the keyword
       value = keyboard.nextLine();// get next line type on keyboard
       value = value.trim(); // trim off leading and trailing blanks
       
       
       if (value.length()< 1) { // value is blank
        System.out.println("\n*** You must enter a value*** ");
      
      
       return value; // return the value entered    
        }       
     return null;
     
        }
}


