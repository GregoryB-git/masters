package A0;

import android.util.Pair;
import d0.I;
import d0.J;
import d0.q;
import g0.M;
import java.util.Arrays;
import k0.Z0;
import k0.a1;
import k0.b1;
import x0.Z;
import x0.x.b;

public abstract class A
  extends D
{
  public a c;
  
  public static int n(a1[] paramArrayOfa1, J paramJ, int[] paramArrayOfInt, boolean paramBoolean)
  {
    int i = paramArrayOfa1.length;
    int j = 0;
    int k = j;
    int i4;
    for (int m = 1; j < paramArrayOfa1.length; m = i4)
    {
      a1 locala1 = paramArrayOfa1[j];
      int n = 0;
      int i1 = n;
      while (n < a)
      {
        i1 = Math.max(i1, Z0.h(locala1.a(paramJ.a(n))));
        n++;
      }
      if (paramArrayOfInt[j] == 0) {
        n = 1;
      } else {
        n = 0;
      }
      int i2;
      int i3;
      if (i1 <= k)
      {
        i2 = i;
        i3 = k;
        i4 = m;
        if (i1 == k)
        {
          i2 = i;
          i3 = k;
          i4 = m;
          if (paramBoolean)
          {
            i2 = i;
            i3 = k;
            i4 = m;
            if (m == 0)
            {
              i2 = i;
              i3 = k;
              i4 = m;
              if (n == 0) {}
            }
          }
        }
      }
      else
      {
        i2 = j;
        i4 = n;
        i3 = i1;
      }
      j++;
      i = i2;
      k = i3;
    }
    return i;
  }
  
  public static int[] o(a1 parama1, J paramJ)
  {
    int[] arrayOfInt = new int[a];
    for (int i = 0; i < a; i++) {
      arrayOfInt[i] = parama1.a(paramJ.a(i));
    }
    return arrayOfInt;
  }
  
  public static int[] p(a1[] paramArrayOfa1)
  {
    int i = paramArrayOfa1.length;
    int[] arrayOfInt = new int[i];
    for (int j = 0; j < i; j++) {
      arrayOfInt[j] = paramArrayOfa1[j].s();
    }
    return arrayOfInt;
  }
  
  public final void i(Object paramObject)
  {
    c = ((a)paramObject);
  }
  
  public final E k(a1[] paramArrayOfa1, Z paramZ, x.b paramb, I paramI)
  {
    int[] arrayOfInt1 = new int[paramArrayOfa1.length + 1];
    int i = paramArrayOfa1.length + 1;
    J[][] arrayOfJ = new J[i][];
    int[][][] arrayOfInt = new int[paramArrayOfa1.length + 1][][];
    int j = 0;
    int m;
    for (int k = 0; k < i; k++)
    {
      m = a;
      arrayOfJ[k] = new J[m];
      arrayOfInt[k] = new int[m][];
    }
    int[] arrayOfInt2 = p(paramArrayOfa1);
    for (k = 0; k < a; k++)
    {
      localObject = paramZ.b(k);
      boolean bool;
      if (c == 5) {
        bool = true;
      } else {
        bool = false;
      }
      i = n(paramArrayOfa1, (J)localObject, arrayOfInt1, bool);
      if (i == paramArrayOfa1.length) {
        arrayOfInt3 = new int[a];
      } else {
        arrayOfInt3 = o(paramArrayOfa1[i], (J)localObject);
      }
      m = arrayOfInt1[i];
      arrayOfJ[i][m] = localObject;
      arrayOfInt[i][m] = arrayOfInt3;
      arrayOfInt1[i] = (m + 1);
    }
    paramZ = new Z[paramArrayOfa1.length];
    Object localObject = new String[paramArrayOfa1.length];
    int[] arrayOfInt3 = new int[paramArrayOfa1.length];
    for (k = j; k < paramArrayOfa1.length; k++)
    {
      j = arrayOfInt1[k];
      paramZ[k] = new Z((J[])M.O0(arrayOfJ[k], j));
      arrayOfInt[k] = ((int[][])M.O0(arrayOfInt[k], j));
      localObject[k] = paramArrayOfa1[k].d();
      arrayOfInt3[k] = paramArrayOfa1[k].l();
    }
    k = arrayOfInt1[paramArrayOfa1.length];
    paramArrayOfa1 = new a((String[])localObject, arrayOfInt3, paramZ, arrayOfInt2, arrayOfInt, new Z((J[])M.O0(arrayOfJ[paramArrayOfa1.length], k)));
    paramZ = q(paramArrayOfa1, arrayOfInt, arrayOfInt2, paramb, paramI);
    paramb = C.a(paramArrayOfa1, (B[])second);
    return new E((b1[])first, (y[])second, paramb, paramArrayOfa1);
  }
  
  public abstract Pair q(a parama, int[][][] paramArrayOfInt, int[] paramArrayOfInt1, x.b paramb, I paramI);
  
  public static final class a
  {
    public final int a;
    public final String[] b;
    public final int[] c;
    public final Z[] d;
    public final int[] e;
    public final int[][][] f;
    public final Z g;
    
    public a(String[] paramArrayOfString, int[] paramArrayOfInt1, Z[] paramArrayOfZ, int[] paramArrayOfInt2, int[][][] paramArrayOfInt, Z paramZ)
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
}

/* Location:
 * Qualified Name:     A0.A
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */