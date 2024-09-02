/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    static int calculateDivident(int D , int R, int Q){
        
        return D*Q+R;
    }
    
    static int specialFactorial(String s){
        int vowel=0;
        
        for(char ch :s.toCharArray()){
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') vowel++;
        }
        
        int fact=s.length()-vowel;
        
        for(int i=fact-1;i>=1;i--){
            fact*=i;
        }
        
        return fact;
    }
    
    static int oddIndexSumEven(int arr[]){
        int sum=arr[1],xor=arr[0];
        for(int i=2;i<arr.length;i++){
            if(i%2!=0){
                sum+=arr[i];
            }
            else xor^=arr[i];
        }
        System.out.println(sum+" "+xor);
        
        return Math.abs(sum-xor);
    }
    
    static String maxSubstring(String s){
        String countString="",max="";
        for(char ch: s.toCharArray()){
            if(ch=='.'){
                max=(max.length()<countString.length())?countString:max;
                countString="";
                continue;
            }
           
            countString+=ch;
        }
        return max;
    }
    
    static int fibonacci(int n){
        if(n<1) return -1;
        if(n<3) return n-1;
        int fib=0,one=0,two=1;
        for(int i=2;i<n;i++){
            
            fib=one+two;
            System.out.print(fib+ " ");
            one=two*two;
            two=fib*fib;
            
        }
        
        return fib;
        
        
       
        
    }
    
    static int gcdOfTwoNum(int a,int b){
        int temp;
        
        while(b!=0){
            temp=b;
            b=a%b;
            a=temp;
            
        }
        return a;
    }
    
    static int lcmOfTwoNum(int x,int y){
        int temp,a=x,b=y;
        
        while(a!=0){
            temp=a;
            a=b%a;
            b=temp;
        }
        return (x*y)/b;
    }
	public static void main(String[] args) {
// 		System.out.println(oddIndexSumEven(new int []{1,2,3,4,5,6}));
//	    System.out.println(calculateDivident(78,4,6));
 //       System.out.println(specialFactorial("bharath"));
        System.out.println(lcmOfTwoNum(12,9));
        
	}
}
