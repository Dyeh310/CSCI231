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
 * This program implements various methods to an array.
 * It can initialize, print, sort, find the range, find the smallest number
 * find the largest number, search, and sort the array.
 * 
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
        System.out.print("Average of elements in the array: ");
        System.out.println(average(arr));
        
        //Ask user to enter a search key
        System.out.println("Please enter a key to search for: ");
        key = input.nextInt();
        
        //Call the linearSearch function with array and key. Print out message based on result
        if (linearSearch(arr, key) != -1) {//if the key is found     
            System.out.println("The key " + key + " was found in the array.");
        } else {//the method returns -1 and the key is not found
            System.out.println(key + " was not found in the array.");
        }
        
        //Call the selectSort function to sort the array
        selectSort(arr);
        
        //Print out array again to see the sorted array 
        System.out.println("The sorted array now looks like: ");
        printArray(arr);
    }
    
    //--------------METHODS------------
    
    /**
     * Performs a linear search to locate a key in the function.
     * If found, returns the key. If not the function returns -1.
     * 
     * 
     * @param arr the given int[]
     * @param key the given int to search for
     * @return the key if found, if not return -1.
     */
    public static int linearSearch(int arr[], int key){
        for (int i = 0; i < arr.length; i++){//loop through the array
            if (key == arr[i]){//match key to element in the array
                return arr[i];
        }
    }
        return -1; //if the key is not found return -1.
    }
    
    /**
     * performs a the select sort method on the array. Does not return anything,
     * but leaves the array sorted.
     * 
     * @param arr the given int[].
     */
    public static void selectSort(int arr[]){
        int n = arr.length;
 
        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    
    /**
     * Prints the counts of the array, with 5 elements on each line.
     * Does not return anything.
     * 
     * @param arr the given int[] 
     */
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
    
    /**
     * Accepts an array of any given size. Randomly generates and inserts a number
     * 1 to 100 in each index of the array. Does not return anything
     * 
     * @param arr the given int[] 
     */
    public static void initializeArray(int arr[]){
        Random rand = new Random();//import random class
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt((100 - 1) +1) + 1; //generate random numbers 1 - 100
        }
        
    }

    /**
     * Accepts an int array. Calls the smallest and largest functions. Then subtracts
     * the smallest from the largest element in the array. Returns that range.
     * 
     * @param arr accepts an int[]
     * @return the int range which contains the largest -smallest elements in the array 
     */
    public static int range (int arr[]){
        int range = 0;
        
        int largest = arr[0];
        int smallest = arr[0];
    
        //call the largest method
        largest = largest(arr);
        //call the smallest method
        smallest = smallest(arr);
            
        //subtract to find the range
        range = largest - smallest;
        return range;
    }
    
    /**
     * Accepts an int[] and returns the largest element in the array
     * 
     * @param arr the given int[]
     * @return the largest int in the array
     */
    public static int largest(int arr[]) {
        int largest = arr[0];
        
        for (int i = 0; i < arr.length; i++){
            if (largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
    
    /**
     * Accepts the int[] and returns the smallest element in the array
     * 
     * @param arr the given int[]
     * @return the smallest int in the array
     */
    public static int smallest(int arr[]) {
        int smallest = arr[0];
        
        for (int i = 0; i < arr.length; i++){
            if (smallest > arr[i]){
                smallest = arr[i];            
            }
        }
        
        return smallest;
    }
    
    /**
     * Accepts the intp[ and returns the average of all the elements in the array.
     * 
     * @param arr the given int[]
     * @return the average of all elements in the array in the form of a double
     */
    public static double average(int arr[]) {
        double average = 0;
        int total = 0;
        
        //loop through adding the value of each element to the total
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        //computer the average from total and the number of indexes in the array
        average = (total / arr.length);
        
        return average;
    }
}


