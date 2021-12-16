
public class ArithmeticDemo {
public static void main(String[] args) {
	Arthimetic a1=(n,m)->(Integer)n+(Integer)m;
	System.out.println(a1.sum(10,20));
	Arthimetic a2=(n,m)->(Double)n+(Double)m;
	System.out.println(a2.sum(10.5,20.5));
}
}
