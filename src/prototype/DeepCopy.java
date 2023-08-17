package prototype;

import java.util.*;
//this is the example class to show how we can do deep copy
public class DeepCopy implements Cloneable {
	private String ip; 
	private String add; 
	private List<Integer> list = new ArrayList<>();
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	public void loadList() {
		this.add = "address"; 
		list.add(11);
	}
	@Override
	public String toString() {
		return this.ip + ", add=" + this.add + ":" + list;
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		// here we can write logic for cloning for Deep copy
		DeepCopy deepCopy = new DeepCopy(); 
		deepCopy.setIp(this.ip);
		deepCopy.setAdd(this.getAdd());
		
		for(int e : this.getList()) {
			deepCopy.getList().add(e); 
		}
		return deepCopy;
	}
	
	public List<Integer> getList() {
		return list;
	}
	
	public void setList(List<Integer> list) {
		this.list = list;
	}
}
