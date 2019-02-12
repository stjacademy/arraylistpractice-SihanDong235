import java.util.ArrayList;

public class AAL {
	public static void main(String[] args) {
		
		/*ArrayList <Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(10);
		list.add(12);
		
		for(int i= 0; i < list.size(); i++)
			list.remove(i); 
		
		for(int i=0; i < 4; i++)
			System.out.print(list.get(i) + " "); 
		
		}*/
		ArrayList band = new ArrayList<String>(); 
		
		band.add("Paul"); 
		band.add("Ringo");
		band.add("John"); 
		band.add("George"); 


		band.add(band.size()-2,band.remove(band.size()-1));

		System.out.print(band); 


		
	}
				
	}
