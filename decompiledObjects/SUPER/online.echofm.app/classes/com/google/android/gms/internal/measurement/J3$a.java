package com.google.android.gms.internal.measurement;

public final class J3$a
  extends J3
{
  public final byte[] d;
  public final int e;
  public final int f;
  public int g;
  
  public J3$a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    super(null);
    if (paramArrayOfByte != null)
    {
      if ((paramArrayOfByte.length - paramInt2 | paramInt2) >= 0)
      {
        d = paramArrayOfByte;
        e = 0;
        g = 0;
        f = paramInt2;
        return;
      }
      throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(0), Integer.valueOf(paramInt2) }));
    }
    throw new NullPointerException("buffer");
  }
  
  public final void A0(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      System.arraycopy(paramArrayOfByte, paramInt1, d, g, paramInt2);
      g += paramInt2;
      return;
    }
    catch (IndexOutOfBoundsException paramArrayOfByte)
    {
      throw new J3.b(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(g), Integer.valueOf(f), Integer.valueOf(paramInt2) }), paramArrayOfByte);
    }
  }
  
  public final void H(int paramInt)
  {
    if (paramInt >= 0)
    {
      U(paramInt);
      return;
    }
    N(paramInt);
  }
  
  public final void K(int paramInt1, int paramInt2)
  {
    V(paramInt1, 0);
    H(paramInt2);
  }
  
  public final void L(int paramInt, long paramLong)
  {
    V(paramInt, 0);
    N(paramLong);
  }
  
  public final void M(int paramInt, q3 paramq3)
  {
    V(1, 3);
    b0(2, paramInt);
    n(3, paramq3);
    V(1, 4);
  }
  
  public final void N(long paramLong)
  {
    long l = paramLong;
    byte[] arrayOfByte1;
    int i;
    if (J3.W())
    {
      l = paramLong;
      if (b() >= 10) {
        for (;;)
        {
          if ((paramLong & 0xFFFFFFFFFFFFFF80) == 0L)
          {
            arrayOfByte1 = d;
            i = g;
            g = (1 + i);
            D5.m(arrayOfByte1, i, (byte)(int)paramLong);
            return;
          }
          arrayOfByte1 = d;
          i = g;
          g = (i + 1);
          D5.m(arrayOfByte1, i, (byte)((int)paramLong & 0x7F | 0x80));
          paramLong >>>= 7;
        }
      }
    }
    byte[] arrayOfByte2;
    for (;;)
    {
      if ((l & 0xFFFFFFFFFFFFFF80) == 0L) {
        try
        {
          arrayOfByte1 = d;
          i = g;
          g = (i + 1);
          arrayOfByte1[i] = ((byte)(byte)(int)l);
          return;
        }
        catch (IndexOutOfBoundsException localIndexOutOfBoundsException) {}
      }
      arrayOfByte2 = d;
      i = g;
      g = (i + 1);
      arrayOfByte2[i] = ((byte)(byte)((int)l & 0x7F | 0x80));
      l >>>= 7;
    }
    throw new J3.b(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(g), Integer.valueOf(f), Integer.valueOf(1) }), arrayOfByte2);
  }
  
  public final void U(int paramInt)
  {
    byte[] arrayOfByte2;
    for (;;)
    {
      if ((paramInt & 0xFFFFFF80) == 0) {
        try
        {
          byte[] arrayOfByte1 = d;
          i = g;
          g = (i + 1);
          arrayOfByte1[i] = ((byte)(byte)paramInt);
          return;
        }
        catch (IndexOutOfBoundsException localIndexOutOfBoundsException) {}
      }
      arrayOfByte2 = d;
      int i = g;
      g = (i + 1);
      arrayOfByte2[i] = ((byte)(byte)(paramInt & 0x7F | 0x80));
      paramInt >>>= 7;
    }
    throw new J3.b(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(g), Integer.valueOf(f), Integer.valueOf(1) }), arrayOfByte2);
  }
  
  public final void V(int paramInt1, int paramInt2)
  {
    U(paramInt1 << 3 | paramInt2);
  }
  
  public final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    A0(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public final int b()
  {
    return f - g;
  }
  
  public final void b0(int paramInt1, int paramInt2)
  {
    V(paramInt1, 0);
    U(paramInt2);
  }
  
  public final void j(byte paramByte)
  {
    try
    {
      byte[] arrayOfByte = d;
      int i = g;
      g = (i + 1);
      arrayOfByte[i] = ((byte)paramByte);
      return;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      throw new J3.b(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(g), Integer.valueOf(f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
    }
  }
  
  public final void k(int paramInt)
  {
    try
    {
      byte[] arrayOfByte = d;
      int i = g;
      arrayOfByte[i] = ((byte)(byte)paramInt);
      arrayOfByte[(i + 1)] = ((byte)(byte)(paramInt >> 8));
      arrayOfByte[(i + 2)] = ((byte)(byte)(paramInt >> 16));
      g = (i + 4);
      arrayOfByte[(i + 3)] = ((byte)(byte)(paramInt >>> 24));
      return;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      throw new J3.b(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(g), Integer.valueOf(f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
    }
  }
  
  public final void l(int paramInt1, int paramInt2)
  {
    V(paramInt1, 5);
    k(paramInt2);
  }
  
  public final void m(int paramInt, long paramLong)
  {
    V(paramInt, 1);
    s(paramLong);
  }
  
  public final void n(int paramInt, q3 paramq3)
  {
    V(paramInt, 2);
    t(paramq3);
  }
  
  public final void o(int paramInt, I4 paramI4)
  {
    V(1, 3);
    b0(2, paramInt);
    V(3, 2);
    u(paramI4);
    V(1, 4);
  }
  
  public final void p(int paramInt, I4 paramI4, Z4 paramZ4)
  {
    V(paramInt, 2);
    U(((j3)paramI4).c(paramZ4));
    paramZ4.i(paramI4, a);
  }
  
  public final void q(int paramInt, String paramString)
  {
    V(paramInt, 2);
    v(paramString);
  }
  
  public final void r(int paramInt, boolean paramBoolean)
  {
    V(paramInt, 0);
    j((byte)paramBoolean);
  }
  
  public final void s(long paramLong)
  {
    try
    {
      byte[] arrayOfByte = d;
      int i = g;
      arrayOfByte[i] = ((byte)(byte)(int)paramLong);
      arrayOfByte[(i + 1)] = ((byte)(byte)(int)(paramLong >> 8));
      arrayOfByte[(i + 2)] = ((byte)(byte)(int)(paramLong >> 16));
      arrayOfByte[(i + 3)] = ((byte)(byte)(int)(paramLong >> 24));
      arrayOfByte[(i + 4)] = ((byte)(byte)(int)(paramLong >> 32));
      arrayOfByte[(i + 5)] = ((byte)(byte)(int)(paramLong >> 40));
      arrayOfByte[(i + 6)] = ((byte)(byte)(int)(paramLong >> 48));
      g = (i + 8);
      arrayOfByte[(i + 7)] = ((byte)(byte)(int)(paramLong >> 56));
      return;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      throw new J3.b(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(g), Integer.valueOf(f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
    }
  }
  
  public final void t(q3 paramq3)
  {
    U(paramq3.S());
    paramq3.D(this);
  }
  
  public final void u(I4 paramI4)
  {
    U(paramI4.a());
    paramI4.f(this);
  }
  
  public final void v(String paramString)
  {
    int i = g;
    try
    {
      int j = J3.v0(paramString.length() * 3);
      int k = J3.v0(paramString.length());
      if (k == j)
      {
        j = i + k;
        g = j;
        j = E5.b(paramString, d, j, b());
        g = i;
        U(j - i - k);
        g = j;
        return;
      }
    }
    catch (IndexOutOfBoundsException paramString)
    {
      break label113;
    }
    catch (H5 localH5) {}
    U(E5.a(paramString));
    g = E5.b(paramString, d, g, b());
    return;
    label113:
    throw new J3.b(paramString);
    g = i;
    w(paramString, localH5);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.J3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */