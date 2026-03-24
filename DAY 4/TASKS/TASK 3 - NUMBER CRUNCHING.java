//Number Crunching

class Solution {
    public int findNumbers(int[] nums) {
        int ctr=0;
        for(int i=0;i<nums.length;i++){
            int dig=0;
            while(nums[i]>0){
                dig++;
                nums[i]/=10;
            }
            if(dig%2==0) ctr++;
        }
        return ctr;
    }
}

//String

class Solution {
    public int findNumbers(int[] nums) {
      int ctr=0;
        for(int i=0;i<nums.length;i++){
            String s=String.valueOf(nums[i]);
            if(s.length()%2==0)  ctr++;
        }
        return ctr;
    }
}