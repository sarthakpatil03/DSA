class Solution {

    public static int findMax(int arr[]) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        return max;
    }

    public static long findTotHours(int arr[], int k) {
        long ans = 0;

        for (int i = 0; i < arr.length; i++) {
            ans += (arr[i] + (long)k - 1) / k;
        }

        return ans;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int st = 1;
        int end = findMax(piles);

        while (st <= end) {

            int mid = st + (end - st) / 2;

            long totHour = findTotHours(piles, mid);

            if (totHour <= h) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        return st;
    }
}