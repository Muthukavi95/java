import java.util.*;
public class Main {
  public static void main(String[] args) {
  
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print(" ");
        n = s.nextInt();
        
        if(n > 0)
        {
            System.out.println(" "+n+"  Positive");
        }
        else if(n < 0)
        {
            System.out.println(" "+n+"  Negative");
        }
        else
        {
            System.out.println(" "+n+" zero");
        }
      
  }
}
