package project07;

public class class36_5 extends class36_2{
	
	
	class36_5(String type, String name){
		super(type, name);
	}
	class36_5(String type, String name, String ex1){
		super(type, name, ex1);
		
	}
	
	
	
	
	void speak() {
		System.out.println(ex1+" 하울링을 합니다.");
	}
	void hunt() {
		System.out.println(name+"이(가) 무리와 사냥을 합니다.");
	}
	void ch(String name) {
		System.out.println(this.name+"이(가) " +name+ "에게 도전합니다.");
	}
	
	
	
}
