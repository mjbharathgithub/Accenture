
public class Main
{
    int count(arr,len,num,diff){
        int count=0;
        for(int i=0;i<len;i++){
            if(Math.abs(arr[i]-num)<=diff){
                count++;
            }
        }
        return count;
    }
    
    ind sumOfEvenOdd(int arr[]){
        
        int fLrg=Integer.MIN_VALUE,scLrg,fSml=Integer.MAX_VALUE,secSml;
        
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                if(arr[i]>fLrg){
                    scLrg=fLrg;
                    fLrg=arr[i];
                    
                    
                    
                    
                    
                }
                else if(arr[i]>scLrg){
                    scLrg=arr[i];
                        
                    }
                
             }
             else{
                 if(arr[i]<fSml){
                    secSml=fSml;
                    fSml=arr[i];
                    
                    
                    
                    
                    
                }
                else if(arr[i]<secSml){
                    secSml=arr[i];
                        
                    }
                 
             }
             
             return secSml+scLrg;
        }
        
    }
    
    // int diff(m,n){
    //     for(int i=1;i<=n;i++){
    //         if(i%m==0) sum1+=i;
    //         else sum2+=i;
    //     }
        
    //     return sum2-sum1;
    // }
	public static void main(String[] args) {
		System.out.println("Hello World");
		
	}
}
