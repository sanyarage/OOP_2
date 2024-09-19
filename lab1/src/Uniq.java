public class Uniq
{
    public String findUniq(String sentence)
    {
        String[] words = sentence.split(" ");
        String result = null;
        int minUniq = Integer.MAX_VALUE;

        for (String word : words)
        {
            int uniqCount = countUniq(word);
            if (uniqCount < minUniq)
            {
                minUniq = uniqCount;
                result = word;
            }
        }
        return result;
    }

    private int countUniq(String word)
    {
        boolean[] charPresence = new boolean[256];
        int uniqueCount = 0;
        for (int i = 0; i < word.length(); i++)
        {
            char current = word.charAt(i);

            if (!charPresence[current])
            {
                charPresence[current] = true;
                uniqueCount++;
            }
        }
        return uniqueCount;
    }
}
