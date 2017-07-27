
package version1;

import java.util.*;
/**
 * 
 * @author weiji
 *产生随机的人名、地名、邮箱、Email
 *局限17个以内
 */
public class RandomName {
	/**  随机人名*/
	static String[] listName = {"Fern ", "Alice", "Bunny", "Belle", "Estelle", "Jasmine", "Iris ", "Emily", 
		    "Ailsa", "Aimee", "Beata", "Beatrice", "Becky", "Betty", "Carina", "Daisy"};
	/**  随机人名list1*/
	static ArrayList<String> list1 = new ArrayList<>(Arrays.asList(listName));
	/** 随机地址*/
	static String[] listAddress = {"Birmingham	伯明翰", "Montgomery	蒙哥马利","Mobile	莫比尔县","Anniston	安尼斯顿",
								       "Gadsden	加兹登", "Phoenix	凤凰城" ,"Scottsdale	斯科茨代尔" , 	"Tempe	坦佩" , 
								       	"Buckeye 巴克艾" , "Chandler	钱德勒" , "ElDorado	埃尔拉多" , "Jonesboro	琼斯伯勒" , 
								       	"PaineBluff	潘恩崖" , "LittleRock	小石城" , "Fayetteville   " , 
								       	"FortSmith	史密斯堡" , 
										"MileHouse	英哩议院" };
	/** 随机地址list2*/
	static ArrayList<String> list2 = new ArrayList<>(Arrays.asList(listAddress));
	/**  随机电话*/
	static String[] listPhoneNum  = {"4008-895-543" , "1118543432" ,  "4008-111-111" ,  "021-69777888" , 
									     "021-39777777" ,  "021-39207888" ,  "021-67662333" ,  "021-62963636" , 
										 "4008822168" ,  "4008305555" , "4006789000" , "95572000324" , 
										 "021-69781999" ,  "4008-208-388" , "4008-861-888" ,  "4008-108-000" , 
										 "4008-000-222" };
	/** 随机地址电话list3*/
	static ArrayList<String> list3 = new ArrayList<>(Arrays.asList(listPhoneNum));
	/**  随机eMail*/
	static String[] listeMail  = {"530180782@qq.com ", "243678025@qq.com "	, "398018489@qq.com ", 
			"595064131@qq.com ", "362483245@qq.com ", "285340035@qq.com "	, "448280012@qq.com ", 
			"452779373@qq.com ", "1043553227@qq.com "	, "554003572@qq.com ", "1158658706@qq.com ", 
			"535603525@qq.com ", "327526091@qq.com ", "491163631@qq.com", " 404127680@qq.com ",
			"610363953@qq.com ", "530413323@qq.com" };
	/** 随机eMail list4*/
	static ArrayList<String> list4 = new ArrayList<>(Arrays.asList(listeMail));
	
	/**
	 * @param args
	 */
	
	/**
	 * 可以重复调用产生产生16个以内的随机人名
	 * @return name
	 */
	public static String randomName() {
		
		Collections.shuffle(list1);
		String temp = list1.get(0);
		list1.remove(0);
		return temp;
	}
	/**
	 * 可以重复调用产生产生16个以内的随机地址
	 * @return name
	 */
	public static String randomAddress() {
		
		Collections.shuffle(list2);
		String temp = list2.get(0);
		list2.remove(0);
		return temp;
	}
	/**
	 * 可以重复调用产生产生16个以内的随机电话号码
	 * @return name
	 */
	public static String randomPhoneNum() {
		
		Collections.shuffle(list3);
		String temp = list3.get(0);
		list3.remove(0);
		return temp;
	}
	
	/**
	 * 可以重复调用产生产生16个以内的随机eMail
	 * @return name
	 */
	public static String randomEmail() {
		
		Collections.shuffle(list4);
		String temp = list4.get(0);
		list4.remove(0);
		return temp;
	}
	

}
