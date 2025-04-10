import java.util.*;
public class SwingCalc {
    public static void main(String[] args) {
    	int power = 0, dig = 1;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a number");
    	int n = sc.nextInt();
    	int no = n, sum = 0;
    	while(n != 0) {
    		power = power + 1;
    		n = n/10;
    	}
    	
    	n = no;
    	
    	while(n != 0) {
    		dig = n%10;
    		sum = sum + (int)Math.pow(dig, power);
    		n = n/10;
    	}
    	
    	if(sum == no) 
    	{
    		System.out.println("Armstrong Number");
    	}
    	
    }
}

