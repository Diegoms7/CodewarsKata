public static int findShort(String s) {
      
      int index = 0; 
      String [] words = null;
      words = s.split(" ");
      
      for (int i = 0; i < words.length; i++){
        if (words[i].length() < words[index].length()){
          index = i;
        }
      }
      
      return index;
    }
