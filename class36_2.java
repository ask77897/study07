package project07;

public class class36_2 extends class36_1{
	String ex1;
	String ex2;
	
	class36_2(String type, String name, int age){
		super(type,name, age);
	}
	class36_2(String type, String name){
		super(type, name);
	}
	class36_2(String type, String name, int age,String ex1, String ex2){
		super(type,name, age);
		this.ex1 = ex1;
		this.ex2 = ex2;
	}
	class36_2(String type, String name,String ex1, String ex2){
		super(type,name);
		this.ex1 = ex1;
		this.ex2 = ex2;
	}
	class36_2(String type, String name, String ex1){
		super(type,name);
		this.ex1 = ex1;
	}
	
	void play(String name) {
		System.out.println(this.name+"이(가) "+name+"와(과) 놉니다.");
	}
	
	
	
}
