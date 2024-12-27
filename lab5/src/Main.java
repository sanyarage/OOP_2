public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("+724634698390", "Huawai", 600);
        Phone phone3 = new Phone("+742569470469", "Xiaomi", 300);

        phone1.showPhone();
        phone2.showPhone();
        phone3.showPhone();

        Reader[] readers = new Reader[10];
        readers[0] = new Reader();

        readers[0].takeBook("Война и Мир", "Преступление и наказание", "Отцы и дети");
        readers[0].returnBook( "Отцы и дети");

        readers[0].takeBook(new Book("Война и Мир"), new Book("Преступление и наказание"), new Book("Отцы и дети"));
    }
}