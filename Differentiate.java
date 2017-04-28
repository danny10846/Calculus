
public class Differentiate {
	
	private int resultCoefficient;
	private int resultPower;
	
	//method to differentiate given poly
	public Differentiate(Polynomial givenPoly){
		
		resultCoefficient = givenPoly.returnCoefficient() * givenPoly.returnPower();
		resultPower = givenPoly.returnPower() -1;
	}//Differentiate
	
	public int returnResultCoefficient(){
		return resultCoefficient;
	}//returnResultCoefficient
	
	public int returnResultPower(){
		return resultPower;
	}//returnResultPower
}
