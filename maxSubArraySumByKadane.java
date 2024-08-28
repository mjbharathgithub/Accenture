 static int maxSubArraySumByKadane(int []arr){
        if(arr==null || arr.length==0) return 0;
        int currentSum=arr[0], maxSum=arr[0];
        for(int i=1;i<arr.length;i++){
            currentSum+=arr[i];
            if(currentSum<arr[i]) currentSum=arr[i];
            
            if(maxSum<currentSum) maxSum= currentSum;
        }
        
        return maxSum;
    }
