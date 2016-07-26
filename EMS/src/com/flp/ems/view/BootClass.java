package com.flp.ems.view;
import java.util.Scanner;

public class BootClass {
	public static void main(String[] args) {
		System.out.println("Employee Management System");
		BootClass object =new BootClass();
		object.menuSelection();
			
	}

	
	
	public void menuSelection(){
		UserInteraction obj =new UserInteraction();
		
		Scanner sc=new Scanner(System.in);
			
		while(true){
			System.out.println("option 0 for AddEmployee");
			System.out.println("option 1 for ModifyEmployee");
			System.out.println("option 2 for RemoveEmployee");
			System.out.println("option 3 for SearchEmployee");
			System.out.println("option 4 for getAllEmployee");
			System.out.println("option 5 for Exit");
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
				break;
			case 5: System.exit(0);
			break;
			}
		}
	}
}
		
	
	

	
	
	
	
	
	
	
	
	
	


		
	

