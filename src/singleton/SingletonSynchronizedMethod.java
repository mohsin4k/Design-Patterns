package singleton;

class SingletonSyncM{
	private static SingletonSyncM singeton_instance;
	
	private SingletonSyncM() {
		
	}
	
	public static synchronized SingletonSyncM getInstance() {
		if(singeton_instance == null) {
			singeton_instance = new SingletonSyncM();
		}
		return singeton_instance;
	}
}

public class SingletonSynchronizedMethod {
	public static void main(String args[]) {
		SingletonSyncM s =  SingletonSyncM.getInstance();
		System.out.println(s);
		SingletonSyncM s1 =  SingletonSyncM.getInstance();
		System.out.println(s1);
	}
}