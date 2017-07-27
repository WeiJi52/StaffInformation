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
	System.out.print("�ࣺ Person " + "\t����:" + person.getName());
	System.out.print("\t��ַ�� " + person.getAddress());
	System.out.print("\t�绰���룺 " + person.getPhoneNum());
	System.out.println("\t���䣺 " + person.getE_Mail());
}
/**
 * show the object of Student
 * @param object
 */
 
public static void showStudent(Object o) {
	Student s = (Student)o;
	System.out.print("�ࣺ Student " + "\t����:" + s.getName());
	System.out.print("\t��ַ�� " + s.getAddress());
	System.out.print("\t�绰���룺 " + s.getPhoneNum());
	System.out.println("\t���䣺 " + s.getE_Mail());
}
/**
 * show the information of employee
 * @param object
 */
public static void showEmployee(Object o) {
	Employee e = (Employee)o;
	System.out.print("�ࣺ Employee " + "\t����:" + e.getName());
	System.out.print("\t��ַ�� " + e.getAddress());
	System.out.print("\t�绰���룺 " + e.getPhoneNum());
	System.out.print("\t���䣺 " + e.getE_Mail());
	System.out.print("\t�칫�ң� " + e.getOffice());
	System.out.println("\t���ʣ� " + e.getSalary() + "\t" + e.getHireDate().toString());
	
}

/**
 * show the information of fculty
 * @param object
 */
public static void showFculty(Object o) {
	Faculty e = (Faculty)o;
	System.out.print("�ࣺ Fculty " + "\t����:" + e.getName());
	System.out.print("\t��ַ�� " + e.getAddress());
	System.out.print("\t�绰���룺 " + e.getPhoneNum());
	System.out.print("\t���䣺 " + e.getE_Mail());
	System.out.print("\t�칫�ң� " + e.getOffice());
	System.out.print("\t���ʣ� " + e.getSalary() + "\t" + e.getHireDate().toString());
	System.out.println("\t�칫ʱ�䣺 " + e.getOfficeHours() + "\t" + "�ȼ��� " + e.getRank());
	
}

/**
 * show the information of staff
 * @param object
 */
public static void showStaff(Object o) {
	Staff e = (Staff)o;
	System.out.print("�ࣺ Staff" + "\t����:" + e.getName());
	System.out.print("\t��ַ��" + e.getAddress());
	System.out.print("\t�绰���룺 " + e.getPhoneNum());
	System.out.print("\t���䣺 " + e.getE_Mail());
	System.out.print("\t�칫�ң� " + e.getOffice());
	System.out.print("\t���ʣ� " + e.getSalary() + "\t" + e.getHireDate().toString());
	System.out.println("\tְ�ƣ�" + e.getNameOfProfessionalRole());
	
}


}



