package numbers;

import java.util.ArrayList;
import java.util.Arrays;

public class Unsigned extends NewNumber{

	public static long toUnsignedLong(int x) {
        return ((long) x) & 0xffffffffL;
    }
	
	private long n;
	
	public Unsigned(){
		super(EnumNumber.UNSIGNED,
				new ArrayList<Integer>(Arrays.asList(0)));
		n=toUnsignedLong(0);
	}
	public Unsigned(int n0){
		super(EnumNumber.UNSIGNED,
				new ArrayList<Integer>(Arrays.asList(n0)));
		n=toUnsignedLong(n0);
	}

	public Unsigned(long n0){
		super(EnumNumber.UNSIGNED,
				new ArrayList<Integer>(Arrays.asList((int)n0)));
		n= n0 & 0xffffffffL;
	}
	
	public Unsigned(NewNumber n){
		super(EnumNumber.UNSIGNED,n.value);
		this.n=toUnsignedLong(n.value.get(0));
	}

	@Override
	public NewNumber add(NewNumber other) {
		Unsigned c  = new Unsigned(other);
		Unsigned ans = new Unsigned(c.n+n);
		return ans;
	}

	@Override
	public NewNumber subtract(NewNumber other) {
		Unsigned c  = new Unsigned(other);
		Unsigned ans = new Unsigned(n-c.n);
		return ans;
	}

	@Override
	public NewNumber multiply(NewNumber other) {
		Unsigned c  = new Unsigned(other);
		Unsigned ans = new Unsigned(c.n*n);
		return ans;
	}

	@Override
	public NewNumber divide(NewNumber other) {
		Unsigned c  = new Unsigned(other);
		Unsigned ans = new Unsigned((long) (float)n/c.n);
		return ans;
	}
	
}

