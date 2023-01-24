package polymorphism.hungryAnimals;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		System.out.println("=================게임 설명==================");
		System.out.println("초원에 배고픔과 시달리는 동물 3마리가 있습니다");
		System.out.println("당신은 그들에게 먹을 것을 줄 수 있습니다.");
		System.out.println("당신은 먹을 것을 줄 수 있습니다.");
		System.out.println("동물들은 먹을 것이 모두 해결되어야 행복해집니다.");
		System.out.println("먹을 것을 먹지 못하면 부족하면 동물은 안타깝게도 자연으로 돌아갑니다.");
		System.out.println("==========================================");
		System.out.println("=============이제 게임을 시작합니다==============");
		System.out.println("==========================================");

		
		Scanner sc = new Scanner(System.in);
		System.out.print("당신은 먹이를 주는 사육사 입니다. 이름을 입력해주세요. : ");
		String name = sc.nextLine();
		
		System.out.println("드넓은 초원에 굶주린 코끼리, 원숭이, 얼룩말이 " + name + " 님을 보고 울부짖습니다.");
		System.out.println("코끼리 : 뿌우우우우우우~~~~~~~~~~~!");
		System.out.println("원숭이 : 우끾끽끼기기ㅣ끽ㄱ끽끼기기기ㅣㄱ끼");
		System.out.println("얼룩말 : 히이이이이이ㅣ잉히이잉~");
		
		
		Feeder feeder = new Feeder();
		
		
		
		
		Animals animals = null;
		boolean isChoose = true;
		
		while(true) {
			System.out.println("어떤 동물을 선택하실지 번호를 입력해주세요.");
			System.out.println("1. 코끼리 \t 2. 원숭이 \t 3. 얼룩말 \t 4. 선택 안 함.");
			int num = sc.nextInt();
		
			int num1 = 0;
		if(num != 4) {	
			System.out.println("먹이를 주겠습니까? 1. 준다 2. 안 준다");
			 num1 = sc.nextInt();
		}
		
		switch(num) {
		case 1 :
			animals = new Elephant();
			break;
		case 2 :
			animals = new Monkey();
			break;
		case 3 :
			animals = new Zebra();
			break;
		case 4 :
			isChoose = false;
			System.out.println("아무것도 선택하지 않았습니다. 동물들이 모두 굶주려 자연으로 돌아갔습니다.");
			break;
		}
		if(isChoose) {
			if(num1 == 1) {
				feeder.feeding(animals);
			} else {
				feeder.noFeeding(animals);
			}
		}else {
			break;
		}
		
	
		
	}	
	

}
}