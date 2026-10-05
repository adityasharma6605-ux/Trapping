class Solution {
    public int trap(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxLeft=0;
        int maxRight=0;
        int answer=0;
        while(i<j){
            if(height[i]<=height[j]){
                maxLeft=Math.max(maxLeft,height[i]);
                if(height[i]<=maxLeft){
                    int trap=maxLeft-height[i];
                    answer+=trap;
                }
                i++;
                
            }
            else{
                maxRight=Math.max(maxRight,height[j]);
                if(height[j]<=maxRight){
                    int trap=maxRight-height[j];
                    answer+=trap;
                }
                j--;
            }
        }
        return answer;
        
    }
}
