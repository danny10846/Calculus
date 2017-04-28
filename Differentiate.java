
public class Differentiate {
	
	private int resultCoefficient;
	private int resultPower;
	
	public Differentiate(Polynomial givenPoly){
		
		resultCoefficient = givenPoly.returnCoefficient() * givenPoly.returnPower();
		resultPower = givenPoly.returnCoefficient() -1;
	}
	
	public int returnResultCoefficient(){
		return resultCoefficient;
	}
	
	public int returnResultPower(){
		return resultPower;
	}
}
