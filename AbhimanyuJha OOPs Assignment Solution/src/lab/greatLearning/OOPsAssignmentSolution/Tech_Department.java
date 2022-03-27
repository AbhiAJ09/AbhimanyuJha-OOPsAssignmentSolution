package lab.greatLearning.OOPsAssignmentSolution;

//Program to create base class for superclass SuperDepartment
public class Tech_Department extends SuperDepartment {
	
	//Tech department will contain 4 methods of return type String and will not accept any parameter
	
	//i)  departmentName 
	//departmentName will return “ Tech Department “
	String departmentName() {
		String department="Welcome to Tech department";
		return department;
	}
	
	//ii)  getTodaysWork  
	//getTodaysWork will return  “ Complete coding of module 1”
	String getTodaysWork() {
		String Work = "Complete coding of module 1";
		return Work;
	}
	
	//iii) getWorkDeadline
	//getWorkDeadline will return “ Complete by EOD “
	String getWorkDeadline() {
		String deadline = "Complete by EOD";
		return deadline;
	}
	
	//iv) getTechStackInformation
	//getTechStackInformation will return “core Java”
	String getTechStackInformation() {
		String stackInformation = "core java";
		return stackInformation;
	}
}
