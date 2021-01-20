import java.util.*;
public class CountingTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of the array");
		int arr_size=sc.nextInt();
		int arr[]=new int[arr_size];
		
		System.out.println("Enter numbers in the array:");
		for(int i=0; i<arr_size; i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter sum:");
		int sum=sc.nextInt();
		
		CountingTriplets ct=new CountingTriplets();
		ct.findTriplets(arr, sum);
		}
	
	
	void findTriplets(int arr[], int sum) 
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				for(int k=0; k<arr.length; k++)
				{
					if(sum==arr[i]+arr[j]+arr[k])
					{
						System.out.println("Triplet is"+arr[i]+","+arr[j]+","+arr[k]);
					}
					else
					{
						System.out.println("No Triplet");
					}
				}					
			}
		}
	}
}
