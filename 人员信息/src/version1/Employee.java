/**
 * 
 */
package version1;



/**
 * @author WeiJi
 *
 */
public class Employee extends Person{
/**�칫�� */
private String office;
/**���� */
private String salary;
/**��Ƹ���� */
private MyDate hireDate;
/** �޲����Ĺ��췽�� */
Employee () {}
/** ������Ĺ��췽�� */
Employee (String name, String address, String phoneNum, String e_Mail, String office, String salary, 
    MyDate hireDate) {
	super(name, address, phoneNum, e_Mail);
	this.setOffice(office);
	this.setSalary(salary);
	this.setHireDate(hireDate);
}

/** 
 * ����toString
 * @return Employee ����
 */
@Override
public String toString() {
	return "Employee " + this.getName();
}
public String getOffice() {
	return office;
}
public void setOffice(String office) {
	this.office = office;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
public MyDate getHireDate() {
	return hireDate;
}
public void setHireDate(MyDate hireDate) {
	this.hireDate = hireDate;
}
}
