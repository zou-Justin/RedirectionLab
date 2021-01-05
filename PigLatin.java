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
}

}