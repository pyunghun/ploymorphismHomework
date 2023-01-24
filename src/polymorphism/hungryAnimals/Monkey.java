package polymorphism.hungryAnimals;

public class Monkey extends Animals {

	@Override
	public void eat() {
		System.out.println("원숭이가 가슴을 치며 행복하게 사료를 먹습니다.");
	}
	@Override
	public void noEat() {
		System.out.println("원숭이가 돌멩이를 던지며 사료를 내놓으라고 협박합니다.");
	}
}
