package comsyntax.class2;

public class ArtithmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=10;
		int number2=20;
		System.out.println(number1+number2);
		System.out.println(number1-number2);
		System.out.println(number1*number2);
		System.out.println(number1/number2);
		System.out.println("********************");
		double number3=10;
		double number4=20;
		System.out.println(number3+number4);
		System.out.println(number3-number4);
		System.out.println(number3*number4);
		System.out.println(number3/number4);
		System.out.println("********************");
		boolean var1=true;
		boolean var2=false;
		//System.out.println doesn't allow math on booleans
		char char1='A';
		char char2='B';
		System.out.println(char1+char2);
		System.out.println(char1-char2);
		System.out.println(char1*char2);
		System.out.println(char1/char2);
		//adding, subtracting, multiplying, or dividing char's results in a number corresponding to an ascii code
		System.out.println("********************");
		String str1="hi";
		String str2="bye";
		System.out.println(str1+str2);
		//subtracting, multiplying, or dividing strings is not allowed
		
	}

}
