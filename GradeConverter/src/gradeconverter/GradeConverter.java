/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradeconverter;

/**
 *
 * @author bbaker
 */
public class GradeConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        double x = readDouble("What is your numerical grade? ");
        if(x >= 90)
        {
            System.out.println("Your letter grade is an A.");
        }
        if(x >= 80 && x < 90)
        {
            System.out.println("Your letter grade is an B.");
        }
        if(x >= 70 && x < 80)
        {
            System.out.println("Your letter grade is an C.");
        }
        if(x >= 60 && x < 70)
        {
            System.out.println("Your letter grade is an D.");
        }
        else if(x <= 59)
        {
            System.out.println("You are failing this class.");
        }
    }
    
}
