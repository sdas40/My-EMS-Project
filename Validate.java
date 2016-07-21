package com.flp.ems.util;
//import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

	public class Validate {
		String Email_id;
		public static String Name;
		static String Phone_no;
		static String Add;
		static int Project_id, Role_id;
		static String number;
	    static String newname;
		static String Dateofjoining;
		static String dateofbirth;
		static int Dept_id;
		static int countofemp;
		static String dept, proj, role;
		static boolean flag;
		static int Data;
		static int email_id, Kin_id;
		
		private static Pattern pattern;
		  private static Matcher matcher;
		 
		  private static final String DATE_PATTERN =  "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)";
			  
		  /*public Validate(){
			  pattern = Pattern.compile(DATE_PATTERN);
		  }*/

		public static  boolean isvalidname(String name) {

			if(name.matches("[A-Z][a-zA-Z]*"))
			{
				
			}
			//return ; 
			newname=name;
			if(name.matches("[A-Z][a-zA-Z]*"))
			{
				
				return true;
				//System.out.println("valid");
			}
			else 
				return false;
		
			
			
		}

		public static boolean isvalidkin() {

			return true;

		}

		public static boolean isvalidPhone(String phone) {

			isInt(phone);

			if (Phone_no.equals("")) {
				System.out.println("plz enter number");
			} else if (phone.length() > 10) {
				System.out.println("invalid number");

			} else if (phone.length() < 10) {
				System.out.println("invalid number");
			} else {

				System.out.println("valid phone number");
			}

			return true;

		}

		public static boolean isInt(String phones) {

			try {
				long i = Long.parseLong(phones);
				return true;
			} catch (NumberFormatException e) {
				return false;
			}

		}

		public static boolean isvalidEmail(String mail) {
			String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
			Pattern p = Pattern.compile(ePattern);
			Matcher m = p.matcher(mail);
			return m.matches();

		}
		
		
		
			
			public static boolean validate(final String date){
				 pattern = Pattern.compile(DATE_PATTERN);
			     matcher = pattern.matcher(date);
			    

			     if(matcher.matches()){
						 
				 matcher.reset();
						  
				 if(matcher.find()){
				
			             String day = matcher.group(1);
				     String month = matcher.group(2);
				     int year = Integer.parseInt(matcher.group(3));
							 
				     if (day.equals("31") && 
					  (month.equals("4") || month .equals("6") || month.equals("9") ||
			                  month.equals("11") || month.equals("04") || month .equals("06") ||
			                  month.equals("09"))) {
						return false; // only 1,3,5,7,8,10,12 has 31 days
				     } 
				     else if (month.equals("2") || month.equals("02")) {
			                  //leap year
					  if(year % 4==0){
						  if(day.equals("30") || day.equals("31")){
							  return false;
						  }
							else{
							  return true;
						  }
					  }
					  else{
					         if(day.equals("29")||day.equals("30")||day.equals("31")){
							  return false;
					         }
					         
					    else{
							  return true;
						  }
					  }
				      }
				     else{				 
				    	 	return true;				 
				      }
				   }
				 else{
			    	      return false;
				   }		  
			     }
			     else{
			    	 	return false;
			     }			    
			     
			
			     }
		/*public static boolean isvalidDate(String date )
		{
		
			
			
			if (date.matches("\\d{2}-\\d{2}-\\d{4}")) {
			    
				return true;
				
			}else
			{
				return false;
			}
			
		}*/
		
			
		
		
		
		
	}


