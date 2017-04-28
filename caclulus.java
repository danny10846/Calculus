import java.util.Scanner;

public class caclulus{


	public static void main(String[] args){
		
		//variables we'll be using
		
		String polynomial;
		int calculus;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your polynomial in the form: '5x^2' for example");
		polynomial = input.nextLine();
		
		System.out.println("Please choose 1 for differentiate and 2 for integrate");
		calculus = Integer.parseInt(input.nextLine());
		
		polynomial givenPoly = new polynomial(polynomial);
		
		//calculate the differential
		int resultCoefficient = givenPoly.returnPower()*givenPoly.returnCoefficient();
		int resultPower = givenPoly.returnPower() -1;
		
		String answer = (resultCoefficient + givenPoly.returnAlgebra() + "^"+ resultPower);
		
		System.out.println(answer);
		
		input.close();
		
		
		
		
		
		
		
		
	}
	

}