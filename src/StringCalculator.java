import java.util.Scanner;

public class StringCalculator {
	public static int Add(String numbers) {
		if(numbers.length()==0) {
			return 0;
		}else if(numbers.contains(",")) {
			String[] nos = numbers.split(",");
			return Integer.parseInt(nos[0])+Integer.parseInt(nos[1]);
		}
		return Integer.parseInt(numbers);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(Add(s));
	}
}
