class Solution {
    public int maxArea(int[] heights) {
        int left= 0;
        int right= heights.length-1;
        int max_area=0, current_area=0;
        while(left<right){
            System.out.println("left"+heights[left]);
            System.out.println("right"+heights[right]);
            System.out.println(Math.min(heights[left],heights[right]));
            current_area=(int)(Math.min(heights[left],heights[right])*(right-left));
            // System.out.println(current_area);
            max_area=Math.max(max_area,current_area);
            System.out.println(heights[right]>=heights[left]);
            if(heights[right] >= heights[left]){
                left++;
            }
            else if(heights[left] > heights[right]){
                right--;
            }

        }
        return max_area;
    }
}
