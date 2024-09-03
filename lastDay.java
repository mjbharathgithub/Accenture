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

	/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    static double formulae(double h, double v,double vn) {
 double en = v/vn;
 double hn = h * (Math.pow(en,2));
 System.out.println(en+" "+hn);
 return hn;
}

     public static String fun(int n) {
         StringBuilder res = new StringBuilder();
         while (n > 0) {
         if ((n % 10) % 2 == 0) {
         res.insert(0, "Even");
         } else {
         res.insert(0, "Odd");
         }
         n /= 10;
         }
         return res.toString();
 }
 
    static int roundOff(int l, int b) {
         int res = (int)Math.round((3.14 * l * b));
         return res;
}

    static int SplFnb(int n) {
    if (n == 0 || n == 1) {
        return n;
    }

    int prev2 = 0;  // Equivalent to SplFnb(n-2)
    int prev1 = 1;  // Equivalent to SplFnb(n-1)
    int result = 0;

    for (int i = 2; i <= n; i++) {
        result = prev1 * prev1 + prev2 * prev2;
        prev2 = prev1;
        prev1 = result;
    }

    return result;
}

static int fibonacci(int n){
        if(n<1) return -1;
        if(n<3) return n-1;
        int fib=0,one=0,two=1;
        for(int i=2;i<n;i++){
            
            fib=one*one+two*two;
            System.out.print(fib+ " ");
            one=two;
            two=fib;
            
        }
        
        return fib;
        
    }
    public static int fun(String s) {
         char[] vowels = {'a', 'e', 'i', 'o', 'u'};
         int cnt = 0;
         int fact = 1;
         for (int i = 0; i < s.length(); i++) {
         char c = s.charAt(i);
         boolean isVowel = false;
         for (char vowel : vowels) {
         if (c == vowel) {
         isVowel = true;
         break;
         }
         }
         if (!isVowel && c != ' ') {
         cnt++;
         fact *= cnt;
         }
         }
         return fact;
 }
 
    static int FileHandling(String[] files) {
         try {
         int val = 0;
         for(String s : files) {
         val = Math.max(Integer.valueOf(s.replace("file_","")),val);
         }
         return val;
         }
         catch(Exception e) {
         return -1;
         }
        
    }
    
    //16 2 10    50 48 7 
    
    static int numOfChocalteBox(int chockies,int limit,int day){
        int bought=1,stock=chockies;
        for(int d=1;d<=day;d++){
            
            stock-=limit;
            if(stock<limit&&d%7==0) return -1;
            
            else if(stock<limit){
                stock+=chockies;
                bought++;
            }
            
            
        }
        return bought;
    }
// 	public static void main(String[] args) {
// // 		System.out.println(roundOff(45,56));
// // 		int a=(int)Math.sqrt(565);
//     // 	System.out.println(fibonacci(6));
//     // 		System.out.println(SplFnb(5));
    
// //         System.out.println(FileHandling(new String[]{"file_1", "file_20", 
// // "file_3", "file_10"}));
//         System.out.println(numOfChocalteBox(16,2,10));
        
		
// 	}
// }
}
