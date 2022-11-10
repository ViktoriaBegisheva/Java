package task7_11_dz;

public class Shoes extends Clothes {
    private String brand;

    public Shoes(int size, String color, String type, String brand) {
        super(size, color, type);
        setBrand(brand);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Shoes {" + super.toString() + "; brand: " + brand+"}";
    }
}
