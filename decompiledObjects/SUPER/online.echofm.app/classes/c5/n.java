package c5;

import V4.a;
import V4.c;
import V4.g;
import Y4.b;
import java.util.Map;

public abstract class n
  implements g
{
  public static int b(boolean[] paramArrayOfBoolean, int paramInt, int[] paramArrayOfInt, boolean paramBoolean)
  {
    int i = paramArrayOfInt.length;
    int j = 0;
    int k = j;
    int m = paramInt;
    paramInt = k;
    while (j < i)
    {
      int n = paramArrayOfInt[j];
      k = 0;
      while (k < n)
      {
        paramArrayOfBoolean[m] = paramBoolean;
        k++;
        m++;
      }
      paramInt += n;
      paramBoolean ^= true;
      j++;
    }
    return paramInt;
  }
  
  public static b e(boolean[] paramArrayOfBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramArrayOfBoolean.length;
    int j = paramInt3 + i;
    paramInt1 = Math.max(paramInt1, j);
    paramInt3 = Math.max(1, paramInt2);
    j = paramInt1 / j;
    paramInt2 = (paramInt1 - i * j) / 2;
    b localb = new b(paramInt1, paramInt3);
    paramInt1 = 0;
    while (paramInt1 < i)
    {
      if (paramArrayOfBoolean[paramInt1] != 0) {
        localb.n(paramInt2, 0, j, paramInt3);
      }
      paramInt1++;
      paramInt2 += j;
    }
    return localb;
  }
  
  public b a(String paramString, a parama, int paramInt1, int paramInt2, Map paramMap)
  {
    if (!paramString.isEmpty())
    {
      if ((paramInt1 >= 0) && (paramInt2 >= 0))
      {
        int i = d();
        int j = i;
        if (paramMap != null)
        {
          parama = c.t;
          j = i;
          if (paramMap.containsKey(parama)) {
            j = Integer.parseInt(paramMap.get(parama).toString());
          }
        }
        return e(c(paramString), paramInt1, paramInt2, j);
      }
      paramString = new StringBuilder("Negative size is not allowed. Input: ");
      paramString.append(paramInt1);
      paramString.append('x');
      paramString.append(paramInt2);
      throw new IllegalArgumentException(paramString.toString());
    }
    throw new IllegalArgumentException("Found empty contents");
  }
  
  public abstract boolean[] c(String paramString);
  
  public int d()
  {
    return 10;
  }
}

/* Location:
 * Qualified Name:     c5.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */