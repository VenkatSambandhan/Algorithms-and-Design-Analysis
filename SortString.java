import java.util.Arrays;

public class SortString
{
    public static void main(String[] args)
    {
        String original = "edcrtybza";
        char[] chars = original.toCharArray();
        Arrays.sort(chars);
        System.out.println(chars);
    }
}