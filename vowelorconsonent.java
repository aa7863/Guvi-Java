import java.util.Scanner;

public class vowelorconsonent 
{
  
public static void main(String args[]) 
 
   {
     
   Scanner a = new Scanner(System.in);

   System.out.println("Input any alphabet:");
        
   char x = a.next().charAt(0);
        
      
   switch(x)
       
   {
        
    case 'a':
          
    case 'e':
         
    case 'i':
         
    case 'o':
        
    case 'u':
         
    case 'A':
         
    case 'E':
         
    case 'I':
         
    case 'O':
         
    case 'U':     
         
    System.out.println("The alphabet is a vowel");
         
    break;
         
    default:
         
    System.out.println("The alphabet is a consonent");
        
    }
   
 }

}
