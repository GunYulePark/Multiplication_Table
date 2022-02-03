//import java.util.Scanner; // scanner import 필요
//

public class Multiplication_Main {
	
//	public static void main(String[] args) {
////		// System.in을 사용하여 키보드 입력 값을 읽고 원하는 타입으로 변환하여 리턴한다.
////		Scanner scan=new Scanner(System.in); // Scanner 객체 // System.in <-> System.out
////		boolean flag=false; // 출력됐음을 나타내는 flag
////		int[] result_array=new int[9];
////		while(flag==false) {
////			int result=scan.nextInt(); // scanner의 메소드 중 nextInt(): 다음 토큰을 int 타입으로 리턴
////			// for문 활용
////			if(result<2 || result>9) {
////				System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
////			} else {
////				for(int i=0; i<9; i++) { // java의 for문은 처음, 끝이 아주 직관적
////					result_array[i]=(i+1)*result;
////					System.out.println(result+"*"+(i+1)+"="+result_array[i]);
////				flag=true;
////				}
////			}
////		}
//		
//		
//		// while문 활용
////		int i=1;
////		while(i<10) {
////			System.out.println(result+"*"+i+"="+result*i);
////			i++;
////		}
//		
//		int[] times2=new int[9];
//		for(int i=0; i<times2.length; i++) {
//			times2[i]=2*(i+1);
//		}
//		for(int i=0; i<times2.length; i++) {
//			System.out.println(times2[i]);
//		}
//		
//		int[] times3=new int[9];
//		for(int i=0; i<times3.length; i++) {
//			times3[i]=3*(i+1);
//		}
//		for(int i=0; i<times3.length; i++) {
//			System.out.println(times3[i]);
//		}
//		
//		int[] times4=new int[9];
//		for(int i=0; i<times4.length; i++) {
//			times4[i]=4*(i+1);
//		}
//		for(int i=0; i<times4.length; i++) {
//			System.out.println(times4[i]);
//		}
//		
//	}
	// 구구단 계산 결과를 배열에 담는 로직을 새로운 메소드로 분리

	public static void main(String[] args) {
		for(int j=2; j<10; j++) {
			int[] result=Multiplication.calculate(j);
			Multiplication.print(result, j);
		}
	}
}
