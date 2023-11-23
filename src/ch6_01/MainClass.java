package ch6_01;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu1 = new Student(); // student 클라스로 새로운 객체를 찍겠다.
		// Student 클래스로 객체가 선언(Student틀로 찍어낸다)
		// ram(메모리)에 stu1(객체)이 생성
		// stu1 안에 변수들(공간) 생성
		// stu1(참조타입변수(객체), stu1저장된주소값갖고있음)
		
		stu1.name = "홍길동";
		stu1.age = 10;
		
		Student stu2 = new Student(); // 또 만들수 있다.
		
		stu2.age = 20;
		stu2.name = "김유신";
		
		Car car1 = new Car();
		System.out.println(car1.speed);
		car1.printSpeed();  // 호출 
		System.out.println(car1.speed); 
	}

}
