class Solution {
    public int wiggleMaxLength(int[] nums) {
     if(nums == null || nums.length==0)
        return 0;
    if(nums.length<2){
        return nums.length;
    }    
 
    int count=1;
 
 
    for(int i=1, j=0; i<nums.length; j=i, i++){
        if(nums[j]<nums[i]){
            count++;
            while(i<nums.length-1 && nums[i]<=nums[i+1]){
                i++;
            }
        }else if(nums[j]>nums[i]){
            count++;
            while(i<nums.length-1 && nums[i]>=nums[i+1]){
                i++;
            }
        }
    }
 
    return count;   
    }
}