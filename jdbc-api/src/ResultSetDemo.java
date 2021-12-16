import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
public class ResultSetDemo {
public static void main(String[] args) {
	String sql="select * from product";
	try {
		Connection conn=JdbcUtil.getConnection();
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		ResultSetMetaData meta=rs.getMetaData();
		System.out.print(meta.getColumnLabel(0));
		while(rs.next())
			System.out.print(rs.getInt(1)+"\t"+rs.getString(2)+"t"+rs.getString(3));
	}catch(SQLException e) {
		e.printStackTrace();
	}
}
}
