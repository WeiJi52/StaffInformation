package version1;
/**
 * 
 * @author	 weiji
 *
 */
public class ShowObjectInformation {
	/**
	 * show the information of person
	 */
public static void showPerson(Object o) {
	Person person = (Person)o;
	System.out.print("类： Person " + "\t姓名:" + person.getName());
	System.out.print("\t地址： " + person.getAddress());
	System.out.print("\t电话号码： " + person.getPhoneNum());
	System.out.println("\t邮箱： " + person.getE_Mail());
}
/**
 * show the object of Student
 * @param object
 */
 
public static void showStudent(Object o) {
	Student s = (Student)o;
	System.out.print("类： Student " + "\t姓名:" + s.getName());
	System.out.print("\t地址： " + s.getAddress());
	System.out.print("\t电话号码： " + s.getPhoneNum());
	System.out.println("\t邮箱： " + s.getE_Mail());
}
/**
 * show the information of employee
 * @param object
 */
public static void showEmployee(Object o) {
	Employee e = (Employee)o;
	System.out.print("类： Employee " + "\t姓名:" + e.getName());
	System.out.print("\t地址： " + e.getAddress());
	System.out.print("\t电话号码： " + e.getPhoneNum());
	System.out.print("\t邮箱： " + e.getE_Mail());
	System.out.print("\t办公室： " + e.getOffice());
	System.out.println("\t工资： " + e.getSalary() + "\t" + e.getHireDate().toString());
	
}

/**
 * show the information of fculty
 * @param object
 */
public static void showFculty(Object o) {
	Faculty e = (Faculty)o;
	System.out.print("类： Fculty " + "\t姓名:" + e.getName());
	System.out.print("\t地址： " + e.getAddress());
	System.out.print("\t电话号码： " + e.getPhoneNum());
	System.out.print("\t邮箱： " + e.getE_Mail());
	System.out.print("\t办公室： " + e.getOffice());
	System.out.print("\t工资： " + e.getSalary() + "\t" + e.getHireDate().toString());
	System.out.println("\t办公时间： " + e.getOfficeHours() + "\t" + "等级： " + e.getRank());
	
}

/**
 * show the information of staff
 * @param object
 */
public static void showStaff(Object o) {
	Staff e = (Staff)o;
	System.out.print("类： Staff" + "\t姓名:" + e.getName());
	System.out.print("\t地址：" + e.getAddress());
	System.out.print("\t电话号码： " + e.getPhoneNum());
	System.out.print("\t邮箱： " + e.getE_Mail());
	System.out.print("\t办公室： " + e.getOffice());
	System.out.print("\t工资： " + e.getSalary() + "\t" + e.getHireDate().toString());
	System.out.println("\t职称：" + e.getNameOfProfessionalRole());
	
}


}



