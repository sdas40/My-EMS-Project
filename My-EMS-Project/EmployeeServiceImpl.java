package com.flp.ems.service;

import java.util.Map;
import java.util.Map.Entry;

import com.flp.ems.dao.EmployeeDaoImplForList;
import com.flp.ems.domain.Employee;

public class EmployeeServiceImpl implements IEmployeeService {
	
	private int emp_id=0;
	private String j_date;
	private String dateofbirth;
	private String Phone_no;
	private String Name;
	private String Add;
	private String email_id;
	
	Employee obj2=new Employee();
	@Override
	public void AddEmployee(Map E) {
		
		Map<Integer, String> serv=E;
		/*for( Entry<Integer, String> e: serv.entrySet()){
			System.out.println(e.getKey() + ":" + e.getValue());
		}*/
		Name=serv.get(1);
		Add=serv.get(3);
		Phone_no=serv.get(2);
		j_date=serv.get(4);
		dateofbirth=serv.get(5);
		
		obj2.setName(Name);
		obj2.setPhone_no(Phone_no);
		obj2.setAdd(Add);
		obj2.setJ_date(j_date);
		obj2.setdateofbirth(dateofbirth);
		
		EmployeeDaoImplForList El=new EmployeeDaoImplForList();
		El.AddEmployee(obj2);
	}

	

	@Override
	public void ModifyEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RemoveEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SearchEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAllEmployee() {
		// TODO Auto-generated method stub
		
	}


	

	@Override
	public void AddEmployee() {
		// TODO Auto-generated method stub
		
	}


	
	

}
