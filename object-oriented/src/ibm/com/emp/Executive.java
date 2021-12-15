package ibm.com.emp;
/*public class Executive extends Employee {
	private double commission;

	public Executive() {
		
	}

	public Executive(String empName, double salary,double commission) {
		super(empName,salary);
		// TODO Auto-generated constructor stub
		this.commission=commission;
	}
	public void payslip()
	{
		super.payslip();
		System.out.println("Commission:"+commission);
	}
	public double getSalary()
	{
		return super.getSalary()+commission;
	}

}*/
public class Executive extends Employee {
	private double commission;
	
	public Executive(String empName, double salary, double commission) {
		super(empName, salary);
		this.commission=commission;
	}
	@Override
	public void payslip() {
		
		super.payslip();
		System.out.println("Commission: "+commission);
	}
	@Override
	public double getSalary() {
		return super.getSalary()+commission;
		
	}
}