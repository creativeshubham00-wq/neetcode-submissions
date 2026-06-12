class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        boolean flag = false;
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) +1);
        }

        for(var it : map.entrySet()){
            if(it.getValue() > 1){
                flag = true;
                return flag;
            }
        }

        return flag;
    }
}