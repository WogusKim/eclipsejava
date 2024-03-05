/*
 * java 는 100% 상속구조
 * java 는 100% 객체지향언어 -> 무조건 객체를 사용. -> class
 * 
 * 시작과 끝을 담당하는 함수: main
 * 함수 => function => method. 모두 같음. c나 c++에선 펑션, 자바에선 메소드.
 * 
 * 
 */

/*
import java.util.Scanner ;
public class Hello {
	public static void main(String []args){
		
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt() ;
		
		System.out.print("사칙연산 입력 : ");
		String giho = sc.next() ;

		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt() ;
		
		if(giho.equals("+")) {
			System.out.println(num1+""+giho+""+num2+"="+(num1+num2));
		}else if(giho.equals("-")) {
			System.out.println(num1+""+giho+""+num2+"="+(num1-num2));
		}else if(giho.equals("*")) {
			System.out.println(num1+""+giho+""+num2+"="+(num1*num2));
		}else if(giho.equals("/")) {
			System.out.println(num1+""+giho+""+num2+"="+((double)num1/num2));
		}else {
			System.out.println("잘못된 입력");
		}
		sc.close();
	}
}

*/
/*
public class Hello {
	public static void main(String[] args) { // 프로그램을 시작해주고 끝내줌. 메인이 없으면 시작/끝이 없다.
		int i = 1;
		int count = 0;
		while(i<500) {
				i*=2;
				//i <<=1; 
				//연산속도를 올리기 위해 2진수로 쓸 수도 있다
				count++;
		}
		System.out.println(i);
		System.out.println(count);
	}
}
*/
/*
public class Hello {
	public static void main(String[] args) { // 프로그램을 시작해주고 끝내줌. 메인이 없으면 시작/끝이 없다.
		int j = 1;
		while(j<10) {
			int i = 2;
			while(i<10) {
				System.out.print(i+""+"*"+j+"="+(i*j)+"\t");
				i++;
			}
			System.out.println();
			j++;
		}
		
	}
}

"　"
" "

*/
/*
public class Hello {
	public static void main(String[] args) { // 프로그램을 시작해주고 끝내줌. 메인이 없으면 시작/끝이 없다.
		int i = 1;
		while (i < 4) {
			int j = 1;
			while (i >= j) {
				if (3 - j > 0) {
					System.out.print(" ");
				} else {
				}
				j++;
			}
			System.out.print("*");
			i++;
		}
		System.out.println();
	}
}
*/
/*
 3번
public class Hello {
	public static void main(String[] args) {
		int i = 1;
		int j = 3;
		for(i=1; i<4; i++) {
			for(j=3; j>=1; j--) {
				if(j>i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}

*/
/*
public class Hello {
	public static void main(String[] args) {
		int i = -4;
		int j = 4;
		for (i = -4; i < 5 && i < 5; i += 2) {
			if (i >= -4) {
				for (j = 0; j >= 0; j--) {
					if (j > i) {
						System.out.print(" ");
						j--;
					} else {
						System.out.print("*");
					}

				}
				System.out.println();
			} else {
				for (j = 4; j >= 0; j++) {
					if (j < i) {
						System.out.print(" ");
						j++;
					} else {
						System.out.print("*");
					}

				}
				System.out.println();
			}
		}
	}
}

*/

public class Hello {
	public static void main(String[] args) {
		int sc = 5;
		int i = 0;
		int j = 0;
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				if (i <= sc / 2) {
					if (sc / 2 - 1 >= i + j) {
						System.out.print(" ");
					} else if (sc / 2 + 1 <= j - i) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else if (i > sc / 2) {
					if (sc / 2 + 1 <= i - j) {
						System.out.print(" ");
					} else if (sc / 2 * 3 + 1 <= i + j) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			}System.out.println();
		}
	}
}




/*
 * 

최종장
import java.util.Scanner ;
public class Hello {
	public static void main(String []args){
		
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.print("홀수 입력 : ");
		int num1 = sc.nextInt() ;

	
	
	
	
	}
}

*/