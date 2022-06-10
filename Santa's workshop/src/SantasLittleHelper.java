import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class SantasLittleHelper implements Observer {
	private String toy;

	Santa santa = Santa.getInstance("Santa");
	
	public SantasLittleHelper() {
		toy = "toy";
		System.out.println(santa.value + " wants a " + toy);
	}
	
	@Override
	public void update(Observable obj, Object arg) {
		if (arg instanceof String) {
			toy = (String) arg;
			System.out.println(santa.value + " now wants a " + toy);
		} else {
			System.out.println(santa.value + " is confused");
		}
	}
}
