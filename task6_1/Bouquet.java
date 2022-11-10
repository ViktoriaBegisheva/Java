package task6_1;

import java.util.Arrays;

public class Bouquet {
	int size;
	Flower[] flowers;
	
	Bouquet(){
		size=0;
		flowers = new Flower[size];
	}
	void addFlower(Flower f) {
		flowers = Arrays.copyOf(flowers,size+1);
		flowers[size++] = f;
	}
	
	boolean flowerInBouquet(Flower f) {
		for(Flower fl:flowers) {
			if(fl.equals(f))
				return true;
		}
		return false;
	}
	
	void removeFlower(Flower f) {
		int k=0;
		if (!flowerInBouquet(f))return;
		for(Flower fl:flowers) {
			if(fl.equals(f)) {
				for(int i=k;i<flowers.length-1;i++)
					flowers[i]=flowers[i+1];
				flowers = Arrays.copyOf(flowers,--size);
			}
			k++;
		}
	}
	
	float getPrice() {
		float sum=0f;
		for(Flower f:flowers)
			sum+=f.getPrice();
		return sum;
	}
	
	float getFresh() {
		float sum=0f;
		for(Flower f:flowers)
			sum+=f.getFresh();
		return sum/size;
	}
	
	Flower getByLength(float a,float b) {
		for(Flower f:flowers) {
			if(f.getLength()>=a&&f.getLength()<=b)
				return f;
		}
		return new Flower();
	}
	
	void checkPrice(double price) {
		while (getPrice()>price) {
			double minPrice = flowers[0].getPrice();
			int indMin = 0;
			for(int i=1;i<size;i++) {
				if (flowers[i].getPrice()<minPrice) {
					minPrice=flowers[i].getPrice();
					indMin=i;
				}
			}
			removeFlower(flowers[indMin]);
		}
			
	}
	
	@Override
	public String toString() {
		String s="Bouquet: {\n";
		for(Flower f:flowers)
			s+=f.toString()+", \n";
		s=s.substring(0, s.length()-3)+"\n}; \nfresh "+getFresh()+
				"%; \nprice "+getPrice();
		return s;
	}
	
	public static void main(String[] args) {
		int n = 9;
		Flower[] flowers = new Flower[n];
		flowers[0] = new Rose(90,10);
		flowers[1] = new Rose(80,15);
		flowers[2] = new Rose(65,7);
		flowers[3] = new Chamomile(90,9);
		flowers[4] = new Chamomile(85,17);
		flowers[5] = new Chamomile(70,11);
		flowers[6] = new Liliya(90,13);
		flowers[7] = new Liliya(95,14);
		flowers[8] = new Liliya(70,10);
		Bouquet bouq = new Bouquet();
		for (Flower f:flowers)
			bouq.addFlower(f);
		System.out.println(bouq.toString());

		System.out.println("flower with flen [10;20]: "+bouq.getByLength(10, 20));
		bouq.checkPrice(280);
		System.out.println(bouq);
		
		
		
		

	}

}