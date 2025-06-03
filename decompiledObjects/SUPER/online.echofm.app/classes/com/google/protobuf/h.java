package com.google.protobuf;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class h
  extends e
{
  public static final Logger c = Logger.getLogger(h.class.getName());
  public static final boolean d = k0.E();
  public i a;
  public boolean b;
  
  public static int A(int paramInt, K paramK, Z paramZ)
  {
    return O(paramInt) + C(paramK, paramZ);
  }
  
  public static int B(K paramK)
  {
    return z(paramK.a());
  }
  
  public static int C(K paramK, Z paramZ)
  {
    return z(((a)paramK).h(paramZ));
  }
  
  public static int D(int paramInt, f paramf)
  {
    return O(1) * 2 + P(2, paramInt) + g(3, paramf);
  }
  
  public static int E(int paramInt1, int paramInt2)
  {
    return O(paramInt1) + F(paramInt2);
  }
  
  public static int F(int paramInt)
  {
    return 4;
  }
  
  public static int G(int paramInt, long paramLong)
  {
    return O(paramInt) + H(paramLong);
  }
  
  public static int H(long paramLong)
  {
    return 8;
  }
  
  public static int I(int paramInt1, int paramInt2)
  {
    return O(paramInt1) + J(paramInt2);
  }
  
  public static int J(int paramInt)
  {
    return Q(T(paramInt));
  }
  
  public static int K(int paramInt, long paramLong)
  {
    return O(paramInt) + L(paramLong);
  }
  
  public static int L(long paramLong)
  {
    return S(U(paramLong));
  }
  
  public static int M(int paramInt, String paramString)
  {
    return O(paramInt) + N(paramString);
  }
  
  public static int N(String paramString)
  {
    int i;
    try
    {
      i = l0.f(paramString);
    }
    catch (l0.c localc)
    {
      i = paramString.getBytes(t.b).length;
    }
    return z(i);
  }
  
  public static int O(int paramInt)
  {
    return Q(m0.c(paramInt, 0));
  }
  
  public static int P(int paramInt1, int paramInt2)
  {
    return O(paramInt1) + Q(paramInt2);
  }
  
  public static int Q(int paramInt)
  {
    if ((paramInt & 0xFFFFFF80) == 0) {
      return 1;
    }
    if ((paramInt & 0xC000) == 0) {
      return 2;
    }
    if ((0xFFE00000 & paramInt) == 0) {
      return 3;
    }
    if ((paramInt & 0xF0000000) == 0) {
      return 4;
    }
    return 5;
  }
  
  public static int R(int paramInt, long paramLong)
  {
    return O(paramInt) + S(paramLong);
  }
  
  public static int S(long paramLong)
  {
    if ((0xFFFFFFFFFFFFFF80 & paramLong) == 0L) {
      return 1;
    }
    if (paramLong < 0L) {
      return 10;
    }
    if ((0xFFFFFFF800000000 & paramLong) != 0L)
    {
      paramLong >>>= 28;
      i = 6;
    }
    else
    {
      i = 2;
    }
    int j = i;
    long l = paramLong;
    if ((0xFFFFFFFFFFE00000 & paramLong) != 0L)
    {
      j = i + 2;
      l = paramLong >>> 14;
    }
    int i = j;
    if ((l & 0xFFFFFFFFFFFFC000) != 0L) {
      i = j + 1;
    }
    return i;
  }
  
  public static int T(int paramInt)
  {
    return paramInt >> 31 ^ paramInt << 1;
  }
  
  public static long U(long paramLong)
  {
    return paramLong >> 63 ^ paramLong << 1;
  }
  
  public static h X(byte[] paramArrayOfByte)
  {
    return Y(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static h Y(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new b(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public static int d(int paramInt, boolean paramBoolean)
  {
    return O(paramInt) + e(paramBoolean);
  }
  
  public static int e(boolean paramBoolean)
  {
    return 1;
  }
  
  public static int f(byte[] paramArrayOfByte)
  {
    return z(paramArrayOfByte.length);
  }
  
  public static int g(int paramInt, f paramf)
  {
    return O(paramInt) + h(paramf);
  }
  
  public static int h(f paramf)
  {
    return z(paramf.size());
  }
  
  public static int i(int paramInt, double paramDouble)
  {
    return O(paramInt) + j(paramDouble);
  }
  
  public static int j(double paramDouble)
  {
    return 8;
  }
  
  public static int k(int paramInt1, int paramInt2)
  {
    return O(paramInt1) + l(paramInt2);
  }
  
  public static int l(int paramInt)
  {
    return w(paramInt);
  }
  
  public static int m(int paramInt1, int paramInt2)
  {
    return O(paramInt1) + n(paramInt2);
  }
  
  public static int n(int paramInt)
  {
    return 4;
  }
  
  public static int o(int paramInt, long paramLong)
  {
    return O(paramInt) + p(paramLong);
  }
  
  public static int p(long paramLong)
  {
    return 8;
  }
  
  public static int q(int paramInt, float paramFloat)
  {
    return O(paramInt) + r(paramFloat);
  }
  
  public static int r(float paramFloat)
  {
    return 4;
  }
  
  public static int s(int paramInt, K paramK, Z paramZ)
  {
    return O(paramInt) * 2 + u(paramK, paramZ);
  }
  
  public static int t(K paramK)
  {
    return paramK.a();
  }
  
  public static int u(K paramK, Z paramZ)
  {
    return ((a)paramK).h(paramZ);
  }
  
  public static int v(int paramInt1, int paramInt2)
  {
    return O(paramInt1) + w(paramInt2);
  }
  
  public static int w(int paramInt)
  {
    if (paramInt >= 0) {
      return Q(paramInt);
    }
    return 10;
  }
  
  public static int x(int paramInt, long paramLong)
  {
    return O(paramInt) + y(paramLong);
  }
  
  public static int y(long paramLong)
  {
    return S(paramLong);
  }
  
  public static int z(int paramInt)
  {
    return Q(paramInt) + paramInt;
  }
  
  public abstract void A0(K paramK);
  
  public abstract void B0(int paramInt, K paramK);
  
  public abstract void C0(int paramInt, f paramf);
  
  public final void D0(int paramInt1, int paramInt2)
  {
    l0(paramInt1, paramInt2);
  }
  
  public final void E0(int paramInt)
  {
    m0(paramInt);
  }
  
  public final void F0(int paramInt, long paramLong)
  {
    n0(paramInt, paramLong);
  }
  
  public final void G0(long paramLong)
  {
    o0(paramLong);
  }
  
  public final void H0(int paramInt1, int paramInt2)
  {
    O0(paramInt1, T(paramInt2));
  }
  
  public final void I0(int paramInt)
  {
    P0(T(paramInt));
  }
  
  public final void J0(int paramInt, long paramLong)
  {
    Q0(paramInt, U(paramLong));
  }
  
  public final void K0(long paramLong)
  {
    R0(U(paramLong));
  }
  
  public abstract void L0(int paramInt, String paramString);
  
  public abstract void M0(String paramString);
  
  public abstract void N0(int paramInt1, int paramInt2);
  
  public abstract void O0(int paramInt1, int paramInt2);
  
  public abstract void P0(int paramInt);
  
  public abstract void Q0(int paramInt, long paramLong);
  
  public abstract void R0(long paramLong);
  
  public final void V(String paramString, l0.c paramc)
  {
    c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", paramc);
    paramString = paramString.getBytes(t.b);
    try
    {
      P0(paramString.length);
      a(paramString, 0, paramString.length);
      return;
    }
    catch (IndexOutOfBoundsException paramString)
    {
      throw new c(paramString);
    }
  }
  
  public boolean W()
  {
    return b;
  }
  
  public abstract int Z();
  
  public abstract void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public abstract void a0(byte paramByte);
  
  public abstract void b0(int paramInt, boolean paramBoolean);
  
  public final void c()
  {
    if (Z() == 0) {
      return;
    }
    throw new IllegalStateException("Did not write as much data as expected.");
  }
  
  public final void c0(boolean paramBoolean)
  {
    a0((byte)paramBoolean);
  }
  
  public final void d0(byte[] paramArrayOfByte)
  {
    e0(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public abstract void e0(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public abstract void f0(int paramInt, f paramf);
  
  public abstract void g0(f paramf);
  
  public final void h0(int paramInt, double paramDouble)
  {
    n0(paramInt, Double.doubleToRawLongBits(paramDouble));
  }
  
  public final void i0(double paramDouble)
  {
    o0(Double.doubleToRawLongBits(paramDouble));
  }
  
  public final void j0(int paramInt1, int paramInt2)
  {
    v0(paramInt1, paramInt2);
  }
  
  public final void k0(int paramInt)
  {
    w0(paramInt);
  }
  
  public abstract void l0(int paramInt1, int paramInt2);
  
  public abstract void m0(int paramInt);
  
  public abstract void n0(int paramInt, long paramLong);
  
  public abstract void o0(long paramLong);
  
  public final void p0(int paramInt, float paramFloat)
  {
    l0(paramInt, Float.floatToRawIntBits(paramFloat));
  }
  
  public final void q0(float paramFloat)
  {
    m0(Float.floatToRawIntBits(paramFloat));
  }
  
  public final void r0(int paramInt, K paramK)
  {
    N0(paramInt, 3);
    t0(paramK);
    N0(paramInt, 4);
  }
  
  public final void s0(int paramInt, K paramK, Z paramZ)
  {
    N0(paramInt, 3);
    u0(paramK, paramZ);
    N0(paramInt, 4);
  }
  
  public final void t0(K paramK)
  {
    paramK.j(this);
  }
  
  public final void u0(K paramK, Z paramZ)
  {
    paramZ.h(paramK, a);
  }
  
  public abstract void v0(int paramInt1, int paramInt2);
  
  public abstract void w0(int paramInt);
  
  public final void x0(int paramInt, long paramLong)
  {
    Q0(paramInt, paramLong);
  }
  
  public final void y0(long paramLong)
  {
    R0(paramLong);
  }
  
  public abstract void z0(int paramInt, K paramK, Z paramZ);
  
  public static class b
    extends h
  {
    public final byte[] e;
    public final int f;
    public final int g;
    public int h;
    
    public b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      super();
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
  
  public static class c
    extends IOException
  {
    private static final long serialVersionUID = -6947486886997889499L;
    
    public c(String paramString, Throwable paramThrowable)
    {
      super(paramThrowable);
    }
    
    public c(Throwable paramThrowable)
    {
      super(paramThrowable);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */