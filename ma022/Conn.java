import java.util.*;
import java.sql.*;
public class Conn
{
	public static void main(String args[])  throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con;
		con=DriverManager.getConnection("jdbc:mysql://localhost:3308/java","root","");
		Scanner s1=new Scanner(System.in);
		System.out.println("1) view employee based on their salary");
		System.out.println("2) view specific employee detail based on emp_code filter with their salary details");
		System.out.println("enter your choice=");
		int ch=s1.nextInt();
		if(ch==1)
		{
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from employee_master  natural join emp_salary_detail");
			while(rs.next())
			{
				System.out.print(rs.getInt(1)+" ");
				System.out.print(rs.getString(2)+" ");
				System.out.print(rs.getString(3)+" ");
				System.out.print(rs.getString(4)+" ");
				System.out.print(rs.getInt(5)+" ");
				System.out.print(rs.getString(6)+" ");
				System.out.print(rs.getInt(7)+" ");
				System.out.print(rs.getInt(8)+" ");
				System.out.print(rs.getString(9)+" ");
				System.out.print(rs.getInt(10)+" ");
				System.out.print(rs.getInt(11)+" ");
				System.out.print(rs.getInt(12)+" ");
				System.out.println();
				//System.out.print(rs.getInt(13)+" ");
			}

		}

		if(ch==2)
		{
			System.out.println("enter code=");
			int code=s1.nextInt();
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from employee_master e1 left join emp_salary_detail e2 on e1.emp_id=e2.emp_id where emp_code="+code);
			while(rs.next())
			{
				System.out.print(rs.getInt(1)+" ");
				System.out.print(rs.getString(2)+" ");
				System.out.print(rs.getString(3)+" ");
				System.out.print(rs.getString(4)+" ");
				System.out.print(rs.getInt(5)+" ");
				System.out.print(rs.getString(6)+" ");
				System.out.print(rs.getInt(7)+" ");
				System.out.print(rs.getInt(8)+" ");
				System.out.print(rs.getString(9)+" ");
				System.out.print(rs.getInt(10)+" ");
				System.out.print(rs.getInt(11)+" ");
				System.out.print(rs.getInt(12)+" ");
				System.out.print(rs.getInt(13)+" ");
				System.out.println();
							//System.out.print(rs.getInt(13)+" ");
			}
		}

	}
}