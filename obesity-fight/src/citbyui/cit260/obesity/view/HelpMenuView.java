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
public class HelpMenuView extends View { 
    
           public HelpMenuView(){
               super ("\n                       n"
                +"\n------------------------------------"
                + "\n| Main Menu                         |"
                +"\nL - The goal of the game"
                +"\nC-  calorie amount per meal "
                +"\nE - The level of exercice to burn an amount of calorie"
                +"\n--------------------------------------");
            
            
            }
 
     @Override     
     public boolean doAction(String value) {
        value = value.toUpperCase();
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

    
    

