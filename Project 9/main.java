/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci231.project9;

import java.util.Scanner;

/**
 *
 * @author Nick
 */
public class NicholasHeydProject9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        Scanner input = new Scanner(System.in);
        double degree = 0;
        char scale = 'C';
        
        //Default Constructor OBJECT 1
        Temperature temp1 = new Temperature();
        System.out.println("The first Temperature has been created using the default"
                + "constructor which sets the degree to a default value of " + 
                temp1.getDegreeInCelsius() + " and the scale to a default value of C.");
        System.out.println("The first Temperature is " + temp1.getDegreeInCelsius() + " C.");
        System.out.println("The first Temperature is " + temp1.getDegreeInFahrenheit() + " F.");
        System.out.println("Set the degree (a number) and the scale (F or C) of the first Temperature.");
        System.out.println("First set the degree: ");
        degree = input.nextDouble();
        temp1.setDegree(degree);
        System.out.println("Now set the Scale: ");
        scale = input.next().charAt(0);
        temp1.setDegree(scale);
        System.out.println("Now the first Temperature is: " + temp1.getDegreeInCelsius() + " C.");
        System.out.println("which is " + temp1.getDegreeInFahrenheit() + " F.");
        System.out.println("");
        
        //Double arguement Constructor OBJECT 2
        Temperature temp2 = new Temperature(32.0);
        System.out.println("The Second Temperature has been created using the constructor"
                + "with a double argument.");
        System.out.println("Which set degree to this argument and the scale to a default value of C.");
        System.out.println("In my code, I passed 32 to the double argument. So ");
        System.out.println("The second Temperature is: " + temp2.getDegreeInCelsius() + " C.");
        System.out.println("The second Temperature is: " + temp2.getDegreeInFahrenheit() + " F.");
        System.out.println("Set the degree (a number) and the scale (F or C) of the second Temperature. ");
        System.out.println("First set the degree: ");
        degree = input.nextDouble();
        System.out.println("Now set the scale: ");
        scale = input.next().charAt(0);
        temp2.setDegree(degree, scale);
        System.out.println("The second Temperature is " + temp2.getDegreeInCelsius() + " C.");
        System.out.println("The second Temperature is: " + temp2.getDegreeInFahrenheit() + " F.");
        System.out.println("");
        
        //Third constructor OBJECT 3
        Temperature temp3 = new Temperature('F');
        System.out.println("The third Temperature has been created using the constructor "
                + "which sets");
        System.out.println("the degree to a default value of 0.0 and the scale to the argument.");
        System.out.println("I passed 'F' to the argument So");
        System.out.println("The third Temperature is " + temp3.getDegreeInFahrenheit() + " F.");
        System.out.println("which is " + temp3.getDegreeInCelsius() + " C.");
        System.out.println("Set the degree (a number and the scale (F or C) of the third Temperature.");
        System.out.println("First set the degree: ");
        degree = input.nextDouble();
        System.out.println("Now set the scale: ");
        scale = input.next().charAt(0);
        temp3.setDegree(degree, scale);
        System.out.println("The third Temperature is " + temp3.getDegreeInCelsius()+ " C.");
        System.out.println("which is " + temp3.getDegreeInFahrenheit() + " F.");
        System.out.println("");
        
        //Fourth Constructor double argument and scale char argument OBJECT 4
        Temperature temp4 = new Temperature (98.6, 'F');
        System.out.println("The fourth Temperature has been created using the constructor which sets"
                + "the degree to double double argument the scale to char argument.");
        System.out.println("I passed 98.6 and 'F' to the arguments. So ");
        System.out.println("The fourth Temperature is " + temp4.getDegreeInCelsius() + " C.");
        System.out.println("The fourth Temperature is " + temp4.getDegreeInFahrenheit() + " F.");
        System.out.println("Set the degree (a number) and the scale (F or C) of the fourth Temperature.");
        System.out.println("First set the degree: ");
        degree = input.nextDouble();
        System.out.println("Now set the scale: ");
        scale = input.next().charAt(0);
        temp4.setDegree(degree, scale);
        System.out.println("The fourth Temperature is " + temp4.getDegreeInCelsius() + " C.");
        System.out.println("which is " + temp4.getDegreeInFahrenheit() + " F.");
        System.out.println("");
        
        //Order of creation
        System.out.println("In order of creation the Temperatures in Celcius are : " +
                temp1.getDegreeInCelsius() + ", " + temp2.getDegreeInCelsius() + ", " +
                temp3.getDegreeInCelsius() + ", " + temp4.getDegreeInCelsius());
        System.out.println("In order of creation the Temperatures in Fahrenheit are: " + 
                temp1.getDegreeInFahrenheit() + ", " + temp2.getDegreeInFahrenheit() + ", " +
                temp3.getDegreeInFahrenheit() + ", " + temp4.getDegreeInFahrenheit());
        System.out.println("");
        
        
        //-----Testing equality------
        
                 //-temp1 V temp2-
        //equals
        if(temp1.equals(temp2)) {
            System.out.println("The first Temperature is equal to the second.");
        } else {
            System.out.println("The first Temperature is not equal to the second.");
        }
        
        //less than
        if (temp1.isLessThan(temp2)) {
            System.out.println("The first Temperature is less than the second");
        } else {
            System.out.println("The first Temperature is not less than the second");
        }
        
        //greater than
        if (temp1.isGreaterThan(temp2)) {
            System.out.println("The first Temperature is greater than the second");
        } else {
            System.out.println("The first Temperature is not greater than the second");
        }
        System.out.println("");
        
                //-temp2 V temp3-
        //equals
        if(temp2.equals(temp3)) {
            System.out.println("The second Temperature is equal to the third.");
        } else {
            System.out.println("The second Temperature is not equal to the third.");
        }
        //less than
        if (temp2.isLessThan(temp3)) {
            System.out.println("The second Temperature is less than the third");
        } else {
            System.out.println("The second Temperature is not less than the third");
        }
        
        //greater than
        if (temp2.isGreaterThan(temp3)) {
            System.out.println("The second Temperature is greater than the third");
        } else {
            System.out.println("The second Temperature is not greater than the third");
        }
        System.out.println("");
        
                //-temp3 V temp4-
        //equals
        if(temp3.equals(temp4)) {
            System.out.println("The third Temperature is equal to the fourth.");
        } else {
            System.out.println("The third Temperature is not equal to the fourth.");
        }
        //less than
        if (temp3.isLessThan(temp4)) {
            System.out.println("The third Temperature is less than the fourth");
        } else {
            System.out.println("The third Temperature is not less than the fourth");
        }
        
        //greater than
        if (temp3.isGreaterThan(temp4)) {
            System.out.println("The third Temperature is greater than the fourth");
        } else {
            System.out.println("The third Temperature is not greater than the fourth");
        }
        
        
        
        
        
        
        
        
    }//End Main
    
}
