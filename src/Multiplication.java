
public class Multiplication {
	public static int[] calculate(int times) { // ()에 있는 건 argument.
		int[] result=new int[9];
		for(int i=0; i<result.length; i++) {
			result[i]=times*(i+1);
		}
		return result;
	}
	// 배열에 담은 데이터를 화면에 출력하는 로직을 메소드로 분리
	public static void print(int[] result, int j) {
		System.out.println(j+"단");
		for(int i=0; i<result.length; i++) {
			System.out.println(j+"*"+(i+1)+"="+result[i]);
		}
		System.out.println();
	}
}
