class Solution {
    public int largestRectangleArea(int[] heights) {

        int n= heights.length;
        int max_area=0;

        Stack<Integer> stack= new Stack<>();

        for(int i=0; i<=n; i++){
            int current_height= (i==n)?0:heights[i];
            while(!stack.isEmpty() && current_height < heights[stack.peek()]){
                int height=heights[stack.pop()];
                int width=stack.isEmpty()?i:i-stack.peek()-1;
                max_area=Math.max(max_area, height*width);
            }
            stack.push(i);
        }

        return max_area;
        
    }
}
