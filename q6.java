class Solution {
    public double findMaxAverage(int[] nums, int k) {
       double maxavg=-10000;
       for(int i=0;i<=nums.length-k;i++){
        int sum=0;

        for( int j=i; j<i+k;j++){
            sum+=nums[j];
        } 
        double avg=(double)sum/k;
        if(avg>maxavg){
          maxavg=avg;
        }
       }
       return maxavg;
    }
}