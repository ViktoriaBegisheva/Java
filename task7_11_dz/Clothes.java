package task7_11_dz;

abstract class Clothes implements Fabric {
    private int size;
    private String color;
    private String type;

    public Clothes(int size, String color, String type) {
    	this.size = size;
    	this.color = color;
    	this.type = type;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
        this.color();
    }

    public String getColor() {
        return color;
    }

    public void setType(String type) {
        this.type = type;
        this.type();
    }

    public String getType() {
        return type;
    }

    @Override
    public void color() {
        System.out.println("Color: " + this.color);
    }

    @Override
    public void type() {
        System.out.println("Type: " + this.type);
    }

    @Override
    public String toString() {
        return "type: " + type + "; size: " + size + "; color: " + color;
    }
}
