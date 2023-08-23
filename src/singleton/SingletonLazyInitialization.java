package singleton;

class SingletonLazy{
	private static SingletonLazy singeton_instance;
	
	private SingletonLazy() {
		
	}
	
	public static SingletonLazy getInstance() {
		if(singeton_instance == null) {
			singeton_instance = new SingletonLazy();
		}
		return singeton_instance;
	}
}

public class SingletonLazyInitialization {
	public static void main(String args[]) {
		SingletonLazy s =  SingletonLazy.getInstance();
		System.out.println(s);
		
		SingletonLazy s1 =  SingletonLazy.getInstance();
		System.out.println(s1);
	}
}