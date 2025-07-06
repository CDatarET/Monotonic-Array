class Solution {
    public boolean isMonotonic(int[] nums) {
        int prev = nums[0];
        int state = 0;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] > prev){
                if(state == 2){
                    return(false);
                }
                state = 1;
            }
            else if(nums[i] < prev){
                if(state == 1){
                    return(false);
                }
                state = 2;
            }
            
            prev = nums[i];
        }
        return(true);
    }
}
