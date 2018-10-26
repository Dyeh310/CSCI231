/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2pratice;

import java.util.Scanner;

/**
 *
 * @author nheyd
 */
public class Exam2Pratice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

 
        System.out.println(factorial(3));
        
    }
    
    /* Question 1:
    Write a while loop or for statement to print allthe digits of an int type variable x, one digit per line.
    for example, if int x = 38625, then the output should be in 5 lines as 
    3
    8
    6
    2
    5
    */
    public static void onePerLineX(int x) {
        String xValue = Integer.toString(x);
        
        for (int i = 0; i < xValue.length(); i++) {
            System.out.println(xValue.charAt(i));
        } 
    }
    
    /* Question 2: 
    Write a while (or for) statement to print all the digits of an int type variable x reversely, one per line
    */
    public static void onePerLineXReverse(int x) {
        
    }
    
    /* Question 3:
    Write a while loop to get user's input of test scores. When a -1 is entere dthe loops finishes and prints out the average
    */
    public static int Average() {
        Scanner input = new Scanner(System.in);
        int score = 0;
        int userData = 0;
        int entered = 0;
        while (true) {
            System.out.println("Please enter a test score");
            userData = input.nextInt();
            if (userData == -1) break;
            score += userData;
            entered++;
        }       
        score = (score / entered);
        
        return score;
    }
    
    /* Question 4:
    Write a for or while loop statement to calculate the factorial n.
    */
    public static int factorialAddition(int n) {
        int sum = 0;
        
        while (n != 0) {
            sum += n;
            n--;
        }
        return sum;
    }

    /*Question 5:
    Now do it with a factorial
    */
    public static int factorial(int n) {
        int fact = 1;
        int i = 1;
        
        while (i <= n) {
         fact = fact * i;
         i++;
        }
        return fact;
    }
    
}
