/**
 * 
 */
package version1;


/**
 * @author WeiJi
 *
 */
public class Staff extends Employee {
/** 职务称号 */
private String nameOfProfessionalRole;
/** 无参数的构造方法 */
Staff () {}
/** 有参数的构造方法*/
Staff(String name, String address, String phoneNum, String e_Mail, String office, String salary, 
	    MyDate hireDate, String nameOfProfessionalRole) {
	super(name, address, phoneNum, e_Mail, office, salary, hireDate);
	this.nameOfProfessionalRole = nameOfProfessionalRole;
}

/** 
 * 重载toString
 * @return Staff 人名
 */
@Override
public String toString() {
	return "Staff" + this.getName();
}
public String getNameOfProfessionalRole() {
	return nameOfProfessionalRole;
}
public void setNameOfProfessionalRole(String nameOfProfessionalRole) {
	this.nameOfProfessionalRole = nameOfProfessionalRole;
}

}
