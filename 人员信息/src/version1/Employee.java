/**
 * 
 */
package version1;



/**
 * @author WeiJi
 *
 */
public class Employee extends Person{
/**办公室 */
private String office;
/**工资 */
private String salary;
/**受聘日期 */
private MyDate hireDate;
/** 无参数的构造方法 */
Employee () {}
/** 多参数的构造方法 */
Employee (String name, String address, String phoneNum, String e_Mail, String office, String salary, 
    MyDate hireDate) {
	super(name, address, phoneNum, e_Mail);
	this.setOffice(office);
	this.setSalary(salary);
	this.setHireDate(hireDate);
}

/** 
 * 重载toString
 * @return Employee 人名
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
