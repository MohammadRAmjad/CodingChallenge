package onboardingCodingChallenge1;

import java.util.*;


/**
Imagine you are responsible for a portfolio of profitable stocks represented in an array. 
Each item in the array represents the yearly profit of a corresponding stock. 
The analyst gathers all distinct pairs of stocks that reached the target profit. 
Distinct pairs are pairs that differ in at least one element. Given the array of profits, 
find the number of distinct pairs of stocks where the sum of each pair’s profits is 
exactly equal to the target sum.
Example:
stocksProfit = [5, 7, 9, 13, 11, 6, 6, 3, 3]
target = 12 profit's target
 * 
 * **/

public class challenge1 {

	public static void main(String[] args) {
		int[] a = {1,1,6, 5, 7, 9, 13, 11, 6, 3, 3};
		int target = 12;
		
		findPairs(a, target);
		

	}
	
	 public static void findPairs(int[] nums, int T) {
		 int left_pointer = 0;
		 int right_pointer = nums.length - 1;
		 Arrays.sort(nums);
		while(left_pointer < right_pointer) {
			if(left_pointer != 0 && nums[left_pointer] == nums[left_pointer -1]) {
				left_pointer++;
				continue;
			}
			int sum = nums[left_pointer] + nums[right_pointer];
			if(sum == T) {
				System.out.println(nums[left_pointer] + " + " + nums[right_pointer]);
				left_pointer++;
				right_pointer--;
			}else if(sum > T) {
				right_pointer--;
			}else {
				left_pointer++;
			}
		}
	 }

}
