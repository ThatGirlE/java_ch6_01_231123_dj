package ch6_01;

public class Car {

	int speed;  // 필드값은 초기화하지 않으면 기본값 0으로 초기화 / 필드, 멤버변수, 속성
	
	public void printSpeed(){
		int speed; // 이 변수는 필드가 아님 -> 메서드 또는 생성자 내에서는 필드를 선언할 수 없다. 
		this.speed = 10;  // 지역변수로 적용되서 this.하면 전역변수?로 다시 연결
		System.out.println(this.speed);
		
	}
	
}