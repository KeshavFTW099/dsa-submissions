import java.util.HashMap;
import java.util.Map; //or just *

class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map< Integer, Integer> numMap = new HashMap<>();
       //map takes integer key value pari, named hashmap, and is of the class HashMap

       for(int i=0;i<nums.length; i++) {
       int complement = target - nums[i];
       
       //eg target is 5, num is 3, 5-3=2, complement = 2

       //now check for complement in NumMap
       if(numMap.containsKey(complement)) {
        return new int[] //will return a new initiated int array
        {numMap.get(complement), i}; 

       }
                  numMap.put(nums[i], i);
        
        
       
    }
     return null;
    }
} 