class Solution {
    public int[] twoSum(int[] numbers, int target) {
      int n=numbers.length;
      for(int i=0;i<n;i++){
        int comp=target-numbers[i];
        int left=i+1;
        int right=n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(numbers[mid]==comp){
                return new int[]{i+1,mid+1};
            }
            else if(numbers[mid]<comp)
                left=mid+1;
            else
                right=mid-1;
        }
      }
      return new int[]{};
    }
}