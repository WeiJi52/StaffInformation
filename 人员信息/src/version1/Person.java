/**
 * 
 */
package version1;

/**
 * @author weiji
 *
 */
public class Person {
/**���� */
private String name;
/**��ַ */
private String address;
/**�绰���� */
private String phoneNum;
/**�����ʼ� */
private String e_Mail;

/** Person ���޲ι��췽�� */
Person () {}
/** Person ��4�������췽��  */
Person (String name, String address, String phoneNum, String e_Mail) {
	this.setName(name);
	this.setAddress(address);
	this.setPhoneNum(phoneNum);
	this.setE_Mail(e_Mail);
}
/** 
 * ����toString
 * @return Person ����
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