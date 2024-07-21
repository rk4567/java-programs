import java.util.Scanner;
class pattern1 
{
public static void main (String args[])
{
    int n,i,j;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of rows to print");
    n=sc.nextInt();
    for( i = n ;i <= n;n--)
    {
        for(j=1;j<=n;j++)
        {
            System.out.print("*");
        }
    System.out.println();
    }
}
}
