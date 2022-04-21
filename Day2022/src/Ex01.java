
public class Ex01 {

	public static void main(String[] args) {
		//3 ) 함수에서 입력(O), 출력(O)
		
		int n= 5;
		int n2 = 10;
		
		System.out.println("main() 함수!!");
		
		int result = sub(n, n2);  //함수 호출  -->인자값
		
		System.out.println("결과 값은 " +result);
	}
		
	public static int  sub(int n, int n2) { //--> 매개변수
		
		System.out.println("sub() 함수...");
		
		return n*n2;
	   }
}
