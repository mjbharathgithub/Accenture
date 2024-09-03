
import java.util.*;
public class Main
{
    static void sortBasedOnCharacterFrequency(char[] arr){
        
        Map<Character,Integer> map = new HashMap<>();
        
        for(char ch: arr) map.put(ch,map.getOrDefault(ch,0)+1);
        Character chArray[]=new Character[arr.length];
        
        for(int i=0;i<arr.length;i++)chArray[i]=arr[i];
        
        Arrays.sort(chArray,(a,b)->{
            if(map.get(a)==map.get(b)) return a-b;
            
            return map.get(b)-map.get(a);
        });
        
        
        for(int i=0;i<arr.length;i++) arr[i]=chArray[i];
        
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		long current=System.currentTimeMillis();
		System.out.println(current);
		
		char arr[]= {'a','b','c','d','a','b','d','e','d','e','d'};
		for(char ele: arr) System.out.print(ele+" ");
		System.out.println();
		sortBasedOnCharacterFrequency(arr);
		for(char ele: arr) System.out.print(ele+" ");
	}
}
