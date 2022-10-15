class Solution {
    public boolean search(int[] arr, int target) {
        int left=0;
        int right=arr.length-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(arr[mid]==target)
            {
                return true;
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
            else if(arr[mid]<arr[right])//right sorted
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
            else
            {
                while(left<=right && arr[mid]==arr[right])
                {
                    right--;
                }
                mid=left+(right-left)/2;
            }
        }
        return false;
    }
}