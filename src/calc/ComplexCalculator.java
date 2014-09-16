//Chia Hui, Hsieh

package calc;
import java.lang.Math;
public class ComplexCalculator {

	private double currentNumber;
	
	// constructor
	public ComplexCalculator(double d) {
		currentNumber = d;
	}
	
	// adds d to current number
	public void add(double d) {
		currentNumber = currentNumber + d;
	}
	
	// subtract()
	public void subtract(double d) {
		currentNumber = currentNumber - d;
	}
	
	// multiply()
	public void multiply(double d) {
		currentNumber = currentNumber * d;
	}
	
	// divide()
	public void divide(double d) {
		currentNumber = currentNumber / d;
	}
	
	// clear()
	public void clear() {
		currentNumber = 0;
	}
	
	// power()
	public void power(double d) {
		currentNumber = Math.pow(currentNumber, d);
	}
	
	public double getCurrentNumber() {
		return currentNumber;
	}
	
	//////////////////////////////////////////////////
	// EXTRA FUNCTIONS - not needed for full credit //
	
	public boolean isEven(double d){
		if(d%2 == 0){
			return true;
		}
		else{
			return false;
		}
	}
	// TODO returns true is current number is even, false otherwise
	
	public boolean isPrime(double d){
		for(int i = 2; i<d; i++ ){
			if(d%i == 0){
				System.out.println("False");
				return false;
				
			}
			
		}
		
		return true;
	}
	// TODO returns true if current number is a prime number, false otherwise
	
	////////////////////////////////////////////////////
	
}
