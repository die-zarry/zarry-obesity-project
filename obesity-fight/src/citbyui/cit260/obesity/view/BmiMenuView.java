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
public class BmiMenuView extends View {

public BmiMenuView(){
               super ("\n                            n"
                +"\n------------------------------------"
                + "\n| Main Menu                         |"
                +"\nM-  range of body mass Index (BMI)"
                +"\nU- with a BMI of : you're underweight  "
                +"\nO - with a BMI of : you're overweight "
                +"\nB - with a BMI of : you're Obese"
                +"\nB1-  with a BMI of : your're obese with type I" 
                +"\nB2 - with a BMI of : you're you're obese with type II"
                +"'nB3  -with a BMI of : you're you're obese with type 3"
                +"\n--------------------------------------");
            
            
            }

     @Override
    public boolean doAction(String value) {
        
    value = value.toUpperCase();
        
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
    

