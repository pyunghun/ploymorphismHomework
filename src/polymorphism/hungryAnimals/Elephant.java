package polymorphism.hungryAnimals;

public class Elephant extends Animals {

	@Override
	public void eat() {
		System.out.println("코끼리가 뿌~우 하면서 음식을 먹습니다.");
	}
	@Override
	public void noEat() {
		System.out.println("코끼리가 화가 나 나무를 부숩니다.");
	}
}
