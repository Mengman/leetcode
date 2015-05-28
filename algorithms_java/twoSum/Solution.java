// Source : https://oj.leetcode.com/problems/two-sum/
// Author : ycli
// Date   : 2015-05-29

/**********************************************************************************
*
* Given an array of integers, find two numbers such that they add up to a specific target number.
*
* The function twoSum should return indices of the two numbers such that they add up to the target,
* where index1 must be less than index2. Please note that your returned answers (both index1 and index2)
* are not zero-based.
*
* You may assume that each input would have exactly one solution.
*
* Input: numbers={2, 7, 11, 15}, target=9
* Output: index1=1, index2=2
*
*
**********************************************************************************/
package algorithms_java.twoSum;

import java.lang.Integer;
import java.util.Map;
import java.util.HashMap;

public class Solution {

  public int[] twoSum(int[] nums, int target){
    int result[] = new int[2];
    Map<Integer, Integer> m = new HashMap<>();
    for (int i = 0; i < nums.length ; i++) {
      int key = target - nums[i];
      if (m.containsKey(key)) {
        result[0] = m.get(key) + 1;
        result[1] = i + 1;
        break;

      }
      else {
        m.put(key, i);
      }

    }

    return result;
  }
}
