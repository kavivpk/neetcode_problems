class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][]=new int[n][n];

        int l=0;
        int r=arr[0].length-1;
        int t=0;
        int b=arr.length-1;
        int num=1;
        while(l<=r && t<=b){
            for(int i=l;i<=r;i++){
                arr[t][i]=num++;
            }
            t++;
            for(int j=t;j<=b;j++){
                arr[j][r]=num++;
            }
            r--;
            if(t<=b){
            for(int i=r;i>=l;i--){
                arr[b][i]=num++;
            }
            b--;
            }
            if(l<=r){
                for(int j=b;j>=t;j--){
                    arr[j][l]=num++;
                }
                l++;
            }
        }
        return arr;
    }
}