package collections;
import java.util.ArrayList;
import java.util.List;

public class BikeUI {
	public static void main(String[] args) {
		List<BikeEx>al=new ArrayList();
		al.add(new BikeEx("Bike1",45.90d,"red"));
		al.add(new BikeEx("Bike2",45.90d,"red"));
		for (Object o : al) {
			System.out.println(o);

		}
		
		
	}

}
