import java.util.*;
public class Pattern {

	
	public static void main (String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of columns (odd only)");
		int n=sc.nextInt();
		int n1 = n / 2;
		int x = 1;
		
		if(n%2 !=0)
		{		
		for (int i = 1; i <= n; i++) 
		{ 
			for (int j = 1; j <= n1; j++) 
			{ 
				System.out.print(" "); 
			}
			int num = x/2+1; 
			for (int k=1; k<=x; k++) 
			{ 
				System.out.print(num); 
				if (k<=x/2) 
				{
					num--; 
				}
				else {
					num++;
				}
			} 
			System.out.println(); 
			if (i<=n/2) { 
				n1 = n1 - 1; 
				x = x + 2; 
			} 
			else { 
				n1 = n1 + 1; 
				x = x - 2; 
			} 
		}
		}
		else {
			System.out.println("Number is even");
	}
}
}
