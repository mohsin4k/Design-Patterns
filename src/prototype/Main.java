package prototype;

public class Main {

	public static void main(String[] args) {
		
//		NetworkConnection networkConnection=new  NetworkConnection(); 
//		networkConnection.setIp("192.168.2.2");
//		networkConnection.loadVeryImportantData();
//		
//		System.out.println(networkConnection);
//		
//		//we want new object of network connection
//		NetworkConnection networkConnection2 = null; 
//		try {
//			networkConnection2= (NetworkConnection)networkConnection.clone();
//			System.out.println(networkConnection2);
//		} catch (CloneNotSupportedException e) {
//			e.printStackTrace();
//		}
		
		// Deep copy example
		
		DeepCopy deepCopy = new DeepCopy();
		deepCopy.setIp("112,112,112");
		deepCopy.loadList();
//		System.out.println(deepCopy);
		
		try {
			DeepCopy deepCopy1 = (DeepCopy) deepCopy.clone();
			deepCopy.loadList();
			System.out.println(deepCopy1);
			System.out.println(deepCopy);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
