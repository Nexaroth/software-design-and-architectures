import java.util.ArrayList;

public class RequestMinder extends Thread{
	
	private final long sleepInterval;
	
	private final ArrayList<RequestEntry> requestList;

	public RequestMinder(long sleepInterval) {
		this.sleepInterval = sleepInterval;
		requestList = new ArrayList<>();
		start();
	}

	public void addRequest(Request request, long repeatInterval) {
		long ri = (repeatInterval > 0) ? repeatInterval : 0;
		RequestEntry te = new RequestEntry(request, ri);
		requestList.add(te);
		System.out.println(te);
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				sleep(sleepInterval);
				long now = System.currentTimeMillis();

				for (RequestEntry te: requestList) {
					if (te.getRepeatInterval() + te.getTimeLastDone() < now) {
						te.getRequest().performRequest();
						te.setTimeLastDone(now);
					}
				}
			} catch (InterruptedException e) {
				System.out.println("Interrupted sleep: " + e);
			}
		}
	}
}
