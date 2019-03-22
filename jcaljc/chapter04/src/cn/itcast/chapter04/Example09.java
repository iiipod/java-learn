package cn.itcast.chapter04;

class Student {
//	final String name;
	final String name = "韩强";
	
	public void introduce() {
		System.out.println("我叫" + name + ", 是传智播客的学生");
	}

}

public class Example09 {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.introduce();
	}

}
