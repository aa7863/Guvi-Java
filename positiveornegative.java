import java.util.Scanner;

public class positiveornegative
{
  
public static void main(String args[]) 
 
   {
     
   Scanner a = new Scanner(System.in);

   System.out.println("Input any number:");
        
   int x = a.nextInt();
        
      
   if (x>=1)
        
   {System.out.println("The number is positive");}
        
   else if (x<0)
        
   {System.out.println("The number is negative");}
        
   else
        
   {System.out.println("The number is zero");}

    }

}