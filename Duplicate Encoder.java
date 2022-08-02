public class DuplicateEncoder {

    static String encode(String word) {
        
        String res = "";
        boolean repeat;
        for (int i = 0; i < word.length(); i++){
            repeat = false;
            for (int j = 0; j < word.length(); j++){
                if (word.toLowerCase().charAt(i) == word.toLowerCase().charAt(j) && i != j){
                   repeat = true;
                }
               
            }
            
            if (repeat){
                res = res + ')';
            }
            else{
                res = res + '(';
            }
        }
        
        return res;

    }
}
