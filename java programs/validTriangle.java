import java.util.*;
public class validTriangle
{
public static void main(String args[])
{
    double angle1;
    double angle2;
    double angle3;
    try (Scanner scn = new Scanner(System.in)) {
        System.out.println("Enter angles of triangle: ");
        angle1 = scn.nextDouble();
        angle2 = scn.nextDouble();
        angle3 = scn.nextDouble();
    }

if (angle1+angle2+angle3==180)
{
	System.out.println("triangle is valid");
}
else

     System.out.println("triangle is invalid");

}}

