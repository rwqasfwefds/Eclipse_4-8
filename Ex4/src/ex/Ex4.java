package ex;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ex4_1
//		int score = 80;
//		
//		if(score > 60) {
//			System.out.println("합격입니다.");
//		}
		
//		Ex4_2
//		int x = 0;
//		System.out.printf("x = %d 일 때, 참인 것은 %n", x);
//		
//		if(x == 0) System.out.println("x == 0");
//		if(x != 0) System.out.println("x != 0");
//		if(!(x == 0)) System.out.println("! (x == 0)");
//		if(!(x != 0)) System.out.println("! (x != 0)");
//		
//		x = 1;
//		System.out.printf("x = %d 일 때, 참인 것은%n", x);
//		
//		if(x == 0) System.out.println("x == 0");
//		if(x != 0) System.out.println("x != 0");
//		if(!(x == 0)) System.out.println("!(x == 0)");
//		if(!(x != 0)) System.out.println("!(x != 0)");
		
//		Ex4_3
//		System.out.print("숫자를 하나 입력하세요.>");
//		Scanner scanner = new Scanner(System.in);
//		int input = scanner.nextInt();
//		
//		if(input == 0) {
//			System.out.println("입력하신 숫자는 0입니다.");
//		} else {
//			System.out.println("입력하신 숫자는 0이 아닙니다.");
//		}
		
//		Ex4_4
//		int score = 0;
//		char grade = ' ';
//		
//		System.out.print("점수를 입력하세요.>");
//		Scanner scanner = new Scanner(System.in);
//		score = scanner.nextInt();
//		
//		if(score >= 90) {
//			grade = 'A';
//		} else if(score >= 80) {
//			grade = 'B';
//		} else if(score >= 70) {
//			grade = 'C';
//		} else {
//			grade = 'D';
//		}
//		System.out.println("당신의 학점은 " + grade + "입니다.");
		
//		Ex4_5
		
//		int score = 0;
//		char grade = ' ', opt = '0';
//		
//		System.out.print("점수를 입력해주세요.>");
//		
//		Scanner scanner = new Scanner(System.in);
//		score = scanner.nextInt();
//		
//		System.out.printf("당신의 점수는 %d입니다.%n", score);
//		
//		if(score >= 90) {
//			grade = 'A';
//			if(score >= 98) {
//				opt = '+';
//			} else if(score < 94) {
//				opt = '-';
//			}
//		} else if(score >= 80) {
//			grade = 'B';
//			if(score >= 88) {
//				opt = '+';
//			} else if(score < 84) {
//				opt = '-';
//			}
//		} else {
//			grade = 'C';
//		}
//		System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
		
//		Ex4_6
//		System.out.print("현재 월을 입력하세요.>");
//		
//		Scanner scanner = new Scanner(System.in);
//		int month = scanner.nextInt();
//		
//		switch(month) {
//		case 3:
//		case 4:
//		case 5:
//			System.out.println("현재의 계절은 봄입니다.");
//			break;
//		case 6: case 7: case 8:
//			System.out.println("현재의 계절은 여름입니다.");
//			break;
//		case 9: case 10: case 11:
//			System.out.println("현재의 계절은 가을입니다.");
//			break;
//		default:
//			System.out.println("현재의 계절은 겨울입니다.");
//		}
		
//		Ex4_7
//		int num = 0;
//		
//		for(int i = 1; i <= 5; i++) {
//			num = (int)(Math.random() * 6) + 1;
//			System.out.println(num);
//		}
		
//		Ex4_8
//		for(int i = 1; i <= 3; i++) {
//			System.out.println("Hello");
//		}
		
//		Ex4_9
//		for(int i = 1; i <= 5; i++)
//			System.out.println(i);
//				
//		for(int i = 1; i <= 5; i++)
//			System.out.print(i);
//		
//		System.out.println();
		
//		Ex4_10
//		int sum = 0;
//		
//		for(int i = 1; i <= 5; i++) {
//			sum += i;
//			System.out.printf("1부터 %2d 까지의 합 : %2d%n", i, sum);
//		}
		
//		Ex4_11
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		Ex4_12
//		int i = 5;
//		
//		while(i-- != 0) {
//			System.out.println(i + " - I can do it.");
//		}
		
//		Ex4_13
//		int sum = 0;
//		int i = 0;
//		
//		while(sum <= 100) {
//			System.out.printf("%d - %d%n", i, sum);
//			sum += ++i;
//		}
		
//		Ex4_14
//		int num = 0, sum = 0;
//		System.out.print("숫자를 입력하세요.(예 : 12345)>");
//		
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine();
//		num = Integer.parseInt(tmp);
//		
//		while(num != 0) {
//			sum += num % 10;
//			System.out.printf("sum = %3d num = %d%n", sum, num);
//			
//			num /= 10;
//		}
//		System.out.println("각 자리수의 합 : " + sum);
		
//		Ex4_15
//		int input = 0, answer = 0;
//		
//		answer = (int)(Math.random() * 100) + 1;
//		Scanner scanner = new Scanner(System.in);
//		
//		do {
//			System.out.print("1과 100사이의 정수를 입력하세요.>");
//			input = scanner.nextInt();
//			
//			if(input > answer) {
//				System.out.println("더 작은 수로 다시 시도해보세요.");
//			} else if(input < answer) {
//				System.out.println("더 큰 수로 다시 시도해보세요.");
//			}
//		} while(input != answer);
//		System.out.println("정답 입니다.");
		
