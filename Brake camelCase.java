/*
Complete the solution so that the function will break up camel casing, using a space between words.
*/

class Solution {
  public static String camelCase(String input) {
    String result = "";
        
        for (int i = 0; i < input.length(); i++){
            
            if (Character.isUpperCase(input.charAt(i))){
                result = result + " " + input.charAt(i);
            }
            
            else{
                result = result + input.charAt(i);
            }
        }
        
        return result;
  }
}
