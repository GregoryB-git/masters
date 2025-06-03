package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class k
  extends g
{
  public static final Logger c = Logger.getLogger(k.class.getName());
  public static final boolean d = o0.E();
  public l a;
  public boolean b;
  
  public static int A(int paramInt, h paramh)
  {
    return L(1) * 2 + M(2, paramInt) + f(3, paramh);
  }
  
  public static int B(int paramInt1, int paramInt2)
  {
    return L(paramInt1) + C(paramInt2);
  }
  
  public static int C(int paramInt)
  {
    return 4;
  }
  
  public static int D(int paramInt, long paramLong)
  {
    return L(paramInt) + E(paramLong);
  }
  
  public static int E(long paramLong)
  {
    return 8;
  }
  
  public static int F(int paramInt1, int paramInt2)
  {
    return L(paramInt1) + G(paramInt2);
  }
  
  public static int G(int paramInt)
  {
    return N(Q(paramInt));
  }
  
  public static int H(int paramInt, long paramLong)
  {
    return L(paramInt) + I(paramLong);
  }
  
  public static int I(long paramLong)
  {
    return P(R(paramLong));
  }
  
  public static int J(int paramInt, String paramString)
  {
    return L(paramInt) + K(paramString);
  }
  
  public static int K(String paramString)
  {
    int i;
    try
    {
      i = p0.g(paramString);
    }
    catch (p0.d locald)
    {
      i = paramString.getBytes(z.b).length;
    }
    return x(i);
  }
  
  public static int L(int paramInt)
  {
    return N(q0.c(paramInt, 0));
  }
  
  public static int M(int paramInt1, int paramInt2)
  {
    return L(paramInt1) + N(paramInt2);
  }
  
  public static int N(int paramInt)
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
  
  public static int O(int paramInt, long paramLong)
  {
    return L(paramInt) + P(paramLong);
  }
  
  public static int P(long paramLong)
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
  
  public static int Q(int paramInt)
  {
    return paramInt >> 31 ^ paramInt << 1;
  }
  
  public static long R(long paramLong)
  {
    return paramLong >> 63 ^ paramLong << 1;
  }
  
  public static k U(byte[] paramArrayOfByte)
  {
    return V(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static k V(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new b(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public static int d(int paramInt, boolean paramBoolean)
  {
    return L(paramInt) + e(paramBoolean);
  }
  
  public static int e(boolean paramBoolean)
  {
    return 1;
  }
  
  public static int f(int paramInt, h paramh)
  {
    return L(paramInt) + g(paramh);
  }
  
  public static int g(h paramh)
  {
    return x(paramh.size());
  }
  
  public static int h(int paramInt, double paramDouble)
  {
    return L(paramInt) + i(paramDouble);
  }
  
  public static int i(double paramDouble)
  {
    return 8;
  }
  
  public static int j(int paramInt1, int paramInt2)
  {
    return L(paramInt1) + k(paramInt2);
  }
  
  public static int k(int paramInt)
  {
    return u(paramInt);
  }
  
  public static int l(int paramInt1, int paramInt2)
  {
    return L(paramInt1) + m(paramInt2);
  }
  
  public static int m(int paramInt)
  {
    return 4;
  }
  
  public static int n(int paramInt, long paramLong)
  {
    return L(paramInt) + o(paramLong);
  }
  
  public static int o(long paramLong)
  {
    return 8;
  }
  
  public static int p(int paramInt, float paramFloat)
  {
    return L(paramInt) + q(paramFloat);
  }
  
  public static int q(float paramFloat)
  {
    return 4;
  }
  
  public static int r(int paramInt, O paramO, e0 parame0)
  {
    return L(paramInt) * 2 + s(paramO, parame0);
  }
  
  public static int s(O paramO, e0 parame0)
  {
    return ((a)paramO).e(parame0);
  }
  
  public static int t(int paramInt1, int paramInt2)
  {
    return L(paramInt1) + u(paramInt2);
  }
  
  public static int u(int paramInt)
  {
    if (paramInt >= 0) {
      return N(paramInt);
    }
    return 10;
  }
  
  public static int v(int paramInt, long paramLong)
  {
    return L(paramInt) + w(paramLong);
  }
  
  public static int w(long paramLong)
  {
    return P(paramLong);
  }
  
  public static int x(int paramInt)
  {
    return N(paramInt) + paramInt;
  }
  
  public static int y(int paramInt, O paramO, e0 parame0)
  {
    return L(paramInt) + z(paramO, parame0);
  }
  
  public static int z(O paramO, e0 parame0)
  {
    return x(((a)paramO).e(parame0));
  }
  
  public final void A0(int paramInt, long paramLong)
  {
    G0(paramInt, R(paramLong));
  }
  
  public final void B0(long paramLong)
  {
    H0(R(paramLong));
  }
  
  public abstract void C0(int paramInt, String paramString);
  
  public abstract void D0(int paramInt1, int paramInt2);
  
  public abstract void E0(int paramInt1, int paramInt2);
  
  public abstract void F0(int paramInt);
  
  public abstract void G0(int paramInt, long paramLong);
  
  public abstract void H0(long paramLong);
  
  public final void S(String paramString, p0.d paramd)
  {
    c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", paramd);
    paramString = paramString.getBytes(z.b);
    try
    {
      F0(paramString.length);
      a(paramString, 0, paramString.length);
      return;
    }
    catch (IndexOutOfBoundsException paramString)
    {
      throw new c(paramString);
    }
  }
  
  public boolean T()
  {
    return b;
  }
  
  public abstract int W();
  
  public abstract void X(byte paramByte);
  
  public abstract void Y(int paramInt, boolean paramBoolean);
  
  public final void Z(boolean paramBoolean)
  {
    X((byte)paramBoolean);
  }
  
  public abstract void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public abstract void a0(int paramInt, h paramh);
  
  public final void b0(int paramInt, double paramDouble)
  {
    h0(paramInt, Double.doubleToRawLongBits(paramDouble));
  }
  
  public final void c()
  {
    if (W() == 0) {
      return;
    }
    throw new IllegalStateException("Did not write as much data as expected.");
  }
  
  public final void c0(double paramDouble)
  {
    i0(Double.doubleToRawLongBits(paramDouble));
  }
  
  public final void d0(int paramInt1, int paramInt2)
  {
    n0(paramInt1, paramInt2);
  }
  
  public final void e0(int paramInt)
  {
    o0(paramInt);
  }
  
  public abstract void f0(int paramInt1, int paramInt2);
  
  public abstract void g0(int paramInt);
  
  public abstract void h0(int paramInt, long paramLong);
  
  public abstract void i0(long paramLong);
  
  public final void j0(int paramInt, float paramFloat)
  {
    f0(paramInt, Float.floatToRawIntBits(paramFloat));
  }
  
  public final void k0(float paramFloat)
  {
    g0(Float.floatToRawIntBits(paramFloat));
  }
  
  public final void l0(int paramInt, O paramO, e0 parame0)
  {
    D0(paramInt, 3);
    m0(paramO, parame0);
    D0(paramInt, 4);
  }
  
  public final void m0(O paramO, e0 parame0)
  {
    parame0.i(paramO, a);
  }
  
  public abstract void n0(int paramInt1, int paramInt2);
  
  public abstract void o0(int paramInt);
  
  public final void p0(int paramInt, long paramLong)
  {
    G0(paramInt, paramLong);
  }
  
  public final void q0(long paramLong)
  {
    H0(paramLong);
  }
  
  public abstract void r0(int paramInt, O paramO, e0 parame0);
  
  public abstract void s0(int paramInt, O paramO);
  
  public abstract void t0(int paramInt, h paramh);
  
  public final void u0(int paramInt1, int paramInt2)
  {
    f0(paramInt1, paramInt2);
  }
  
  public final void v0(int paramInt)
  {
    g0(paramInt);
  }
  
  public final void w0(int paramInt, long paramLong)
  {
    h0(paramInt, paramLong);
  }
  
  public final void x0(long paramLong)
  {
    i0(paramLong);
  }
  
  public final void y0(int paramInt1, int paramInt2)
  {
    E0(paramInt1, Q(paramInt2));
  }
  
  public final void z0(int paramInt)
  {
    F0(Q(paramInt));
  }
  
  public static class b
    extends k
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
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */