package c5;

import V4.a;
import Y4.b;
import java.util.Map;

public class h
  extends n
{
  public static int f(boolean[] paramArrayOfBoolean, int paramInt, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    int j = 0;
    while (j < i)
    {
      int k;
      if (paramArrayOfInt[j] != 0) {
        k = 1;
      } else {
        k = 0;
      }
      paramArrayOfBoolean[paramInt] = k;
      j++;
      paramInt++;
    }
    return 9;
  }
  
  public static int g(String paramString, int paramInt)
  {
    int i = paramString.length() - 1;
    int j = 0;
    int k = 1;
    while (i >= 0)
    {
      j += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(paramString.charAt(i)) * k;
      int m = k + 1;
      k = m;
      if (m > paramInt) {
        k = 1;
      }
      i--;
    }
    return j % 47;
  }
  
  private static void h(int paramInt, int[] paramArrayOfInt)
  {
    for (int i = 0; i < 9; i++)
    {
      int j = 1;
      if ((1 << 8 - i & paramInt) == 0) {
        j = 0;
      }
      paramArrayOfInt[i] = j;
    }
  }
  
  public b a(String paramString, a parama, int paramInt1, int paramInt2, Map paramMap)
  {
    if (parama == a.r) {
      return super.a(paramString, parama, paramInt1, paramInt2, paramMap);
    }
    throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(parama)));
  }
  
  public boolean[] c(String paramString)
  {
    int i = paramString.length();
    if (i <= 80)
    {
      int[] arrayOfInt1 = new int[9];
      int j = paramString.length();
      h(g.b[47], arrayOfInt1);
      boolean[] arrayOfBoolean = new boolean[(j + 4) * 9 + 1];
      int k = 0;
      j = f(arrayOfBoolean, 0, arrayOfInt1);
      while (k < i)
      {
        int m = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(paramString.charAt(k));
        h(g.b[m], arrayOfInt1);
        j += f(arrayOfBoolean, j, arrayOfInt1);
        k++;
      }
      k = g(paramString, 20);
      int[] arrayOfInt2 = g.b;
      h(arrayOfInt2[k], arrayOfInt1);
      j += f(arrayOfBoolean, j, arrayOfInt1);
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString);
      localStringBuilder.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(k));
      h(arrayOfInt2[g(localStringBuilder.toString(), 15)], arrayOfInt1);
      j += f(arrayOfBoolean, j, arrayOfInt1);
      h(arrayOfInt2[47], arrayOfInt1);
      arrayOfBoolean[(j + f(arrayOfBoolean, j, arrayOfInt1))] = true;
      return arrayOfBoolean;
    }
    throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(i)));
  }
}

/* Location:
 * Qualified Name:     c5.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */