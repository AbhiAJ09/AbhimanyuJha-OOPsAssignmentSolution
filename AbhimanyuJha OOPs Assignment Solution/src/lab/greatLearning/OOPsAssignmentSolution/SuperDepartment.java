package lab.greatLearning.OOPsAssignmentSolution;

//creating SuperDepartment class which will be the superclass
public class SuperDepartment {
	
	// Super department will contain 4 methods of return type String and will not accept any parameter
	
	//i)  departmentName 
	//departmentName will return “ Super Department “
	String departmentName() {
		String department="Welcome to Super Department";
		return department;
	}
	
	//ii)  getTodaysWork  
	//getTodaysWork will return  “ No Work as of now”
	String getTodaysWork() {
		String todayWork="No work as of now";
		return todayWork;
	}
	
	//iii) getWorkDeadline
	//getWorkDeadline will return “ Nil “
	String getWorkDeadline() {
		String deadline= "nill";
		return deadline;
	}
	
	//iv) isTodayAHoliday
	//isTodayAHoliday will return “ Today is not a holiday”
	String isTodayAHoliday() {
		String holiday="Today is not a holiday";
		return holiday;		
	}
}
