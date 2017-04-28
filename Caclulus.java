import java.util.Scanner;

public class Caclulus{


	public static void main(String[] args){
		
		
		
		String polynomial;
		String answer = "";
		int calculus;
		
		
		Scanner input = new Scanner(System.in);
		try{
			
		System.out.println("Please enter your polynomial in the form: '5x^2' for example");
		polynomial = input.nextLine();
		
		Polynomial givenPoly = new Polynomial(polynomial);
		
		//error handling for anything other than 1 or 2 
		
		calculus = input.nextInt();
		
		
		
		//if user wants to differentiate
		if(calculus==1){
			Differentiate newDiff = new Differentiate(givenPoly);
			answer = (newDiff.returnResultCoefficient() + givenPoly.returnAlgebra() + "^"+ newDiff.returnResultPower());
		}//if
		
		//else integrate
		else if(calculus==2){
			Integrate newIntegrate = new Integrate(givenPoly);
			answer = (newIntegrate.returnResultCoefficient() + givenPoly.returnAlgebra() + "^"+ newIntegrate.returnResultPower());
		}//else if 
		
		
		System.out.println(answer);
		
		input.close();
		}
		//catching array out of bounds etc
		catch(Exception e){
			System.out.println("Please enter in the form provided!");
		}
		
		
		
		
		
		
		
	}
	

}