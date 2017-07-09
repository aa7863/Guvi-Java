import java.util.Scanner; 

public class leapyear 
{
   
 public static void main(String args[]) 
    
{
        
       
 Scanner a = new Scanner(System.in);
      
  System.out.println("Enter the year:");
       
 int x = a.nextInt();
        
        
if ((x % 400 == 0) || ((x % 4 == 0) && (x % 100 != 0)))
       
 {System.out.println("Year " + x + " is a leap year.");}
       
 else
       
 {System.out.println("Year " + x + " is not a leap year.");}
    
}

}