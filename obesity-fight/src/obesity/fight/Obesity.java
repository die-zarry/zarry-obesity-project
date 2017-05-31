/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obesity.fight;

import byui.cit260.obesity.model.Actor;
import byui.cit260.obesity.model.Game;
import byui.cit260.obesity.model.Inventory;
import byui.cit260.obesity.model.Player;
import byui.cit260.obesity.model.Workout;

/**
 *
 * @author wdc
 */
public class Obesity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Player playerOne = new Player ();
    
    playerOne.setName("Zarry die");
    playerOne.setBestTime(6.00);
    
    String playerInfo = playerOne.toString();
    System.out.println(playerInfo);
    
    
    // game class
    Game gameOne = new Game ();
    
    gameOne.setNoPeople(10);
    gameOne.setTotalTime(60.00);
    
    String gameInfo = gameOne.toString();
    System.out.println(gameInfo);
   
    
    // class actor
    Actor actorOne = new Actor();
    actorOne.setCalorieAmount(300.00);
    actorOne.setFood("type of food: vegetables, fruits etc");
    
    String actorInfo = actorOne.toString();
    System.out.println(actorInfo);
    
   // class inventory
   
   Inventory inventoryOne = new Inventory ();
   inventoryOne.setDiet("Type of food for meal time: breakfast, lunch, dinner");
   inventoryOne.setFitness("type of body shape: six pat, flat stomach");
   
   String inventoryInfo = inventoryOne.toString();
   System.out.println(inventoryInfo);
   
   // workout class
   Workout workoutOne = new Workout ();
   workoutOne.setBodyShape("type of bodyshape");
   workoutOne.setExerciceType("type of exercice: cadio, abdomimo");
   String workoutInfo = workoutOne.toString();
   System.out.println(workoutInfo);
   
   
   
    
  
    
            
    
    
    } 
   
}
