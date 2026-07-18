class Solution {
    public int trap(int[] height) {
        int totWater=0;
        int start=0;
        int end=height.length-1;
        int lMax=0;
        int rMax=0;

        while(start<end) {
            lMax=Math.max(lMax,height[start]);
            rMax=Math.max(rMax,height[end]);

            if(lMax<rMax) {
                totWater+=lMax-height[start];
                start++;
            }else {
                totWater+=rMax-height[end];
                end--;
            }
        }
        return totWater;
    }
}