/**
 * 
 */
package version1;


/**
 * @author WeiJi
 *
 */
public class Staff extends Employee {
/** ְ��ƺ� */
private String nameOfProfessionalRole;
/** �޲����Ĺ��췽�� */
Staff () {}
/** �в����Ĺ��췽��*/
Staff(String name, String address, String phoneNum, String e_Mail, String office, String salary, 
	    MyDate hireDate, String nameOfProfessionalRole) {
	super(name, address, phoneNum, e_Mail, office, salary, hireDate);
	this.nameOfProfessionalRole = nameOfProfessionalRole;
}

/** 
 * ����toString
 * @return Staff ����
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
