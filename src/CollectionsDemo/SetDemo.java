package CollectionsDemo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<Integer> hs=new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(2);
		System.out.println(hs);
	}

}
