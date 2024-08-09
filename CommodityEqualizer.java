import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int unit=sc.nextInt();
	    int r=sc.nextInt();
	    int n=sc.nextInt();
	    
	    int []house=new int[n];
	    for(int j=0;j<n;j++) house[j]=sc.nextInt();
	    
	    int cons=unit*r, i=0;
	    
	    while(cons>0 &&i<n){
	        cons-=house[i];
	        i++;
	    }
	    
	    System.out.println(i);
		
	}
}
