import java.sql.*;

public class test
{
	//jdbc driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/test";

	static final String USER="beginner";
	static final String PASS="fth19930526";


	public static void main(String[] args){
		Connection conn = null;
		Statement stmt = null;

		try{
			//register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			//open connection
			System.out.println("Connecting to DB");
			conn=DriverManager.getConnection(DB_URL,USER,PASS);

			//execute query
			System.out.println("Createing statement");
			stmt=conn.createStatement();
			String sql;
			sql="SELECT pid, first, last, age FROM Employees;";
			ResultSet rs=stmt.executeQuery(sql);

			while(rs.next()){
				int pid=rs.getInt("pid");
				int age=rs.getInt("age");
				String first = rs.getString("first");
				String last = rs.getString("last");

				//display values
				System.out.println("ID: "+pid);
				System.out.println("AGE: "+age);
				System.out.println("First: "+first);
				System.out.println("LAST: "+last);

			}//while
			rs.close();
			stmt.close();
			conn.close();
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
			try{
				if(stmt!=null){
					stmt.close();
				}
			}catch(SQLException se2){
				//nothing
			}//try1

			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}//try2

		}//finally
		System.out.println("log out and finished");
	}//main
	

}
