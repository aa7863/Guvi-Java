import java.util.Scanner;
 
public class naturalnumbers
{
   
 public static void main(String args[]) 
   
 {
       
 Scanner sc = new Scanner(System.in);
        
System.out.println("Enter the total no. of natural numbers:");
  
      int n = sc.nextInt();
       
 int sum = 0;
        
int x;
        
for (x=1; x<=n; x++)
        
{
        sum += x;}
        
System.out.println("The sum of first " + n + " natural numbers is:" + sum);
        
    
}

}