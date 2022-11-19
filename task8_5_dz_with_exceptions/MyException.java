package task8_5_dz_with_exceptions;

public class MyException extends Exception {
	
	private String message;
	
	MyException(String str) {
		message=str;
	}
	
	@Override
	public String toString() {
		return "Exception: "+message;
	}
}
