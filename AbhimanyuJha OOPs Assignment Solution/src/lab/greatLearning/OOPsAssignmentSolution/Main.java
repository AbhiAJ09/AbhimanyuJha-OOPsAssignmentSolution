package lab.greatLearning.OOPsAssignmentSolution;

//Driver class Main will be used to create objects of HrDepartment, TechDepartment, AdminDepartment
public class Main {
	public static void main(String [] arg) {
		
		HR_Department obj1=new HR_Department();
		Tech_Department obj2=new Tech_Department();
		Admin_Department obj3=new Admin_Department();
		
		//Each department will display all its functionalities
		//Each department  will display whether today is a holiday or not with the help of the Super Department. (SuperDepartment will act as a super class for all the departments)
	    
		System.out.println(obj3.departmentName()+"\n"+obj3.getTodaysWork()+"\n"+ obj3.getWorkDeadline()+"\n"+obj3.isTodayAHoliday()+"\n");
		System.out.println(obj1.departmentName()+"\n"+obj1.doActivity()+"\n"+obj1.getTodaysWork()+"\n"+ obj1.getWorkDeadline()+"\n"+obj1.isTodayAHoliday()+"\n");
		System.out.println(obj2.departmentName()+"\n"+obj2.getTodaysWork()+"\n"+ obj2.getWorkDeadline()+"\n"+obj2.getTechStackInformation()+"\n"+obj2.isTodayAHoliday()+"\n");
	}
}
