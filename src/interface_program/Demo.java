package interface_program;



interface PrintDemo{
	
	public static void hello() {
		
		System.out.println("called from PrintDemo");
	}
}
public class Demo implements PrintDemo {
	public static void main(String[] args) {
		
		PrintDemo demo = new Demo();
		PrintDemo.hello();
	}
	

}
