import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class IterateMap 
{
	public static void main(String[] args) {
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		hm.put(10, 100);
		hm.put(20, 200);
		Set<Integer> keySet = hm.keySet();
		
		
		for (Integer inte : keySet) 
		{
			System.out.println(hm.get(inte));
		}
		
		
		Iterator<Integer> it = keySet.iterator();
		while(it.hasNext())
		{
			
		}
		}
	
	}

