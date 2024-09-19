public class Middle
{
    public String getMiddle(String str)
    {
        int length = str.length();
        int middleStart = (length / 2) - 1;
        return str.substring(middleStart, middleStart + 2);
    }
}

