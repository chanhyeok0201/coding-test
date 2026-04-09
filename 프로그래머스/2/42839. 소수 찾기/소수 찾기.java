import java.util.*;

class Solution {
    
    Set<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {
        
        boolean[] check = new boolean[numbers.length()];
        
        dfs("", numbers, check);
        
        int count = 0;
        for (int num : set) {
            if(isPrime(num)) {
                count++;
            }
        }
        return count;   
    }
    
    private void dfs(String current, String numbers, boolean[] check){
        if (!current.equals("")) {
        set.add(Integer.parseInt(current));
    }

        for (int i = 0; i < numbers.length(); i++) {
            if (check[i]) continue;

            check[i] = true;
            dfs(current + numbers.charAt(i), numbers, check);
            check[i] = false;
        }
    }
    
    private boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}