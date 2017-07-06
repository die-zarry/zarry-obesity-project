/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.model;
import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;


/**
 *
 * @author wdc
 */
public enum Actor implements Serializable{
    
   UnhealthyFood("all the foods that will imapact negatively our body shape"),
   
   HealthyFood("all the food that will impact positvely our body shape"),
   RegularExercice("Exercice fitnesss to burn excedenr colorie in");
   
   private final String description;
    private final Point coordinates;
    
    Actor(String description){
    this.description = description; 
    coordinates = new Point(1,1);
}
   
    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

}

    

    

    
    

