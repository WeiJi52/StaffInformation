/**
 * 
 */
package version1;


/**
 * @author WeiJi
 *
 */
public class Faculty extends Employee{
/**办公时间 */
private String officeHours;
private String rank;
/**Faculty无参数构造方法 */
Faculty () {}
/** Faculty的多参数的构造方法 */
Faculty (String name, String address, String phoneNum, String e_Mail, String office, String salary, 
	    MyDate hireDate, String officeHours, String rank) {
	super(name, address, phoneNum, e_Mail, office, salary, hireDate);
	this.setOfficeHours(officeHours);
	this.setRank(rank);
}

/** 
 * 重载toString
 * @return Faculty 人名
 */
@Override
public String toString() {
	return "Faculty" + this.getName();
}
public String getOfficeHours() {
	return officeHours;
}
public void setOfficeHours(String officeHours) {
	this.officeHours = officeHours;
}
public String getRank() {
	return rank;
}
public void setRank(String rank) {
	this.rank = rank;
}
}
