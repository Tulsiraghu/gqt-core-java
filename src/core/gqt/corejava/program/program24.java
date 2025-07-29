package core.gqt.corejava.program;
import java.util.HashMap;
import java.util.Map;
public class program24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3,3,4,2,4,4,2,4,4};
		Map<Integer, Integer>countMap = new HashMap<>();
		for(int value :array) {
			countMap.put(value,countMap.getOrDefault(value, 0)+1);
			
		}
		int majorityElement = 0;
		int majorityCount = 0;
		
		for (Map.Entry<Integer, Integer>entry:countMap.entrySet()) {
			if(entry.getValue()>majorityCount) {
				majorityElement = entry.getKey();
				majorityCount = entry.getValue();
			}
		}
		if(majorityCount>array.length/2) {
			System.out.println("Majority element in the array:"+majorityElement);
			
		}else {
			System.out.println("No majority element in the array:");
		}

	}

}
