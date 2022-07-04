import java.util.HashSet;

public class Solution {
  public boolean canPartition(int[] nums) {
    int targetSum = 0;
    for (int num : nums) {
      targetSum  += num;
    }
    if (targetSum % 2 == 1) {
      return false;
    }
    targetSum /= 2;
    HashSet<Integer> dp = new HashSet<>();
    dp.add(0);
    int nLen = nums.length;
    for (int start = nLen -1; start >= 0; start--) {
      HashSet<Integer> nextDp = new HashSet<>();
      for (int sum : dp) {
        if (nums[start]+ sum == targetSum) {
          return true;
        }
        nextDp.add(sum);
        nextDp.add(sum+ nums[start]);
      }
      dp = nextDp;
    }
    return dp.contains(targetSum);
  }
}
