package studio3;

import java.util.Scanner;

public class Sieve1 {

	public static void main(String[] args) {
		//user inputs last number
		Scanner in = new Scanner(System.in);
		System.out.println("What is the highest number in the array?");
		int length = in.nextInt();
		int[] nums = new int[length];
		for(int i =0; i< nums.length-1; i++) {
			nums[i]= i+2; 
		}
		
		/*for(int i =0; i< nums.length-1; i++) {
			System.out.println(nums[i]);
		}*/
		
		double factor = 2.0;
		while(factor <length) {
			for(int i=0; i< nums.length; i++) {
				
				if(nums[i]==factor) {
					nums[i] = nums[i];
					
				}
				else if((nums[i]/factor) == (int)(nums[i]/factor)) {
					nums[i] = 0;	
				}
			}
			
			factor++;
		}
		
		for(int i =0; i< nums.length-1; i++) {
			if(nums[i] !=0)
			System.out.println(nums[i]);
		}

	}

}
