import java.util.*;
import java.sql.*;
public class Connectivity
{
	public static void main(String args[])throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Scanner s1=new Scanner(System.in);
		Connection con;
		con=DriverManager.getConnection("jdbc:mysql://localhost:3308/java","root","");
		System.out.println("1) view all records...");
		System.out.println("2) view all records using primary key");
		System.out.println("3) view records using code");
		System.out.println("4) update record using primary key");
		System.out.println("5) delete record based on primary key");
		System.out.println("6) update record based on empcode");
		System.out.println("7) delete record based on empcode");
		System.out.println("enter your choice=");
		int ch=s1.nextInt();
		if(ch==1)
		{
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from employee_master");
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
				System.out.println();

			}
		}
		if(ch==2)
		{
			System.out.println("enter empid=");
			int id=s1.nextInt();
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from employee_master where emp_id="+id);
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
				System.out.println();

			}
		}
		if(ch==3)
		{
			System.out.println("enter empcode=");
			int code=s1.nextInt();
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from employee_master where emp_code="+code);
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
				System.out.println();

			}
		}

		if(ch==4)
		{
			System.out.println("enter id=");
			int id=s1.nextInt();
			Statement stmt=con.createStatement();
			String query;
			query="update employee_master set emp_fname='krisha' where emp_id="+id;
			int i=stmt.executeUpdate(query);
			System.out.println(i+"record updated");
		}

		if(ch==5)
		{
			System.out.println("enter id=");
			int id=s1.nextInt();
			String query;
			Statement stmt=con.createStatement();

			int i=stmt.executeUpdate("delete from employee_master where emp_id="+id);
			System.out.println(i+"record deleted");
		}

		if(ch==6)
		{
			System.out.println("enter code=");
			int code=s1.nextInt();
			Statement stmt=con.createStatement();
			String query;
			query="update employee_master set emp_phone=12345 where emp_code="+code;
			int i=stmt.executeUpdate(query);
			System.out.println(i+"record updated");

		}

		if(ch==7)
		{
			System.out.println("enter code=");
			int code=s1.nextInt();
			String query;
			Statement stmt=con.createStatement();
			int i=stmt.executeUpdate("delete from employee_master where emp_code="+code);
			System.out.println(i+"record deleted");
		}




	}
}