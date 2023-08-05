package project07;

public class class36_4 extends class36_2{
	
	
	class36_4(String type, String name, int age){
		super(type, name, age);
	}
	class36_4(String type, String name, String ex1){
		super(type, name, ex1);
		
	}
	class36_4(String type, String name, String ex1, String ex2){
		super(type, name, ex1, ex2);
		
	}
	class36_4(String type, String name, int age, String ex1, String ex2){
		super(type, name, age, ex1, ex2);
	}
	
	void ex1() {
		System.out.println(name+"이(가) "+ex1+"을(를) 하며 놉니다.");
	}
	void ex2() {
		System.out.println(name+"이(가) 경계를 합니다. "+ex2);
	}
	void speak() {
		System.out.println("얘는 "+name+"이고, "+age+"살이야.");
	}
	
	
	
	
}
