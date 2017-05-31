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
public class Inventory implements Serializable{
    
    private String diet;
    private String fitness;

    public Inventory() {
    }
    
    
    

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getFitness() {
        return fitness;
    }

    public void setFitness(String fitness) {
        this.fitness = fitness;
        
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.diet);
        hash = 37 * hash + Objects.hashCode(this.fitness);
        return hash;
    }

    @Override
    public String toString() {
        return "Inventory{" + "diet=" + diet + ", fitness=" + fitness + '}';
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
        final Inventory other = (Inventory) obj;
        if (!Objects.equals(this.diet, other.diet)) {
            return false;
        }
        if (!Objects.equals(this.fitness, other.fitness)) {
            return false;
        }
        return true;
    }
    
    
    
}
