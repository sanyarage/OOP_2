public class Main
{
    public static void main(String[] args)
    {
        Numerals numerals = new Numerals();
        numerals.filter();

        Middle middle = new Middle();

        System.out.println(middle.getMiddle("string"));
        System.out.println(middle.getMiddle("code"));
        System.out.println(middle.getMiddle("Practice"));
    }
}
