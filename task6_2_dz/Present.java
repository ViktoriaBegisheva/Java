package task6_2_dz;
import java.util.Arrays;

public class Present {
	int size;
	Sweet[] sweets;

	
	Present(){
		size=0;
		sweets = new Sweet[size];
	}
	void addSweet(Sweet s) {
		sweets = Arrays.copyOf(sweets,size+1);
		sweets[size++] = s;
	}
	
	boolean sweetInPresent(Sweet s) {
		for(Sweet sw:sweets) {
			if(sw.equals(s))
				return true;
		}
		return false;
	}
	
	void removeSweet(Sweet s) {
		int k=0;
		if (!sweetInPresent(s))return;
		for(Sweet sw:sweets) {
			if(sw.equals(s)) {
				for(int i=k;i<sweets.length-1;i++)
					sweets[i]=sweets[i+1];
				sweets = Arrays.copyOf(sweets,--size);
			}
			k++;
		}
	}
	
	float getWeight() {
		float sum=0f;
		for(Sweet sw:sweets)
			sum+=sw.getWeight();
		return sum;
	}
	
	
	Sweet getByLength(float a,float b) {
		for(Sweet sw:sweets) {
			if(sw.getSugar()>=a&&sw.getSugar()<=b)
				return sw;
		}
		return new Sweet();
	}
	
	void checkWeight(double price) {
		while (getWeight()>price) {
			double minWei = sweets[0].getWeight();
			int indMin = 0;
			for(int i=1;i<size;i++) {
				if (sweets[i].getWeight()<minWei) {
					minWei=sweets[i].getWeight();
					indMin=i;
				}
			}
			removeSweet(sweets[indMin]);
		}
			
	}
	
	@Override
	public String toString() {
		String s="Bouquet: {\n";
		for(Sweet f:sweets)
			s+=f.toString()+", \n";
		s=s.substring(0, s.length()-3)+"\n}; \nweight "+getWeight();
		return s;
	}
	
	public static void main(String[] args) {
		int n = 9;
		Sweet[] sweets = new Sweet[n];
		sweets[0] = new Candy("appel");
		sweets[1] = new Candy("banana");
		sweets[2] = new Candy("mango");
		sweets[3] = new Lollipop("appel");
		sweets[4] = new Candy("orange");
		sweets[5] = new Lollipop("orange");
		sweets[6] = new Lollipop("mango");
		sweets[7] = new Candy("appel");
		sweets[8] = new Lollipop("banana");
		Present pres = new Present();
		for (Sweet sw:sweets)
			pres.addSweet(sw);
		System.out.println(pres);
		pres.checkWeight(100);
		System.out.println(pres);
		
		
		
		

	}

}
