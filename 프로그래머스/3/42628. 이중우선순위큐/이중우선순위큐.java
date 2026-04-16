import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (String operation : operations) {
            String[] parts = operation.split(" ");
            String command = parts[0];
            int number = Integer.parseInt(parts[1]);

            // 삽입
            if (command.equals("I")) {
                map.put(number, map.getOrDefault(number, 0) + 1);
            }
            // 삭제
            else {
                // 비어있으면 삭제 무시
                if (map.isEmpty()) {
                    continue;
                }

                // 최댓값 삭제
                if (number == 1) {
                    int maxKey = map.lastKey();
                    if (map.get(maxKey) == 1) {
                        map.remove(maxKey);
                    } else {
                        map.put(maxKey, map.get(maxKey) - 1);
                    }
                }
                // 최솟값 삭제
                else if (number == -1) {
                    int minKey = map.firstKey();
                    if (map.get(minKey) == 1) {
                        map.remove(minKey);
                    } else {
                        map.put(minKey, map.get(minKey) - 1);
                    }
                }
            }
        }

        // 큐가 비어있으면 [0, 0]
        if (map.isEmpty()) {
            return new int[]{0, 0};
        }

        // [최댓값, 최솟값]
        return new int[]{map.lastKey(), map.firstKey()};
    }
}