public class Test {
	
	public void printOne(String s) {
		int i = 10;
		int j = 2 + 1;
		int z = 2;
		int k = i + j + z;
		this.printTwo(s, k);
	}
	
	public void printTwo(String s, int i) {
		System.out.println(s);
		System.out.println(i);
	}
}