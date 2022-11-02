package lab6;

public class Complex {
	
	private float Re;
	private float Im;
	
	Complex(){
		Re = 0;
		Im = 0;
	}
	
	Complex(float r,float i){
		Re = r;
		Im = i;
	}
	
	String getStrRe() {
		return String.valueOf(Re);
	}
	
	String getStrIm() {
		return String.valueOf(Im);
	}
	
	public Complex sum(Complex other) {
		return new Complex(Re + other.Re, Im + other.Im);
	}
	
	public Complex mul(Complex other) {
		return new Complex(Re*other.Re - Im*other.Im, 
				Im*other.Re + Re*other.Im);
	}
	
	public Complex sumArr(Complex[] arr) {
		Complex c = new Complex();
		for(Complex a:arr) {
			c = c.sum(a);
		}
		return c;
	}
	
	public Complex mulArr(Complex[] arr) {
		Complex c = new Complex(1,0);
		for(Complex a:arr) {
			c = c.mul(a);
		}
		return c;
	}
	
	@Override
	public String toString() {
		String s= getStrRe() + " + " + getStrIm() + "i";
		return s;
	}

}
