package nicholasheydproj6;

import java.util.Scanner;

/**
 * @author Nicholas Heyd
 * @version 1.0 / 10/7/2018 
 */
public class NicholasHeydProj6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //VARIABLES
        boolean running = true; //used to continue the while loop
        Scanner input = new Scanner(System.in);//accepts user input
        String userString = "";//holds the user's string
        char userChar;//holds the target char to search for
        String keepGoing = "";//used to see if user would like to loop again.
        
        while (running){
            System.out.println("Enter a string: ");
            userString = input.nextLine();//input string
            System.out.println("Enter a char: ");
            userChar = input.nextLine().charAt(0);//accepts only first char of input
            
            //fist function output
            System.out.println("The result of calling function int countLetters"
                    + "(String s) is: " + countLetters(userString));
            //second function output
            System.out.println("The result of calling function int countLetters"
                    + "(String s, char c) is: " + countLetters(userString, userChar));
            
            //Check if the user wants to use the program again
            System.out.println("Do you want to do another test? Y/N");
            keepGoing = input.nextLine();
            //if no or n is inputted, stop the program
            if (keepGoing.equalsIgnoreCase("n" )|| keepGoing.equalsIgnoreCase("no"))
                running = false;//change while loop condition to false
        }//end program loop
        
        System.out.println("Nicholas Heyd");
        System.out.println("Project 6");
        System.out.println("CSCI 231");
    }
    
    //Counts the number of English letters in String s
    public static int countLetters(String s){
        int total = 0;//counts the letters
        
        for (int i = 0; i < s.length(); i++){
            if (Character.isLetter(s.charAt(i)))//check if each character is a letter
                total++;
        }
        
        return total;//returns the total English letters in String s.
    }
    
    //counts the total number of English letters c
    //if c is not an Englishe letter return -1.
    public static int countLetters(String s, char c){
        int total = 0; //number of times the letter appears
        String userString = s.toLowerCase();//change the string to lower case
        char target = Character.toLowerCase(c);//change char c to lower case
        
        if (Character.isLetter(target)){
              for (int i = 0; i < userString.length(); i++){//loop through s
                if (target == userString.charAt(i)){
                    total++;//if true implement the total by 1
                }
              } return total; //return the total times the English letter was spotted
        } else {
            return -1; //if the target i not a letter, return -1
        }
    }
    
    
    
}

/*
Enter a string: 
hello 123$% world
Enter a char: 
3
The result of calling function int countLetters(String s) is: 10
The result of calling function int countLetters(String s, char c) is: -1
Do you want to do another test? Y/N
y
Enter a string: 
%$#1234567 89 Hello hays
Enter a char: 
h
The result of calling function int countLetters(String s) is: 9
The result of calling function int countLetters(String s, char c) is: 2
Do you want to do another test? Y/N
n
Nicholas Heyd
Project 6
CSCI 231
*/
