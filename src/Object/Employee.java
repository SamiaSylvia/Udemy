package Object;

public class Employee {
	int empno;
	String ename;
	float sal;
	
	void setproperties() {
		ename = "Naveen";
		sal= 5000; 
		
	}
	
	void displayProperties() {
		System.out.println(empno + "|" + ename + "|" + sal);

	}
	public static void main (String [] args) {
		//create an employee type object 
		Employee emp = new Employee();
		
		// access the employee object properties using reference 
		System.out.println(emp.empno + "|" + emp.ename + "|" + emp.sal);

		//1. changing the state of object using reference 
		emp.empno = 101;
		emp.ename = "Sunil";
		emp.sal = (float) 2500.5f;
		//System.out.println(emp.empno + "|" + emp.ename + "|" + emp.sal);
		emp.displayProperties();
		
		//2. changing the state of object using a method 
		emp.setproperties();
		emp.displayProperties();
		
		
	}
}
