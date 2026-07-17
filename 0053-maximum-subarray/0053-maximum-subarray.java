class Solution {
    public int maxSubArray(int[] num) {
        int sum=0;
        int max=Integer.MIN_VALUE;
       for(int i=0;i<num.length;i++){
        int temp=sum+num[i];
        if(temp<num[i]){
       sum =num[i];
        }
        else{
            sum=temp;
        }
    if(max<sum){
    max=sum;
    }
       }
        return max;
    }
}