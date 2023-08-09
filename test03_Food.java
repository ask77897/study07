package project07;

public class test03_Food {
	String nation;
	
	test03_Food(){
		nation = "없음";
	}
	
	test03_Food(String nation){
		this.nation = nation;
	}
	
	void printNation() {
		System.out.println(nation+"본토의 맛을 느낄 수 있습니다.");
		return;
	}
}
