
public class Santa {
	private static Santa instance;
    public String value;

    private Santa(String value) {
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Santa getInstance(String value) {
        if (instance == null) {
            instance = new Santa(value);
        }
        return instance;
    }
}
