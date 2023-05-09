package mc_interview_codes;

public class MCTest {

	public static int disp() {
		try {
			System.out.println("try");
			throw new ArithmeticException();	
		}catch(Exception e) {
			System.out.println("catch");
			return 0;
		}finally {	
			System.out.println("finally");
		}
	 }
		
	public static void main(String arg[]) {		
			System.out.println("Main");
			System.out.println(disp());
	}
}
