package prototype;

public class NetworkConnection implements Cloneable{

	private String ip; 
	private String importantata;
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getImportantata() {
		return importantata;
	}
	
	@Override
	public String toString() {
		return this.ip + ", importantata=" + this.importantata;
	}
	
	public void setImportantata(String importantata) {
		this.importantata = importantata;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public void loadVeryImportantData() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		this.importantata = "V.V.V important data"; 
		//takes way too much time
	}
}
