package MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Student{
	int roll_no;
	String nameString;
	
	Student(int roll_no, String nameString){
		this.roll_no = roll_no;
		this.nameString = nameString;
	}	
	@Override
	public String toString() {
		return roll_no + " -------> " + nameString;
	}	
}

public class MapMethodsDemo {
	
	public static void main(String[] args) {
				
		Student s1 = new Student(11, "Sumit");
		Student s2 = new Student(12, "Sunny");
		Student s3 = new Student(13, "Sojal");
		Student s4 = new Student(14, "Himanshu");
		
		HashMap<Integer, Student> Obj1 = new HashMap<Integer, Student>();
		Obj1.put(1, s1);
		Obj1.put(2, s2);
		Obj1.put(3, s3);
		Obj1.put(4, s4);
		
		for(int i = 1; i <= Obj1.size(); i++) {			
			Student string;
			string = Obj1.get(i);
			System.out.println(string);
		}
		
		System.out.println("All Map keys are Mationed: "+Obj1.keySet());
		System.out.println("All Map Values are Mationed: "+Obj1.values());
		
		Set<Map.Entry<Integer, Student>> entryEntries = Obj1.entrySet();
		
		Iterator<Map.Entry<Integer, Student>> entryIterator = entryEntries.iterator();
		
		while (entryIterator.hasNext()) {
			Map.Entry<Integer,Student> entry = entryIterator.next();
			Integer ikey = entry.getKey();
			Student strStudent = entry.getValue();
			System.out.println(ikey+" ----> "+strStudent);
		}		
		System.out.println("Checking is that Empty: "+Obj1.isEmpty());
	}	
}
