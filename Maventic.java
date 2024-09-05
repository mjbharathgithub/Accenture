
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
	static void sortByMiddleElement(int arr[]){
        List<Integer> list = new ArrayList<>();
        
        for(int ele : arr) list.add(ele);
        
        list.sort((e1,e2)->{
            if(((e1+"").charAt((e1+"").length()/2)-(e2+"").charAt((e2+"").length()/2))==0) return e1-e2;
            return ((e1+"").charAt((e1+"").length()/2)-(e2+"").charAt((e2+"").length()/2));
        });
        
        for(int i=0;i<arr.length;i++) arr[i]=list.get(i);
        
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
