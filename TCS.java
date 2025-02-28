public class Main
{
    
    static int findTotalHorses(int k,int n,int horses[]){
        int left=0,right=0,maxNum=0,price=0;
        
        for(right=0;right<n;right++){
            price+=horses[right];
            
            if(price>99){
                maxNum=maxNum<(right-left)?(right-left):maxNum;
                price-=horses[left];
                left++;
                
            }
            
            
        }
        
        return left==0?n:maxNum;
        
        
    }
    
    static void printEntryAndExit(int k,int n,int[] rooms){
        
        int enter=0,exit=0,coins=0;
        for(exit=0;exit<n;exit++){
            coins+=rooms[exit];
            if(coins>k){
                coins-=rooms[enter];
                enter++;
            }
            else if(coins==k){
                System.out.println((enter+1)+" "+(exit+1));
                return;
            }
        }
        System.out.println((enter+1)+" "+exit);
    }

  static int notUnderstood(int n , int d[]){
        int result=0;
        for(int i=1;i<n;i++){
            if(d[0]!=d[i]) result++;
        }
//         5
// 1 2 3 2 2
        return result;
    }

  
	public static void main(String[] args) {
	//	System.out.println(findTotalHorses(100,10,new int[]{1,2,3,4,5,6,7,8,9,10})); //30,40,50,20,20,10,90,10,10,10
		printEntryAndExit(15,10,new int[] {5 ,3 ,7, 14, 18, 1, 18, 4, 8, 3});
	}
}
