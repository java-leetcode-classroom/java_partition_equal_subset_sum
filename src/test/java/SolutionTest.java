import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();

  @Test
  void canPartitionExample1() {
    assertTrue(sol.canPartition(new int[]{1, 5, 11, 5}));
  }

  @Test
  void canPartitionExample2() {
    assertFalse(sol.canPartition(new int[]{1, 2, 3, 5}));
  }
}