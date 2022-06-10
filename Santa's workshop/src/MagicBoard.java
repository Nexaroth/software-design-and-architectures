import java.util.Observable;

@SuppressWarnings("deprecation")
public class MagicBoard extends Observable {
	private String toyRequest;

	public void setToyRequest(String toyRequest) {
		this.toyRequest = toyRequest;
		setChanged();
		notifyObservers(toyRequest);
	}
}
