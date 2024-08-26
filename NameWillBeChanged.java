
import java.util.*;
public class Main
{
//     N = 3, Devil Energy = 10
// E = [5, 7, 8]
// J = [10, 11]

    
    
    static int hoursReq(int []E,int []J, int dEnergy){
        
        int myEnergy=0, i=0,len=E.length,hour=0;
        while(myEnergy<dEnergy){
            hour++;
            myEnergy+=E[i];
            if(myEnergy>=dEnergy) return hour;
            if(i<len-1&&myEnergy>=J[i]){
                myEnergy-=J[i++];
                
            }
            
           
            
        }
        
        return hour==0?1:hour;
    }
//     Input : arr[] = {7, 3, 2, 4, 9, 12, 56} , m = 3 
// Output: Minimum Difference is 2 

// Input : arr[] = {3, 4, 1, 9, 56, 7, 9, 12} , m = 5 
// Output: Minimum Difference is 6 
    static int minDiff(int[] arr,int m){
        int diff=Integer.MAX_VALUE, len=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<=len-m;i++){
            diff=Math.min(arr[i+m-1]-arr[i],diff);
        }
        
        return diff;
    }
    
    static int countChocalates(int chocalates){
        return chocalates-((chocalates/2)+1);
    }
//     Input : arr[] = {1, 5, 7, -1, 5}, sum = 6
// Output : (1, 5), (7, -1)

// Input : arr[] = {2, 5, 17, -1} sum = 7
// Output : (2, 5)

    static void printSum(int arr[],int target){
        
        Map<Integer,Integer> map = new HashMap<>();
        
        int len = arr.length;
        for(int i=0;i<len;i++){
            //int ele=map.getOrDefault(target-arr[i],0);
            if(map.getOrDefault(target-arr[i],0)==1){
                System.out.println((target-arr[i])+" "+arr[i]);
                map.put(target-arr[i],2);
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
    }
    
    
    
	public static void main(String[] args) {
		//System.out.println(hoursReq(new int[]{5,7,8},new int[]{10,11},5));
	//	System.out.println(minDiff(new int[]{12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50}  ,7));
	//	System.out.println(countChocalates(2));
	printSum(new int[]{1,4,2,1,5,3},5);
		
	}
}
