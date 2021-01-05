import java.util.*;

public class PigLatin{

  public static String pigLatinSimple(String s){
    String[] vowels = new String[]{"a","e","i","o","u"};
    for (int i = 0; i < vowels.length;i++){
        if (s.substring(0,1).equals(vowels[i])){
          s += "hay";
          return s.toLowerCase();
        }
    }
    s = s.substring(1,s.length()) + s.substring(0,1) + "ay";
    return s.toLowerCase();
  }
  public static void main(String[]args){
  System.out.println(pigLatinBest("science"));
  // System.out.println(pigLatinBest("4chan"));
  // System.out.println(pigLatinBest("fish!"));
  // System.out.println(pigLatinBest("fish") );
  // System.out.println(pigLatinBest("the."));
  // System.out.println(pigLatinBest("cat!"));
  // System.out.println(pigLatinBest("amazing?"));
  // System.out.println(pigLatinBest("apple%"));
   Scanner n = new Scanner(System.in);
     while(n.hasNextLine()){
         Scanner line = new Scanner(n.nextLine());
         while (line.hasNext()){
           System.out.print(pigLatinBest(line.next()));
           if (line.hasNext()){
             System.out.print(" ");
         }
         if (n.hasNextLine()){
           System.out.println();
         }
         }
         
       }
     }    


  public static String pigLatin(String s){
    String[] diagraphs = new String[]{"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    for (int i = 0; i < diagraphs.length;i++){
        if (s.substring(0,2).equals(diagraphs[i]) && s.length() >= 2){
          s = s.substring(2,s.length()) + s.substring(0,2) + "ay";
          return s.toLowerCase();
        }
    }
    String[] vowels = new String[]{"a","e","i","o","u"};
    for (int i = 0; i < vowels.length;i++){
        if (s.substring(0,1).equals(vowels[i])){
          s += "hay";
          return s.toLowerCase();
        }
    }
    s = s.substring(1,s.length()) + s.substring(0,1) + "ay";
    return s.toLowerCase();
  }
  public static String pigLatinBest(String s){
    String[] Alphabet = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    String[] NumberAlphabet = new String[]{"1","2","3","4","5","6","7","8","9","0","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    for (int i = 0; i < Alphabet.length;i++){
      if (s.substring(0,1).toLowerCase().equals(Alphabet[i])){
        String b = "";
        for (int j = 0;j < NumberAlphabet.length;j++){
          if (!s.substring(s.length()-1,s.length()).toLowerCase().equals(NumberAlphabet[j])){
            b = pigLatin(s.substring(0,s.length()-1));
            b += s.substring(s.length()-1,s.length());
          }
          else if(s.substring(s.length()-1,s.length()).toLowerCase().equals(NumberAlphabet[j])){
            return pigLatin(s);
          }
        }
        return b.toLowerCase();
      }

    }
    return s.toLowerCase();
  }
}
