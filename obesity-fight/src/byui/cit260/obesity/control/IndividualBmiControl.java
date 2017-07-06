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
public class IndividualBmiControl {
    public double calcBmiOfIndividual(double weight, double height){
        
 if (height < 0){ // height is negative
 return -1;
}
if (weight < 84 || weight > 400) {// weight is out of range.
return -1;
}
double BMI = (weight *703) / (height * height); {
return BMI;
        }
}

    public void displayIndividualBmiControl() {
        System.out.println("n displayIndividualBmiControl() function called");
    }
}