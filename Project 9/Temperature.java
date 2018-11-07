/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci231.project9;

/**
 *
 * @author Nick
 */
public class Temperature {
    
    //Variables
    private char scale;
    private double degree;
    
    //---------Constructors-------------
    public Temperature() {
        degree = 0.0;
        scale = 'C';
    }
    
    public Temperature(double d) {
        degree = d;
        scale = 'C';
    }
    
    public Temperature(char s) {
        scale = s;
        degree = 0.0;
    }
    
    public Temperature(double d, char s) {
        degree = d;
        scale = s;
    }
    
    //--------Methods---------
    
    /**
     * insert program description
     * 
     * @return a double that is either in Celsius or Fahrenheit depending on scale
     */
    public double getDegreeInCelsius() {
        double result = 0;
        
        //If set to Celcius
        if (scale == 'C') {
            return degree;
        } else if (scale == 'F') {
            result = (degree - 32) * ((double)5/9); //problem is here!
            return result;
        }   
        //error
        return -1;
    }
    
    public double getDegreeInFahrenheit() {
        double result = 0;
        
        //If set to Celcius
        if (scale == 'F') {
            return degree;
        } else if (scale == 'C') {
            result = (1.8*degree) + 32;
            return result;
        }   
        //error
        return -1;
    }
    
    public void setDegree(double d) {
        degree = d;
    }
    
    public void setDegree(char s) {
        scale = s;
    }
    
    public void setDegree (double d, char s) {
        degree = d;
        scale = s;
    }
   
    
    public boolean equals (Temperature temp) {
        double currentTemp = getDegreeInCelsius(); 
        double compareTemp = temp.getDegreeInCelsius();
        
        if (currentTemp == compareTemp) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isLessThan(Temperature temp) {
        double currentTemp = getDegreeInCelsius(); 
        double compareTemp = temp.getDegreeInCelsius();
        
        if (currentTemp < compareTemp) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isGreaterThan (Temperature temp) {
        double currentTemp = getDegreeInCelsius(); 
        double compareTemp = temp.getDegreeInCelsius();
        
        if (currentTemp > compareTemp) {
            return true;
        } else {
            return false;
        }
    }      
}
