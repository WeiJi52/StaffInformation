
package version1;

import java.util.*;
/**
 * 
 * @author weiji
 *������������������������䡢Email
 *����17������
 */
public class RandomName {
	/**  �������*/
	static String[] listName = {"Fern ", "Alice", "Bunny", "Belle", "Estelle", "Jasmine", "Iris ", "Emily", 
		    "Ailsa", "Aimee", "Beata", "Beatrice", "Becky", "Betty", "Carina", "Daisy"};
	/**  �������list1*/
	static ArrayList<String> list1 = new ArrayList<>(Arrays.asList(listName));
	/** �����ַ*/
	static String[] listAddress = {"Birmingham	������", "Montgomery	�ɸ�����","Mobile	Ī�ȶ���","Anniston	����˹��",
								       "Gadsden	���ȵ�", "Phoenix	��˳�" ,"Scottsdale	˹�ƴĴ���" , 	"Tempe	̹��" , 
								       	"Buckeye �Ϳ˰�" , "Chandler	Ǯ����" , "ElDorado	��������" , "Jonesboro	��˹����" , 
								       	"PaineBluff	�˶���" , "LittleRock	Сʯ��" , "Fayetteville   " , 
								       	"FortSmith	ʷ��˹��" , 
										"MileHouse	Ӣ����Ժ" };
	/** �����ַlist2*/
	static ArrayList<String> list2 = new ArrayList<>(Arrays.asList(listAddress));
	/**  ����绰*/
	static String[] listPhoneNum  = {"4008-895-543" , "1118543432" ,  "4008-111-111" ,  "021-69777888" , 
									     "021-39777777" ,  "021-39207888" ,  "021-67662333" ,  "021-62963636" , 
										 "4008822168" ,  "4008305555" , "4006789000" , "95572000324" , 
										 "021-69781999" ,  "4008-208-388" , "4008-861-888" ,  "4008-108-000" , 
										 "4008-000-222" };
	/** �����ַ�绰list3*/
	static ArrayList<String> list3 = new ArrayList<>(Arrays.asList(listPhoneNum));
	/**  ���eMail*/
	static String[] listeMail  = {"530180782@qq.com ", "243678025@qq.com "	, "398018489@qq.com ", 
			"595064131@qq.com ", "362483245@qq.com ", "285340035@qq.com "	, "448280012@qq.com ", 
			"452779373@qq.com ", "1043553227@qq.com "	, "554003572@qq.com ", "1158658706@qq.com ", 
			"535603525@qq.com ", "327526091@qq.com ", "491163631@qq.com", " 404127680@qq.com ",
			"610363953@qq.com ", "530413323@qq.com" };
	/** ���eMail list4*/
	static ArrayList<String> list4 = new ArrayList<>(Arrays.asList(listeMail));
	
	/**
	 * @param args
	 */
	
	/**
	 * �����ظ����ò�������16�����ڵ��������
	 * @return name
	 */
	public static String randomName() {
		
		Collections.shuffle(list1);
		String temp = list1.get(0);
		list1.remove(0);
		return temp;
	}
	/**
	 * �����ظ����ò�������16�����ڵ������ַ
	 * @return name
	 */
	public static String randomAddress() {
		
		Collections.shuffle(list2);
		String temp = list2.get(0);
		list2.remove(0);
		return temp;
	}
	/**
	 * �����ظ����ò�������16�����ڵ�����绰����
	 * @return name
	 */
	public static String randomPhoneNum() {
		
		Collections.shuffle(list3);
		String temp = list3.get(0);
		list3.remove(0);
		return temp;
	}
	
	/**
	 * �����ظ����ò�������16�����ڵ����eMail
	 * @return name
	 */
	public static String randomEmail() {
		
		Collections.shuffle(list4);
		String temp = list4.get(0);
		list4.remove(0);
		return temp;
	}
	

}
