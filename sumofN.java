import java.util.Scanner;

public class sumofN 
{
    
public static void main(String args[]) 
    
{
        
Scanner sc = new Scanner(System.in);
        
System.out.println("Enter the total no. of numbers:");
        
int n = sc.nextInt();
        
System.out.println("Enter " + n + " numbers:");
        
int A[] = new int[n];
        
for (int i=0; i<n; i++)
        
{
            
A[i]= sc.nextInt();
        
}
        
int sum = 0;
        
int x;
        
for (x=0; x<n; x++)
        
{
        
sum += A[x];
}
        
System.out.println("The sum of first " + n + " natural numbers is:" + sum);
        
    
}

}