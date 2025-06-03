package c5;

public abstract class a
  extends m
{
  public static final char[] a = "0123456789-$:/.+ABCD".toCharArray();
  public static final int[] b = { 3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14 };
  public static final char[] c = { 65, 66, 67, 68 };
  
  public static boolean a(char[] paramArrayOfChar, char paramChar)
  {
    if (paramArrayOfChar != null)
    {
      int i = paramArrayOfChar.length;
      for (int j = 0; j < i; j++) {
        if (paramArrayOfChar[j] == paramChar) {
          return true;
        }
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     c5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */