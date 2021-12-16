import java.sql.Connection;
import java.sql.Statement;

public class StatementDemo {
public static void main(String[] args) {
	String sql="insert into product values(231,'Apple Watch 5','2400)";
	Connection conn=JdbcUtil.Connection();
	Statement stmt=conn.createStatement();
	stmt.executeUpdate(sql);
	System.out.println("Record inserted");
}
}
