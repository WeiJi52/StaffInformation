/**
 * 
 */
package version1;

/**
 * @author WeiJi
 *
 */
public class Student extends Person{
/**��һ */
private final int FRESH = 1;
/**��� */
private final int SOPHMORE = 2;
/**���� */
private final int JUNIR = 3;
/** ����*/
private final int SENIR = 4;

/**�޲������췽�� */
Student (){}
/**�Ĳ������췽�� */
Student (String name, String address, String phoneNum, String e_Mail) {
	super(name, address, phoneNum, e_Mail);
}

/** 
 * ����toString
 * @return Student ����
 */
@Override
public String toString() {
	return "Student" + this.getName();
}
}
