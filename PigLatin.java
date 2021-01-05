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
  System.out.println(pigLatin("the"));
  System.out.println(pigLatin("skee"));
  System.out.println(pigLatin("emu"));
  System.out.println(pigLatin("grade"));
}
  public static String pigLatin(String s){
    String[] vowels = new String[]{"a","e","i","o","u"};
    String[] diagraphs = new String[]{"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    for (int i = 0; i < diagraphs.length;i++){
        if (s.substring(0,2).equals(diagraphs[i])){
          s += s.substring(0,2) + "ay";
          s = s.substring(2,s.length());
          return s.toLowerCase();
        }
    }
    for (int i = 0; i < vowels.length;i++){
        if (s.substring(0,1).equals(vowels[i])){
          s += "hay";
          return s.toLowerCase();
        }
    }
    s = s.substring(1,s.length()) + s.substring(0,1) + "ay";
    return s.toLowerCase();
  }
  public static String pigLatinBest(String s){}
}