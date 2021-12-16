
public interface Hello {
String sayHello();
default String sayBye() {
	return "goodbye";
}
static void greet() {
	System.out.println("zubairrrrrrrrrrr");
}
}
