/**
 * 
 */
package version1;

/**
 * @author WeiJi
 *
 */
public class Student extends Person{
/**大一 */
private final int FRESH = 1;
/**大二 */
private final int SOPHMORE = 2;
/**大三 */
private final int JUNIR = 3;
/** 大四*/
private final int SENIR = 4;

/**无参数构造方法 */
Student (){}
/**四参数构造方法 */
Student (String name, String address, String phoneNum, String e_Mail) {
	super(name, address, phoneNum, e_Mail);
}

/** 
 * 重载toString
 * @return Student 人名
 */
@Override
public String toString() {
	return "Student" + this.getName();
}
}
