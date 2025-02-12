public class Solution{
    public int maxArea(int[] height) {
        int left = 0;  // Start pointer
        int right = height.length - 1;  // End pointer
        int maxArea = 0;  // To store the maximum area
        
        while (left < right) {
            // Calculate the area between the two lines
            int minHeight = Math.min(height[left], height[right]);
            int width = right - left;
            int currentArea = minHeight * width;
            
            
            maxArea = Math.max(maxArea, currentArea);
            
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxArea;
    }
}