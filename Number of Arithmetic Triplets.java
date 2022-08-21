public int arithmeticTriplets(int[] nums, int diff) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        
        for(int i = 0; i < nums.length; i++) 
            map.put(nums[i], i);
        
        for(int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            
            if(map.containsKey(curr + diff) && map.containsKey(curr + 2 * diff)) count++;
        }
        
        return count;
    }
