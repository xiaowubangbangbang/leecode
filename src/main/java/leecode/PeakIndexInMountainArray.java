package leecode;

public class PeakIndexInMountainArray {



    public static void main(String[] args) {

    }

    public static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1, ans = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[mid + 1]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;

    }
}