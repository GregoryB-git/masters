package com.google.ads.interactivemedia.v3.internal;

public final class wb
{
  private byte[] a;
  private int b;
  private int c;
  private int d;
  
  public wb(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    a(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  private final boolean d(int paramInt)
  {
    if ((2 <= paramInt) && (paramInt < b))
    {
      byte[] arrayOfByte = a;
      if ((arrayOfByte[paramInt] == 3) && (arrayOfByte[(paramInt - 2)] == 0) && (arrayOfByte[(paramInt - 1)] == 0)) {
        return true;
      }
    }
    return false;
  }
  
  private final int f()
  {
    int i = 0;
    for (int j = 0; !b(); j++) {}
    if (j > 0) {
      i = c(j);
    }
    return (1 << j) - 1 + i;
  }
  
  private final void g()
  {
    int i = c;
    if (i >= 0)
    {
      int j = b;
      if ((i < j) || ((i == j) && (d == 0)))
      {
        bool = true;
        break label38;
      }
    }
    boolean bool = false;
    label38:
    rp.c(bool);
  }
  
  public final void a()
  {
    int i = d;
    int j = 1;
    i++;
    d = i;
    if (i == 8)
    {
      d = 0;
      i = c;
      if (d(i + 1)) {
        j = 2;
      }
      c = (i + j);
    }
    g();
  }
  
  public final void a(int paramInt)
  {
    int i = c;
    int j = paramInt / 8;
    int k = i + j;
    c = k;
    j = paramInt - (j << 3) + d;
    d = j;
    paramInt = i;
    if (j > 7)
    {
      c = (k + 1);
      d = (j - 8);
      paramInt = i;
    }
    for (;;)
    {
      i = paramInt + 1;
      if (i > c) {
        break;
      }
      paramInt = i;
      if (d(i))
      {
        c += 1;
        paramInt = i + 2;
      }
    }
    g();
  }
  
  public final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    a = paramArrayOfByte;
    c = paramInt1;
    b = paramInt2;
    d = 0;
    g();
  }
  
  public final boolean b()
  {
    boolean bool;
    if ((a[c] & 128 >> d) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    a();
    return bool;
  }
  
  public final boolean b(int paramInt)
  {
    int i = c;
    int j = paramInt / 8;
    int k = i + j;
    int m = d + paramInt - (j << 3);
    paramInt = k;
    j = m;
    if (m > 7)
    {
      paramInt = k + 1;
      j = m - 8;
    }
    boolean bool1 = true;
    k = paramInt;
    paramInt = i;
    for (;;)
    {
      i = paramInt + 1;
      if ((i > k) || (k >= b)) {
        break;
      }
      paramInt = i;
      if (d(i))
      {
        k++;
        paramInt = i + 2;
      }
    }
    paramInt = b;
    boolean bool2 = bool1;
    if (k >= paramInt) {
      if ((k == paramInt) && (j == 0)) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    return bool2;
  }
  
  public final int c(int paramInt)
  {
    d += paramInt;
    int i = 0;
    int j;
    int k;
    for (;;)
    {
      j = d;
      k = 2;
      if (j <= 8) {
        break;
      }
      j -= 8;
      d = j;
      arrayOfByte = a;
      m = c;
      i |= (arrayOfByte[m] & 0xFF) << j;
      if (!d(m + 1)) {
        k = 1;
      }
      c = (m + k);
    }
    byte[] arrayOfByte = a;
    int n = c;
    int m = arrayOfByte[n];
    if (j == 8)
    {
      d = 0;
      if (!d(n + 1)) {
        k = 1;
      }
      c = (n + k);
    }
    g();
    return -1 >>> 32 - paramInt & (i | (m & 0xFF) >> 8 - j);
  }
  
  public final boolean c()
  {
    int i = c;
    int j = d;
    for (int k = 0; (c < b) && (!b()); k++) {}
    int m;
    if (c == b) {
      m = 1;
    } else {
      m = 0;
    }
    c = i;
    d = j;
    return (m == 0) && (b((k << 1) + 1));
  }
  
  public final int d()
  {
    return f();
  }
  
  public final int e()
  {
    int i = f();
    int j;
    if (i % 2 == 0) {
      j = -1;
    } else {
      j = 1;
    }
    return (i + 1) / 2 * j;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.wb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */