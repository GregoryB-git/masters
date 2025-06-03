package xc;

import b.a0;
import java.security.MessageDigest;
import sb.j;

public final class v
  extends i
{
  public final transient byte[][] e;
  public final transient int[] f;
  
  public v(byte[][] paramArrayOfByte, int[] paramArrayOfInt)
  {
    super(da);
    e = paramArrayOfByte;
    f = paramArrayOfInt;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject != this)
    {
      if ((paramObject instanceof i))
      {
        paramObject = (i)paramObject;
        if ((((i)paramObject).i() != i()) || (!q((i)paramObject, i()))) {}
      }
    }
    else {
      return true;
    }
    boolean bool = false;
    return bool;
  }
  
  public final String f()
  {
    return new i(s()).f();
  }
  
  public final i h(String paramString)
  {
    paramString = MessageDigest.getInstance(paramString);
    int i = e.length;
    int j = 0;
    int n;
    for (int k = 0; j < i; k = n)
    {
      int[] arrayOfInt = f;
      int m = arrayOfInt[(i + j)];
      n = arrayOfInt[j];
      paramString.update(e[j], m, n - k);
      j++;
    }
    paramString = paramString.digest();
    ec.i.d(paramString, "digestBytes");
    return new i(paramString);
  }
  
  public final int hashCode()
  {
    int i = b;
    if (i == 0)
    {
      int j = e.length;
      int k = 0;
      i = 1;
      int i1;
      for (int m = 0; k < j; m = i1)
      {
        Object localObject = f;
        int n = localObject[(j + k)];
        i1 = localObject[k];
        localObject = e[k];
        for (int i2 = n; i2 < i1 - m + n; i2++) {
          i = i * 31 + localObject[i2];
        }
        k++;
      }
      b = i;
    }
    return i;
  }
  
  public final int i()
  {
    return f[(e.length - 1)];
  }
  
  public final String l()
  {
    return new i(s()).l();
  }
  
  public final byte[] m()
  {
    return s();
  }
  
  public final byte n(int paramInt)
  {
    b.b(f[(e.length - 1)], paramInt, 1L);
    int i = a0.E(this, paramInt);
    int j;
    if (i == 0) {
      j = 0;
    } else {
      j = f[(i - 1)];
    }
    int[] arrayOfInt = f;
    byte[][] arrayOfByte = e;
    int k = arrayOfInt[(arrayOfByte.length + i)];
    return arrayOfByte[i][(paramInt - j + k)];
  }
  
  public final boolean p(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    ec.i.e(paramArrayOfByte, "other");
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramInt1 >= 0)
    {
      bool2 = bool1;
      if (paramInt1 <= i() - paramInt3)
      {
        bool2 = bool1;
        if (paramInt2 >= 0) {
          if (paramInt2 > paramArrayOfByte.length - paramInt3)
          {
            bool2 = bool1;
          }
          else
          {
            int i = paramInt3 + paramInt1;
            int j = a0.E(this, paramInt1);
            paramInt3 = paramInt2;
            for (paramInt2 = j; paramInt1 < i; paramInt2++)
            {
              if (paramInt2 == 0) {
                j = 0;
              } else {
                j = f[(paramInt2 - 1)];
              }
              int[] arrayOfInt = f;
              int k = arrayOfInt[paramInt2];
              int m = arrayOfInt[(e.length + paramInt2)];
              k = Math.min(i, k - j + j) - paramInt1;
              if (!b.a(e[paramInt2], paramInt1 - j + m, paramArrayOfByte, paramInt3, k))
              {
                bool2 = bool1;
                break label194;
              }
              paramInt3 += k;
              paramInt1 += k;
            }
            bool2 = true;
          }
        }
      }
    }
    label194:
    return bool2;
  }
  
  public final boolean q(i parami, int paramInt)
  {
    ec.i.e(parami, "other");
    int i = i();
    boolean bool = false;
    if (i - paramInt >= 0)
    {
      int j = paramInt + 0;
      paramInt = a0.E(this, 0);
      int k = 0;
      i = k;
      while (k < j)
      {
        int m;
        if (paramInt == 0) {
          m = 0;
        } else {
          m = f[(paramInt - 1)];
        }
        int[] arrayOfInt = f;
        int n = arrayOfInt[paramInt];
        int i1 = arrayOfInt[(e.length + paramInt)];
        n = Math.min(j, n - m + m) - k;
        if (!parami.p(i, e[paramInt], k - m + i1, n)) {
          break label157;
        }
        i += n;
        k += n;
        paramInt++;
      }
      bool = true;
    }
    label157:
    return bool;
  }
  
  public final i r()
  {
    return new i(s()).r();
  }
  
  public final byte[] s()
  {
    byte[] arrayOfByte = new byte[i()];
    int i = e.length;
    int j = 0;
    int k = 0;
    int m = k;
    while (j < i)
    {
      Object localObject = f;
      int n = localObject[(i + j)];
      int i1 = localObject[j];
      localObject = e[j];
      k = i1 - k;
      j.k((byte[])localObject, m, arrayOfByte, n, n + k);
      m += k;
      j++;
      k = i1;
    }
    return arrayOfByte;
  }
  
  public final String toString()
  {
    return new i(s()).toString();
  }
  
  public final void u(f paramf, int paramInt)
  {
    ec.i.e(paramf, "buffer");
    int i = 0 + paramInt;
    int j = a0.E(this, 0);
    int k = 0;
    while (k < i)
    {
      if (j == 0) {
        m = 0;
      } else {
        m = f[(j - 1)];
      }
      Object localObject = f;
      int n = localObject[j];
      int i1 = localObject[(e.length + j)];
      n = Math.min(i, n - m + m) - k;
      int m = k - m + i1;
      localObject = new t(e[j], m, m + n, true, false);
      t localt = a;
      if (localt == null)
      {
        g = ((t)localObject);
        f = ((t)localObject);
        a = ((t)localObject);
      }
      else
      {
        localt = g;
        ec.i.b(localt);
        localt.b((t)localObject);
      }
      k += n;
      j++;
    }
    b += paramInt;
  }
}

/* Location:
 * Qualified Name:     xc.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */