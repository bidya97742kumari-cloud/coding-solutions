class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] A = nums1, B = nums2;
        if (A.length > B.length) {
            int[] tmp = A; A = B; B = tmp;   // binary search on the shorter array
        }
        int m = A.length, n = B.length;
        int half = (m + n + 1) / 2;

        int lo = 0, hi = m;
        while (lo <= hi) {
            int i = (lo + hi) / 2;   // elements taken from A
            int j = half - i;        // elements taken from B

            int aLeft  = (i > 0) ? A[i - 1] : Integer.MIN_VALUE;
            int aRight = (i < m) ? A[i]     : Integer.MAX_VALUE;
            int bLeft  = (j > 0) ? B[j - 1] : Integer.MIN_VALUE;
            int bRight = (j < n) ? B[j]     : Integer.MAX_VALUE;

            if (aLeft <= bRight && bLeft <= aRight) {
                if ((m + n) % 2 == 1) {
                    return Math.max(aLeft, bLeft);
                }
                return (Math.max(aLeft, bLeft) + (double) Math.min(aRight, bRight)) / 2.0;
            } else if (aLeft > bRight) {
                hi = i - 1;
            } else {
                lo = i + 1;
            }
        }
        throw new IllegalArgumentException("Input arrays are not sorted");
    }
}