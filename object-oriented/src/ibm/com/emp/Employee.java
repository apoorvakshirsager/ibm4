package ibm.com.emp;

public class Employee {
private int empNo;
private String empName;
private double salary;
public Employee() {
	
}
public Employee(String empName,int empNo,double salary)
{
    this.empNo=empNo;
    this.empName=empName;
    this.salary=salary;
}
public void payslip()
{
	System.out.println("Emp No:"+empNo);
	System.out.println("EmpName:"+empName);
	System.out.println("salary:"+salary);
}
}
