class Solution {
    public int search(int[] arr, int target) {
        int left=0;
        int right=arr.length-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]>arr[right]) //left sorted
            {
                if(arr[left]<=target && target<arr[mid]) //Check within boundaries of the Sorted Side
                {
                    right=mid-1;
                }
                else
                {
                    left=mid+1;
                }
            }
            else //right sorted
            {
                if(arr[mid]<target && target<=arr[right])  //Check within boundaries of the Sorted Side
                {
                    left=mid+1;
                }
                else
                {
                    right=mid-1;
                }
            }
        }
        return -1;
    }
}