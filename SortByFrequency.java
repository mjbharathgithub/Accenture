/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    
    static int[] sortByFrequency(int arr[]){
        
        
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int ele: arr) map.put(ele,map.getOrDefault(ele,0)+1);
        
        System.out.println(map);
        
        List<Integer> list = new ArrayList<>(Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new)));
        
        // for(int ele: arr) list.add(ele);
        // System.out.println(list);
        
        
        list.sort((a, b) -> {
            int freqCompare = map.get(b)-map.get(a);
            if (freqCompare == 0) {
                return b-a; // Sort by value if frequencies are the same
            }
            return freqCompare;
        });
        
        System.out.println(list);
        
        for(int i=0;i<list.size();i++) arr[i]=list.get(i); 
        return arr;
        
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		System.out.println(Arrays.asList(Arrays.stream(sortByFrequency(new int[]{1,2,3,4,5,1,2,6})).boxed().toArray(Integer[] ::new)));
	}
}
