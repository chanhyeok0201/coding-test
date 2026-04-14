class Solution {
    public int solution(String begin, String target, String[] words) {
        boolean exists = false;
        for (String word : words) {
            if (word.equals(target)) {
                exists = true;
                break;
            }
        }

        if (!exists) {
            return 0;
        }

        boolean[] visited = new boolean[words.length];
        return dfs(begin, target, words, visited, 0);
    }

    private int dfs(String current, String target, String[] words, boolean[] visited, int count) {
        if (current.equals(target)) {
            return count;
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < words.length; i++) {
            if (!visited[i] && canChange(current, words[i])) {
                visited[i] = true;
                int result = dfs(words[i], target, words, visited, count + 1);
                if (result != 0) {
                    min = Math.min(min, result);
                }
                visited[i] = false;
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }

    private boolean canChange(String a, String b) {
        int diff = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                diff++;
            }
        }

        return diff == 1;
    }
}