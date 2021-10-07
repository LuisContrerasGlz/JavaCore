package CollectionsDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Discovery");
		hm.put(2, "Net Jio");
		hm.put(3, "ESPN");
		hm.put(4, "Star Action");
		hm.put(4, "Discover Kits");
		System.out.println(hm);
		
//		for(Map.Entry m:hm.entrySet())
//		{
//			System.out.println(m.getKey()+" "+m.getValue());
//		}
		Iterator trav=hm.entrySet().iterator();
		while(trav.hasNext())
		{
			System.out.println(trav.next());
		}
		

	}

}
