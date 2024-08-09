
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    
	    String binary=sc.next();
	    
	    int ans=binary.charAt(0)-'0';
	    
	    for(int i=1;i<binary.length();i+=2){
	            switch((binary.charAt(i))){
	                case 'A' :
	                    ans&=(int)(binary.charAt(i+1)-'0');
	                    break;
	                    
	                case 'B' :
	                    ans|=(int)(binary.charAt(i+1)-'0');
	                    break;
	                    
	                case 'C' :
	                    ans^=(int)(binary.charAt(i+1)-'0');
	                    break;     
	                    
	            //1C0C1C1A0B1
	            
	        }
	        System.out.println("ans : "+ans+"option "+binary.charAt(i)+" "+binary.charAt(i+1));
	    }
	    System.out.println(ans);
	}
}
