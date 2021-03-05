public class MaxArea {
    public static void main(String[] args) {

    }

    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int ans = 0;
        while (l < r) {
            //比较左右两个边界值并且计算出容器的面积 长:r-l 宽: Math.min(height[r], height[l])
            int area = Math.min(height[r], height[l]) * (r - l);
            ans = Math.max(area, ans);
            if (height[l] < height[r]) l++;//移动左边界,继续计算面积
            else r--;  //移动右边界
        }
        return ans;
    }
}
