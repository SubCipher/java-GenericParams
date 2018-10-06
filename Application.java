import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Application {

	public static void main(String[] args){

		Container<Integer, String> container = new Container<>(12, "hello");

		int val1 = container.getItem1();
		String val2 = container.getItem2();


		System.out.println("val1:" + val1 + " val2: " + val2);
		
		Set<String> mySet1 = new HashSet<String>();
		mySet1.add("first");
		mySet1.add("second");
		mySet1.add("whatever");

		Set<String> mySet2 = new HashSet<String>();
		mySet2.add("first");
		mySet2.add("second");
		mySet2.add("computer");

		Set<String> resultSet = union(mySet1,mySet2);

		Iterator<String> itr = resultSet.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}


	public static <E> Set<E> union(Set<E> set1, Set<E> set2){

		Set<E> result = new HashSet<>(set1);
		result.addAll(set2);
		return result;
	}

}
