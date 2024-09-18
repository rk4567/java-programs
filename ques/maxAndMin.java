
import java.util.Scanner;

public class maxAndMin {

    void minArray(int[] arr){
        int min=arr[0];
        // int count=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                // count++;
            }

        }
        System.out.println("Minimum number in array = "+ min);
        // System.out.println("it present " +count+" Times in array.");
        // return min;
        
    }
    void maxArray(int[] arr){
        int max=arr[0];
        // int count=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println("Maximum number in array = "+ max);
        // System.out.println("it present" +count+"Times in array.");
        // return max;
        
    }
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        maxAndMin mm = new maxAndMin();
            int[] array = new int[12];  
            System.out.println("Enter the elements of the array: ");  
            for(int i=0; i<12; i++)  
            {  
                //reading array elements from the user   
                array[i]=sc.nextInt();  
            }  
            System.out.println("Array elements are: ");  
            // accessing array elements using the for loop  
            for (int i=0; i<12; i++)   
            {  
                System.out.println(array[i]);  
            } 
            
    mm.maxArray(array);
    mm.minArray(array);
        
    }
}
