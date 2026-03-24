class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=new int[nums.length];
        int st=0,half=n;
        int ctr=0;
        while(ctr!=nums.length){
            arr[ctr]=nums[st];
            arr[++ctr]=nums[half];
            ctr+=1;
            st++;
            half++;
        }
        return arr;
    }
}