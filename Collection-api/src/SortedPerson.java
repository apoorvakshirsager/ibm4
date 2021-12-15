import java.util.TreeSet;
import java.util.Comparator;
public class SortedPerson{
	public static void main(String[] args) {
	//	Comparator <Person> pc=(p1,p2)->p1.getAge()-p2.getAge();
		Comparator <Person> pc2=(p1,p2)->p1.getAge()-p2.getAge();
		TreeSet<Person> people=new TreeSet<Person>(pc2);
		people.add(new Person("polo",21));
		people.add(new Person("pol",21));
		people.add(new Person("po",21));
		for(Person p:people)
			System.out.println(p);
		
	}
}