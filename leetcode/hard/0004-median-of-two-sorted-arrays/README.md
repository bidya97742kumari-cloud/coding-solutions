# Median of Two Sorted Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given two sorted arrays `nums1` and `nums2` of size `m` and `n` respectively, return  **the median**  of the two sorted arrays.

The overall run time complexity should be `O(log (m+n))`.

 

Original
Java
 **Example 1:** 

```
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

```

 **Example 2:** 

```
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

```

 

 **Constraints:** 

- nums1.length == m
- nums2.length == n
- 0 <= m <= 1000
- 0 <= n <= 1000
- 1 <= m + n <= 2000
- -106 <= nums1[i], nums2[i] <= 106

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 57.56%)  
**Memory:** 48.2 MB (beats 92.98%)  
**Submitted:** 2026-11-15T16:47:02.033Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/median-of-two-sorted-arrays/)