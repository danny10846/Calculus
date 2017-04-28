
public class Integrate {
	
	private double resultCoefficient;
	private int resultPower;
	
	public Integrate(Polynomial givenPoly){
		
		resultPower = givenPoly.returnPower() +1;
		resultCoefficient = (givenPoly.returnCoefficient() / (double)(resultPower));
	}//Integrate
	
	public double returnResultCoefficient(){
		return resultCoefficient;
	}//returnResultCoefficient
	
	public int returnResultPower(){
		return resultPower;
	}//returnResultPower

}
