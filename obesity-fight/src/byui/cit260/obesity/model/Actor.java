/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.model;
import java.io.Serializable;
import java.util.Objects;


/**
 *
 * @author wdc
 */
public class Actor implements Serializable{
    
    private String food;
    private double calorieAmount;

    public Actor() {
    }
    
    
    

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public double getCalorieAmount() {
        return calorieAmount;
    }

    public void setCalorieAmount(double calorieAmount) {
        this.calorieAmount = calorieAmount;
        
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.food);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.calorieAmount) ^ (Double.doubleToLongBits(this.calorieAmount) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Actor{" + "food=" + food + ", calorieAmount=" + calorieAmount + '}';
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Actor other = (Actor) obj;
        if (Double.doubleToLongBits(this.calorieAmount) != Double.doubleToLongBits(other.calorieAmount)) {
            return false;
        }
        if (!Objects.equals(this.food, other.food)) {
            return false;
        }
        return true;
    }
    
    
    
}
