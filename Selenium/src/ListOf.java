import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;

public class ListOf {

	public static void main (String[] args)
	{
		List a = new ArrayList();
		a.add("adf");
		a.add("234");
		
		Iterator b = a.iterator();
		
		while(b.hasNext())
		{
			String c = (String) b.next();
			System.out.println(c);
			//Assert.Equals(expecteds, actuals);
			
		}
		
		
	}
}
