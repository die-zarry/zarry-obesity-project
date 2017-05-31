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
public class Workout implements Serializable{
    
    private String bodyShape;
    private String exerciceType;

    public Workout() {
    }
    
    
    

    public String getBodyShape() {
        return bodyShape;
    }

    public void setBodyShape(String bodyShape) {
        this.bodyShape = bodyShape;
    }

    public String getExerciceType() {
        return exerciceType;
    }

    public void setExerciceType(String exerciceType) {
        this.exerciceType = exerciceType;
        
        
        
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.bodyShape);
        hash = 29 * hash + Objects.hashCode(this.exerciceType);
        return hash;
    }

    @Override
    public String toString() {
        return "Workout{" + "bodyShape=" + bodyShape + ", exerciceType=" + exerciceType + '}';
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
        final Workout other = (Workout) obj;
        if (!Objects.equals(this.bodyShape, other.bodyShape)) {
            return false;
        }
        if (!Objects.equals(this.exerciceType, other.exerciceType)) {
            return false;
        }
        return true;
    }
    
    
    
}
