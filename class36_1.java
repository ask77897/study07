package project07;

public class class36_1 {
	String type;
	String name;
	int age;
	
	class36_1(String type){
		this.type = type;
	}
	class36_1(String type, String name){
		this.type = type;
		this.name = name;
	}
	class36_1(String name, int age){
		this.name = name;
		this.age = age;
	}
	class36_1(String type, String name, int age){
		this.type = type;
		this.name = name;
		this.age = age;
	}
	
	void type() {
		System.out.println(type+"과 입니다.");
	}
	void walk() {
		System.out.println(name+"이(가) 걸어갑니다.");
	}
	void eat() {
		System.out.println(name+ "이(가) 먹습니다.");
	}
	void sleep() {
		System.out.println(name+ "이(가) 잠을 잡니다.");
	}
}
