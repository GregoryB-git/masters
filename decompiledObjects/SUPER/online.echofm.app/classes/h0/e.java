package h0;

import g0.a;

public final class e
{
  public byte[] a;
  public int b;
  public int c;
  public int d;
  
  public e(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    i(paramArrayOfByte, paramInt1, paramInt2);
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
    a.f(bool);
  }
  
  public boolean b(int paramInt)
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
      if (j(i))
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
  
  public boolean c()
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
  
  public boolean d()
  {
    boolean bool;
    if ((a[c] & 128 >> d) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    k();
    return bool;
  }
  
  public int e(int paramInt)
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
      if (!j(m + 1)) {
        k = 1;
      }
      c = (m + k);
    }
    byte[] arrayOfByte = a;
    int m = c;
    int n = arrayOfByte[m];
    if (j == 8)
    {
      d = 0;
      if (!j(m + 1)) {
        k = 1;
      }
      c = (m + k);
    }
    a();
    return -1 >>> 32 - paramInt & (i | (n & 0xFF) >> 8 - j);
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
  
  public int g()
  {
    int i = f();
    int j;
    if (i % 2 == 0) {
      j = -1;
    } else {
      j = 1;
    }
    return j * ((i + 1) / 2);
  }
  
  public int h()
  {
    return f();
  }
  
  public void i(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    a = paramArrayOfByte;
    c = paramInt1;
    b = paramInt2;
    d = 0;
    a();
  }
  
  public final boolean j(int paramInt)
  {
    if ((2 <= paramInt) && (paramInt < b))
    {
      byte[] arrayOfByte = a;
      if ((arrayOfByte[paramInt] == 3) && (arrayOfByte[(paramInt - 2)] == 0))
      {
        bool = true;
        if (arrayOfByte[(paramInt - 1)] == 0) {
          return bool;
        }
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public void k()
  {
    int i = d;
    int j = 1;
    i++;
    d = i;
    if (i == 8)
    {
      d = 0;
      i = c;
      if (j(i + 1)) {
        j = 2;
      }
      c = (i + j);
    }
    a();
  }
  
  public void l(int paramInt)
  {
    int i = c;
    int j = paramInt / 8;
    int k = i + j;
    c = k;
    j = d + (paramInt - j * 8);
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
      if (j(i))
      {
        c += 1;
        paramInt = i + 2;
      }
    }
    a();
  }
}

/* Location:
 * Qualified Name:     h0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */