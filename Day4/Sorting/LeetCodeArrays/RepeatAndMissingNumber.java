package Day4.Day4.Sorting.LeetCodeArrays;

class RepeatAndMissingNumber {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n + 1];
        int dup = -1;
        for (int num : nums) {
            if (seen[num]) dup = num;
            seen[num] = true;
        }
        int miss = -1;
        for (int i = 1; i <= n; i++) {
            if (!seen[i]) {
                miss = i;
                break;
            }
        }
        return new int[]{dup, miss};
    }
}
