package ibm.com.emp;
/*public class Manager extends Employee {

	private double commission;

	public Manager() {
		
	}

	public Manager(String empName, double salary,double commission) {
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


public class Manager extends Employee {
	private double incentives;
	//public Manager() {
	//}
    public Manager(String empName, double salary, double incentives) {
    	super(empName, salary);
    	this.incentives=incentives;    	
    }
	@Override
	public void payslip() {
		super.payslip();
		System.out.println("Incentives:"+incentives);
	}
	@Override
	public double getSalary() {
		return super.getSalary()+incentives;
	}
    
}
