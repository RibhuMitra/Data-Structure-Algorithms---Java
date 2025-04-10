import java.util.*;

public class Reversearray {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        	int size;
         	System.out.println("Enter the size of the array");
        	size = sc.nextInt();
        	System.out.println("Enter the array");
       	 	int arr[] = new int[size];
       		for(int i = 0; i < size; i++)
       		{
        		arr[i] = sc.nextInt();
        	}
       		System.out.println("Reversed Array : ");
       		for(int i = size-1; i >=0; i--)
        	{
       		 	System.out.println(arr[i]);
     		}
     	}
}
