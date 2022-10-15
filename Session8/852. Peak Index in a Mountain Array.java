class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int lo = 0, hi = A.length;
        int n=A.length;
        while (lo <= hi) {
            int mi = lo + (hi - lo) / 2;
            if ((mi+1>n || A[mi]>A[mi+1]) && (mi-1<0 || A[mi]>A[mi-1]) )
            {
                return mi;
            }
            else if (A[mi] < A[mi + 1])
                lo = mi + 1;
            else
                hi = mi;
        }
        return lo;
    }
}