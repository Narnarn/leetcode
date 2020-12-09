public class InsertNum {
    public static int searchInsert(int[] nums, int target) {
        return searchInsert(nums, 0, nums.length - 1, target);

    }

    public static int searchInsert(int[] nums, int i, int j, int target) {
        if (i == j) {
            if (nums[i] >= target) {
                return i;
            } else if (nums[i] < target) {
                return i + 1;
            }
        }

        int mid = i + (j - i) / 2;
        if (target < nums[mid]) {
            return searchInsert(nums, i, mid, target);
        } else {
            return searchInsert(nums, mid + 1, j, target);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6 };
        int ans = searchInsert(arr, 1);
        System.out.println(ans);
    }

}