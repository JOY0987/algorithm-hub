import java.util.*;
import java.lang.*;

class Solution {
    public static boolean isPrime(int n) {
        for(int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public int solution(int[] nums) {
       
        // 완전 탐색?
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(isPrime(sum)) {
                        count++;
                    }
                }
            }
        }
        
        return count;
        
    }
}