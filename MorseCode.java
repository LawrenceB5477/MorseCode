/**
 * Method to convert text into morse code 
 * 
 * @author Lars Beutlich
 * @version 2/28/2017
 */
import java.util.Scanner;
import java.io.File; 
import java.io.IOException; 
public class MorseCode
{       
    public static String[] createArray() throws IOException
    {
        File text = new File("morse.txt"); 
        Scanner readFile = new Scanner(text); 
        
        String[] code = new String[37]; 
        //space between words
        code[0] = "  "; 
        for(int i = 1; i < 37; i++)
        {
            code[i] = readFile.nextLine(); 
        }
        readFile.close(); 
        
        return code;
    }
    
    public static String[] createAlphabet()
    {
        String[] a = new String[37];
        a[0] = " "; 
        a[1] = "a"; 
        a[2] = "b"; 
        a[3] = "c"; 
        a[4] = "d"; 
        a[5] = "e"; 
        a[6] = "f"; 
        a[7] = "g"; 
        a[8] = "h";
        a[9] = "i"; 
        a[10] = "j"; 
        a[11] = "k"; 
        a[12] = "l"; 
        a[13] = "m"; 
        a[14] = "n"; 
        a[15] = "o"; 
        a[16] = "p"; 
        a[17] = "q"; 
        a[18] = "r"; 
        a[19] = "s"; 
        a[20] = "t"; 
        a[21] = "u"; 
        a[22] = "v"; 
        a[23] = "w"; 
        a[24] = "x";
        a[25] = "y";
        a[26] = "z";
        a[27] = "1";
        a[28] = "2"; 
        a[29] = "3"; 
        a[30] = "4"; 
        a[31] = "5"; 
        a[32] = "6"; 
        a[33] = "7"; 
        a[34] = "8"; 
        a[35] = "9";
        a[36] = "0"; 
        return a; 
    }
    
    public static String convert(String[] morse, String[] alphabet, String input)
    {
        int cypher = 0; 
        String text = "";
        boolean first = true; 
        for(int i = 0; i < input.length(); i++)
        {
            if ( i > 0)
            {
                first = false; 
            }
            for (int l = 0; l < alphabet.length; l ++)
            {
                if (Character.toString(input.charAt(i)).equalsIgnoreCase(alphabet[l]))
                {
                    cypher = l; 
                }
            }
            //print out the corresponding morse code
            if (first == true)
            {
                text += morse[cypher];
            } else 
            {
                if (cypher == 0)
                {
                    text += morse[cypher];
                } else 
                {
                    text += "   " + morse[cypher]; 
                }
            }
        }
        return text;
    }
        
}
