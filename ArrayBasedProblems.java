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

static void rotateRightArrayKTimes(int arr[],int k){
        int len=arr.length,last;
        System.out.println("Before : "+Arrays.toString(arr));
        for(int i=1;i<=k;i++){
            last=arr[len-1];
            for(int j=len-1;j>=1;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=last;
        }
        
        System.out.println("After : "+Arrays.toString(arr));
        
    }


