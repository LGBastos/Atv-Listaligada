import java.util.Scanner;
public class RevisãoArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inteiros = new int[10];
		
		for(int i =0 ; i<10 ; i++) {
			inteiros[i] = sc.nextInt();
		}
		for(int i =0 ; i<10 ; i++) {
			System.out.println( inteiros[i]);
		}
	}
}
