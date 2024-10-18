static int equillibiriunIndex(int arr[],int n){
        int sum=0,leftSum=0;
        
        for(int ele:arr) sum+=ele;
        
        for(int i=0;i<n-1;i++){
            leftSum+=arr[i];
            
            if(sum-leftSum-arr[i+1]==leftSum){
                return i+2;
            }
        }
        
        return -1;
    }
