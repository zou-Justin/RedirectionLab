import java.util.*;
public class MakeStars{
  public static void main(String[]args ){
      Scanner n = new Scanner(System.in);
        while(n.hasNextLine()){
            Scanner line = new Scanner(n.nextLine());
            while (line.hasNext()){
              String star = line.next();
              for (int i = 0;i < star.length();i++){
                System.out.print("*");
              }
              System.out.print(" ");
            }
          System.out.println();
        }

}
}
