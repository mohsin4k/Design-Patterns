package prototype;

public class Main {

	public static void main(String[] args) {
		
		NetworkConnection networkConnection=new  NetworkConnection(); 
		networkConnection.setIp("192.168.2.2");
		networkConnection.loadVeryImportantData();
		
		System.out.println(networkConnection);
		
		//we want new object of network connection
		NetworkConnection networkConnection2 = null; 
		try {
			networkConnection2= (NetworkConnection)networkConnection.clone();
			System.out.println(networkConnection2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} 
	}

}
