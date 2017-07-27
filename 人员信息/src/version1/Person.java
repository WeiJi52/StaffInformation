/**
 * 
 */
package version1;

/**
 * @author weiji
 *
 */
public class Person {
/**姓名 */
private String name;
/**地址 */
private String address;
/**电话号码 */
private String phoneNum;
/**电子邮件 */
private String e_Mail;

/** Person 的无参构造方法 */
Person () {}
/** Person 的4参数构造方法  */
Person (String name, String address, String phoneNum, String e_Mail) {
	this.setName(name);
	this.setAddress(address);
	this.setPhoneNum(phoneNum);
	this.setE_Mail(e_Mail);
}
/** 
 * 重载toString
 * @return Person 人名
 */
@Override
public String toString() {
	return "Person " + this.getName();
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhoneNum() {
	return phoneNum;
}
public void setPhoneNum(String phoneNum) {
	this.phoneNum = phoneNum;
}
public String getE_Mail() {
	return e_Mail;
}
public void setE_Mail(String e_Mail) {
	this.e_Mail = e_Mail;
}


}