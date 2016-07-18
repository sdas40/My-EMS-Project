package com.flp.ems.service;

import java.util.HashMap;
import com.flp.ems.dao.EmployeeDaoImplForList;
import com.flp.ems.domain.Employee;

public class EmployeeServiceImpl implements IEmployeeService<Object> {
	
	private String emp_id;
	private String j_date;
	private String dateofbirth;
	private String Phone_no;
	private String Name;
	private String Add;
	private String email_id;
	private String Kin_id;
	HashMap<Integer, String> serv;
	
	EmployeeDaoImplForList El=new EmployeeDaoImplForList();
	
	@Override
	public int hashCode() {
		
		return super.hashCode();
	}
	

@Override
public boolean equals(Object o) {
	// If the object is compared with itself then return true  
    if (o == this) {
        return true;
    }

    
     
    // typecast o to Complex so that we can compare data members 
    Employee c = (Employee) o;
   serv.equals(o);
    // Compare the data members and return accordingly 
    /*return Double.compare(Name, c.getName()) == 0
            && Double.compare(im, c.im) == 0;*/
	return super.equals(o);
}

	@Override
	public void getAllEmployee() {
		El.getAllEmployee();
		
	}



	@Override
	public void AddEmployee(HashMap E) {
		
		serv=E;
		Employee obj2=new Employee();
		
		Name=serv.get(1);
		Add=serv.get(3);
		Phone_no=serv.get(2);
		j_date=serv.get(4);
		dateofbirth=serv.get(5);
		Kin_id=serv.get(6);
		email_id=serv.get(7);
		emp_id=serv.get(8);
		
		obj2.setName(Name);
		obj2.setPhone_no(Phone_no);
		obj2.setAdd(Add);
		obj2.setJ_date(j_date);
		obj2.setdateofbirth(dateofbirth);
		obj2.setJ_date(j_date);
		obj2.setKin_id(Kin_id);
		obj2.setEmail_id(email_id);
		obj2.setEmp_id(emp_id);

		El.AddEmployee(obj2);
		
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
