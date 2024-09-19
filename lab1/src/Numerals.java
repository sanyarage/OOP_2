public class Numerals {
    private int maxSize = 300;
    private int sum = 0;
    private int num;

    public Numerals() {}

    public void filter() {
        for (int i = 0; i <= maxSize; i += 4) {
            if (i % 6 != 0) {
                num = i;
                sum = 0;

                while (num > 0) {
                    sum += num % 10;
                    num = num / 10;
                }

                if (sum < 10) {
                    System.out.println(i);
                }
            }
        }
    }
}

