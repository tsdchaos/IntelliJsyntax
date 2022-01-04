package comsyntax.class2;

public class Class2HW1 {

	public static void main(String[] args) {
		double num1=5.90;
		double num2=4.30;
		double sum=num1+num2;
		double difference=num1-num2;
		double product=num1*num2;
		double quotient=num1/num2;
		System.out.println("The sum of 2 numbers "+num1+" and "+num2+" is equal to "+sum);
		System.out.println("The difference of 2 numbers "+num1+" and "+num2+" is equal to "+difference);
		System.out.println("The product of 2 numbers "+num1+" and "+num2+" is equal to "+product);
		System.out.println("The quotient of 2 numbers "+num1+" and "+num2+" is equal to "+quotient);
		System.out.println("****************************************************************");
		double num3=3.9;
		System.out.println("The square of "+num3+" is "+num3*num3);
		System.out.println("****************************************************************");
		int width =5;
		int height=8;
		System.out.println("The perimeter of a rectangle with width "+width+" and height "+height+" is equal to "+(width*2+height*2)+" and the area is "+(width*height));
		System.out.println("****************************************************************");
		int var1=37;
		System.out.println("Variable 1 is assigned the value of "+var1);
		var1+=100;
		System.out.println("I have changed the value of Variable 1 to "+var1);
		int var2=45;
		System.out.println("Variable 2 is assigned the value of "+var2);
		var2-=67;
		System.out.println("I have changed the value of Variable 2 to "+var2);
		float cakePiece=11f;
		System.out.print("There are "+cakePiece+" pieces of cake.");
		cakePiece/=4;
		System.out.println(" Four people can each have "+cakePiece+" pieces of cake.");
		cakePiece=25;
		System.out.println("If seven people share "+cakePiece+" pieces of cake, and do not divide any pieces, then there will be "+cakePiece%7+" pieces left over.");
		

	}

}
