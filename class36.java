package project07;

public class class36 {

	public static void main(String[] args) {
		class36_4 dog1 = new class36_4("개", "멍멍", 3);
		class36_4 dog2 = new class36_4("개", "왕왕", "땅파기", "왕왕왕");
		class36_4 dog3 = new class36_4("개", "월월", 4, "공놀이", "으르렁");

		dog1.type(); dog1.walk(); dog1.eat(); dog1.sleep(); dog1.speak();
		dog2.type(); dog2.ex1(); dog2.ex2(); dog2.play(dog3.name);
		dog3.type(); dog3.ex1(); dog3.ex2(); dog3.play(dog1.name);
		
		
		class36_5 wolf1 = new class36_5("개", "우두머리", "아우우우");
		class36_5 wolf2 = new class36_5("개", "늑대1", "아우우");
		class36_5 wolf3 = new class36_5("개", "늑대2", "우우우우");
		
		wolf1.type(); wolf1.walk(); wolf1.eat(); wolf1.sleep(); wolf1.speak(); wolf1.hunt();
		wolf2.type(); wolf2.speak(); wolf2.play(wolf3.name); wolf2.ch(wolf1.name);
		wolf3.type(); wolf3.speak(); wolf3.play(wolf2.name); wolf3.ch(wolf1.name);
	}

}
