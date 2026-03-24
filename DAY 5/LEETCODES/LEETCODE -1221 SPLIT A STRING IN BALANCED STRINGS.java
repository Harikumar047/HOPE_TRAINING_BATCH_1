class Solution {
    public int balancedStringSplit(String s) {
        int bal_var=0,ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L'){
                bal_var+=1;
            }
            else{
                bal_var-=1;
            }
            if(bal_var==0){
                ans+=1;
            }
        }
        return ans;
    }
}