import java.util.Arrays;
import java.util.Scanner;

public class Testjava {

	public static void main(String[] args) {
		
		int fee = 2500;
		int age = input();
		double rate = feeCalcRate(age);
		output(age, fee, rate);		
	}
	
	static int input() {
		int age = 0;	
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�(0~100�� ���� �Է�) >> ");
		age = sc.nextInt();
		return age;
	}
	
		static double feeCalcRate(int age) {
			double rate = 0.0;
			
			if(age>=65)
				rate = 0;
			else if(age>=20)
				rate = 1;
			else if(age>=14)
				rate = 0.75;
			else if(age>=4)
				rate = 0.5;
			else if(age<4)
				rate = 0;
			else
				System.out.println("��Ȥ�� �� �Է� ���!!!");
			return rate;
		}
		
		static void output(int age,int fee, double rate) {
			System.out.println(age + "�� ����� " + (int)(fee*rate) + "��");
		}
}

	