package leetcode;

public class twoSum {

	public static void main(String args[]) {
		int[] nums = {3,2,4};
		int target = 6;
		
		twoSum(nums, target);
	}
	
	public static int[] twoSum(int[] nums, int target) {
        boolean answered = false;
		int[] answer = new int[2];
        for(int i=0; i<nums.length-1; i++) {
        	if(answered) {
        		break;
        	}
        	
        	for(int j=i+1; j<nums.length; j++) {
            	if(target == nums[i] + nums[j]) {
            		answer[0] = i;
            		answer[1] = j;
            		answered = true;
            		break;
            	}
        	}
        }

        return answer;
    }
}
