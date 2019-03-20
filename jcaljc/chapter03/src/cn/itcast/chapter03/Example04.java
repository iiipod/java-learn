package cn.itcast.chapter03;

class Student04 {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String stuName) {
		name = stuName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int stuAge) {
		if (stuAge <= 0) {
			System.out.println("对不起,您输入的年龄不合法...");
		} else {
			age = stuAge;
		}
	}
	
	public void introduce() {
		System.out.println("大家好,我叫" + name +",我今年" + age + "岁!");
	}
}
public class Example04 {

	public static void main(String[] args) {
		Student04 stu = new Student04();
		stu.setName("韩强");
		stu.setAge(-40);
		stu.introduce();
	}
}
