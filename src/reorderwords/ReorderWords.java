package reorderwords;

import java.util.*;

public class ReorderWords {
    public static String reorderSentence(String[] words) {

        String[] result = new String[words.length];
        
  
        for (String word : words) {
          
            int length = word.length();
            int position = Character.getNumericValue(word.charAt(length - 1)) - 1; 
            
    
            String actualWord = word.substring(0, length - 1);
        
            result[position] = actualWord;
        }
        
   
        return String.join(" ", result);
    }

    public static void main(String[] args) {
        String[] words = {"esta2", "bien4", "muy3", "esto1"};
        String result = reorderSentence(words);
        System.out.println(result);  
    }
}
