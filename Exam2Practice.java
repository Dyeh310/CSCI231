/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2practice;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nick
 */
public class Exam2Pratice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] arr = {1,2,3,6,8,10,20};
        
        System.out.println(binarySearch(arr, 10));
       
        
        
        
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
    Write a while (or for) statement to print all the digits of an 
    int type variable x reversely, one per line
    */
    public static int onePerLineXReverse(int x) {
        int rev_num = 0;
        while (x > 0) {
            rev_num = rev_num * 10 + x % 10;
            x = x / 10;
        }
        return rev_num;
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
    
    /*Question 6:
    Write a method public static int linearSearch(int[] arr, int key) which returns
    the ;argest index such that arr[index] matches the key. no match = -1.
    */
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return key;
            }
        }
        return -1;//if it fails
    }
   
    
    /* Question 7:
    Write a method public static double average(int[] arr) which returns the 
    average of all elements in a given array arr. 
    Assume that arr has a length at least 1
    */
    public static double average(int[] arr) {
        int sum = 0;
        int answer = 0;
        
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        
        answer = sum / arr.length;
        return answer;
    }
    
    /*Question 8:
    Write a method public void crazyPrint(String sentence, int n) which prints
    out the given sentence n times
    */
    public static void crazyPrint(String sentence, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(sentence);
        }
    }
    
    /*Question 9:
    Write a method public static int sum(int n) that take a positive integer n as input and return the sum of 1+2..
    */
    public static int sum(int n) {
        int answer = 0;
        int i = 1;
        
        while (i <= n) {
            answer += i;
            i++;
        }
        
        
        return answer;
    }
    
    /*Question 11:
    Write a nested for loop statement to print out the multiplaction table for numbers
    1-9.
    */
    
    /*
    Question 12:
    Write a method public static initializeArray(int[] arr) to initailize a givven
    array named arr with random nuymbs between 101 and 200, inclusive
    */
    public static void initializeAarray(int[] arr) {
        Random rand = new Random();
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt((200 - 101) + 1) + 101;
            System.out.println(arr[i]);
        }
    }
    
    /*Question 13:
    Suppose that int[][] triangle = new int[3][] Write several statements to 
    initialize traingle[0]
    as (1,2); triangle[1] as {3,4,5}; and triangle[2] = {6,7,8,9}
    */
    public static void initializeTriangle(int[][] arr) {
        //Takes a long time.
    }
    
    /*Question 14
    Write public static int[] sum(int[][] arr) that returns an int array
    in which elements is the sum of ith row of table ar
    */
    
    /*Questio 15
    Write public static boolean zeroDiagonal(int[][]arr) which returns true if 
    the diagonal elements in the arr are all zeros.
    */
    
 
    //--------------PRACTICE--------------------
    //Sum entire array
    public static void sumArray(int[][] arr) {
        int total = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++){
                total += arr[row][col];
            }
        }
    }
    
    //sum col of arrays
    public static void sumCol(int[][] arr){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                
            }
        }
    }
    
    //Binary Search
}
