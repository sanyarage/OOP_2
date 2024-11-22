public class skirt extends Clothes implements WomenClothing {
    @Override
    public void dressWoman(){
        System.out.println("Одежда - Юбка");
        System.out.println("Размер: " + getSize() + " " + getSize().getDescription());
        System.out.println("Цвет: " + getColor());
        System.out.println("Цена: " + getPrice());
        System.out.println();
    }
}