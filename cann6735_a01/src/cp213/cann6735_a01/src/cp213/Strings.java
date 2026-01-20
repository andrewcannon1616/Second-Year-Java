package cp213;

/**
 * @author Your name and id here
 * @version 2024-09-01
 */
public class Strings {
    // Constants
    public static final String VOWELS = "aeiouAEIOU";

    /**
     * Determines if string is a "palindrome": a word, verse, or sentence (such as
     * "Able was I ere I saw Elba") that reads the same backward or forward. Ignores
     * case, spaces, digits, and punctuation in the string parameter s.
     *
     * @param string a string
     * @return true if string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(final String string) {

	// your code here
    boolean booly = true;
    String paly = "";
    for (int i = 0; i < string.length(); i++) 
    {
    	if (Character.isLetter(string.charAt(i)) == true)
    	{
    		paly += Character.toLowerCase(string.charAt(i));
    	}
    }
    for (int i = 0; i < (paly.length()) / 2; i++) 
    {
    	if (paly.charAt(i) != paly.charAt(paly.length() - i - 1))
    	{
    		booly = false;
    	}
    }
    

	return booly;
    }

    /**
     * Determines if name is a valid Java variable name. Variables names must start
     * with a letter or an underscore, but cannot be an underscore alone. The rest
     * of the variable name may consist of letters, numbers and underscores.
     *
     * @param name a string to test as a Java variable name
     * @return true if name is a valid Java variable name, false otherwise
     */
    public static boolean isValid(final String name) {

	// your code here
    int r = 1;
    if (name.length() > 0)
    {
    	if (Character.isLetter(name.charAt(0)) == true 
    			|| name.charAt(0) == '_')
    	{
    		for (int i = 0;i < name.length();i++)
    		{
    			if (Character.isLetterOrDigit(name.charAt(i)) == false 
    					&& name.charAt(i) != '_')
    			{
    				r -= 1;
    				
    				
    			}
    					
    		}
    	} else
    	{
    		r -= 1;
    	}
    }


	return (r > 0);
    }

    /**
     * Converts a word to Pig Latin. The conversion is:
     * <ul>
     * <li>if a word begins with a vowel, add "way" to the end of the word.</li>
     * <li>if the word begins with consonants, move the leading consonants to the
     * end of the word and add "ay" to the end of that. "y" is treated as a
     * consonant if it is the first character in the word, and as a vowel for
     * anywhere else in the word.</li>
     * </ul>
     * Preserve the case of the word - i.e. if the first character of word is
     * upper-case, then the new first character should also be upper case.
     *
     * @param word The string to convert to Pig Latin
     * @return the Pig Latin version of word
     */
    public static String pigLatin(String word) {

	// your code here
    String rets = "";
    boolean vow = false;
    for (int i = 0;i < VOWELS.length();i++)//finds vowels
    {
    	if (VOWELS.charAt(i) == word.charAt(0))
    	{
    		vow = true;
    	}
    }
    
    
    if (vow == true)//vowel
    {
    	for (int i = 0;i < word.length();i++)
    	{
    		rets += word.charAt(i);
    	}
    	rets += "way";
    } else//consonants
    {
    	if (Character.isUpperCase(word.charAt(0)) == true)
    	{
    		for (int i = 0;i < (word.length() - 1);i++)
        	{
    			if (i == 0)
    			{
    				rets += Character.toUpperCase(word.charAt(i+1));
    			} else
    			{
    				rets += word.charAt(i+1);
    			}
        		
        	}
    		rets += Character.toLowerCase(word.charAt(0)) + "ay";
    	} else
    	{
    		for (int i = 0;i < (word.length() - 1);i++)
        	{
        		rets += word.charAt(i+1);
        	}
        	rets += word.charAt(0) + "ay";
    	}
    	
    }
    
	return rets;
    }

}
