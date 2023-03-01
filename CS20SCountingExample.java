import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           your name
 *  Class:          CS20S
 * 
 *  Assignment:     Simple while loop example
 *  
 *                  count how many numbers are entered
 * 
 *************************************************************/

public class CS20SCountingExample {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
    // ***** variables *****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
        
        // local variables
        
        int number = 0;         // number entered from the keyboard    
        int count = 0;          // counter, how many numbers are entered
        int sum = 0;            // sum of the numbers entered
    
    // ***** objects *****
    
        Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
    
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  simple counting example" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        //fout.print(banner);
    
    // ***** Get Input *****
    
        prompt = "enter a series of numbers, 0 to quit";
    
    // ***** Main Processing *****
    
        // pre-loop processing
        count = 0;              // make sure we start counting at 0
        sum = 0;                // make sure we start adding from 0
    
        System.out.println(prompt);
        number = scanner.nextInt();
        //System.out.println(number);
        
        while(number != 0){
            // stuff to be repeated goes here
            // iteration counter
            count++;            // count numbers
            sum += number;      // add numbers
            
            // ** update the control variable **
            //System.out.println("enter another number, 0 to quit");
            number = scanner.nextInt();
        }// end while
        
        // post-loop processing
        System.out.format("Count = %4d%s", count, nl);
        System.out.format("Sum = %4d%s", sum, nl);
    
    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");
        
    } // end main 
    
} // end FormatTemplate
