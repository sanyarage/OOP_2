public class Main
{
    public static void main(String[] args)
    {
        Numerals numerals = new Numerals();
        numerals.filter();
        System.out.println("___________");

        Middle middle = new Middle();
        System.out.println(middle.getMiddle("string"));
        System.out.println(middle.getMiddle("code"));
        System.out.println(middle.getMiddle("Practice"));
        System.out.println("___________");

        Uniq minimalWordFinder = new Uniq();
        String sentence0 = "abcd fgg fff jj";
        String result0 = minimalWordFinder.findUniq(sentence0);
        System.out.println("Слово с минимальным количеством уникальных символов: " + result0);
        System.out.println("___________");

        Latin counter = new Latin();
        String sentence1 = "One two three раз два три one1 two2 123";
        int result1 = counter.countLatin(sentence1);
        System.out.println("Количество слов, содержащих только латинские буквы: " + result1);
        System.out.println("___________");
    }


}
