
public class ToyRequest implements Request {
	
	Santa santa = Santa.getInstance("Santa");
	
	private int nextRequest = 0;
	private final String[] request = {
			" wants a doll",
			" wants a bicycle"
	};
	
	Bicycle bicycle;
	
	@Override
	public void performRequest() {
		System.out.println(santa.value + request[nextRequest]);
		System.out.println(bicycle);
		nextRequest = (nextRequest + 1) % request.length;
	}
}
