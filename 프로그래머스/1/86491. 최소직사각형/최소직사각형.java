class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
        int hight = 0;
        
        for (int[]card : sizes){
            int maxWidth = Math.max(card[0], card[1]);
            int minWidth = Math.min(card[0], card[1]);
            
            width = Math.max(width, maxWidth);
            hight = Math.max(hight, minWidth);
        }
        
        return width * hight;
    }
}