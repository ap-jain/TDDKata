import java.util.Scanner;

public class StringCalculator {
	public static int Add(String numbers) throws Exception {
		char x = ' ';
		boolean skip = false;
		if(numbers.length()==0) {
			return 0;
		}
		if(numbers.startsWith("//")){
			x = numbers.charAt(2);			
			skip = true;
		}
		if(numbers.contains(",")||numbers.contains("\\n")) {
			String[] nos;
			if(skip) {
				nos =  numbers.substring(5).split(x+"|,|\\\\n");				
			}else {
			nos = numbers.split(",|\\\\n");	
			}
			int s = 0;
			for(int i=0;i<nos.length;i++) {				
				s+=Integer.parseInt(nos[i]);				
			}
			return s;
		}
		if(Integer.parseInt(numbers)<0) {
			throw new Exception("negatives not allowed"+numbers);
		}
		return Integer.parseInt(numbers);
		
	}
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(Add(s));
	}
}
