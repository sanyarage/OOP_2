public class Latin
{
    public int countLatin(String sentence)
    {
        String[] words = sentence.split(" ");
        int latinCount = 0;

        for (String word : words)
        {
            if (LatinWord(word))
            {
                latinCount++;
            }
        }

        return latinCount;
    }

    private boolean LatinWord(String word)
    {
        for (int i = 0; i < word.length(); i++)
        {
            char c = word.charAt(i);
            if (!Character.isLetter(c) || (c < 'A' || (c > 'Z' && c < 'a') || c > 'z'))
            {
                return false;
            }
        }
        return true;
    }
}

