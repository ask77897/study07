package project07;

public class test03_Korean extends test03_Restaurant{
	String soju;
	
	test03_Korean(){
		super("한국","김치");
	}
	
	test03_Korean(String menu){
		super("한국",menu);
	}
	
	test03_Korean(String menu, String soju){
		super("한국", menu);
		this.soju = soju;
	}
	
	test03_Korean(String nation, String menu, String soju){
		super(nation, menu);
		this.soju = soju;
	}
	test03_Korean(test03_Restaurant res, String soju){
		super(res.nation, res.menu);
		this.soju = soju;
	}
	void printsoju() {
		super.printMenu();
		System.out.println("음식과 어울리는 술은 "+ soju+ "을(를) 추천드립니다.");
	}
		
	
}
