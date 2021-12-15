import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
//import java.util.HashSet;
public class CollectionDemo {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	list.add("apple");
	list.add("google");
	list.add("oracle");
	list.add(2,"micro");
	list.add("ibm");
	System.out.println("--Travelling over arraylist using for loop");
	for(int i=0;i<list.size();i++)
		System.out.println(list.get(i));
	System.out.println("-- traversing over arylist usimg iterator");
	Iterator<String > itr=list.iterator();
	while(itr.hasNext())
		System.out.println(itr.next());
	System.out.println("--traversing over arraylist using for..each");
	for(String s:list)
		System.out.println(s);
	LinkedList<String> link=new LinkedList<String>();

	link.add("telsa");
	link.addFirst("telsa");
	link.add("telsa");
	link.addLast("telsa");
	link.addAll(link);
	
	System.out.println("--traversing over upadated arraylist using for..each");
	for(String s:list)
		System.out.println(s);
//	HashSet<String> set=new HashSet<String>(list);
	
}
}
