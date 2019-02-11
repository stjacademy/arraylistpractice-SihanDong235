import java.util.ArrayList;

public class AAL {
	public static void main(String[] args) {
		
		/*ArrayList <Integer> list = new ArrayList<Integer>();
		
		list.add(40);
		list.add(41);
		list.add(42);
		list.set(1, 4);
		list.add(1, 39);
		System.out.println(list);
		
		
		System.out.println(list.remove(2));
		System.out.println(list);
		
		for(int i = 0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		for(Integer intob : list) {
			System.out.println(intob);
		}*/
		
		ArrayList<String> band = new ArrayList<String>();

		band.add("Lindsey");
	  	band.add("Mick");
		band.add("Stevie");
		band.add("Peter");
		band.remove(3);
		band.set(2, "Christine");

		System.out.println(band);

				
	}
}
