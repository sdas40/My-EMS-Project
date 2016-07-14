package com.flp.ems.view;
import com.flp.ems.domain.Employee;
import java.util.Scanner;

public class BootClass {
	public static void main(String[] args) {
		System.out.println("hello:");
		BootClass object =new BootClass();
		object.menuSelection();
		
		
		
		
	}
	
	public void menuSelection(){
		UserInteraction obj =new UserInteraction();
		System.out.println("option 0 for AddEmployee");
		System.out.println("option 1 for ModifyEmployee");
		System.out.println("option 2 for RemoveEmployee");
		System.out.println("option 3 for SearchEmployee");
		System.out.println("option 4 for getAllEmployee");
		Scanner sc=new Scanner(System.in);
			int i=	sc.nextInt();
		
		switch(i){
		case 0:
			obj.AddEmployee();
			break;
		case 1:
			obj.ModifyEmployee();
			break;
		case 2:
			obj.RemoveEmployee();
			break;
		case 3:
			obj.SearchEmployee();
			break;
		case 4:
			obj.getAllEmployee();
		}

		
	}

}
