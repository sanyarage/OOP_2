public class tie extends Clothes implements MenClothing {
    @Override
    public void dressMan(){
        System.out.println("Одежда - Галстук");
        System.out.println("Размер: " + getSize() + " " + getSize().getDescription());
        System.out.println("Цвет: " + getColor());
        System.out.println("Цена: " + getPrice());
        System.out.println();
    }
}
