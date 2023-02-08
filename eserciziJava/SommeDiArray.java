package eserciziperlaforma;

public class SommeDiArray {

	public static void main(String[] args) {
		int nums3[] = { 2,5,5,11};
		stampaArray(twoSum(nums3, 10));
	}

	public static int[] twoSum(int[] nums, int target) {
		int nums2[] = new int[2];
		boolean si = false;
		
			for (int j = 0; j <= nums.length; j++) {
				if (si)
					break;
				for (int i = j; i <= nums.length; i++) {
					
					if(nums.length==i+1)break;
					
					if ((nums[j] + nums[i + 1]) == target) {
						nums2[0] = j;
						nums2[1] = i + 1;
						si = true;
						break;
					}
					
				}
			
		} 
		return nums2;
	}

	public static void stampaArray(int n[]) {

		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
	}
}
