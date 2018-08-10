package kr.or.connect.DIexam01;

public class Car {
	Engine v8;
	
	public Car() {
		System.out.println("Car 생성자");
	}
	
	public void setEngine(Engine e) {
		this.v8 = e;
	}
	
	public void run() {
		System.out.println("run method 실행!!");
		v8.exec();
	}
}
