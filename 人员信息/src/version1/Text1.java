package version1;

import java.util.Scanner;

public class Text1 {
	/** �����  Ϊ0���� Person �� */
	private static final int NEWPERSON = 0;
	/** �����  Ϊ1���� Student �� */
	private static final int NEWSTUDENT = 1;
	/** �����  Ϊ2����Employee �� */
	private static final int NEWEMPLOYEE = 2;
	/** �����  Ϊ3���� Faculty �� */
	private static final int NEWFACULTY = 3;
	/** �����  Ϊ4���� Staff �� */
	private static final int STAFF = 4;
	public static void main(String[] args) {
		Object[] o = createSomeObject();   // ��������
		printMessage(o);     // ��ӡ��Ϣ
		

	}
	
	/**
	 * ���������ͬ����
	 * @return ����Object
	 */
	public static Object[]  createSomeObject() {
		// Construct a Scanner 
		Scanner input = new Scanner(System.in);
		
		System.out.print("�������ٸ�����(16������): ");
		int numOfObject = input.nextInt();   // ���ղ����������Ŀ
		input.close();
		
		int randomNum  = 0;  // �����
		// ����һЩObject ����
		
		// Construct a Object[] 
		Object []o = new Object[numOfObject];   // ת�ظ��ֶ����Object
		for(int i = 0; i < numOfObject; i++) {
			randomNum = (int) (Math.random() * 5);
			
			if (randomNum == NEWPERSON) {  // ���� Person ��
				o[i] = CreateObject.createPerson();
			}
			if (randomNum == NEWSTUDENT) { // ���� Student��
				o[i] = CreateObject.createStudent();
			}
			if (randomNum == NEWEMPLOYEE) { // ����Employee ��
				o[i] = CreateObject.createEmployee();
			}
			if (randomNum == NEWFACULTY) { // ���� Faculty ��
				o[i] = CreateObject.creatFaculty();
			}
			if (randomNum == STAFF) {     // ���� Staff ��
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
