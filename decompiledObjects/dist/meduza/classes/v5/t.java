package v5;

import x6.b;

public final class t
{
  public byte[] a;
  public int b;
  public int c;
  public int d;
  
  public t()
  {
    a = e0.f;
  }
  
  public t(byte[] paramArrayOfByte, int paramInt)
  {
    a = paramArrayOfByte;
    d = paramInt;
  }
  
  public final void a()
  {
    int i = b;
    if (i >= 0)
    {
      int j = d;
      if ((i < j) || ((i == j) && (c == 0)))
      {
        bool = true;
        break label38;
      }
    }
    boolean bool = false;
    label38:
    b.H(bool);
  }
  
  public final int b()
  {
    return (d - b) * 8 - c;
  }
  
  public final void c()
  {
    if (c == 0) {
      return;
    }
    c = 0;
    b += 1;
    a();
  }
  
  public final int d()
  {
    boolean bool;
    if (c == 0) {
      bool = true;
    } else {
      bool = false;
    }
    b.H(bool);
    return b;
  }
  
  public final int e()
  {
    return b * 8 + c;
  }
  
  public final boolean f()
  {
    boolean bool;
    if ((a[b] & 128 >> c) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    l();
    return bool;
  }
  
  public final int g(int paramInt)
  {
    if (paramInt == 0) {
      return 0;
    }
    c += paramInt;
    int i = 0;
    int j;
    for (;;)
    {
      j = c;
      if (j <= 8) {
        break;
      }
      k = j - 8;
      c = k;
      arrayOfByte = a;
      m = b;
      b = (m + 1);
      i |= (arrayOfByte[m] & 0xFF) << k;
    }
    byte[] arrayOfByte = a;
    int k = b;
    int m = arrayOfByte[k];
    if (j == 8)
    {
      c = 0;
      b = (k + 1);
    }
    a();
    return -1 >>> 32 - paramInt & (i | (m & 0xFF) >> 8 - j);
  }
  
  public final void h(byte[] paramArrayOfByte, int paramInt)
  {
    int i = (paramInt >> 3) + 0;
    for (int j = 0; j < i; j++)
    {
      arrayOfByte = a;
      k = b;
      m = k + 1;
      b = m;
      n = arrayOfByte[k];
      k = c;
      n = (byte)(n << k);
      paramArrayOfByte[j] = ((byte)n);
      paramArrayOfByte[j] = ((byte)(byte)((0xFF & arrayOfByte[m]) >> 8 - k | n));
    }
    paramInt &= 0x7;
    if (paramInt == 0) {
      return;
    }
    int k = (byte)(paramArrayOfByte[i] & 255 >> paramInt);
    paramArrayOfByte[i] = ((byte)k);
    j = c;
    if (j + paramInt > 8)
    {
      arrayOfByte = a;
      m = b;
      b = (m + 1);
      paramArrayOfByte[i] = ((byte)(byte)(k | (arrayOfByte[m] & 0xFF) << j));
      c = (j - 8);
    }
    int n = c + paramInt;
    c = n;
    byte[] arrayOfByte = a;
    int m = b;
    k = arrayOfByte[m];
    j = paramArrayOfByte[i];
    paramArrayOfByte[i] = ((byte)(byte)((byte)((0xFF & k) >> 8 - n << 8 - paramInt) | j));
    if (n == 8)
    {
      c = 0;
      b = (m + 1);
    }
    a();
  }
  
  public final void i(byte[] paramArrayOfByte, int paramInt)
  {
    boolean bool;
    if (c == 0) {
      bool = true;
    } else {
      bool = false;
    }
    b.H(bool);
    System.arraycopy(a, b, paramArrayOfByte, 0, paramInt);
    b += paramInt;
    a();
  }
  
  public final void j(byte[] paramArrayOfByte, int paramInt)
  {
    a = paramArrayOfByte;
    b = 0;
    c = 0;
    d = paramInt;
  }
  
  public final void k(int paramInt)
  {
    int i = paramInt / 8;
    b = i;
    c = (paramInt - i * 8);
    a();
  }
  
  public final void l()
  {
    int i = c + 1;
    c = i;
    if (i == 8)
    {
      c = 0;
      b += 1;
    }
    a();
  }
  
  public final void m(int paramInt)
  {
    int i = paramInt / 8;
    int j = b + i;
    b = j;
    paramInt = paramInt - i * 8 + c;
    c = paramInt;
    if (paramInt > 7)
    {
      b = (j + 1);
      c = (paramInt - 8);
    }
    a();
  }
  
  public final void n(int paramInt)
  {
    boolean bool;
    if (c == 0) {
      bool = true;
    } else {
      bool = false;
    }
    b.H(bool);
    b += paramInt;
    a();
  }
}

/* Location:
 * Qualified Name:     v5.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */