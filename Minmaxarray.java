import java.util.*;

class Minmaxarray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		System.out.println("Enter the elements in the array : ");
		int arr[] = new int[size];
		int i;
		for(i=0; i < size; i++) 
		{
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		for(i = 0; i < size; i++)
		{
			if(arr[i] > max)
				max = arr[i];
			else if(arr[i] < min)
				min = arr[i];
		}
		System.out.println("Max : " + max + " | Min : " + min);
		
	}
}
		
		

