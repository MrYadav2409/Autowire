package beans;

public class Employee {
	private int eid;
	private String ename;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public void sayHello() 
	{
		System.out.println("Hello : " + ename);
		System.out.println("Your employee id is :" + eid);
	}

}
