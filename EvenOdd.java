package topcrowd;
import java.util.*;
public class EvenOdd {
	// in b1  
	private static int oddRounder(int num)
	{
		int temp;
		if(num<0)return -1;
		else 
			if(num == 0) return -2;
			else if((num%2) == 0)return num;
			      else {temp= ((num/10) +1)*10;return temp;}
		
	}
	public static void main(String[] args)
	{
		int num,temp;
		System.out.println("Enter any number :");
		Scanner sc = new Scanner(System.in);
		num= sc.nextInt();		
		temp = oddRounder(num);
		System.out.println(temp);
		
	}
}
