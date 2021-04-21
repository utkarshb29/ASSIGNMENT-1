package lab6;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ex4 {
	public static void main(String[] args) {
		HashMap<String, Integer> student=new HashMap<String, Integer>();
		student.put("Capg1001", 95);
		student.put("Capg1002", 90);
		student.put("Capg1003", 85);
		student.put("Capg1004", 80);
		student.put("Capg1005", 75);
		student.put("Capg1006", 70);
		System.out.println(getStudents(student));
	}

	public static Map<String, String> getStudents(HashMap<String, Integer> m) {
		Map<String, String> eligible = new HashMap<String, String>();
        for (Entry<String, Integer> iterable_element : m.entrySet()) {
			if(iterable_element.getValue() >= 90) {
				eligible.put(iterable_element.getKey(), "Gold");
			}else if (iterable_element.getValue() >= 80 && iterable_element.getValue() < 90) {
				eligible.put(iterable_element.getKey(), "Silver");
			} else if (iterable_element.getValue() >= 70 && iterable_element.getValue() < 80) {
				eligible.put(iterable_element.getKey(), "Bronze");
			}
		}
		
		return eligible;
	}

}
