package iterator;

public class Main {

	public static void main(String[] args) {
		
		UserManagement userManagement = new UserManagement();
		
		userManagement.addUser(new User("Mohsin","1"));
		userManagement.addUser(new User("Aman", "2"));
		userManagement.addUser(new User("Faiz", "3"));
		userManagement.addUser(new User("Yash", "4"));
		
		MyIterator myIterator =  userManagement.getIterator(); 
		
		while(myIterator.hasNext()) {
			User user = (User)myIterator.next();
			System.out.println(user.getName());
		}
	}
	
	

}
