// slide 50
import java.util.*;
public class Prompt{
public static void main(String [] args){
   Scanner kb = new Scanner(System.in);
   System.out.print("Type a non-negative integer: ");
   int n = kb.nextInt();
   
   while(n<0){
      System.out.print("Invalid number, try it again: ");
      n = kb.nextInt();
   }
   System.out.println(n+" squared is "+n*n);
}
}