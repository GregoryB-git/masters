package A0;

import d0.J;
import d0.q;
import g0.M;
import java.util.Arrays;
import k0.Z0;
import x0.Z;

public final class A$a
{
  public final int a;
  public final String[] b;
  public final int[] c;
  public final Z[] d;
  public final int[] e;
  public final int[][][] f;
  public final Z g;
  
  public A$a(String[] paramArrayOfString, int[] paramArrayOfInt1, Z[] paramArrayOfZ, int[] paramArrayOfInt2, int[][][] paramArrayOfInt, Z paramZ)
  {
    b = paramArrayOfString;
    c = paramArrayOfInt1;
    d = paramArrayOfZ;
    f = paramArrayOfInt;
    e = paramArrayOfInt2;
    g = paramZ;
    a = paramArrayOfInt1.length;
  }
  
  public int a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = d[paramInt1].b(paramInt2).a;
    int[] arrayOfInt = new int[i];
    int j = 0;
    int n;
    for (int k = 0; j < i; k = n)
    {
      int m = g(paramInt1, paramInt2, j);
      if (m != 4)
      {
        n = k;
        if (paramBoolean)
        {
          n = k;
          if (m != 3) {}
        }
      }
      else
      {
        arrayOfInt[k] = j;
        n = k + 1;
      }
      j++;
    }
    return b(paramInt1, paramInt2, Arrays.copyOf(arrayOfInt, k));
  }
  
  public int b(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    int i = 0;
    int j = 16;
    Object localObject = null;
    boolean bool1 = false;
    for (boolean bool2 = bool1; i < paramArrayOfInt.length; bool2++)
    {
      int k = paramArrayOfInt[i];
      String str = d[paramInt1].b(paramInt2).a(k).n;
      if (!bool2) {
        localObject = str;
      } else {
        bool1 |= M.c(localObject, str) ^ true;
      }
      j = Math.min(j, Z0.e(f[paramInt1][paramInt2][i]));
      i++;
    }
    paramInt2 = j;
    if (bool1) {
      paramInt2 = Math.min(j, e[paramInt1]);
    }
    return paramInt2;
  }
  
  public int c(int paramInt1, int paramInt2, int paramInt3)
  {
    return f[paramInt1][paramInt2][paramInt3];
  }
  
  public int d()
  {
    return a;
  }
  
  public int e(int paramInt)
  {
    return c[paramInt];
  }
  
  public Z f(int paramInt)
  {
    return d[paramInt];
  }
  
  public int g(int paramInt1, int paramInt2, int paramInt3)
  {
    return Z0.h(c(paramInt1, paramInt2, paramInt3));
  }
  
  public Z h()
  {
    return g;
  }
}

/* Location:
 * Qualified Name:     A0.A.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */