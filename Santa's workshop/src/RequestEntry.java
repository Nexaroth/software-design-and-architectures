
import java.time.Instant;
import java.time.LocalDateTime;

public class RequestEntry {

	private final Request request;
	
	public Request getRequest() {
		return request;
	}
	
	private long repeatInterval;
	
	public long getRepeatInterval() {
		return repeatInterval;
	}
	
	private long timeLastDone;

	public long getTimeLastDone() {
		return timeLastDone;
	}
	
	public void setTimeLastDone(long stld) {
		this.timeLastDone = stld;
	}
	
	public RequestEntry(Request request, long repeatInterval) {
		this.request = request;
		this.repeatInterval = repeatInterval;
		this.timeLastDone = System.currentTimeMillis();
	}
}
