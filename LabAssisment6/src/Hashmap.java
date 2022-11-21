import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  HashMap<Integer,Integer> Sc =new HashMap<>();
		for (int i=1;i<=15;i++)
		{
			int SQUARE = i*i;
			Sc.put(i, SQUARE);
		}
		
		System.out.println(Sc); 	
		
	}

}