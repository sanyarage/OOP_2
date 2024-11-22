public class trousers extends Clothes implements MenClothing, WomenClothing {
    @Override
    public void dressMan(){
        System.out.println("Одежда - Брюки для мужчины");
        System.out.println("Размер: " + getSize() + " " + getSize().getDescription());
        System.out.println("Цвет: " + getColor());
        System.out.println("Цена: " + getPrice());
        System.out.println();
    }
    @Override
    public void dressWoman(){
        System.out.println("Одежда - Брюки для женщины");
        System.out.println("Размер: " + getSize() + " " + getSize().getDescription());
        System.out.println("Цвет: " + getColor());
        System.out.println("Цена: " + getPrice());
        System.out.println();
    }
}
