/*
An isogram is a word that has no repeating letters, consecutive or non-consecutive. 
Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. 
Ignore letter case.
*/

public class isogram {
    public static boolean  isIsogram(String str) {
      
        str = str.toLowerCase();
        boolean result = true;

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) != str.lastIndexOf(str.charAt(i))) {
                result = false;
            }

        }
      
        return result;
    } 
}
