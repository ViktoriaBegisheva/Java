package task7_11_dz;

public class Task7_11 {

	public static void main(String[] args) {
		// 7.11
		Suit suit = new Suit(170, "black", "cotton", "italian");
        System.out.println(suit);
        suit.color();
        Shoes shoes = new Shoes(38, "brown", "skin", "gucci");
        System.out.println(shoes);
        shoes.type();

	}

}
