//An Phung
//9-12-14
//Lab 03 Big Mac
//This program will compute the cost of buying 
//Big Macs

//Import program to use scanner class
import java.util.Scanner;

//add the main class
public class BigMac {
    
    
    //add main method
    public static void main(String[] args) {
    
    //declare an instance of the Scanner object
    
    Scanner myScanner;
    
    //Construct an instance of the Scanner class declared
    //Scanner allows the program to know that an input is coming in
    
    myScanner = new Scanner( System.in );
    
    //After all this, the program is now ready to accept input
    
    //Prompt the user to type in the number of tickets
    
    System.out.print( "Enter the number of Big Macs (an integer > 0: "); //tells user to input the number of Big Macs to order
    
    //Note that println was not used. This means that the program will not print right to the next line
    
    //Accept user input by using the statement
    //The next part tells the program that when "enter" is pressed then the input is over and go on to the next line of code
    
    int nBigMacs = myScanner.nextInt();
    
    //This command tells Scanner that the program is using the nextInt() method
    //This command tells java that the nextInt() method needs the myScanner object to work
    //To accept a decimal(double) use nextDouble() instead of nextInt()
    
    //Prompt the user for the cost of a Big Mac and the perecent sales tax and accept the input
    
    System.out.print("Enter the cost per Big Mac as" +" a double (in the form xx.xx): "); //tells user to input the cost of a big mac
    double bigMac$ = myScanner.nextDouble();
    System.out.print("Enter the percent tax as a whole number (xx): "); //tells the user to input the percent tax
    double taxRate = myScanner.nextDouble();
    //makes the tax rate a decimal
    taxRate/=100; 
    //user enters percent, but I want proportion
    
    //Print the ouput
    
    double cost$; //Define the cost variable
    int dollars, /*whole dollar amount of cost*/ dimes, pennies; //for storing digits to the right of the decimal point 
    
    //for the cost$
    
    cost$ = nBigMacs*bigMac$*(1+taxRate); //Defines the formula to get the cost of the purchase
    
    //get the whole amount, dropping decimal fraction
    
    dollars=(int)cost$; //Gets the dollar amount of the cost
    
    //get dimes amount, e.g.,
    //(int)(6.73*10)% 10 -> 67 % 10 -> 7
    //after the division:   583%100 -> 53, 27%5 -> 2
    
    dimes=(int)(cost$*10)%10; //the %10 takes the remainder of the cost multiplied by 10 to get the dimes amount of the cost
    pennies=(int)(cost$*100)%10; //the %100 takes the remainder of the cost multiplied by 10 to get the pennies amount of the cost
    
    //Print out the total cost of Big Macs including the price per Big Mac and sales tax and total price of the purchase for the amount purchased
    
    System.out.println("The total cost of " +nBigMacs+ " Big Macs, at $" +bigMac$+ " per bigMac, with a " + "sales tax of " +(int)(taxRate*100)+ "%, is $" +dollars+'.' +dimes+pennies); 
    
    //End of program
    } //end of main method
} //end of main class