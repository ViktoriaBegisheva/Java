package task7_11_dz;

public class Suit extends Clothes {
    private String style;

    public Suit(int size, String color, String type, String style) {
        super(size, color, type);
        this.style = style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    @Override
    public String toString() {
        return "Suit {" + super.toString() + "; style: " + style+"}";
    }
}
