package lab.greatLearning.OOPsAssignmentSolution;

//Program to create base class for superclass SuperDepartment
public class Admin_Department extends SuperDepartment {
	
	//Admin department will contain 3 methods of return type String and will not accept any parameter
	
	//i)  departmentName 
	//departmentName will return “ Admin Department “
	String departmentName() {
		String department="Welcome to Admin department";
		return department;
	}
	
	//ii)  getTodaysWork 
	//getTodaysWork will return “Complete your documents Submission”
	String getTodaysWork() {
		String Work = "Complete your documents Submission";
		return Work;
	}
	
	//iii) getWorkDeadline
	//getWorkDeadline will return “ Complete by EOD “
	String getWorkDeadline() {
		String deadline = "Complete by EOD";
		return deadline;
	}

}
