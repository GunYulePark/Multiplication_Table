
public class Multiplication_table {
	public static void main(String[] args) {
		// 2단
		System.out.println("2단 시작");
		for(int i=1; i<=9; ++i) { // java의 for문은 처음, 끝이 아주 직관적.
			System.out.println("2, "+i+"은(는)"+" "+2*i);
		}
		System.out.println();
		
		// 3단
		System.out.println("3단 시작");
		for(int i=1; i<=9; ++i) {
			System.out.println("3, "+i+"은(는)"+" "+3*i);
		}
		System.out.println();
	}

}
