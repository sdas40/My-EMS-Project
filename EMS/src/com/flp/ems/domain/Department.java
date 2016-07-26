package com.flp.ems.domain;

import java.util.Scanner;
public class Department {
   /* @Override
	public String toString() {
		return "Department [dID=" + dID + ", nDEPT=" + nDEPT + ", getdepartment()=" + getdepartment() + "]";
	}
*/
	
	private int dID;
    public int getdID() {
		return dID;
	}

	public void setdID(int dID) {
		this.dID = dID;
	}

	@Override
	public String toString() {
		return "Department [getdepartment()=" + getdepartment() + "]";
	}

	private String nDEPT;
 
    public String getdepartment(){
        int coD;
        Scanner sc = new Scanner(System.in);    
        //System.out.println("Choice of differnt department");
        System.out.println("1. ADM");
        System.out.println("2. Cards");
        System.out.println("3. Testing");
        coD=sc.nextInt();
			
	switch (coD) {
	case 1: 
            System.out.println("Department is ADM");
	    nDEPT="ADM";
            return nDEPT;
        case 2:
            System.out.println("Department is Cards");
	    nDEPT="Cards";
            return nDEPT;
        case 3:
            System.out.println("Department is testing");
	    nDEPT="testing";    
            return nDEPT;
        
    }
 return null;  
}

    public String setdepartment(String string) {    
    	return nDEPT;
    }
}