package com.google.ads.interactivemedia.v3.internal;

public final class vz
{
  public byte[] a;
  private int b;
  private int c;
  private int d;
  
  public vz()
  {
    a = wl.f;
  }
  
  public vz(byte[] paramArrayOfByte)
  {
    this(paramArrayOfByte, paramArrayOfByte.length);
  }
  
  private vz(byte[] paramArrayOfByte, int paramInt)
  {
    a = paramArrayOfByte;
    d = paramInt;
  }
  
  private final void f()
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
    rp.c(bool);
  }
  
  public final int a()
  {
    return (d - b << 3) - c;
  }
  
  public final void a(int paramInt)
  {
    int i = paramInt / 8;
    b = i;
    c = (paramInt - (i << 3));
    f();
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    int i = paramInt1 & 0x3FFF;
    paramInt1 = Math.min(8 - c, 14);
    int j = c;
    int k = 8 - j - paramInt1;
    byte[] arrayOfByte = a;
    paramInt2 = b;
    j = (byte)((65280 >> j | (1 << k) - 1) & arrayOfByte[paramInt2]);
    arrayOfByte[paramInt2] = ((byte)j);
    paramInt1 = 14 - paramInt1;
    arrayOfByte[paramInt2] = ((byte)(byte)(j | i >>> paramInt1 << k));
    paramInt2++;
    while (paramInt1 > 8)
    {
      a[paramInt2] = ((byte)(byte)(i >>> paramInt1 - 8));
      paramInt1 -= 8;
      paramInt2++;
    }
    k = 8 - paramInt1;
    arrayOfByte = a;
    j = (byte)(arrayOfByte[paramInt2] & (1 << k) - 1);
    arrayOfByte[paramInt2] = ((byte)j);
    arrayOfByte[paramInt2] = ((byte)(byte)((i & (1 << paramInt1) - 1) << k | j));
    b(14);
    f();
  }
  
  public final void a(byte[] paramArrayOfByte, int paramInt)
  {
    a = paramArrayOfByte;
    b = 0;
    c = 0;
    d = paramInt;
  }
  
  public final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = (paramInt2 >> 3) + 0;
    for (paramInt1 = 0; paramInt1 < i; paramInt1++)
    {
      arrayOfByte = a;
      j = b;
      k = j + 1;
      b = k;
      m = arrayOfByte[j];
      j = c;
      m = (byte)(m << j);
      paramArrayOfByte[paramInt1] = ((byte)m);
      paramArrayOfByte[paramInt1] = ((byte)(byte)((0xFF & arrayOfByte[k]) >> 8 - j | m));
    }
    paramInt1 = paramInt2 & 0x7;
    if (paramInt1 == 0) {
      return;
    }
    int k = (byte)(paramArrayOfByte[i] & 255 >> paramInt1);
    paramArrayOfByte[i] = ((byte)k);
    paramInt2 = c;
    if (paramInt2 + paramInt1 > 8)
    {
      arrayOfByte = a;
      j = b;
      b = (j + 1);
      paramArrayOfByte[i] = ((byte)(byte)(k | (arrayOfByte[j] & 0xFF) << paramInt2));
      c = (paramInt2 - 8);
    }
    k = c + paramInt1;
    c = k;
    byte[] arrayOfByte = a;
    paramInt2 = b;
    int m = arrayOfByte[paramInt2];
    int j = paramArrayOfByte[i];
    paramArrayOfByte[i] = ((byte)(byte)((byte)((0xFF & m) >> 8 - k << 8 - paramInt1) | j));
    if (k == 8)
    {
      c = 0;
      b = (paramInt2 + 1);
    }
    f();
  }
  
  public final int b()
  {
    return (b << 3) + c;
  }
  
  public final void b(int paramInt)
  {
    int i = paramInt / 8;
    int j = b + i;
    b = j;
    paramInt = paramInt - (i << 3) + c;
    c = paramInt;
    if (paramInt > 7)
    {
      b = (j + 1);
      c = (paramInt - 8);
    }
    f();
  }
  
  public final int c(int paramInt)
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
    int m = b;
    int k = arrayOfByte[m];
    if (j == 8)
    {
      c = 0;
      b = (m + 1);
    }
    f();
    return -1 >>> 32 - paramInt & (i | (k & 0xFF) >> 8 - j);
  }
  
  public final void c()
  {
    int i = c + 1;
    c = i;
    if (i == 8)
    {
      c = 0;
      b += 1;
    }
    f();
  }
  
  public final boolean d()
  {
    boolean bool;
    if ((a[b] & 128 >> c) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    c();
    return bool;
  }
  
  public final void e()
  {
    if (c == 0) {
      return;
    }
    c = 0;
    b += 1;
    f();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.vz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */