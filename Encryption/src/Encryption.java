/**
 * An encryption scheme used for an English text.
 *
 * Bugs: N/A
 *
 * @author Jennifer Wong
 */
public class Encryption {

	/**
	 * encrypts the string and returns it
	 * 
	 * @param s the String to be encrypted
	 * @return the encrypted String
	 */
	public static String encryptString(String s)
	{
		// remove spaces
		String noSpacesString = s.replace(" ", "");
		// number of short Strings that is separated by a space in the output
		double shortStringNum = Math.sqrt(noSpacesString.length());
		// the number of characters we skip to get the next character in the output
		int skipChar = (int)Math.ceil(shortStringNum);
		String output = "";
		// iterates through the first few characters in the output string
		for (int j = 0; j < skipChar; j++)
		{
			// finds the next character to add to the output string
			for (int i = j; i < noSpacesString.length(); i+=skipChar)
			{
				output += noSpacesString.charAt(i);
			}
			// does not add a space if it reaches the last output string
			if(j != skipChar-1)
				output += " ";
		}
		return output;
	}
	
	/**
	 * Runs the test cases for encryptString method
	 * 
	 * @return true is all test cases are passed, false otherwise
	 */
	public static boolean unitTests()
	{
		//Tests for encryptString
		//Test case 1: s = if man was meant to stay on the ground god would have given us roots
		String expected1 = "imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau";
		if (!encryptString("if man was meant to stay on the ground god would have given us roots").equals(expected1))
			return false;
		
		//Test case 2: s = have a nice day
		String expected2 = "hae and via ecy";
		if (!encryptString("have a nice day").equals(expected2))
			return false;
		
		//Test case 3: s = feedthedog
		String expected3 = "fto ehg ee dd";
		if (!encryptString("feedthedog    ").equals(expected3))
			return false;
		
		//Test case 4: s = chillout
		String expected4 = "clu hlt io";
		if (!encryptString("chillout").equals(expected4))
			return false;
		
		return true;
	}
	
	/**
	 * Main class that runs unitTests and encrytString.
	 */
	public static void main(String[] args) {
		
		// Perform unitTests first
        if(unitTests()) {
            System.out.println("All unit tests passed.\n");
        } else {
            System.out.println("Failed test.\n");
            return;
        }
        
        // Prints all the expected and actual outputs from unitTests
        System.out.println("Expected: imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau");
		System.out.println("Actual: "+
		encryptString("if man was meant to stay on the ground god would have given us roots")+"\n");
		System.out.println("Expected: hae and via ecy");
		System.out.println("Actual: "+encryptString("have a nice day")+"\n");
		System.out.println("Expected: fto ehg ee dd");
		System.out.println("Actual: "+encryptString("feedthedog    ")+"\n");
		System.out.println("Expected: clu hlt io");
		System.out.println("Actual: "+encryptString("chillout")+"\n");
	}
}
