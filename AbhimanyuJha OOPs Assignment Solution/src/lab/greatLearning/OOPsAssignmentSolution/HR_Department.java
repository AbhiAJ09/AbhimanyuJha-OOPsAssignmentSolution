package lab.greatLearning.OOPsAssignmentSolution;

//Program to create base class for superclass SuperDepartment
public class HR_Department extends SuperDepartment {
	
	//Hr department will contain 4 methods of return type String and will not accept any parameter
	
	//i)  departmentName 
	//departmentName will return “ Hr Department “
	String departmentName() {
		String department="Welcome to Hr department";
		return department;
	}
	
	//ii)  getTodaysWork  
	//getTodaysWork will return  “ Fill today’s worksheet and mark your attendance”
	String getTodaysWork() {
		String Work = "Fill today’s worksheet and mark your attendance";
		return Work;
	}
	
	//iii) getWorkDeadline
	//getWorkDeadline will return “ Complete by EOD “
	String getWorkDeadline() {
		String deadline = "Complete by EOD";
		return deadline;
	}
	
	//iv) doActivity
	//doActivity “team Lunch”
	String doActivity() {
		String activity = "team Lunch";
		return activity;
	}
}
