
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    
	    String password=sc.next();
	    int len=password.length();
	    if((password.charAt(0)>='0'&&password.charAt(0)<='9')||len<4){
	        System.out.println(false);
	        return;
	    }
	    boolean cap=false,dig=false;
	    
	    for(char ch : password.toCharArray()){
	        if(ch>='A'&&ch<='Z'){
	            cap=true;
	        }
	        else if(ch==' '||ch=='/'){
	            System.out.println(false);
	            return;
	        }else if(ch>='0'&&ch<='9'){
	            dig=true;
	        }
	    }
	    //a987 abC012
	    System.out.println(cap&&dig);
	}
}
