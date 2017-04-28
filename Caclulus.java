import java.util.Scanner;

public class Caclulus{


	public static void main(String[] args){
		
		//variables we'll be using
		
		String polynomial;
		String answer = "";
		int calculus;
		
		
		Scanner input = new Scanner(System.in);
		try{
		System.out.println("Please enter your polynomial in the form: '5x^2' for example");
		polynomial = input.nextLine();
		
		Polynomial givenPoly = new Polynomial(polynomial);
		
		do {
			System.out.println("Please choose 1 for differentiate and 2 for integrate");
		    while (!input.hasNextInt()) {
		        System.out.println("That's not a number!");
		        input.next();
		    }
		    calculus = input.nextInt();
		} while (calculus != 1 || calculus != 2);
		
		
		
		//if user wants to differentiate
		if(calculus==1){
			Differentiate newDiff = new Differentiate(givenPoly);
			answer = (newDiff.returnResultCoefficient() + givenPoly.returnAlgebra() + "^"+ newDiff.returnResultPower());
		}
		else if(calculus==2){
			Integrate newIntegrate = new Integrate(givenPoly);
			answer = (newIntegrate.returnResultCoefficient() + givenPoly.returnAlgebra() + "^"+ newIntegrate.returnResultPower());
		}
		
		
		System.out.println(answer);
		
		input.close();
		}
		
		catch(Exception e){
			System.out.println("Please enter in the form provided!");
		}
		
		
		
		
		
		
		
	}
	

}