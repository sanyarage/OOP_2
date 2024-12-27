public class Reader {
    private String name;
    private int readerNumber;
    private String faculty;
    private String birthday;
    private Phone phone;

    Reader(){
        this.name = "NULL";
        this.readerNumber = 0;
        this.faculty = "NULL";
        this.birthday = "NULL";
        this.phone = new Phone();
    }
    Reader(String name, int readerNumber, String faculty, String birthday, Phone phone){
        this.name = name;
        this.readerNumber = readerNumber;
        this.faculty = faculty;
        this.birthday = birthday;
        this.phone = phone;
    }

    public void takeBook(){
        System.out.println(name + " took the book");
    }
    public void returnBook(){
        System.out.println(name + " returned the book");
    }

    public void takeBook(int count){
        System.out.println(name + " took " + count + " books");
    }
    public void returnBook(int count){
        System.out.println(name + " returned " + count + " books");
    }

    public void takeBook(String... names){
        System.out.print(this.name + " took the books:");
        for(String name : names){
            System.out.print(" " + "'" + name + "'");
        }
        System.out.println();
    }

    public void takeBook(Book... books){
        System.out.print(this.name + " took the books:");
        for(Book book: books){
            System.out.print(" " + "'" + book.getBookName() + "'");
        }
        System.out.println();
    }
    public void returnBook(String... names){
        System.out.print(this.name + " returned the books:");
        for(String name : names){
            System.out.print(" " + "'" + name + "'");
        }
        System.out.println();
    }

    public void returnBook(Book... books){
        System.out.print(this.name + " returned the books:");
        for(Book book: books){
            System.out.print(" " + "'" + book.getBookName() + "'");
        }
        System.out.println();
    }
}