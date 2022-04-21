import java.util.*;
public class Ex0 {

	public static void main(String[] args) {
		
		int num =0;
	
//		for(int i=2; i<=9; i++) {  
//			for(int j=1; j<=i; j++) { 
//		
//		System.out.printf("%d*%d=%d%n",i,j,i*j); 
//			}
//	}
//		for(int i=2; i<=9; i++) {
//
//			for(int j=1; j<=i; j++)  
//				System.out.println(i + " * " + j + " = " + i*j);
//				System.out.println("");
		
		System.out.println("*°¹¼öÃâ·Â:");
		Scanner scanner= new Scanner(System.in);
		String tmp = scanner.nextLine();
		num=Integer.parseInt(tmp);
		
		
		
		for(int i=0; i<num; i++) {
			for (int j=0 ; j<=i; j++) {
				System.out.println("*");
			}
				
			System.out.println();
				
		
}
}
}