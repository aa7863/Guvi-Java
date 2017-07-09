import java.util.Scanner;

public class largestof3 
{
    
public static void main(String args[]) 
   
 {
        
       
 Scanner a = new Scanner(System.in);
        
System.out.println("Enter three numbers:");
        
int x = a.nextInt();
      
  int y = a.nextInt();
        
int z = a.nextInt();
        
       
 if (x>y && x>z)
       
 {System.out.println(x + " is largest");}
       
 else if (y>x && y>z)
        
{System.out.println(y + " is largest");}
       
 else 
        
{System.out.println(z + " is largest");}
    
}

}
