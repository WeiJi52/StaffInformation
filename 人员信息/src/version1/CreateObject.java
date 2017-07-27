package version1;

public class CreateObject {


	/**
	 * 
	 * @return Person
	 */
	public static Object createPerson() {
		Person person = new Person(RandomName.randomName(),RandomName.randomAddress(),RandomName.randomPhoneNum(),
				RandomName.randomEmail());
		return person;
	}
	/**
	 * 
	 * @return student
	 */
	public static Object createStudent() {
		Student student = new Student(RandomName.randomName(),RandomName.randomAddress(),RandomName.randomPhoneNum(),
				RandomName.randomEmail());
		return student;
	}
	/**
	 * 
	 * @return Employee
	 */
	public static Object createEmployee() {
		MyDate date = new MyDate(((int)(Math.random() * 18) + 200),((int)(Math.random() * 12) + 1), ((int)(Math.random() * 28) + 1));
		return new Employee(RandomName.randomName(),RandomName.randomAddress(),RandomName.randomPhoneNum(),
				RandomName.randomEmail(), "d218","" + ((int)(Math.random()*4000) + 1000), date);
	}
	/**
	 * 
	 * @return Faculty
	 */
	public static Object creatFaculty() {
		MyDate date = new MyDate(((int)(Math.random() * 18) + 200),((int)(Math.random() * 12) + 1), ((int)(Math.random() * 28) + 1));
		return new Faculty(RandomName.randomName(),RandomName.randomAddress(),RandomName.randomPhoneNum(),
				RandomName.randomEmail(), "d218","" + ((int)(Math.random()*4000) + 1000), date, "8 - 12", ""+ (int)(Math.random() * 3) );
	}
	
	/**
	 * 
	 * @return Staff
	 */
	public static Object creatStaff() {
		MyDate date = new MyDate(((int)(Math.random() * 18) + 200),((int)(Math.random() * 12) + 1), ((int)(Math.random() * 28) + 1));
		return new Staff(RandomName.randomName(),RandomName.randomAddress(),RandomName.randomPhoneNum(),
				RandomName.randomEmail(), "d218","" + ((int)(Math.random()*4000) + 1000), date, "NO" );
	}
}