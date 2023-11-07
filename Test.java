public class Test {
	
	public void printOne(String s) {
		this.printTwo(s, 15);
	}
	
	public void printTwo(String s, int i) {
		System.out.println(s);
		System.out.println(i);
	}
}