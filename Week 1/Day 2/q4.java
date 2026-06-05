class Solution {
    public int maxSubArray(int[] num) {
        int max = num[0];
        int currSum = num[0];

        for (int i = 1; i < num.length; i++) {
            if (currSum < 0) {
                currSum = num[i];
            } else {
                currSum = currSum + num[i];
            }

            if (currSum > max) {
                max = currSum;
            }
        }

        return max;
    }