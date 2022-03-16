package IOandArithmetic;

import java.util.Scanner;

public class AplusB {

	public static void main(String[] args) {
		/* 
		 - 문제
		 	두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 - 입력
		 	첫째 줄에 A와 B가 주어진다 (0<A, B<10)
		 - 출력
		 	첫째 줄에 A+B를 출력한다.
		*/

		int A = 0;
		int B = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("A 입력 : " );
		A = scan.nextInt();
		if(A<0) {
			System.out.println("0보다 큰 수를 입력하세요.");
			return;
		}
		System.out.println("B 입력 : " );
		B = scan.nextInt();
		if(10<B) {
			System.out.println("10보다 작은 수를 입력하세요");
			return;
		}
		
		System.out.println("결과 : " + (A+B));
	}

}

		// 제출 답안
		/* import java.util.Scanner;

		public class Main {

			public static void main(String[] args) {
				int A ;
				int B ;
				
				Scanner scan = new Scanner(System.in);
		
				A = scan.nextInt();
				B = scan.nextInt();
		
				System.out.println(A+B);
			}
	
		}
	*/
