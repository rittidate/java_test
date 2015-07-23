
public class Employee2 {
	public int empId;
	private double salary;
	public String timeIn;
	public String timeOut;
	
	public void setTimeIn(String time){
		timeIn = time;
	}
	
	public void setTimeOut(String time){
		timeOut = time;
	}
	
	private double getSalary(int empId){
		if(empId == 2264) salary = 30000;
		else salary = 20000;
		return salary;
	}
	
	public static void main(String args[]){
		Employee2 employee = new Employee2();
		employee.empId = 2264;
		employee.salary = 20000;
		employee.setTimeIn("08.20");
		employee.setTimeOut("18.00");
		employee.getSalary(employee.empId);
		
		System.out.print("Value from method call =>");
		System.out.print(" empId:" + employee.empId);
		System.out.print(" salary:" + employee.salary);
		System.out.print(" timeIn:" + employee.timeIn);
		System.out.print(" timeOut" + employee.timeOut + "\n");
	}
}
