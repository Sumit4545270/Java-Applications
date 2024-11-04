package inheritance_java;

class Employee{
	protected int empid;
	protected String nmString;
	
	public void setEmployee(int empid, String nmString) {
		this.empid = empid;
		this.nmString = nmString;
	}
	
	public void getEmployee() {
		System.out.println("Employee ID: "+empid);
		System.out.println("Employee Name: "+nmString);
	}	
}
class Person extends Employee{
	protected String empCityString;
	protected String departmentString;
	
	public void setPerson(int empid, String nmString, String empCityString, String departmenString) {
		setEmployee(empid, nmString);
		this.empCityString = empCityString;
		this.departmentString = departmenString;
	}
	
	public void getPerson() {
		getEmployee();
		System.out.println("Person City: "+empCityString);
		System.out.println("Person Department: "+departmentString);
	}
}
class Child extends Person{
	protected int salary;
	
	public void setChild(int empid, String nmString, String empCityString, String departmenString, int salary) {
		setPerson(empid, nmString, empCityString, departmenString);
		this.salary = salary;
	}
	
	public void getChild() {
		getPerson();
		System.out.println("Child Salary: "+salary);		
	}
}
public class multilevel_Demo {
		
	public static void main(String[] args) {
		Employee emp = new Employee();
		Person pers = new Person();
		Child ch = new Child();
		
		emp.setEmployee(66, "Sumit Badgujar");
		emp.getEmployee();
		
		pers.setPerson(67, "Sujal", "Parola", "Computer");
		pers.getPerson();
		
		ch.setChild(68, "Mansi", "Jalgaon", "Computer", 25000);
		ch.getChild();
		
	}
	
	
	
}