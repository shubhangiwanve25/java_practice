package mc_interview_codes;

public class MCTest2 {

	public static int disp() {
		try { System.out.println("try");
		throw new ArithmeticException();
		} catch (Exception e) {
			System.out.println("Catch");
			return 0;
		}finally {
			System.out.println("Finally");
		}
}
	public static void main(String []args){
		System.out.println("Main");
		System.out.println(disp());

	}

}
