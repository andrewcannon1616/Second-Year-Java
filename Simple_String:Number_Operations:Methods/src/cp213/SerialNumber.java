package cp213;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author Your name and id here
 * @version 2024-09-01
 */
public class SerialNumber {

    /**
     * Determines if a string contains all digits.
     *
     * @param str The string to test.
     * @return true if str is all digits, false otherwise.
     */
    public static boolean allDigits(final String str) {

	// your code here
    boolean boolo = true;
    for (int i = 0; i < str.length();i++)
    {
    	if (Character.isDigit(str.charAt(i)) == false)
    	{
    		boolo = false;
    	}
    }

	return boolo;
    }

    /**
     * Determines if a string is a good serial number. Good serial numbers are of
     * the form 'SN/nnnn-nnn', where 'n' is a digit.
     *
     * @param sn The serial number to test.
     * @return true if the serial number is valid in form, false otherwise.
     */
    public static boolean validSn(final String sn) {

	// your code here
    	int q = 0;
    
    if (sn.length() == 11 && sn.charAt(0) == 'S' && sn.charAt(1) == 'N' && sn.charAt(2) == '/' && sn.charAt(7) == '-')
    {
    	if(Character.isDigit(sn.charAt(3)) == true && Character.isDigit(sn.charAt(4)) == true 
    			&& Character.isDigit(sn.charAt(5)) == true && Character.isDigit(sn.charAt(6)) == true 
    			&& Character.isDigit(sn.charAt(8)) == true && Character.isDigit(sn.charAt(9)) == true 
    			&& Character.isDigit(sn.charAt(10)))
    	{
    		q += 1;
    	}
    	
    }
    
    

	return (q > 0);
    }

    /**
     * Evaluates serial numbers from a file. Writes valid serial numbers to
     * good_sns, and invalid serial numbers to bad_sns. Each line of fileIn contains
     * a (possibly valid) serial number.
     *
     * @param fileIn  a file already open for reading
     * @param goodSns a file already open for writing
     * @param badSns  a file already open for writing
     */
    public static void validSnFile(final Scanner fileIn, final PrintStream goodSns, final PrintStream badSns) {

	// your code here

	return;
    }

}
