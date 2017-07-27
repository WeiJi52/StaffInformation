/**
 * 
 */
package version1;

/**
 * @author WeiJi
 *
 */
public class MyDate {
/** 年*/
private int year;
/** 月*/
private int month;
/** 日*/
private int day;
/** 无参数的构造方法*/
MyDate (){}
/**有参数的构造方法 */
MyDate (int year, int month, int day) {
	this.setYear(year);
	this.setMonth(month);
	this.setDay(day);
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
}
public int getDay() {
	return day;
}
public void setDay(int day) {
	this.day = day;
}
public String toString() {
	return year + "  年  " + month + "  月     " + day + " 日\t";
}
}
