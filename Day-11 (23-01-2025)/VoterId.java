package com.exception;

public class VoterId {

	public static void main(String[] args) {
		int ages[] = {25,43,99,78,15,18,11,0,55,30,-24,66,81,93};
		
		for(int age:ages) {
			try {
				checkValidAge(age);
				System.out.println(age + " is a valid age");
			} catch(TooYoungAgeException e) {
				System.out.println(age + " is too young age");
			} catch(TooOldAgeException e) {
				System.out.println(age + " is too old age");
			} catch(NegativeAgeException e) {
				System.out.println(age + " is negative age");
			} catch(ZeroAgeException e) {
				System.out.println(age + " is zero age");
			} catch(Exception e) {
				
			}
		}
	}
	
	public static void checkValidAge(int age) throws TooYoungAgeException,
													 TooOldAgeException,
													 NegativeAgeException,
													 ZeroAgeException
	{
		if(age<0) throw new NegativeAgeException();
		else if(age==0) throw new ZeroAgeException();
		else if(age<18) throw new TooYoungAgeException();
		else if(age>90) throw new TooOldAgeException();
	}

}
