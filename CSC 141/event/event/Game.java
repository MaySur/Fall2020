import java.util.*;
public class Game {
public static void main(String [] args){
Random r = new Random();
int x = r.nextInt(6)+1;
//System.out.println(x);

Scanner kb = new Scanner(System.in);
System.out.print("Enter your guess 0 for 1-3, 1 for 4-6, or -1 for quit: ");
//int g = kb.nextInt();

for(int g = kb.nextInt()  ; g!=-1; g = kb.nextInt()) //added
{ // added
System.out.println("The number is "+x);
if (g==0 && x<4 || g==1 && x>3) 
   System.out.println("The player wins.");
else
   System.out.println("The computer wins.");
System.out.print("Enter your guess 0 for 1-3, 1 for 4-6, or -1 for quit: ");
x = r.nextInt(6)+1; //added
} 


}
}