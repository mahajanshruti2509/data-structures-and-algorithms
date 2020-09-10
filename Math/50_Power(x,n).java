/***********************************************
Time Complexity : O(log n)
Space Complexity : O(log n)
https://leetcode.com/problems/powx-n/
https://www.youtube.com/watch?v=snOaKR2xgZg
***********************************************/

class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return fastPow(x, N);  
    }
    
    private double fastPow(double x, long n) {
        if (n == 0) {
            return 1.0;
        }
        double half = fastPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}