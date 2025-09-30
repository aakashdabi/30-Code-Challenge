package Day3.Day3;

import java.util.*;

class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        Set<Integer> set = new HashSet<>();
        boolean hasDuplicate = false;
        for (int num : nums) {
            if (set.contains(num)) {
                hasDuplicate = true;
                break;
            }
            set.add(num);
        }
        System.out.println(hasDuplicate);
    }
}
