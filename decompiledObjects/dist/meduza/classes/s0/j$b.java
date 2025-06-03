package s0;

public final class j$b
  extends j
{
  public final byte[] e;
  public final int f;
  public int g;
  
  public j$b(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte.length;
    int j = 0 + paramInt;
    if ((0x0 | paramInt | i - j) >= 0)
    {
      e = paramArrayOfByte;
      g = 0;
      f = j;
      return;
    }
    throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(0), Integer.valueOf(paramInt) }));
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
      throw new j.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(g), Integer.valueOf(f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
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
    p0(paramArrayOfByte, 0, paramInt);
  }
  
  public final void W(int paramInt, g paramg)
  {
    k0(paramInt, 2);
    X(paramg);
  }
  
  public final void X(g paramg)
  {
    m0(paramg.size());
    paramg.o(this);
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
      throw new j.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(g), Integer.valueOf(f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
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
      i = j + 1;
      arrayOfByte[j] = ((byte)(byte)((int)(paramLong >> 8) & 0xFF));
      int k = i + 1;
      arrayOfByte[i] = ((byte)(byte)((int)(paramLong >> 16) & 0xFF));
      j = k + 1;
      arrayOfByte[k] = ((byte)(byte)((int)(paramLong >> 24) & 0xFF));
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
      throw new j.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(g), Integer.valueOf(f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
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
  
  public final void e0(int paramInt, o0 paramo0, c1 paramc1)
  {
    k0(paramInt, 2);
    m0(((a)paramo0).i(paramc1));
    paramc1.h(paramo0, b);
  }
  
  public final void f0(o0 paramo0)
  {
    m0(paramo0.d());
    paramo0.g(this);
  }
  
  public final void g0(int paramInt, o0 paramo0)
  {
    k0(1, 3);
    l0(2, paramInt);
    k0(3, 2);
    f0(paramo0);
    k0(1, 4);
  }
  
  public final void h0(int paramInt, g paramg)
  {
    k0(1, 3);
    l0(2, paramInt);
    W(3, paramg);
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
      int j = j.P(paramString.length() * 3);
      int k = j.P(paramString.length());
      byte[] arrayOfByte;
      if (k == j)
      {
        int m = i + k;
        g = m;
        arrayOfByte = e;
        j = f;
        j = m1.a.b(paramString, arrayOfByte, m, j - m);
        g = i;
        m0(j - i - k);
      }
      else
      {
        m0(m1.a(paramString));
        arrayOfByte = e;
        j = g;
        k = f;
        j = m1.a.b(paramString, arrayOfByte, j, k - j);
      }
      g = j;
    }
    catch (IndexOutOfBoundsException paramString)
    {
      throw new j.c(paramString);
    }
    catch (m1.d locald)
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
    int i = paramInt;
    byte[] arrayOfByte;
    if (j.d)
    {
      i = paramInt;
      if (!d.a())
      {
        int j = f;
        int k = g;
        i = paramInt;
        if (j - k >= 5)
        {
          if ((paramInt & 0xFFFFFF80) == 0)
          {
            arrayOfByte = e;
            g = (k + 1);
            l1.p(arrayOfByte, k, (byte)paramInt);
            return;
          }
          arrayOfByte = e;
          g = (k + 1);
          l1.p(arrayOfByte, k, (byte)(paramInt | 0x80));
          paramInt >>>= 7;
          if ((paramInt & 0xFFFFFF80) == 0)
          {
            arrayOfByte = e;
            i = g;
            g = (i + 1);
            l1.p(arrayOfByte, i, (byte)paramInt);
            return;
          }
          arrayOfByte = e;
          i = g;
          g = (i + 1);
          l1.p(arrayOfByte, i, (byte)(paramInt | 0x80));
          paramInt >>>= 7;
          if ((paramInt & 0xFFFFFF80) == 0)
          {
            arrayOfByte = e;
            i = g;
            g = (i + 1);
            l1.p(arrayOfByte, i, (byte)paramInt);
            return;
          }
          arrayOfByte = e;
          i = g;
          g = (i + 1);
          l1.p(arrayOfByte, i, (byte)(paramInt | 0x80));
          paramInt >>>= 7;
          if ((paramInt & 0xFFFFFF80) == 0)
          {
            arrayOfByte = e;
            i = g;
            g = (i + 1);
            l1.p(arrayOfByte, i, (byte)paramInt);
            return;
          }
          arrayOfByte = e;
          i = g;
          g = (i + 1);
          l1.p(arrayOfByte, i, (byte)(paramInt | 0x80));
          arrayOfByte = e;
          i = g;
          g = (i + 1);
          l1.p(arrayOfByte, i, (byte)(paramInt >>> 7));
          return;
        }
      }
    }
    for (;;)
    {
      if ((i & 0xFFFFFF80) == 0) {}
      try
      {
        arrayOfByte = e;
        paramInt = g;
        g = (paramInt + 1);
        arrayOfByte[paramInt] = ((byte)(byte)i);
        return;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        throw new j.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(g), Integer.valueOf(f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
      }
      arrayOfByte = e;
      paramInt = g;
      g = (paramInt + 1);
      arrayOfByte[paramInt] = ((byte)(byte)(i & 0x7F | 0x80));
      i >>>= 7;
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
    if (j.d)
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
            l1.p(arrayOfByte, i, (byte)(int)paramLong);
            return;
          }
          arrayOfByte = e;
          i = g;
          g = (i + 1);
          l1.p(arrayOfByte, i, (byte)((int)paramLong & 0x7F | 0x80));
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
        throw new j.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(g), Integer.valueOf(f), Integer.valueOf(1) }), localIndexOutOfBoundsException);
      }
      arrayOfByte = e;
      i = g;
      g = (i + 1);
      arrayOfByte[i] = ((byte)(byte)((int)l & 0x7F | 0x80));
      l >>>= 7;
    }
  }
  
  public final void p0(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      System.arraycopy(paramArrayOfByte, paramInt1, e, g, paramInt2);
      g += paramInt2;
      return;
    }
    catch (IndexOutOfBoundsException paramArrayOfByte)
    {
      throw new j.c(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(g), Integer.valueOf(f), Integer.valueOf(paramInt2) }), paramArrayOfByte);
    }
  }
  
  public final void s(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    p0(paramArrayOfByte, paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     s0.j.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */