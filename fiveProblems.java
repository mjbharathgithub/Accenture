
public class Main
{
	String increasing_decreasing(String s1,String s2){
        int len1=s1.length(),len2=s2.length();
        
        boolean isDecreasing=false,isIncreasing=false;
        int count=0;
        for(int j=0,i=0;i<len1;i++,j++){
            if(i<len1&&i<len2&&s1.charAt(i)!=s2.charAt(i)) count++;
            if(j<s1.length()-1&&s1.charAt(j)>s1.charAt(j+1)) isDecreasing=true;
            if(j<s1.length()-1&&s1.charAt(j)<s1.charAt(j+1)) isIncreasing=true;
            

            
        }
        if(isDecreasing&&isIncreasing) return "The alphabets in input1 are not in either increasing or decreasing order";
        
        return isDecreasing?("Decreasing:"+count):("Increasing:"+count);
        
    }
    
    static int findKey(int input1,int input2,int input3){
        int largest=0;
        while(input3>0){
            largest=Math.max(largest,input3%10);
            input3/=10;
        }
        return (input1%10000/1000)*(input2%1000/100)-largest;
    }
	 static String replace(String str,char ch1,char ch2){
        char ch[]=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(ch[i]==ch1) ch[i]=ch2;
            
            else if(ch[i]==ch2) ch[i]=ch1;
        }
        
        return new String(ch);
    }
    
    static int maxExp(int start,int end){
        int max=0;
        for(int i=start;i<=end;i++){
            
            if(i>0&&(i&(i-1))==0&&i>max){
                max=i;
            }
            
        }
        
        return max;
    }
    
    static int smallestSum(int arr[],int sum){
        int fsmall=Integer.MAX_VALUE,secSmall=Integer.MAX_VALUE;  
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<fsmall){
                secSmall=fsmall;
                fsmall=arr[i];
            }else if(arr[i]<secSmall){
                secSmall=arr[i];
            }
        }
        
        System.out.println(fsmall+" "+secSmall);
        return (fsmall+secSmall)<=sum?fsmall*secSmall:-1;
        
    }
    
    static String nbase(int num,int n){
        String str="";  int rem;
        
        while(num>0){
            rem=num%n;
            if(rem>=0&&rem<=9){
                str=((char)(rem+48))+str;
            }
            else if(rem>9&&rem<36){
                rem-=10;
                str=((char)(rem+65))+str;
            }
            System.out.println(num+" "+str);
            
            num/=n;
            
        }
        return str;
    }
    
    static String moveHyphens(String input){
        String output="";
        
        for(char ele : input.toCharArray()){
            if(ele=='-'){
                output=ele+output;
            }else{
                output+=ele;
            }
        }
        return output;
    }
    
    static int countCarry(int n1,int n2){
        int sum,carry=0,count=0;
        
        while(n1>0&&n2>0){
            sum=(n1%10+n2%10)+carry;
            carry=(sum>9)?sum%9:0;
            if(carry>0) {
                System.out.println(sum+" "+carry+" "+count);
                
                count++;}
            n1/=10;
            n2/=10;
        }
        return count;
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int arr[]={5,2,4,3,9,7,1};
// 		System.out.println(smallestSum(arr,9));
        // System.out.println(nbase(5678,21));
        // System.out.println(moveHyphens("--Move-Hyphens-to-Front---- sdfgsdfgdfgdfg"));
        System.out.println(countCarry(23,563));
	}
}
