// import java.uti.Scanner;
import java.util.Scanner;
public class ReverseArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];  
        int[] array1 = new int[n];
        int size=array1.length-1;
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<array.length; i++)  
        {  
            //reading array elements from the user   
            array[i]=sc.nextInt();
            array1[size]= array[i];
            size--;  
        }  
        System.out.println("Array elements are: ");  
        // accessing array elements using the for loop  
        for (int i=0; i<array.length-1; i++)   
        {  
            System.out.print(array[i]+",");  
        }
        for (int i=0; i<1; i++)   
        {  
            System.out.print(array[array.length-1]+".");  
        } 
        System.out.println();
        System.err.println("Reversed array elements are:");
        // accessing array elements using the for loop  
        for (int i=0; i<array1.length-1; i++)   
        {  
            System.out.print(array1[i]+",");  
        } 
        for (int i=0; i<1; i++)   
        {  
            System.out.print(array1[array1.length-1]+".");  
        } 
    }
}
