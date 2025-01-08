class Hello {
	public static void main(String[] args) {
		String greet = "Hello Archi";
		System.out.println(greet);
		//for(int i=0; i<10; i=i+1) System.out.println("Hello Archi");
		for(int i=0; i<greet.length(); i++) System.out.print("-");
		System.out.println();
		System.out.println(greet.length());

		//	Reverse the content of greet
		for(int i=greet.length()-1; i>=0; i--)
			System.out.print(greet.charAt(i));
		System.out.println();

		int small = 25;
		int big = 52;
		if(small>big) {
			System.out.println(small+" is greater");
		} else {
			System.out.println(big+" is greater");
		}

		//	Multiplication Tables
		int n = 9;
		int m = 50;
		for(int k=n; k<=m; k+=5) {
			for(int i=1; i<=10; i++) {
				for(int j=k; j<=(k+4); j++) {
					if(j>m) break;
					System.out.print(rjust(j,2)+" x "+rjust(i,2)+" = "+rjust((i*j),3)+"  |  ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	private static String rjust(int n, int w) {
		String r = ""+n;
		for(int i=r.length(); i<w; i++)
			r = " "+r;
		return r;
	}


}
