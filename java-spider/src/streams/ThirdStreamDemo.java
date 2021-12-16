package streams;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.stream.Collectors;
public class ThirdStreamDemo {
 public static void main(String[] args) {
	Map<String,String> people=new HashMap<>();
	people.put("polo","pune");
	people.put("mili","mumbau");
	people.put("nck","nasik");
	people.values().forEach(System.out::println);
	List<String> cities=people.values().stream().sorted().collect(Collectors.toList());
	cities.forEach(System.out::println);
	Map<String,List<String>> contacts=new HashMap<String,List<String>>();
	contacts.put("frudo", Arrays.asList("1212-3434","5656-7878"));
	contacts.put("jack",Arrays.asList("2323-4545","6565-9898"));
	contacts.put("sam",Arrays.asList("8989","2424-36363"));
	contacts.values().stream().flatMap(Collection::stream).forEach(System.out::println);
	
}
}
