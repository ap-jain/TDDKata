import java.util.Scanner;

public class StringCalculator {
	public static int Add(String numbers) {
		if(numbers.length()==0) {
			return 0;
		}else if(numbers.contains(",")||numbers.contains("\\n")) {
			String[] nos = numbers.split(",|\\\\n");			
			int s = 0;
			for(int i=0;i<nos.length;i++) {
				s+=Integer.parseInt(nos[i]);
				
			}
			return s;
		}
		return Integer.parseInt(numbers);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(Add(s));
	}
}
