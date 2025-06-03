package ma;

public final class k$b
  extends k
{
  public final byte[] e;
  public final int f;
  public int g;
  
  public k$b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte != null)
    {
      int i = paramArrayOfByte.length;
      int j = paramInt1 + paramInt2;
      if ((paramInt1 | paramInt2 | i - j) >= 0)
      {
        e = paramArrayOfByte;
        g = paramInt1;
        f = j;
        return;
      }
      throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
    }
    throw new NullPointerException("buffer");
  }
  
  public final void T(byte paramByte)
  {
    try
    {
      byte[] arrayOfByte = e;
      int i = g;
      g = (i + 1);
      arrayOfByte[i] = ((byte)paramByte);
      return;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      throw new k.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(g), Integer.valueOf(f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
    }
  }
  
  public final void U(int paramInt, boolean paramBoolean)
  {
    k0(paramInt, 0);
    T((byte)paramBoolean);
  }
  
  public final void V(byte[] paramArrayOfByte, int paramInt)
  {
    m0(paramInt);
    q0(paramArrayOfByte, 0, paramInt);
  }
  
  public final void W(int paramInt, h paramh)
  {
    k0(paramInt, 2);
    X(paramh);
  }
  
  public final void X(h paramh)
  {
    m0(paramh.size());
    paramh.B(this);
  }
  
  public final void Y(int paramInt1, int paramInt2)
  {
    k0(paramInt1, 5);
    Z(paramInt2);
  }
  
  public final void Z(int paramInt)
  {
    try
    {
      byte[] arrayOfByte = e;
      int i = g;
      int j = i + 1;
      arrayOfByte[i] = ((byte)(byte)(paramInt & 0xFF));
      i = j + 1;
      arrayOfByte[j] = ((byte)(byte)(paramInt >> 8 & 0xFF));
      j = i + 1;
      arrayOfByte[i] = ((byte)(byte)(paramInt >> 16 & 0xFF));
      g = (j + 1);
      arrayOfByte[j] = ((byte)(byte)(paramInt >> 24 & 0xFF));
      return;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      throw new k.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(g), Integer.valueOf(f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
    }
  }
  
  public final void a0(int paramInt, long paramLong)
  {
    k0(paramInt, 1);
    b0(paramLong);
  }
  
  public final void b0(long paramLong)
  {
    try
    {
      byte[] arrayOfByte = e;
      int i = g;
      int j = i + 1;
      arrayOfByte[i] = ((byte)(byte)((int)paramLong & 0xFF));
      int k = j + 1;
      arrayOfByte[j] = ((byte)(byte)((int)(paramLong >> 8) & 0xFF));
      i = k + 1;
      arrayOfByte[k] = ((byte)(byte)((int)(paramLong >> 16) & 0xFF));
      j = i + 1;
      arrayOfByte[i] = ((byte)(byte)((int)(paramLong >> 24) & 0xFF));
      i = j + 1;
      arrayOfByte[j] = ((byte)(byte)((int)(paramLong >> 32) & 0xFF));
      j = i + 1;
      arrayOfByte[i] = ((byte)(byte)((int)(paramLong >> 40) & 0xFF));
      i = j + 1;
      arrayOfByte[j] = ((byte)(byte)((int)(paramLong >> 48) & 0xFF));
      g = (i + 1);
      arrayOfByte[i] = ((byte)(byte)((int)(paramLong >> 56) & 0xFF));
      return;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      throw new k.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(g), Integer.valueOf(f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
    }
  }
  
  public final void c0(int paramInt1, int paramInt2)
  {
    k0(paramInt1, 0);
    d0(paramInt2);
  }
  
  public final void d0(int paramInt)
  {
    if (paramInt >= 0) {
      m0(paramInt);
    } else {
      o0(paramInt);
    }
  }
  
  public final void e0(int paramInt, s0 params0, i1 parami1)
  {
    k0(paramInt, 2);
    m0(((a)params0).m(parami1));
    parami1.h(params0, b);
  }
  
  public final void f0(s0 params0)
  {
    m0(params0.d());
    params0.i(this);
  }
  
  public final void g0(int paramInt, s0 params0)
  {
    k0(1, 3);
    l0(2, paramInt);
    k0(3, 2);
    f0(params0);
    k0(1, 4);
  }
  
  public final void h0(int paramInt, h paramh)
  {
    k0(1, 3);
    l0(2, paramInt);
    W(3, paramh);
    k0(1, 4);
  }
  
  public final void i0(int paramInt, String paramString)
  {
    k0(paramInt, 2);
    j0(paramString);
  }
  
  public final void j0(String paramString)
  {
    int i = g;
    try
    {
      int j = k.P(paramString.length() * 3);
      int k = k.P(paramString.length());
      byte[] arrayOfByte;
      if (k == j)
      {
        j = i + k;
        g = j;
        arrayOfByte = e;
        int m = f;
        j = u1.a.d(paramString, arrayOfByte, j, m - j);
        g = i;
        m0(j - i - k);
      }
      else
      {
        m0(u1.b(paramString));
        arrayOfByte = e;
        j = g;
        k = f;
        j = u1.a.d(paramString, arrayOfByte, j, k - j);
      }
      g = j;
    }
    catch (IndexOutOfBoundsException paramString)
    {
      throw new k.c(paramString);
    }
    catch (u1.d locald)
    {
      g = i;
      S(paramString, locald);
    }
  }
  
  public final void k0(int paramInt1, int paramInt2)
  {
    m0(paramInt1 << 3 | paramInt2);
  }
  
  public final void l0(int paramInt1, int paramInt2)
  {
    k0(paramInt1, 0);
    m0(paramInt2);
  }
  
  public final void m0(int paramInt)
  {
    for (;;)
    {
      if ((paramInt & 0xFFFFFF80) == 0) {}
      try
      {
        arrayOfByte = e;
        i = g;
        g = (i + 1);
        arrayOfByte[i] = ((byte)(byte)paramInt);
        return;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        byte[] arrayOfByte;
        int i;
        throw new k.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(g), Integer.valueOf(f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
      }
      arrayOfByte = e;
      i = g;
      g = (i + 1);
      arrayOfByte[i] = ((byte)(byte)(paramInt & 0x7F | 0x80));
      paramInt >>>= 7;
    }
  }
  
  public final void n0(int paramInt, long paramLong)
  {
    k0(paramInt, 0);
    o0(paramLong);
  }
  
  public final void o0(long paramLong)
  {
    long l = paramLong;
    byte[] arrayOfByte;
    int i;
    if (k.d)
    {
      l = paramLong;
      if (f - g >= 10) {
        for (;;)
        {
          if ((paramLong & 0xFFFFFFFFFFFFFF80) == 0L)
          {
            arrayOfByte = e;
            i = g;
            g = (i + 1);
            t1.s(arrayOfByte, i, (byte)(int)paramLong);
            return;
          }
          arrayOfByte = e;
          i = g;
          g = (i + 1);
          t1.s(arrayOfByte, i, (byte)((int)paramLong & 0x7F | 0x80));
          paramLong >>>= 7;
        }
      }
    }
    for (;;)
    {
      if ((l & 0xFFFFFFFFFFFFFF80) == 0L) {}
      try
      {
        arrayOfByte = e;
        i = g;
        g = (i + 1);
        arrayOfByte[i] = ((byte)(byte)(int)l);
        return;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        throw new k.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(g), Integer.valueOf(f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
      }
      arrayOfByte = e;
      i = g;
      g = (i + 1);
      arrayOfByte[i] = ((byte)(byte)((int)l & 0x7F | 0x80));
      l >>>= 7;
    }
  }
  
  public final int p0()
  {
    return f - g;
  }
  
  public final void q0(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      System.arraycopy(paramArrayOfByte, paramInt1, e, g, paramInt2);
      g += paramInt2;
      return;
    }
    catch (IndexOutOfBoundsException paramArrayOfByte)
    {
      throw new k.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(g), Integer.valueOf(f), Integer.valueOf(paramInt2) }), paramArrayOfByte);
    }
  }
  
  public final void s(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    q0(paramArrayOfByte, paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     ma.k.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */