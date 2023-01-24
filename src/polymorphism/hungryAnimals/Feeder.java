package polymorphism.hungryAnimals;

public class Feeder {

	public void feeding(Animals animals) {
		animals.eat();
		
	}
	public void noFeeding(Animals animals) {
		animals.noEat();
	}
	
}
