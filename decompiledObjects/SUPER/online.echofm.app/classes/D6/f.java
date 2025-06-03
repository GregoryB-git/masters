package D6;

import java.util.Arrays;

public final class f
  extends c
{
  public final transient byte[][] t;
  public final transient int[] u;
  
  public f(a parama, int paramInt)
  {
    super(null);
    g.b(p, 0L, paramInt);
    Object localObject = o;
    int i = 0;
    int j = 0;
    int k = j;
    int n;
    while (j < paramInt)
    {
      int m = c;
      n = b;
      if (m != n)
      {
        j += m - n;
        k++;
        localObject = f;
      }
      else
      {
        throw new AssertionError("s.limit == s.pos");
      }
    }
    t = new byte[k][];
    u = new int[k * 2];
    parama = o;
    j = 0;
    k = i;
    while (k < paramInt)
    {
      byte[][] arrayOfByte = t;
      arrayOfByte[j] = a;
      i = c;
      n = b;
      i = k + (i - n);
      k = i;
      if (i > paramInt) {
        k = paramInt;
      }
      localObject = u;
      localObject[j] = k;
      localObject[(arrayOfByte.length + j)] = n;
      d = true;
      j++;
      parama = f;
    }
  }
  
  private Object writeReplace()
  {
    return C();
  }
  
  public final c C()
  {
    return new c(z());
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof c))
    {
      paramObject = (c)paramObject;
      if ((((c)paramObject).r() == r()) && (w(0, (c)paramObject, 0, r()))) {}
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    int i = p;
    if (i != 0) {
      return i;
    }
    int j = t.length;
    int k = 0;
    int m = 1;
    int i2;
    for (int n = 0; k < j; n = i2)
    {
      byte[] arrayOfByte = t[k];
      int[] arrayOfInt = u;
      int i1 = arrayOfInt[(j + k)];
      i2 = arrayOfInt[k];
      for (i = i1; i < i2 - n + i1; i++) {
        m = m * 31 + arrayOfByte[i];
      }
      k++;
    }
    p = m;
    return m;
  }
  
  public byte l(int paramInt)
  {
    g.b(u[(t.length - 1)], paramInt, 1L);
    int i = x(paramInt);
    int j;
    if (i == 0) {
      j = 0;
    } else {
      j = u[(i - 1)];
    }
    int[] arrayOfInt = u;
    byte[][] arrayOfByte = t;
    int k = arrayOfInt[(arrayOfByte.length + i)];
    return arrayOfByte[i][(paramInt - j + k)];
  }
  
  public String m()
  {
    return C().m();
  }
  
  public boolean o(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    if ((paramInt1 >= 0) && (paramInt1 <= r() - paramInt3) && (paramInt2 >= 0) && (paramInt2 <= paramArrayOfByte.length - paramInt3))
    {
      int i = x(paramInt1);
      int j = paramInt1;
      for (paramInt1 = i; paramInt3 > 0; paramInt1++)
      {
        if (paramInt1 == 0) {
          i = 0;
        } else {
          i = u[(paramInt1 - 1)];
        }
        int k = Math.min(paramInt3, u[paramInt1] - i + i - j);
        int[] arrayOfInt = u;
        byte[][] arrayOfByte = t;
        int m = arrayOfInt[(arrayOfByte.length + paramInt1)];
        if (!g.a(arrayOfByte[paramInt1], j - i + m, paramArrayOfByte, paramInt2, k)) {
          return false;
        }
        j += k;
        paramInt2 += k;
        paramInt3 -= k;
      }
      return true;
    }
    return false;
  }
  
  public int r()
  {
    return u[(t.length - 1)];
  }
  
  public c s(int paramInt1, int paramInt2)
  {
    return C().s(paramInt1, paramInt2);
  }
  
  public String toString()
  {
    return C().toString();
  }
  
  public String u()
  {
    return C().u();
  }
  
  public boolean w(int paramInt1, c paramc, int paramInt2, int paramInt3)
  {
    if ((paramInt1 >= 0) && (paramInt1 <= r() - paramInt3))
    {
      for (int i = x(paramInt1); paramInt3 > 0; i++)
      {
        int j;
        if (i == 0) {
          j = 0;
        } else {
          j = u[(i - 1)];
        }
        int k = Math.min(paramInt3, u[i] - j + j - paramInt1);
        int[] arrayOfInt = u;
        byte[][] arrayOfByte = t;
        int m = arrayOfInt[(arrayOfByte.length + i)];
        if (!paramc.o(paramInt2, arrayOfByte[i], paramInt1 - j + m, k)) {
          return false;
        }
        paramInt1 += k;
        paramInt2 += k;
        paramInt3 -= k;
      }
      return true;
    }
    return false;
  }
  
  public final int x(int paramInt)
  {
    paramInt = Arrays.binarySearch(u, 0, t.length, paramInt + 1);
    if (paramInt < 0) {
      paramInt = paramInt;
    }
    return paramInt;
  }
  
  public byte[] z()
  {
    Object localObject1 = u;
    Object localObject2 = t;
    localObject1 = new byte[localObject1[(localObject2.length - 1)]];
    int i = localObject2.length;
    int j = 0;
    int n;
    for (int k = 0; j < i; k = n)
    {
      localObject2 = u;
      int m = localObject2[(i + j)];
      n = localObject2[j];
      System.arraycopy(t[j], m, localObject1, k, n - k);
      j++;
    }
    return (byte[])localObject1;
  }
}

/* Location:
 * Qualified Name:     D6.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */