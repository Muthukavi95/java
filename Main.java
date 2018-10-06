import java.util.*;
public class Main {
  public static void main(String[] args) {
  
        int num,x,y;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        x = s.nextInt();
        num = s.nextInt();
        y=num+x;
        if(y > 0)
        {
            System.out.println("The given number "+y+" is Positive");
        }
        else if(y < 0)
        {
            System.out.println("The given number "+y+" is Negative");
        }
        else
        {
            System.out.println("The given number "+y+" is invalid");
        }
      
  }
}