/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nicholasheydproj7;

import java.util.Random;

/**
 *
 * @author nheyd
 */
public class NicholasHeydProj7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declare an int array of size 10
        int arr[] = new int[10];
        
        //Initialize the array by calling initializeArray function
        //Print out the array by calling printArray function
        //Print out the largest and smallest value of the array using println and calling largest and smalles functions.
        
        //Print out the range of the array
        //Print out the average of the array elements
        //Ask user to enter a search key
        //Call the linearSearch function with array and key. Print out message based on result
        //Print out array again to see the sorted array 
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
        
    }
    
    //print out all array elements. 5 elements per line
    public static void printArray(int arr[]){
        
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
        int smallest = 0;
        
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
