package week3.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import cucumber.api.cli.Main;

public class MajorityElement {
	public static int checkMajorityElement(int arr[], int n)
	{
		Map<Integer, Integer>mp=new HashMap<Integer,Integer>();
		for (int i=0;i<n;i++)
		{
			if(mp.containsKey(arr[i]))
				mp.put(arr[i], mp.get(arr[i]+1));
			else
				mp.put(arr[i], 1);
		}
		
		for (Map.Entry<Integer, Integer> entry : mp.entrySet())
			
		{
			
			if(entry.getValue()  >(n/2))
				return entry.getKey();
		}
		
		return -1;
	}
		
		public static void main(String[] args) throws Throwable {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of array :");
			int n=6;
			int arr[] = {2,1,1,2,2,2};
			System.out.println("Ente the element of aray:");
			for (int i = 0;i<n;i++)
				arr[i]=sc.nextInt();
			int ans =checkMajorityElement(arr,n);
			if (ans !=-1)
				System.out.println("Majority Element is : "+ans);
			else
				System.out.println("No Majority element in array");
			
					
		}
			
		
		
		
}

