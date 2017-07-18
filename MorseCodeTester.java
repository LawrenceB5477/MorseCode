/**
 * Takes input and converts it to morse code
 * 
 * @author Lars Beutlich
 * @version 2/28/2017
 */
import java.io.IOException;
import java.util.Scanner;
public class MorseCodeTester
{
    public static void main(String[] args) throws IOException
    {
        String[] code = MorseCode.createArray(); 
        String[] alphabet = MorseCode.createAlphabet(); 
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Input to Convert to Morse Code: "); 
        String text = in.nextLine(); 
        
        String textOut = MorseCode.convert(code, alphabet, text); 
        
        System.out.println(textOut); 
    }
}
