/*
Write a function that will return the count of distinct case-insensitive alphabetic 
characters and numeric digits that occur more than once in the input string. 
The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
*/

import java.util.ArrayList;

public class CountingDuplicates {
  public static int duplicateCount(String str) {
        str = str.toLowerCase();
        ArrayList characters = new ArrayList();
        boolean repeat;

        for (int i = 0; i < str.toCharArray().length; i++) {
            repeat = false;
            for (int j = 0; j < str.toCharArray().length; j++) {
                if (str.toCharArray()[i] == str.toCharArray()[j] && i != j) {
                    repeat = true;
                }
            }

            if (repeat && !characters.contains(str.toCharArray()[i])) {
                characters.add(str.toCharArray()[i]);
            }
        }

        return characters.size();
  }
}
