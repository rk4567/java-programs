import java.util.Scanner;
class pattern 
{
public static void main (String[] args)
{
    int n;
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter Number");
        n = sc.nextInt();
    }
    for(int i=0;i<=n;++i)
    {
        for(int j=0;j<=i;++j)
        {
            System.out.println("*");
        }
        
    }
}
}
