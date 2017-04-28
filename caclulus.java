import java.util.Scanner;

public class caclulus{


	public static void main(String[] args){
		
		//variables we'll be using
		int coefficient;
		String polynomial;
		int power, calculus;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your polynomial in the form: '5x^2' for example");
		polynomial = input.nextLine();
		System.out.println("Please choose 1 for differentiate and 2 for integrate");
		calculus = Integer.parseInt(input.nextLine());
		
		//split user input into coefficient and power
		String[] split = polynomial.split("\\^");
		String pt1 = split[0];
		String pt2 = split[1];
		
		//split pt1 further into coefficient and letter
		String[] split2 = pt1.split("(?<=\\d)(?=\\D)");
		String tempCoefficient = split2[0];
		String algebraLetter = split2[1];
		
		//retrieve from array and turn to ints
		coefficient = Integer.parseInt(tempCoefficient);
		power = Integer.parseInt(pt2);
		
		//calculate the differential
		int resultCoefficient = power*coefficient;
		int resultPower = power -1;
		
		String answer = (resultCoefficient + algebraLetter + "^"+ resultPower);
		
		System.out.println(answer);
		
		input.close();
		
		
		
		
		
		
		
		
	}
	

}