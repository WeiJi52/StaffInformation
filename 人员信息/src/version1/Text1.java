package version1;

import java.util.Scanner;

public class Text1 {
	/** 随机数  为0产生 Person 类 */
	private static final int NEWPERSON = 0;
	/** 随机数  为1产生 Student 类 */
	private static final int NEWSTUDENT = 1;
	/** 随机数  为2产生Employee 类 */
	private static final int NEWEMPLOYEE = 2;
	/** 随机数  为3产生 Faculty 类 */
	private static final int NEWFACULTY = 3;
	/** 随机数  为4产生 Staff 类 */
	private static final int STAFF = 4;
	public static void main(String[] args) {
		Object[] o = createSomeObject();   // 创建对象
		printMessage(o);     // 打印信息
		

	}
	
	/**
	 * 随机产生不同对象
	 * @return 几个Object
	 */
	public static Object[]  createSomeObject() {
		// Construct a Scanner 
		Scanner input = new Scanner(System.in);
		
		System.out.print("产生多少个对象：(16个以内): ");
		int numOfObject = input.nextInt();   // 接收产生对象的数目
		input.close();
		
		int randomNum  = 0;  // 随机数
		// 产生一些Object 对象
		
		// Construct a Object[] 
		Object []o = new Object[numOfObject];   // 转载各种对象的Object
		for(int i = 0; i < numOfObject; i++) {
			randomNum = (int) (Math.random() * 5);
			
			if (randomNum == NEWPERSON) {  // 产生 Person 类
				o[i] = CreateObject.createPerson();
			}
			if (randomNum == NEWSTUDENT) { // 产生 Student类
				o[i] = CreateObject.createStudent();
			}
			if (randomNum == NEWEMPLOYEE) { // 产生Employee 类
				o[i] = CreateObject.createEmployee();
			}
			if (randomNum == NEWFACULTY) { // 产生 Faculty 类
				o[i] = CreateObject.creatFaculty();
			}
			if (randomNum == STAFF) {     // 产生 Staff 类
				o[i] = CreateObject.creatStaff();
			}
		}
		return o;
	}
	/**
	 * show all kinds of object about Object[]
	 * @param Object[] 
	 */
	public static void printMessage(Object[] o) {
		
			for(int i = 0; i < o.length; i++) {
				if (o[i] instanceof Staff) {
					ShowObjectInformation.showStaff(o[i]);
				}  else
				if (o[i] instanceof Faculty) {
					ShowObjectInformation.showFculty(o[i]);
				}  else
				
				if (o[i] instanceof Student) {
					ShowObjectInformation.showStudent(o[i]);
				}  else
				if (o[i] instanceof Employee) {
					ShowObjectInformation.showEmployee(o[i]);
				}  else
				if (o[i] instanceof Person) {
					ShowObjectInformation.showPerson(o[i]);
				}
			
			}
	
}
}
