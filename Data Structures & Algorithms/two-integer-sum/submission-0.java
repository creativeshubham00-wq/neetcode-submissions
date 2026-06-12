class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
           int first = target - nums[i];

           if(map.containsKey(first)){
            return new int[]{map.get(first), i};
           }

           map.put(nums[i], i);
        }
        return null;
    }
}
