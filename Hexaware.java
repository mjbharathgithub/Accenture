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
