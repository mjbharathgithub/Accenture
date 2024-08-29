
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Map <String,Integer> map = new LinkedHashMap<>();
		

		map.put("bharath",1);
		map.put("wayne",3);
		map.put("Tony",6);
		map.put("Steve",9);
		System.out.println(map);
		map.forEach((key,value)->System.out.println(key+" "+value));
		
		List<Map.Entry<String,Integer>> freq= new ArrayList<>(map.entrySet());
		System.out.println("list : "+freq);
		System.out.println(freq.get(0).getValue());
		
		freq.sort(Map.Entry.comparingByValue());
		
		for(Map.Entry<String,Integer> entry: freq){
		    map.put(entry.getKey(),entry.getValue());
		}
	 	map.forEach((key,value)->System.out.println(key+" "+value));
	}
}
