package g0;

import java.nio.charset.Charset;

public final class y
{
  public byte[] a;
  public int b;
  public int c;
  public int d;
  
  public y()
  {
    a = M.f;
  }
  
  public y(byte[] paramArrayOfByte)
  {
    this(paramArrayOfByte, paramArrayOfByte.length);
  }
  
  public y(byte[] paramArrayOfByte, int paramInt)
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
    a.f(bool);
  }
  
  public int b()
  {
    return (d - b) * 8 - c;
  }
  
  public void c()
  {
    if (c == 0) {
      return;
    }
    c = 0;
    b += 1;
    a();
  }
  
  public int d()
  {
    boolean bool;
    if (c == 0) {
      bool = true;
    } else {
      bool = false;
    }
    a.f(bool);
    return b;
  }
  
  public int e()
  {
    return b * 8 + c;
  }
  
  public void f(int paramInt1, int paramInt2)
  {
    int i = paramInt1;
    if (paramInt2 < 32) {
      i = paramInt1 & (1 << paramInt2) - 1;
    }
    int j = Math.min(8 - c, paramInt2);
    int k = c;
    paramInt1 = 8 - k - j;
    byte[] arrayOfByte = a;
    int m = b;
    k = (byte)((65280 >> k | (1 << paramInt1) - 1) & arrayOfByte[m]);
    arrayOfByte[m] = ((byte)k);
    j = paramInt2 - j;
    arrayOfByte[m] = ((byte)(byte)(k | i >>> j << paramInt1));
    for (paramInt1 = m + 1; j > 8; paramInt1++)
    {
      a[paramInt1] = ((byte)(byte)(i >>> j - 8));
      j -= 8;
    }
    m = 8 - j;
    arrayOfByte = a;
    k = (byte)(arrayOfByte[paramInt1] & (1 << m) - 1);
    arrayOfByte[paramInt1] = ((byte)k);
    arrayOfByte[paramInt1] = ((byte)(byte)((i & (1 << j) - 1) << m | k));
    r(paramInt2);
    a();
  }
  
  public boolean g()
  {
    boolean bool;
    if ((a[b] & 128 >> c) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    q();
    return bool;
  }
  
  public int h(int paramInt)
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
      j = b;
      b = (j + 1);
      i |= (arrayOfByte[j] & 0xFF) << k;
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
  
  public void i(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = (paramInt2 >> 3) + paramInt1;
    while (paramInt1 < i)
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
      paramInt1++;
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
    int m = c + paramInt1;
    c = m;
    byte[] arrayOfByte = a;
    int j = b;
    paramInt2 = arrayOfByte[j];
    k = paramArrayOfByte[i];
    paramArrayOfByte[i] = ((byte)(byte)((byte)((0xFF & paramInt2) >> 8 - m << 8 - paramInt1) | k));
    if (m == 8)
    {
      c = 0;
      b = (j + 1);
    }
    a();
  }
  
  public long j(int paramInt)
  {
    if (paramInt <= 32) {
      return M.h1(h(paramInt));
    }
    return M.g1(h(paramInt - 32), h(32));
  }
  
  public void k(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    boolean bool;
    if (c == 0) {
      bool = true;
    } else {
      bool = false;
    }
    a.f(bool);
    System.arraycopy(a, b, paramArrayOfByte, paramInt1, paramInt2);
    b += paramInt2;
    a();
  }
  
  public String l(int paramInt, Charset paramCharset)
  {
    byte[] arrayOfByte = new byte[paramInt];
    k(arrayOfByte, 0, paramInt);
    return new String(arrayOfByte, paramCharset);
  }
  
  public void m(z paramz)
  {
    o(paramz.e(), paramz.g());
    p(paramz.f() * 8);
  }
  
  public void n(byte[] paramArrayOfByte)
  {
    o(paramArrayOfByte, paramArrayOfByte.length);
  }
  
  public void o(byte[] paramArrayOfByte, int paramInt)
  {
    a = paramArrayOfByte;
    b = 0;
    c = 0;
    d = paramInt;
  }
  
  public void p(int paramInt)
  {
    int i = paramInt / 8;
    b = i;
    c = (paramInt - i * 8);
    a();
  }
  
  public void q()
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
  
  public void r(int paramInt)
  {
    int i = paramInt / 8;
    int j = b + i;
    b = j;
    paramInt = c + (paramInt - i * 8);
    c = paramInt;
    if (paramInt > 7)
    {
      b = (j + 1);
      c = (paramInt - 8);
    }
    a();
  }
  
  public void s(int paramInt)
  {
    boolean bool;
    if (c == 0) {
      bool = true;
    } else {
      bool = false;
    }
    a.f(bool);
    b += paramInt;
    a();
  }
}

/* Location:
 * Qualified Name:     g0.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */