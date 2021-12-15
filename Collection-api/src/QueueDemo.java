import java.util.Queue;
import java.util.LinkedList;
public class QueueDemo {
public static void main(String[] args) {
	Queue<String> que=new LinkedList<>();
	que.add("apple");
	que.offer("banaa");
	que.offer("cherry");
	System.out.println(que.peek());
	while(!que.isEmpty())
		System.out.println(que.poll());
}
}
