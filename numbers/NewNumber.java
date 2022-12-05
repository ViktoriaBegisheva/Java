package numbers;

import java.util.ArrayList;

public abstract class NewNumber implements Number{
	public EnumNumber numberEnum;
	public ArrayList<Integer> value;
	
	public NewNumber(EnumNumber en){numberEnum=en;}

	public NewNumber(EnumNumber en,ArrayList<Integer> val){
		numberEnum=en;
		value = val;
	}
	public void setValue(ArrayList<Integer> value) {
		this.value=value;
	}
	public NewNumber getEnum(int n) {
		NewNumber num = null;
		switch (this.numberEnum){
			case RATIONAL:
				num = new Rational(n);
				break;
			case UNSIGNED:
				num = new Unsigned(n);
				break;
		}
		return num;
	}

	public static NewNumber getEnum(NewNumber n) {
		NewNumber num = null;
		switch (n.numberEnum){
			case RATIONAL:
				num = new Rational(n);
				break;
			case UNSIGNED:
				num = new Unsigned(n);
				break;
		}
		return num;
	}

	public static NewNumber getEnum(int n,EnumNumber enu) {
		NewNumber num = null;
		switch (enu){
			case RATIONAL:
				num = new Rational(n);
				break;
			case UNSIGNED:
				num = new Unsigned(n);
				break;
		}
		return num;
	}


}
