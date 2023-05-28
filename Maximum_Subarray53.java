class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0, max1 = Integer.MIN_VALUE;
        int i=0;
        while(i<nums.length){
            if(sum<0){
                sum=0;
            }
            sum+=nums[i];
            i++;
            max1 = Math.max(max1, sum);
        }
        return max1;
    }
}
