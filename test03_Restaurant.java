package project07;

public class test03_Restaurant extends test03_Food{
	String menu;
	
	test03_Restaurant(){
		super();
		menu = "없음";
	}
	
	test03_Restaurant(String nation, String menu){
		super(nation);
		this.menu = menu;
	}
	
	void printMenu() {
		super.printNation();
		System.out.println("메인 메뉴는 "+menu+"입니다.");
		
	}
}
