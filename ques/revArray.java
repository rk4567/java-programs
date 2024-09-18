// reverse an array
import java.util.Scanner;
public class revArray {
    Scanner sc = new Scanner(System.in);
    public static void inputArray()   
    {  
        revArray sc = new revArray();
        //creates an array in the memory of length 12 
        int[] array = new int[12];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<12; i++)  
        {  
            //reading array elements from the user   
            array[i]=sc.sc.nextInt();  
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
        reverseArray(array);
    }
    static int reverseArray(int[] arr){
        int size=arr.length;
        int[] rev = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            rev[i]=arr[size-1];
            size--;
        }
        System.out.println();
        System.err.println("Reversed array elements are:");
        // accessing array elements using the for loop  
        for (int i=0; i<rev.length-1; i++)   
        {  
            System.out.print(rev[i]+",");  
        } 
        for (int i=0; i<1; i++)   
        {  
            System.out.print(rev[rev.length-1]+".");  
        } 
    return 0;
    }
    public static void main(String[] args) {
        // inputArray();
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        reverseArray(a);
    }
}
