/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.obesity.view;

import byui.cit260.obesity.control.GameControl;
import java.util.Scanner;
import static obesity.fight.Obesity.getInput;

/**
 *
 * @author wdc
 */
class BmiOfIndividual {

    void displayCalcBmiOfIndividual() {
     boolean done = false; // set flag to not done
        do{
            // prompt for  and get players name
            String getInput = this.getInput();
            if(getInput.toUpperCase().equals("Q"))// user wants to quit
            return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(getInput);
        }while(!done);
    }

    private String getInput() {
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;
        // while a valid name has not been retriebed
        while(!valid){
            // get the value entered  from keyboard
            selection = keyboard.nextLine();
            selection = selection.trim();
            if(selection.length()< 1) { // blank vale entered )
                System.out.println("\n*** Invalid*** try again");
               continue;
            }
            break;
        }
        return selection;
    }

    private boolean doAction(String input) {
    System.out.println("\n****Invalid selection**** try again");
    boolean fasle = false;
    return fasle;
    }
    }



    