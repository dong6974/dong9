
public class Ex01 {

	public static void main(String[] args) {
		//3 ) �Լ����� �Է�(O), ���(O)
		
		int n= 5;
		int n2 = 10;
		
		System.out.println("main() �Լ�!!");
		
		int result = sub(n, n2);  //�Լ� ȣ��  -->���ڰ�
		
		System.out.println("��� ���� " +result);
	}
		
	public static int  sub(int n, int n2) { //--> �Ű�����
		
		System.out.println("sub() �Լ�...");
		
		return n*n2;
	   }
}
