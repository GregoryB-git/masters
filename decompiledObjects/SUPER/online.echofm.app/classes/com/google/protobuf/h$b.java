package com.google.protobuf;

public class h$b
  extends h
{
  public final byte[] e;
  public final int f;
  public final int g;
  public int h;
  
  public h$b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
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
  
  public final void A0(K paramK)
  {
    P0(paramK.a());
    paramK.j(this);
  }
  
  public final void B0(int paramInt, K paramK)
  {
    N0(1, 3);
    O0(2, paramInt);
    T0(3, paramK);
    N0(1, 4);
  }
  
  public final void C0(int paramInt, f paramf)
  {
    N0(1, 3);
    O0(2, paramInt);
    f0(3, paramf);
    N0(1, 4);
  }
  
  public final void L0(int paramInt, String paramString)
  {
    N0(paramInt, 2);
    M0(paramString);
  }
  
  public final void M0(String paramString)
  {
    int i = h;
    for (;;)
    {
      try
      {
        j = h.Q(paramString.length() * 3);
        int k = h.Q(paramString.length());
        if (k == j)
        {
          j = i + k;
          h = j;
          j = l0.e(paramString, e, j, Z());
          h = i;
          P0(j - i - k);
          h = j;
        }
      }
      catch (IndexOutOfBoundsException paramString)
      {
        break;
      }
      catch (l0.c localc)
      {
        break label123;
      }
      P0(l0.f(paramString));
      int j = l0.e(paramString, e, h, Z());
    }
    throw new h.c(paramString);
    label123:
    h = i;
    V(paramString, localc);
  }
  
  public final void N0(int paramInt1, int paramInt2)
  {
    P0(m0.c(paramInt1, paramInt2));
  }
  
  public final void O0(int paramInt1, int paramInt2)
  {
    N0(paramInt1, 0);
    P0(paramInt2);
  }
  
  public final void P0(int paramInt)
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
    throw new h.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(h), Integer.valueOf(g), Integer.valueOf(1) }), arrayOfByte2);
  }
  
  public final void Q0(int paramInt, long paramLong)
  {
    N0(paramInt, 0);
    R0(paramLong);
  }
  
  public final void R0(long paramLong)
  {
    long l = paramLong;
    byte[] arrayOfByte1;
    int i;
    if (h.b())
    {
      l = paramLong;
      if (Z() >= 10) {
        for (;;)
        {
          if ((paramLong & 0xFFFFFFFFFFFFFF80) == 0L)
          {
            arrayOfByte1 = e;
            i = h;
            h = (1 + i);
            k0.K(arrayOfByte1, i, (byte)(int)paramLong);
            return;
          }
          arrayOfByte1 = e;
          i = h;
          h = (i + 1);
          k0.K(arrayOfByte1, i, (byte)((int)paramLong & 0x7F | 0x80));
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
    throw new h.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(h), Integer.valueOf(g), Integer.valueOf(1) }), arrayOfByte2);
  }
  
  public final void S0(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      System.arraycopy(paramArrayOfByte, paramInt1, e, h, paramInt2);
      h += paramInt2;
      return;
    }
    catch (IndexOutOfBoundsException paramArrayOfByte)
    {
      throw new h.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(h), Integer.valueOf(g), Integer.valueOf(paramInt2) }), paramArrayOfByte);
    }
  }
  
  public final void T0(int paramInt, K paramK)
  {
    N0(paramInt, 2);
    A0(paramK);
  }
  
  public final int Z()
  {
    return g - h;
  }
  
  public final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    S0(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public final void a0(byte paramByte)
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
      throw new h.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(h), Integer.valueOf(g), Integer.valueOf(1) }), localIndexOutOfBoundsException);
    }
  }
  
  public final void b0(int paramInt, boolean paramBoolean)
  {
    N0(paramInt, 0);
    a0((byte)paramBoolean);
  }
  
  public final void e0(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    P0(paramInt2);
    S0(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public final void f0(int paramInt, f paramf)
  {
    N0(paramInt, 2);
    g0(paramf);
  }
  
  public final void g0(f paramf)
  {
    P0(paramf.size());
    paramf.b0(this);
  }
  
  public final void l0(int paramInt1, int paramInt2)
  {
    N0(paramInt1, 5);
    m0(paramInt2);
  }
  
  public final void m0(int paramInt)
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
      throw new h.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(h), Integer.valueOf(g), Integer.valueOf(1) }), localIndexOutOfBoundsException);
    }
  }
  
  public final void n0(int paramInt, long paramLong)
  {
    N0(paramInt, 1);
    o0(paramLong);
  }
  
  public final void o0(long paramLong)
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
      throw new h.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(h), Integer.valueOf(g), Integer.valueOf(1) }), localIndexOutOfBoundsException);
    }
  }
  
  public final void v0(int paramInt1, int paramInt2)
  {
    N0(paramInt1, 0);
    w0(paramInt2);
  }
  
  public final void w0(int paramInt)
  {
    if (paramInt >= 0) {
      P0(paramInt);
    } else {
      R0(paramInt);
    }
  }
  
  public final void z0(int paramInt, K paramK, Z paramZ)
  {
    N0(paramInt, 2);
    P0(((a)paramK).h(paramZ));
    paramZ.h(paramK, a);
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.h.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */