/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.control;

/**
 *
 * @author wdc
 */
public class WeightLossControl {

    double calcweightLossPercentage(double startWeight, double currentWeight, long age) {
                
 if (startWeight < 0){ // starWeight is negative
 return -1;
}
if (currentWeight < 84 || currentWeight > 400) {// weight is out of range.
return -1;
}
double lostWeight = startWeight - currentWeight;
double Variation = (lostWeight / currentWeight) * 100; {
return Variation;
    }      
}
    
} 
    
    
    
    
    
    

