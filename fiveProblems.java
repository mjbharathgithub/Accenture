
public class Main
{
    
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
