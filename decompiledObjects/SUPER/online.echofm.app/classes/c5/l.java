package c5;

import V4.a;
import Y4.b;
import java.util.Map;

public final class l
  extends n
{
  public static final int[] a = { 1, 1, 1, 1 };
  public static final int[] b = { 3, 1, 1 };
  public static final int[][] c;
  
  static
  {
    int[] arrayOfInt1 = { 1, 1, 3, 3, 1 };
    int[] arrayOfInt2 = { 3, 1, 1, 1, 3 };
    int[] arrayOfInt3 = { 1, 3, 1, 1, 3 };
    int[] arrayOfInt4 = { 3, 3, 1, 1, 1 };
    int[] arrayOfInt5 = { 1, 3, 1, 3, 1 };
    c = new int[][] { arrayOfInt1, arrayOfInt2, arrayOfInt3, arrayOfInt4, { 1, 1, 3, 1, 3 }, { 3, 1, 3, 1, 1 }, { 1, 3, 3, 1, 1 }, { 1, 1, 1, 3, 3 }, { 3, 1, 1, 3, 1 }, arrayOfInt5 };
  }
  
  public b a(String paramString, a parama, int paramInt1, int paramInt2, Map paramMap)
  {
    if (parama == a.w) {
      return super.a(paramString, parama, paramInt1, paramInt2, paramMap);
    }
    throw new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf(parama)));
  }
  
  public boolean[] c(String paramString)
  {
    int i = paramString.length();
    if (i % 2 == 0)
    {
      if (i <= 80)
      {
        boolean[] arrayOfBoolean = new boolean[i * 9 + 9];
        int j = n.b(arrayOfBoolean, 0, a, true);
        for (int k = 0; k < i; k += 2)
        {
          int m = Character.digit(paramString.charAt(k), 10);
          int n = Character.digit(paramString.charAt(k + 1), 10);
          int[] arrayOfInt = new int[10];
          for (int i1 = 0; i1 < 5; i1++)
          {
            int i2 = i1 * 2;
            int[][] arrayOfInt1 = c;
            arrayOfInt[i2] = arrayOfInt1[m][i1];
            arrayOfInt[(i2 + 1)] = arrayOfInt1[n][i1];
          }
          j += n.b(arrayOfBoolean, j, arrayOfInt, true);
        }
        n.b(arrayOfBoolean, j, b, true);
        return arrayOfBoolean;
      }
      throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(i)));
    }
    throw new IllegalArgumentException("The length of the input should be even");
  }
}

/* Location:
 * Qualified Name:     c5.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */