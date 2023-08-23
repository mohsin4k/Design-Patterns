package singleton;

class SingletonSyncB{
	private static SingletonSyncB singeton_instance;
	
	private SingletonSyncB() {	
	}
	
	public static SingletonSyncB getInstance() {
		synchronized(SingletonSyncB.class){
			if(singeton_instance == null) {
				singeton_instance = new SingletonSyncB();
			}
		}
		return singeton_instance;
	}
}

public class SingletonSynchronizedBlock {
	public static void main(String args[]) {
		SingletonSyncB s =  SingletonSyncB.getInstance();
		System.out.println(s);
		SingletonSyncB s2 =  SingletonSyncB.getInstance();
		System.out.println(s2);
	}
}