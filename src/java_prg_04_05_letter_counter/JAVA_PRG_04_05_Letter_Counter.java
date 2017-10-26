/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_04_05_letter_counter;

import javax.swing.JOptionPane;
/**
 *
 * @author bluebackdev
 * Write a program that asks the user to enter a string, and then asks the user
 * to enter a character. The program should count and display the number of times
 * that the specified character appears in the string.
 */
public class JAVA_PRG_04_05_Letter_Counter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare and initialize counter variable
        int intLetterCounter = 0;
        int intCharactersTotalInString;
        
        // Declare user string
        String strUserString;
        String strUserCharacterString;
        
        // Declare user character
        char chrUserCharacter;
        
        // Get string from user
        strUserString = JOptionPane.showInputDialog("Please enter a string.");
        
        // Get users character choice as a string, will only
        // look at the first letter in the string to extract
        // character for comparison
        strUserCharacterString = JOptionPane.showInputDialog("Please enter a character");
        
        // Get first character from previous string entry
        chrUserCharacter = strUserCharacterString.charAt(0);
        
        // Define total number to times to run the for loop
        // comparing each character in strUserString
        // to chrUserCharacter based on strUserString's length
        intCharactersTotalInString = strUserString.length();
        
        // Run through each character and make the comparison
        for(int i = 0 ; i < intCharactersTotalInString ; i++)
        {
            // If the comparison tests true, then 
            // increase the counter keeping track
            // of how many matches there are
            if(strUserString.charAt(i) == chrUserCharacter)
            {
                intLetterCounter++;
            }
        }
        
        // Output findings to the user via dialog box
        JOptionPane.showMessageDialog(null, "That letter appears " +
                intLetterCounter + " times in that string.");
        
        // Exit for JOptionPane
        System.exit(0);
    }
    
}
