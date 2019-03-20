package cn.itcast.chapter03;

class Student12 {
	static String schoolName;
}

public class Example12 {

	public static void main(String[] args) {
		Student12 stu1 = new Student12();
		Student12 stu2 = new Student12();
		Student12.schoolName = "传智播客";
		System.out.println("我的学校是" + Student12.schoolName);
		System.out.println("我的学校是" + stu1.schoolName);
		System.out.println("我的学校是" + stu2.schoolName);
	}

}
