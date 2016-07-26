package com.flp.ems.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import java.sql.PreparedStatement;

public class EmployeeDaoImplForDB implements IemployeeDao {
	
	private String driver="com.mysql.jdbc.Driver";
	private String url="jdbc:mysql://localhost/test";
	private String emp_id;
	private String j_date;
	private String dateofbirth;
	private int Phone_no;
	private String Name;
	private String Add;
	private String email_id;
	private String Kin_id;
	private int projid;
	private int dpartid;
	
	
	//Department 
	
	Connection conn=null;
	PreparedStatement stmt = null;
	

	@Override
	public void AddEmployee(Employee emp) {
		emp_id=emp.getEmp_id();
		Name=emp.getName();
		j_date=emp.getJ_date();
		dateofbirth=emp.getdateofbirth();
		Phone_no=Integer.parseInt(emp.getPhone_no());
		Add=emp.getAdd();
		email_id=emp.getEmail_id();
		Kin_id=emp.getKin_id();
		projid=emp.getProject();
		dpartid=emp.getDepartment();
		try{
			Class.forName(driver);
			conn=DriverManager.getConnection(url);
			System.out.println("connectionm su");
			String sql = "INSERT INTO DEPARTMENT VALUES (?,?,?)";
			
			stmt = conn.prepareStatement(sql);
			  stmt.setInt(1,dpartid);
		      stmt.setString(2,"ADM");
		      stmt.setString(3, "This is the ADM department");
		      stmt.executeUpdate();
			
/*			String sql = "INSERT INTO EMPLOYEE VALUES (emp_id,Name,Kin_id,email_id,Phone_no,dateofbirth,j_date,Add,)";
*/			
			stmt.executeUpdate(sql);
			// sql = "SELECT Employee_id,  Kin_id, Email_id, Phone_no, Date_of_birth,Date_of_joining,Address,Department_id,project_id  FROM Employees";
			
			String sql1="INSERT INTO PROJECT VALUES()";
	      stmt.close();
	      conn.close();
		   
		}catch(Exception e){
			e.printStackTrace();
		}finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(Exception se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(Exception se){
		         se.printStackTrace();
		      }//end finally try
		   }
		
	     
		 
	}

	@Override
	public void ModifyEmployee(String name, String email, String kin_id) {
		
		
	}

	@Override
	public void RemoveEmployee(String name, String email, String kin_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SearchEmployee(String name, String email, String kin_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAllEmployee() {
		// TODO Auto-generated method stub
		
	}

}
