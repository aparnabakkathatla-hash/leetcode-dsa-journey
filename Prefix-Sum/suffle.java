int i=0;
        int j=n;
        int k=0;
        int ans[]=new int[2*n];
        while(i<n && j<2*n){
            ans[k]=nums[i];
            k++;
            ans[k]=nums[j];
            k++;

            i++;
            j++;
        }
        return ans;
