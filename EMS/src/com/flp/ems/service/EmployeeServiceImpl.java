package com.flp.ems.service;

import java.util.HashMap;
import java.util.HashSet;

import com.flp.ems.dao.EmployeeDaoImplForDB;
import com.flp.ems.dao.EmployeeDaoImplForList;
import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;

public class EmployeeServiceImpl implements IEmployeeService<Object> {
	
	private String emp_id;
	private String j_date;
	private String dateofbirth;
	private String Phone_no;
	private String Name;
	private String Add;
	private String email_id;
	private String Kin_id;
	private int pid;
	private int did;
	private int rid;
	
	Department depT= new Department();
    Project proJ = new Project();
	
	
	HashMap<Integer, Object> serv;
	
	EmployeeDaoImplForList El=new EmployeeDaoImplForList();
	EmployeeDaoImplForDB E2=new EmployeeDaoImplForDB();
	static HashSet<String> hskin=new HashSet<String>();
	static HashSet<String> hsemail=new HashSet<String>();
	


	@Override
	public void getAllEmployee() {
		El.getAllEmployee();
		
		
	}



	@Override
	public void AddEmployee(HashMap E) {
		serv=E;
		
		Employee obj2=new Employee();
		
		Kin_id=(String)serv.get(6);
		email_id=(String)serv.get(7);
		Name=(String)serv.get(1);
		Add=(String)serv.get(3);
		Phone_no=(String)serv.get(2);
		j_date=(String)serv.get(4);
		dateofbirth=(String)serv.get(5);
		emp_id=(String)serv.get(8);
		pid=Integer.parseInt((String)serv.get(12));
		did=Integer.parseInt((String)serv.get(11));
		
		if(hskin.contains(Kin_id))
		{
			System.out.println("kin id already exists");
			return;
		}
		else
		{
			hskin.add(Kin_id);
			}
		if(hsemail.contains(email_id))
		{
			System.out.println("email already exists");
			return;
		}
		else
		{
			hsemail.add(email_id);
		}
		
		
		
		 	proJ.setproject((String)serv.get(9));
	        obj2.setProj(proJ);
	        
	        depT.setdepartment((String)serv.get(10));
		    obj2.setDept(depT);
		
		
	
		
		obj2.setKin_id(Kin_id);
		obj2.setEmail_id(email_id);
		obj2.setName(Name);
		obj2.setPhone_no(Phone_no);
		obj2.setAdd(Add);
		obj2.setJ_date(j_date);
		obj2.setdateofbirth(dateofbirth);
		obj2.setJ_date(j_date);
		obj2.setEmp_id(emp_id);
		obj2.setProject(pid);
		obj2.setDepartment(did);

		

		
		if(obj2.equals(serv)){
			System.out.println("same object");
		}
		
			//El.AddEmployee(obj2);
			E2.AddEmployee(obj2);
		
		
	}


	@Override
	public void ModifyEmployee(String name, String email, String kin_id) {
		El.ModifyEmployee(name,email,kin_id);
		
	}

	@Override
	public void RemoveEmployee(String name, String email, String kin_id) {
		El.RemoveEmployee(name, email,kin_id);
		
	}


	@Override
	public void SearchEmployee(String name, String email, String kin_id) {
		El.SearchEmployee(name, email,kin_id);
		
	}


	



	
	

}
