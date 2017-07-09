import java.util.Scanner;

public class alphabetornot 
{
    
public static void main(String args[]) 
   
 {
        
Scanner a = new Scanner(System.in);
        
System.out.println("Input:");
       
 char x = a.next().charAt(0);
        
       
 if (x>='A' && x<='Z')
       
 {
         System.out.println("It is an alphabet");
        }
       
 else if (x>='a' && x<='z')
       
 {
         System.out.println("It is an alphabet");
        }
       
 else
       
 {
          System.out.println("It is not an alphabet");  
        }
   
 }

}