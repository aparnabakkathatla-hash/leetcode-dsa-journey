class Solution {
     int distance(int[] p1,int[] p2){
         int x1=p2[0]-p1[0];
         int x2=p2[1]-p1[1];
         return x1*x1+x2*x2;
     }
    boolean isSquare(int points[][]) {
        // code here
        int arr[]=new int[6];
        int k=0;
      for(int i=0;i<points.length;i++){
          for(int j=i+1;j<points.length;j++){
              arr[k]=distance(points[i],points[j]);
              k++;
          }
      }
      Arrays.sort(arr);
      for(int i=1;i<4;i++){
          if(arr[i-1] != arr[i] ){
              return false;
          }
      }
      if(arr[4] != arr[5]){
          return false;
      }
      return true;
    }
};
