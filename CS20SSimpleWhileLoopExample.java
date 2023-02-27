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
 *                  a simple while loop that will repeat
 *                  until a 0 is entered from the keyboard
 * 
 *************************************************************/

public class CS20SSimpleWhileLoopExample {

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
    
    // ***** objects *****
    
        Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
    
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  simple while loop example" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        //fout.print(banner);
    
    // ***** Get Input *****
    
    // ***** Main Processing *****
    
        System.out.println("enter a number, 0 to quit");
        number = scanner.nextInt();
        //System.out.println(number);
        
        while(number != 0){
            // stuff to be repeated goes here
            System.out.println("repeat some instructions here");
            System.out.println("might invlove " + number);
            
            // ** update the control variable **
            System.out.println("enter another number, 0 to quit");
            number = scanner.nextInt();
        }// end while
    
    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");
        
    } // end main 
    
} // end FormatTemplate
