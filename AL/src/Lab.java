import java.util.ArrayList;

public class Lab {
	
	 
	  public static ArrayList<Integer> getListOfFactors(int number)
	  {                                                                        	
	  	ArrayList<Integer> n = new ArrayList<Integer>();
	  	
	  	for(int i=1; i<=number; i++) {
	  		if(number%i==0&&i!=1&&i!=number)
	  			n.add(i);
	  	}
	  	
	  	return n;
	  }
	  
	  
	  
	 
	  public static void keepOnlyCompositeNumbers( ArrayList<Integer> nums )
	  { 
		  
	  	for(int i=0; i<=nums.size()-1; i++) {
	  		ArrayList<Integer> n = getListOfFactors(nums.get(i));
	  		if(n.size()<=2) {
	  			nums.remove(i);
	  			i--;
	  		}
	  	}
	  }
	
	  public static void main(String[] args) {
		  ArrayList<Integer> n = getListOfFactors(762);
		  System.out.println(n);
		  keepOnlyCompositeNumbers(n);
		  System.out.print(n);
		  
	  }


}
