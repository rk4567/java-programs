import java.util.*;

class smallest{
    public static void main(String[] args) 
    {
        int a,b,c;
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter 3 number of your choice: ");
            a=scn.nextInt();
            b=scn.nextInt();
            c=scn.nextInt();
        }
        if (a!=b&&a!=c)
        {
            if (a<b && a<c)
            {
                if(b!=c)
                {
                    System.out.println(a+" is the smallest number");
                }
                else
                System.out.println("b and c are equal");
            }
            
        }
        
        else if (b!=a&&b!=c)
        {
            if (b<a && b<c)
            {
                if(a!=c)
                {
                    System.out.println(b+" is the smallest number");
                }
                else
                System.out.println("a and c are equal");
                
            }
            
        }
        
        else if (c!=a&&c!=b)
        {
          if (c<a && c<b)
        {
            if(a!=b)
            {
                System.out.println(c+" is the smallest number");
            }
            else
            System.out.println("a and b are equal");
            
        }
        }
        else
        System.out.println("All number are equal");

    }
}