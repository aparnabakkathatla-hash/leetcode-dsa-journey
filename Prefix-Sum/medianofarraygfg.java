class Solution {
    public double findMedian(int[] arr) {
        // Code here.
        Arrays.sort(arr);
      double median=0;
        int n=arr.length;
        if(n%2==1){
            median=arr[n/2];
        }else{
            median=(arr[n/2]+arr[n/2-1])/2.0;
        }
        return median;
    }
}
