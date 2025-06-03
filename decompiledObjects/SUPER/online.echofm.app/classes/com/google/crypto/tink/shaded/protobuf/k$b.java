package com.google.crypto.tink.shaded.protobuf;

public class k$b
  extends k
{
  public final byte[] e;
  public final int f;
  public final int g;
  public int h;
  
  public k$b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    super(null);
    if (paramArrayOfByte != null)
    {
      int i = paramArrayOfByte.length;
      int j = paramInt1 + paramInt2;
      if ((paramInt1 | paramInt2 | i - j) >= 0)
      {
        e = paramArrayOfByte;
        f = paramInt1;
        h = paramInt1;
        g = j;
        return;
      }
      throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
    }
    throw new NullPointerException("buffer");
  }
  
  public final void C0(int paramInt, String paramString)
  {
    D0(paramInt, 2);
    M0(paramString);
  }
  
  public final void D0(int paramInt1, int paramInt2)
  {
    F0(q0.c(paramInt1, paramInt2));
  }
  
  public final void E0(int paramInt1, int paramInt2)
  {
    D0(paramInt1, 0);
    F0(paramInt2);
  }
  
  public final void F0(int paramInt)
  {
    byte[] arrayOfByte2;
    for (;;)
    {
      if ((paramInt & 0xFFFFFF80) == 0) {
        try
        {
          byte[] arrayOfByte1 = e;
          i = h;
          h = (i + 1);
          arrayOfByte1[i] = ((byte)(byte)paramInt);
          return;
        }
        catch (IndexOutOfBoundsException localIndexOutOfBoundsException) {}
      }
      arrayOfByte2 = e;
      int i = h;
      h = (i + 1);
      arrayOfByte2[i] = ((byte)(byte)(paramInt & 0x7F | 0x80));
      paramInt >>>= 7;
    }
    throw new k.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(h), Integer.valueOf(g), Integer.valueOf(1) }), arrayOfByte2);
  }
  
  public final void G0(int paramInt, long paramLong)
  {
    D0(paramInt, 0);
    H0(paramLong);
  }
  
  public final void H0(long paramLong)
  {
    long l = paramLong;
    byte[] arrayOfByte1;
    int i;
    if (k.b())
    {
      l = paramLong;
      if (W() >= 10) {
        for (;;)
        {
          if ((paramLong & 0xFFFFFFFFFFFFFF80) == 0L)
          {
            arrayOfByte1 = e;
            i = h;
            h = (1 + i);
            o0.K(arrayOfByte1, i, (byte)(int)paramLong);
            return;
          }
          arrayOfByte1 = e;
          i = h;
          h = (i + 1);
          o0.K(arrayOfByte1, i, (byte)((int)paramLong & 0x7F | 0x80));
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
          arrayOfByte1 = e;
          i = h;
          h = (i + 1);
          arrayOfByte1[i] = ((byte)(byte)(int)l);
          return;
        }
        catch (IndexOutOfBoundsException localIndexOutOfBoundsException) {}
      }
      arrayOfByte2 = e;
      i = h;
      h = (i + 1);
      arrayOfByte2[i] = ((byte)(byte)((int)l & 0x7F | 0x80));
      l >>>= 7;
    }
    throw new k.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(h), Integer.valueOf(g), Integer.valueOf(1) }), arrayOfByte2);
  }
  
  public final void I0(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      System.arraycopy(paramArrayOfByte, paramInt1, e, h, paramInt2);
      h += paramInt2;
      return;
    }
    catch (IndexOutOfBoundsException paramArrayOfByte)
    {
      throw new k.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(h), Integer.valueOf(g), Integer.valueOf(paramInt2) }), paramArrayOfByte);
    }
  }
  
  public final void J0(h paramh)
  {
    F0(paramh.size());
    paramh.g0(this);
  }
  
  public final void K0(int paramInt, O paramO)
  {
    D0(paramInt, 2);
    L0(paramO);
  }
  
  public final void L0(O paramO)
  {
    F0(paramO.a());
    paramO.g(this);
  }
  
  public final void M0(String paramString)
  {
    int i = h;
    for (;;)
    {
      try
      {
        j = k.N(paramString.length() * 3);
        int k = k.N(paramString.length());
        if (k == j)
        {
          j = i + k;
          h = j;
          j = p0.f(paramString, e, j, W());
          h = i;
          F0(j - i - k);
          h = j;
        }
      }
      catch (IndexOutOfBoundsException paramString)
      {
        break;
      }
      catch (p0.d locald)
      {
        break label123;
      }
      F0(p0.g(paramString));
      int j = p0.f(paramString, e, h, W());
    }
    throw new k.c(paramString);
    label123:
    h = i;
    S(paramString, locald);
  }
  
  public final int W()
  {
    return g - h;
  }
  
  public final void X(byte paramByte)
  {
    try
    {
      byte[] arrayOfByte = e;
      int i = h;
      h = (i + 1);
      arrayOfByte[i] = ((byte)paramByte);
      return;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      throw new k.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(h), Integer.valueOf(g), Integer.valueOf(1) }), localIndexOutOfBoundsException);
    }
  }
  
  public final void Y(int paramInt, boolean paramBoolean)
  {
    D0(paramInt, 0);
    X((byte)paramBoolean);
  }
  
  public final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    I0(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public final void a0(int paramInt, h paramh)
  {
    D0(paramInt, 2);
    J0(paramh);
  }
  
  public final void f0(int paramInt1, int paramInt2)
  {
    D0(paramInt1, 5);
    g0(paramInt2);
  }
  
  public final void g0(int paramInt)
  {
    try
    {
      byte[] arrayOfByte = e;
      int i = h;
      arrayOfByte[i] = ((byte)(byte)(paramInt & 0xFF));
      arrayOfByte[(i + 1)] = ((byte)(byte)(paramInt >> 8 & 0xFF));
      arrayOfByte[(i + 2)] = ((byte)(byte)(paramInt >> 16 & 0xFF));
      h = (i + 4);
      arrayOfByte[(i + 3)] = ((byte)(byte)(paramInt >> 24 & 0xFF));
      return;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      throw new k.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(h), Integer.valueOf(g), Integer.valueOf(1) }), localIndexOutOfBoundsException);
    }
  }
  
  public final void h0(int paramInt, long paramLong)
  {
    D0(paramInt, 1);
    i0(paramLong);
  }
  
  public final void i0(long paramLong)
  {
    try
    {
      byte[] arrayOfByte = e;
      int i = h;
      arrayOfByte[i] = ((byte)(byte)((int)paramLong & 0xFF));
      arrayOfByte[(i + 1)] = ((byte)(byte)((int)(paramLong >> 8) & 0xFF));
      arrayOfByte[(i + 2)] = ((byte)(byte)((int)(paramLong >> 16) & 0xFF));
      arrayOfByte[(i + 3)] = ((byte)(byte)((int)(paramLong >> 24) & 0xFF));
      arrayOfByte[(i + 4)] = ((byte)(byte)((int)(paramLong >> 32) & 0xFF));
      arrayOfByte[(i + 5)] = ((byte)(byte)((int)(paramLong >> 40) & 0xFF));
      arrayOfByte[(i + 6)] = ((byte)(byte)((int)(paramLong >> 48) & 0xFF));
      h = (i + 8);
      arrayOfByte[(i + 7)] = ((byte)(byte)((int)(paramLong >> 56) & 0xFF));
      return;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      throw new k.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(h), Integer.valueOf(g), Integer.valueOf(1) }), localIndexOutOfBoundsException);
    }
  }
  
  public final void n0(int paramInt1, int paramInt2)
  {
    D0(paramInt1, 0);
    o0(paramInt2);
  }
  
  public final void o0(int paramInt)
  {
    if (paramInt >= 0) {
      F0(paramInt);
    } else {
      H0(paramInt);
    }
  }
  
  public final void r0(int paramInt, O paramO, e0 parame0)
  {
    D0(paramInt, 2);
    F0(((a)paramO).e(parame0));
    parame0.i(paramO, a);
  }
  
  public final void s0(int paramInt, O paramO)
  {
    D0(1, 3);
    E0(2, paramInt);
    K0(3, paramO);
    D0(1, 4);
  }
  
  public final void t0(int paramInt, h paramh)
  {
    D0(1, 3);
    E0(2, paramInt);
    a0(3, paramh);
    D0(1, 4);
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.k.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */