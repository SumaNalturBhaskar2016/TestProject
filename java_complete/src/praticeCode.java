import java.util.Scanner;

public class praticeCode {
	public static void main(String[] args) {
		String s;
		int c = 0;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				c++;
			}
		}
    System.out.print(c);
	}

}