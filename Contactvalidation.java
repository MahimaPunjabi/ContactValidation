
package CoreJavaAssignments;
import java.io.*;

public class Contactvalidation 
{
    
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter cotact number");
        String s1=br.readLine();
        int n=s1.length();
        
        if(n==10)
        {
            for(int i=0; i<n; i++)
            {
                if((s1.charAt(i)<48)||(s1.charAt(i)>57))
                {
                    System.out.println("Only digits are alowed");
                    break;
                }
            }
        }
        else
            System.out.println("Only 10 digits are allowed");
    }
}