//		Ex4_16
//		int sum = 0;
//		int i = 0;
//		
//		while(true) {
//			if(sum > 100)
//				break;
//			++i;
//			sum += i;
//		}
//		System.out.println("i = " + i);
//		System.out.println("sum = " + sum);
		
//		Ex4_17
//		for(int i = 0; i <= 10; i++) {
//			if(i % 3 == 0)
//				continue;
//			System.out.println(i);
//		}
		
//		Ex4_18
//		int menu = 0;
//		int num = 0;
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("1() square");
//			System.out.println("2() square root");
//			System.out.println("(3) log");
//			System.out.println("원하는 메뉴(1~3)를 선택하세요.(종료:0)>");
//			
//			String tmp = scanner.nextLine();
//			menu = Integer.parseInt(tmp);
//			
//			if(menu == 0) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			} else if(!(1 <= menu && menu <= 3)) {
//				System.out.println("메뉴를 잘못 선택하셨습니다.(죵료는 0)");
//				continue;
//			}
//			System.out.println("선택하신 메뉴는 " + menu + "번입니다.");
//		}
		
//		Ex4_19
//		Loop1 : for(int i = 2; i <= 9; i++) {
//			for(int j = 1; j <= 9; j++) {
//				if(j == 5)
//					break Loop1;
//				System.out.println(i + "*" + j + "=" + i*j);
//			}
//			System.out.println();
//		}
		
//		연습문제 4-2
//		int sum = 0;
//		
//		for(int i = 1; i <= 20; i++) {
//			if(i % 2 != 0 && i % 3 != 0)
//			sum += i;
//		}
//		System.out.println(sum);
		
//		연습문제 4-3
//		int sum = 0;
//		
//		for(int i = 1; i <= 10; i++) {
//			for(int j = 1; j <= i; j++) {
//				sum += j;
//			}
//		}
//		System.out.println(sum);
		
//		답
//		부분합 / 총합 계산
//		int sum = 0;
//		int totalsum = 0;
//		
//		for(int i = 1; i <= 10; i++) {
////			1st 부분 합
//			sum = sum + i;
////			2st 부분 합을 다 더한 총합
//			totalsum = totalsum + sum;
////			로깅 디버깅 방법
////			System.out.println("i = " + i);
////			System.out.println("sum = " + sum);
////			System.out.println("totalsum = " + totalsum);
//		}
//		System.out.println("totalsum = " + totalsum);
		
//		연습문제 4-4
//		답
//		int sum = 0; // 총합을 저장할 변수
//		int s = 1; // 값의 부호를 바꿔주는 변수
//		int num = 0; // 총 몇번 계산했는지 카운트 하는 변수
//		int i = 1; // while문 카운트 변수
//		
//		while(true) {
////			탈출 조건 sum >= 100 보다 커지면
//			if(sum >= 100) {
//				break;
//			}
//			num = s * i;
////			짝수마다 음수로 바꿔주기
//			s = -s;
////			누적합(양수 + 음수) >= 100 탈출
//			sum = sum + num;
//			i++;
//		}
//		System.out.println("num = " + num);
//		System.out.println("sum = " + sum);
		
//		연습문제 4-5
//		int i = 0;
//		while(i <= 10) {
//			int j = 0;
//			while(j <= i) {
//				j++;
//				System.out.print("*");
//			}
//			i++;
//			System.out.println();
//		}
		
//		연습문제 4-6
//		for(int i = 1; i <= 6; i++) {
//			for(int j = 1; j <= 6; j++) {
//				if((i + j) == 6) {
//					System.out.println(i + "+" + j);
//				}
//			}
//		}
		
//		연습문제 4-7
//		String str = "12345";
//		int sum = 0;
//		
//		for(int i = 0; i < str.length(); i++) {
//			sum += str.charAt(i) - '0'; // i = 0이라고 가정, '1' - '0' = 1(아스키 코드)
//		}
//		System.out.println("sum = " + sum);
		
//		연습문제 4-8
//		int value = ((int)(Math.random() * 6) + 1);
//		
//		System.out.println("value : " + value);
		
//		연습문제 4-9
//		int num = 12345;
//		int sum = 0;
//		
//		int number = num % 10;
//		int ten = (num / 10) % 10;
//		int hun = (num / 100) % 10;
//		int tho = (num / 1000) % 10;
//		int mil = (num / 10000);
//		
//		sum = number + ten + hun + tho + mil;
//		System.out.println("sum = " + sum);
		
//		답
//		int num = 12345;
//		int sum = 0;
//		
////		나머지 연산자를 이용해서 계산하는 방법
////		num		num/10	  num%10
////		12345	1234	  5
////		1234	123		  5
////		123		12		  5
////		12		1		  5
////		1		0		  5
//		while(num > 0) {
////			나머지 연산 자리수 자르고 누적합을 구함
//			sum = sum + (num % 10);
////			num / 10 값을 반복
//			num = num / 10;
//		}
//		System.out.println("sum = " + sum);
		
//		연습문제 4-10
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0;
		int count = 0;
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			input = s.nextInt();
			
			if(answer > input) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if(answer < input) {
				System.out.println("더 작은 수를 입력하세요.");
			} else {
				System.out.println("정답이다 이 씨발롬아");
				System.out.println("시도 횟수는 " + count + "임");
				break;
			}
		} while(true);
		
	}
}
