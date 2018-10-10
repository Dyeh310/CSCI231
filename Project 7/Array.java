/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nicholasheydproj7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nicholas Heyd
 * @version 1.0 / 10-9-18 -- 10-11-18
 */
public class NicholasHeydProj7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //--------VARIABLES-----------
        //Accepts user input
        Scanner input = new Scanner(System.in);
        //Key to search array
        int key = 0;
        //Declare an int array of size 10
        int arr[] = new int[10];
        
        //Initialize the array by calling initializeArray function
        initializeArray(arr);
        
        //Print out the array by calling printArray function
        printArray(arr);
        System.out.println();
        
        //Print out the largest and smallest value of the array using println and calling largest and smalles functions.
        System.out.println("Largest: " + largest(arr));
        System.out.println("Smallest: " + smallest(arr));
        
        //Print out the range of the array
        System.out.println("Range: " + range(arr));
        
        //Print out the average of the array elements
        average(arr);
        
        //Ask user to enter a search key
        System.out.println("Please enter a key to search for: ");
        key = input.nextInt();
        
        //Call the linearSearch function with array and key. Print out message based on result
        if (linearSearch(arr, key) != -1) {//if the key is found     
            System.out.println("The key " + key + " was found in the array.");
        } else {//the method returns -1 and the key is not found
            System.out.println(key + " was not found in the array.");
        }
        
        //Print out array again to see the sorted array 
        selectSort(arr);
        System.out.println("The sorted array now looks like: ");
        printArray(arr);
    }
    
    //--------------METHODS------------
    
    //return the index of the first occurence of key in arr
    //if key is not found in arra, return - 1
    public static int linearSearch(int arr[], int key){
        for (int i = 0; i < arr.length; i++){//loop through the array
            if (key == arr[i]){//match key to element in the array
                return arr[i];
        }
    }
        return -1; //if the key is not found return -1.
    }
    
    //sort the arr from least to largest by using select sort algorithim
    public static void selectSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {//outer for loop
            int min_index = i; //holds the minimal index
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
            }
        }
    }
    
    //print out all array elements. 5 elements per line
    public static void printArray(int arr[]){
        int lineCounter = 0;//keeps track of how many elements were printed
        for (int i = 0; i < arr.length; i++){
            if(lineCounter == 5) {//if 5 elements per line is reached
                System.out.println();//print a blank line
                lineCounter = 0;//reset lineCounter variable to 0
            }
            System.out.print(arr[i] + " ");//print the element at index i
            lineCounter++;//increment line counter
        }
    }
    
    //assign each element in array with a random number
    //between 1 and 100, inclusive
    public static void initializeArray(int arr[]){
        Random rand = new Random();//import random class
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt((100 - 1) +1) + 1; //generate random numbers 1 - 100
        }
        
    }
    
    //find the range of all array elements
    //the range is defined as the difference between the largest and smallest elements
    public static int range (int arr[]){
        int range = 0;
        
        int largest = arr[0];
        int smallest = arr[0];
        
        //loop through the array
        for (int i = 0; i < arr.length; i++){
            //find the smallest element
            if (smallest > arr[i]){
                smallest = arr[i];            
            }
            //find the largest element
            if (largest < arr[i]){
                largest = arr[i];
            }
        }
            //subtract to find the range
            range = largest - smallest;
            return range;
    }
    
    public static int largest(int arr[]) {
        int largest = arr[0];
        
        for (int i = 0; i < arr.length; i++){
            if (largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
    
    //find the smallest element in the array
    public static int smallest(int arr[]) {
        int smallest = arr[0];
        
        for (int i = 0; i < arr.length; i++){
            if (smallest > arr[i]){
                smallest = arr[i];            
            }
        }
        
        return smallest;
    }
    
    //find the average value of all elements in array
    public static double average(int arr[]) {
        double answer = 0;
        
        return answer;
    }
}
