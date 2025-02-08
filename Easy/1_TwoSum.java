class Solution { 
    public int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2]; 
        HashMap<Integer, Integer> indexMap = new HashMap<Integer, Integer>(); 

        for (int i = 0; i < nums.length; i++){ 
            int number = nums[i]; 
            int difference = target - number; 
            
            if(indexMap.containsKey(difference)){ 
                solution[0] = i; 
                solution[1] = indexMap.get(difference); 
            } 
            indexMap.put(number, i); 
        } 
        
        return solution; 
    } 
}