import ibm.com.lib.Book;
import ibm.com.lib.Member;

public class TestLibrary {
public static void main(String[] args) {
	Book b1=new Book("The alchemist");
	Member m1=new Member("Polo");
	b1.status();
	m1.status();
	b1.issueBook(m1);
	b1.status();
	m1.status();
	b1.issueBook(m1);
	b1.returnBook(m1);
	b1.status();
	m1.status();
	b1.returnBook(m1);
}
}
