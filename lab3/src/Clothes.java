public abstract class Clothes {
    private Size size;
    private int price;
    private Color color;

    public Clothes(Size size, int price, Color color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Clothes() {
        this(Size.XXS, 10000, Color.RED);
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
