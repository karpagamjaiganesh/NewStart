package Demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_demo {
	
	public static class hash{
		int id;
		String name;
	   String college;
		
      public hash(int id, String name, String college) {
			super();
			this.id = id;
			this.name = name;
			this.college =college;
			
		}

		public String getCollege() {
		return this.college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

		public int getId() {
			return this.id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	public static void main(String[] args) {
		// Normal Hashmap

		HashMap<Integer, String> map = new HashMap();
		hash stu1 = new hash(101,"Ramu","CBM");
		/*hash stu2 = new hash(102,"Sai");
		hash stu3 = new hash(103,"Sanjay");
		hash stu4 = new hash(104,"Jai");*/
		HashMap<hash, String> student = new HashMap();
		
		/*student.put(stu2,stu2.getName());
		student.put(stu3,stu3.getName());*/
	    student.put(stu1,stu1.college);
		student.put(stu1,stu1.getName());
		System.out.println(student.get(stu1));
	
		
		map.put(1, "Anitha");
		map.put(2, "geeta");
		map.put(3, "Rani");
		System.out.println(map.get(3));

		
		Set<Entry<Integer, String>> ent = map.entrySet();
		for (Entry<Integer, String> entry : ent) {

			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
         }
		Set set1 = map.keySet();
		Collection<String> set2=map.values();
		for (String string : set2) {
			System.out.println("stringvlaues         "+string);
		}
		Iterator itr = set1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			}
		

	}

}
