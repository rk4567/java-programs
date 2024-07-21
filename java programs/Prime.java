import java.util.Scanner;
class Prime
{
public static void main(String[] args)
{
int n,count=0,i;
    try (Scanner scn = new Scanner(System.in)) {
        System.out.println("--------program To check prime or not -------- ");
        System.out.print("Enter Number to check: ");
        n=scn.nextInt();
    }
i=1; //initialization
while(i<=n)
{
     if (n%i==0)
        count=count+1;
     i=i+1;    
}
if (count==2)
    System.out.println(n+" is a prime number");
else
    System.out.println(n+" is not a prime number");
}
}