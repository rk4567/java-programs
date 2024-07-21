import java.util.*;
public class personalInfo
{
public static void main(String args[])
{
Scanner scn = new Scanner(System.in);
System.out.println("Enter your name: ");
String name=scn.nextLine();
System.out.println("Enter your day of birth(DD): ");
int ddob=scn.nextInt();
System.out.println("Enter your month of birth(MM): ");
int mdob=scn.nextInt();
System.out.println("Enter your year of birth(YYYY): ");
int ydob=scn.nextInt();
scn.close();
System.out.println("Enter your Mobile Number: ");
String mobileNumber=scn.nextLine();
scn.close();
System.out.println("your name is: "+name);
System.out.println("your date of birth is: "+ddob+"-"+mdob+"-"+ydob);
System.out.println("your mobile number is: "+mobileNumber);
}}

