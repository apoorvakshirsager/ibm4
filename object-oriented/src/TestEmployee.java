import ibm.com.emp.Employee;
import ibm.com.emp.Executive;
import ibm.com.emp.Manager;

public class TestEmployee {
public static void main(String[] args) {
	
//	Employee e=new Employee("apoorva",101,7722);
	//e.payslip();
	Executive exec=new Executive("Polo",232,6738);
	exec.payslip();
	Manager mgr=new Manager("jdjd",236,4449);
	mgr.payslip();
	Employee emp=mgr;
	System.out.println(mgr.getSalary());
	System.out.println(mgr.getSalary());
}
}

