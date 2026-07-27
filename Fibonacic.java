
import java.util.Scanner;

public class Fibonacic {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number:");
      int n=sc.nextInt();
      int first=1;
      int second=2;
      for(int i=1;i<=n;i++){
        System.out.print(first + " ");
        int next=first+second;
        first=second;
        second=next;
      }
      
  }
}
