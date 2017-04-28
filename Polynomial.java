
public class Polynomial {
	
	private int coefficient;
	private int power;
	private String algebra;
	
	public Polynomial(String polynomial){
		
		//split user input into coefficient and power
		String[] split = polynomial.split("\\^");
		String pt1 = split[0];
		String pt2 = split[1];
				
		//split pt1 further into coefficient and letter
		String[] split2 = pt1.split("(?<=\\d)(?=\\D)");
		coefficient = Integer.parseInt(split2[0]);
		algebra = split2[1];
				
		//retrieve from array and turn to ints
		power = Integer.parseInt(pt2);
	}//polynomial
	
	public int returnCoefficient(){
		return coefficient;
	}//returnCoefficient
	
	public int returnPower(){
		return power;
	}//returnPower
	
	public String returnAlgebra(){
		return algebra;
	}
}
