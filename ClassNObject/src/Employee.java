
public class Employee {
	public int empId;
	private double salary;
	public String timeIn;
	public String timeOut;
	
	public static void main(String args[]){
		Employee employee = new Employee();
		employee.empId = 2264;
		employee.salary = 20000;
		employee.timeIn = "08.30";
		employee.timeOut = "17.30";
		
		System.out.print("Value from attribute =>");
		System.out.print(" empId:" + employee.empId);
		System.out.print(" salary:" + employee.salary);
		System.out.print(" timeIn:" + employee.timeIn);
		System.out.print(" timeOut" + employee.timeOut + "\n");
	}
}
