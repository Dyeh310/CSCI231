/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nicholasheyd.project5;

import java.util.Scanner;

/**
 *
 * @author nheyd
 */
public class NicholasHeydProject5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Variables
        Scanner input = new Scanner(System.in);
        double P = 0;
        double r = 0;
        int N = 0;
        double c = 0;
        double b = 0;
        double totalInterestPaid = 0;
        double interest = 0;
        
        //INTERFACE
        //accept input
        System.out.println("Enter the principle to borrow: ");
        P = input.nextDouble();
        System.out.println("Enter the interest rate: ");
        r = input.nextDouble();
        r /= 12;//divide the quoted interest rate by 12
        System.out.println("Enter the term (in years): ");
        N = input.nextInt();
        N *= 12; //multiple years by 12 to get total months

        
        //Monthly Payment
        c = P* r * Math.pow(1 + r,N)/(Math.pow(1 + r, N) - 1);
        c = Math.round (c * 100.0) / 100.0; //round to two decimal places
        
        //Starting balance
        b = P;
        
        System.out.println("Principle Payment: $" + P);
        //For Loop
        System.out.println("Month\tPayment\t\t\tTotal Interest\t\tBalanace");
        for (int i = 1; i  <= N; i++){
            //Interest
            interest = b * r;
            //Total Interest
            totalInterestPaid += interest;
            totalInterestPaid = Math.round (totalInterestPaid * 100.0) / 100.0; //round to two decimal places
            
            if (c > b) {
                c = b;
                b = 0;
                System.out.println(i + "\t$" + c + "\t\t$" + totalInterestPaid + "\t\t$" + b);
                break;
            }
            
            //balance
            b = (b - c) + interest;
            b = Math.round (b * 100.0) / 100.0; //round to two decimal places
            
            System.out.println(i + "\t$" + c + "\t\t$" + totalInterestPaid + "\t\t$" + b);
        }
        
    }
    
}
