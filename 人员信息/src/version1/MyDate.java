/**
 * 
 */
package version1;

/**
 * @author WeiJi
 *
 */
public class MyDate {
/** ��*/
private int year;
/** ��*/
private int month;
/** ��*/
private int day;
/** �޲����Ĺ��췽��*/
MyDate (){}
/**�в����Ĺ��췽�� */
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
	return year + "  ��  " + month + "  ��     " + day + " ��\t";
}
}
