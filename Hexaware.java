import java.util.*;
public class Main
{
    
    static void stringGame(String s){
        String max="";
        for(String ele:s.split(" ")){
            int len=ele.length();
            if(len%2!=0 && len>max.length()){
                max=ele;
            }
        }
        
        System.out.println(max.length()!=0?max:"Better luck next time");
        
    }
    
    //10 2 8 1 9 11 
    
    static int bestTime(int arr[]){
        int buy=arr[0],maxProfit=0;
        for(int i=1;i<arr.length;i++){
            if(buy>arr[i]){
                buy=arr[i];
            }else{
                maxProfit=Math.max(maxProfit,arr[i]-buy);
            }
        }
        
        return maxProfit;
     }
    // s = ” |**|*| ”  
    // start Index = [ 1, 1 ]
    // end Index = [ 5, 6 ]
    
    static List<Integer> countFrogs(int start[],int end[],String str){
        List<Integer> list = new ArrayList<>();
        int count;
        for(int i=0;i<start.length;i++){
            count=0;
            for(int j=start[i];j<end[i]-1;j++){
                if(str.charAt(j)=='*') count++;
            }
            list.add(count);
        }
        
        return list;
    }
    
    static List<Integer> getMaxBlood(String n){
        
        List<Integer> list = new ArrayList<>();
        int accSum=0;
        for(char ele:n.toCharArray()){
            list.add(ele-'0');
        }
        
        Collections.sort(list);
        for(int ele : list) accSum+=ele;
        
        List<Integer> answer = new ArrayList<>();
        int sumA=0;
        for(int i=list.size()-1;i>=0;i--){
            sumA=sumA+list.get(i);
            accSum-=list.get(i);
            answer.add(list.get(i));
            if(sumA>accSum) break;
            
            
        }
        
        return answer;
     }
//     nput string: PPPPPP@PPP@PP$PP
// Output: 7
// Explanation: 4 groups can be formed
// PPPPPP@
// PPP@
// PP$
// PP

    static int devilKill(String str){
        boolean dflag=false;
        int MaxCount=0,count=0;
        for(int i=str.length()-1;i>=0;i--){
            if((str.charAt(i)=='$'||str.charAt(i)=='@')&&dflag==false){
                dflag=true;
                
            }
            else if((str.charAt(i)=='$'||str.charAt(i)=='@')) {
                MaxCount=Math.max(MaxCount,count);
                count=0;
                System.out.println(MaxCount+" "+str.charAt(i));
                
            }
            
            if(dflag) count++;
            
        }
        MaxCount=Math.max(MaxCount,count);
        return MaxCount;
    }
    
	public static void main(String[] args) {
	//	System.out.println("Hello World");
		stringGame("Hello Good morning Welcome you");
		System.out.println();
		stringGame("Go to hell");
		
		System.out.println(bestTime(new int[]{ 1, 9, 2, 11, 1, 9, 2}));
		System.out.println(countFrogs(new int[]{1},new int[]{3}, "*|*|"));
		System.out.println(getMaxBlood("0912329"));
		System.out.println(devilKill("PPPPPP@PPP@PP$PP"));
	}

	static String returnLargestId(String id)
	{
	        int max=Integer.MIN_VALUE,ind=0,i=0;
	        
	        for(char ele:id.toCharArray()){
	            if(max<ele){
	                max=ele;
	                ind=i;
	            }
	            
	            i++;
	        }
	        
	        return id.substring(ind);
    	}
	
	static int smallestMostFrequentOddNumber(int arr[])
	{
	        int small=Integer.MAX_VALUE,freq=Integer.MIN_VALUE;
	        TreeMap<Integer,Integer> map= new TreeMap<>();
	        
	        for(int ele: arr) map.put(ele,map.getOrDefault(ele,0)+1);
	        System.out.println(map);
	        
	        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
	           if(entry.getKey()%2!=0 && entry.getValue()>freq){
	               small=entry.getKey();
	               freq=entry.getValue();
	           }
	            
	        }
	        return small==Integer.MAX_VALUE?0:small;
        
    }

	static int nCuccoo(int n,int memo[]){
	      
	       if(n==1){
	           return 0;
	           
	       }
	       else if(n==2) return 1;
	       
	       else if(memo[n]!=0){
	           return memo[n];
	       }else{
	           
	           memo[n]=1*nCuccoo(n-1,memo)+2*nCuccoo(n-2,memo)+3*1;
	           
	           return memo[n];
	           
	       }
	       
	   }

	/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    
    static int[] countFrogs(String str,int start[],int end[]){
        int frogs,st,ed;
        int sol[]=new int[start.length];
        String temp;
        for(int i=0;i<start.length;i++){
            frogs=0;
            temp=str.substring(start[i]-1,end[i]);
            st=temp.indexOf('|');
            ed=temp.lastIndexOf('|');
            for(int j=st;j<=ed;j++){
                if(temp.charAt(j)=='*'){
                    frogs++;
                }
            }
            
            sol[i]=frogs;
            
        }
        return sol;
    }
    
    static int maxBlood(String str){
        int sum=0,max=0;
        char nums[]=str.toCharArray();
        Arrays.sort(nums);
        for(char ele:nums){
            sum+=(ele-'0');
        }
        for(int i=nums.length-1;i>=0;i--){
            max+=(nums[i]-'0');
            sum-=(nums[i]-'0');
            if(max>sum){
                return max;
            }
        }
        
        return 0;
    }
    //@
    static int devilGroup(String str){
        int group=0;
        boolean firstPerson=true;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='P'){
                firstPerson=true;
            
            }
            else if(firstPerson){
                group++;
                firstPerson=false;
            }
        }
        return group;
    }
    // Sample Input: cdadcda
    // Sample Output: c
    static char minFreqChar(String word){
        int minFreq=Integer.MAX_VALUE;
        char minChar=' ';
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(char ele:word.toCharArray()) map.put(ele,map.getOrDefault(ele,0)+1);
        
        for(Character key:map.keySet()){
            if(map.get(key)<minFreq){
                minChar=key;
                minFreq=map.get(key);
            }
            
        }
        System.out.println(map);
        return minChar;
    }
    // SAMPLE CASE 0:
    //  0  → i = 0
    //  5  → j = 5
    // -1  → k = -1
    // SAMPLE OUTPUT 0:  24
    // EXPLANATION 0:  0 + 1 + 2 + 3 + 4 + 5 + 4 + 3 + 2 + 1 + 0 – 1 = 24
    
    static int sequenceFinder(int i,int j,int k ){
        int acc=0;
        for(int start=i;start<=j;start++){
            acc+=start;
            System.out.print(start+" ");
        }
        for(int start=j-1;start>=k;start--){
            acc+=start;
            System.out.print(start+" ");
        }
        return acc;
    }
	public static void main(String[] args) {
		System.out.println(sequenceFinder(0,5,-1));
	}
}
