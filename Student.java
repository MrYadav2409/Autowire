package beans;

public class Student {
   private int rollNo;
   private String sname;
   
   
public Student(int rollNo, String sname) {
	super();
	this.rollNo = rollNo;
	this.sname = sname;
}

public void show() 
{
  System.out.println("Roll number  :"  + rollNo);
  System.out.println("Student name :"  + sname);
}
   
   
	
	
}
