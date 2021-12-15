class EventImp1 implements Event{
	public void doSomething() {
		System.out.println("class level imple");
	}
}
public class EventDemo {
	class InnerEventImp1 implements Event{
		public void doSomething() {
			System.out.println("inner level imple");
		}
	}
	public static class StaticInnerEventImp1 implements Event{
		public void doSomething() {
			System.out.println("static inner level imple");
		}	
	}
	public void nestedEvent(){
		class NestedEventImp1 implements Event{
			public void doSomething() {
				System.out.println("nested level imple");
			}
		}
		new NestedEventImp1().doSomething();
	}
	public void oneMoreEvent() {
		Event e=new Event() {
			public void doSomething() {
				System.out.println("anonymous level imple");
			}
		};e.doSomething();
	}
	public void oneLastEvent() {
		Event e=()->System.out.println("lamda level imple");
		e.doSomething();
	}
 public static void main(String[] args) {
	EventImp1 e1=new EventImp1();
	e1.doSomething();
	EventDemo ed=new EventDemo();
	InnerEventImp1 e2=ed.new InnerEventImp1();
	e2.doSomething();
	EventDemo.StaticInnerEventImp1 e3=new EventDemo.StaticInnerEventImp1();
	e3.doSomething();
	ed.nestedEvent();
	ed.oneMoreEvent();
	ed.oneLastEvent();
}
}
