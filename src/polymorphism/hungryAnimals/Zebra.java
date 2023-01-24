package polymorphism.hungryAnimals;

public class Zebra extends Animals {

	@Override
	public void eat() {
		System.out.println("얼룩말이 신나서 초원을 달리며 사료를 먹습니다.");
	}
	@Override
	public void noEat() {
		System.out.println("얼룩말이 달릴 힘을 잃고 주저 앉습니다.");
	}
}
