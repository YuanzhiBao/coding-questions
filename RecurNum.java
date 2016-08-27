import java.util.ArrayList;

public class RecurNum {
	public ArrayList<ArrayList<Integer>> permute(int[] nums) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if (nums.length == 0) {
			return res;
		}
		ArrayList<Integer> tmpres = new ArrayList<Integer>();
		permuteHelper(nums, 0, res, tmpres);
		return res;
	}
	public void permuteHelper(int[] nums, int index, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> tmpres) {
		if (index  == nums.length) {
			System.out.println("******");
			for (int b : tmpres) {
				System.out.print(b);
			}
			System.out.println("******");
			res.add(tmpres);
			return;
		}
		for (int i = index; i < nums.length; i++) {
			swap(nums, index, i);
			tmpres.add(nums[index]);
			permuteHelper(nums, index + 1, res, tmpres);
			tmpres.remove(tmpres.size() - 1);
			swap(nums, i, index);
		}
	}
	public void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
}
