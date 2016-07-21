package com.flp.ems.domain;
import java.util.Scanner;
public class Project {
    String project;
    Scanner sc= new Scanner(System.in);
    
public String getproject()
{   int coP;
    System.out.println("choice of project ");
    System.out.println("1.Morgan Stanley");
    System.out.println("2.Barclays");
    System.out.println("3.HSBC");
			coP=sc.nextInt(); 
			
			switch(coP)
			{
			
			case 1:
			System.out.println("project is Morgan Stanley");
			project="morganStanley";
			//sc.close();
			return project;
                            
			case 2:
			System.out.println("project is Barclays");
			project="barclays";
			//sc.close();
			return project;
			
			case 3:
			System.out.println("project is HSBC");
			//sc.close();
			return project;
                            

			default:
			System.out.println("wrong choice");
			break;
			}
sc.close();						
return project;	
}


/*@Override
public String toString() {
	return "Project [project=" + project + "]";
}*/

    public String setproject(String string) {
        return project;
    }


	@Override
	public String toString() {
		return "Project [" + getproject() + "]";
	}

}