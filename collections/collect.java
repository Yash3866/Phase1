package collections;


import java.util.ArrayList;

public class collect {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Prem");
		list.add("niyati");
		list.add("akansha");
		list.add("ashwin");
		list.add("Chetan");
		
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		
		System.out.println(list.contains("niyati"));
		
		System.out.println("element from index 3: "+list.get(3));
		
		System.out.println("Size: "+list.size());
		
		list.add("test");
		System.out.println("Size: "+list.size());
		
		
		for(String s:list)
		{
			System.out.println(s);
		}
		
	}
}
