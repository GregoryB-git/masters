package v5;

import x6.b;

public final class v
{
  public byte[] a;
  public int b;
  public int c;
  public int d;
  
  public v(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    a = paramArrayOfByte;
    c = paramInt1;
    b = paramInt2;
    d = 0;
    a();
  }
  
  public final void a()
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
    b.H(bool);
  }
  
  public final boolean b(int paramInt)
  {
    int i = c;
    int j = paramInt / 8;
    int k = i + j;
    int m = d + paramInt - j * 8;
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
      if (h(i))
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
  
  public final boolean c()
  {
    int i = c;
    int j = d;
    boolean bool1 = false;
    for (int k = 0; (c < b) && (!d()); k++) {}
    int m;
    if (c == b) {
      m = 1;
    } else {
      m = 0;
    }
    c = i;
    d = j;
    boolean bool2 = bool1;
    if (m == 0)
    {
      bool2 = bool1;
      if (b(k * 2 + 1)) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public final boolean d()
  {
    boolean bool;
    if ((a[c] & 128 >> d) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    i();
    return bool;
  }
  
  public final int e(int paramInt)
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
      m = j - 8;
      d = m;
      arrayOfByte = a;
      j = c;
      i |= (arrayOfByte[j] & 0xFF) << m;
      if (!h(j + 1)) {
        k = 1;
      }
      c = (j + k);
    }
    byte[] arrayOfByte = a;
    int n = c;
    int m = arrayOfByte[n];
    if (j == 8)
    {
      d = 0;
      if (!h(n + 1)) {
        k = 1;
      }
      c = (n + k);
    }
    a();
    return -1 >>> 32 - paramInt & (i | (m & 0xFF) >> 8 - j);
  }
  
  public final int f()
  {
    int i = 0;
    for (int j = 0; !d(); j++) {}
    if (j > 0) {
      i = e(j);
    }
    return (1 << j) - 1 + i;
  }
  
  public final int g()
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
  
  public final boolean h(int paramInt)
  {
    boolean bool = true;
    if ((2 <= paramInt) && (paramInt < b))
    {
      byte[] arrayOfByte = a;
      if ((arrayOfByte[paramInt] == 3) && (arrayOfByte[(paramInt - 2)] == 0) && (arrayOfByte[(paramInt - 1)] == 0)) {}
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public final void i()
  {
    int i = d;
    int j = 1;
    i++;
    d = i;
    if (i == 8)
    {
      d = 0;
      i = c;
      if (h(i + 1)) {
        j = 2;
      }
      c = (i + j);
    }
    a();
  }
  
  public final void j(int paramInt)
  {
    int i = c;
    int j = paramInt / 8;
    int k = i + j;
    c = k;
    j = paramInt - j * 8 + d;
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
      if (h(i))
      {
        c += 1;
        paramInt = i + 2;
      }
    }
    a();
  }
}

/* Location:
 * Qualified Name:     v5.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */