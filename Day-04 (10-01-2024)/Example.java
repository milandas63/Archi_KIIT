
public class Example {
	int age;
	byte b;
	double amount;
	boolean yesNo;
	String name;
	
	public void func() {
		System.out.println(name+" "+yesNo+" "+amount);
	}
	
	public static void main(String[] args) {
		new Example().func();
		byte b = 127;
		short s = 10;
		int i = 100;
		long l = 2147483648L;
		
		float f = 22.45F;
		float f1 = 34544339456554444553333333334444595944.50F;
		double d = 3454433945655444455333333333444444595944.50;
		
		String name = "Archi";
		
		int n = 747;
		System.out.println(n);
		
		String[] students = {"Archi","Milan","Deepak","Santosh","Okay"};
		for(String str:students) {
			System.out.println(str);
		}

		int[] num = {234,567,789,2121,45,220};
		for(int q:num) {
			System.out.print(q+" ");
		}
		System.out.println();
	}
}

