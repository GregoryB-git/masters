package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class J3
  extends r3
{
  public static final Logger b = Logger.getLogger(J3.class.getName());
  public static final boolean c = D5.w();
  public L3 a;
  
  public static int A(q3 paramq3)
  {
    int i = paramq3.S();
    return v0(i) + i;
  }
  
  public static int B(I4 paramI4)
  {
    return paramI4.a();
  }
  
  public static int C(String paramString)
  {
    int i;
    try
    {
      i = E5.a(paramString);
    }
    catch (H5 localH5)
    {
      i = paramString.getBytes(a4.b).length;
    }
    return v0(i) + i;
  }
  
  public static J3 D(byte[] paramArrayOfByte)
  {
    return new a(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static int P(int paramInt, long paramLong)
  {
    return v0(paramInt << 3) + 8;
  }
  
  public static int Q(int paramInt, q3 paramq3)
  {
    paramInt = v0(paramInt << 3);
    int i = paramq3.S();
    return paramInt + (v0(i) + i);
  }
  
  public static int R(int paramInt, I4 paramI4, Z4 paramZ4)
  {
    return v0(paramInt << 3) + g(paramI4, paramZ4);
  }
  
  public static int S(long paramLong)
  {
    return 8;
  }
  
  public static int T(I4 paramI4)
  {
    int i = paramI4.a();
    return v0(i) + i;
  }
  
  public static int X(int paramInt)
  {
    return g0(paramInt);
  }
  
  public static int Y(int paramInt, long paramLong)
  {
    return v0(paramInt << 3) + n0(paramLong);
  }
  
  public static int Z(int paramInt, q3 paramq3)
  {
    return (v0(8) << 1) + w0(2, paramInt) + Q(3, paramq3);
  }
  
  public static int a0(long paramLong)
  {
    return n0(paramLong);
  }
  
  public static int c(double paramDouble)
  {
    return 8;
  }
  
  public static int c0(int paramInt)
  {
    return 4;
  }
  
  public static int d(float paramFloat)
  {
    return 4;
  }
  
  public static int d0(int paramInt1, int paramInt2)
  {
    return v0(paramInt1 << 3) + g0(paramInt2);
  }
  
  public static int e(int paramInt, double paramDouble)
  {
    return v0(paramInt << 3) + 8;
  }
  
  public static int e0(int paramInt, long paramLong)
  {
    return v0(paramInt << 3) + 8;
  }
  
  public static int f(int paramInt, float paramFloat)
  {
    return v0(paramInt << 3) + 4;
  }
  
  public static int f0(long paramLong)
  {
    return 8;
  }
  
  public static int g(I4 paramI4, Z4 paramZ4)
  {
    int i = ((j3)paramI4).c(paramZ4);
    return v0(i) + i;
  }
  
  public static int g0(int paramInt)
  {
    if (paramInt >= 0) {
      return v0(paramInt);
    }
    return 10;
  }
  
  public static int h(boolean paramBoolean)
  {
    return 1;
  }
  
  public static int h0(int paramInt1, int paramInt2)
  {
    return v0(paramInt1 << 3) + 4;
  }
  
  public static int i(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    return v0(i) + i;
  }
  
  public static int i0(int paramInt, long paramLong)
  {
    return v0(paramInt << 3) + n0(u0(paramLong));
  }
  
  public static int j0(long paramLong)
  {
    return n0(u0(paramLong));
  }
  
  public static int k0(int paramInt)
  {
    return 4;
  }
  
  public static int l0(int paramInt1, int paramInt2)
  {
    return v0(paramInt1 << 3) + g0(paramInt2);
  }
  
  public static int m0(int paramInt, long paramLong)
  {
    return v0(paramInt << 3) + n0(paramLong);
  }
  
  public static int n0(long paramLong)
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
  
  public static int o0(int paramInt)
  {
    return v0(z0(paramInt));
  }
  
  public static int p0(int paramInt1, int paramInt2)
  {
    return v0(paramInt1 << 3) + 4;
  }
  
  public static int s0(int paramInt)
  {
    return v0(paramInt << 3);
  }
  
  public static int t0(int paramInt1, int paramInt2)
  {
    return v0(paramInt1 << 3) + v0(z0(paramInt2));
  }
  
  public static long u0(long paramLong)
  {
    return paramLong >> 63 ^ paramLong << 1;
  }
  
  public static int v0(int paramInt)
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
  
  public static int w0(int paramInt1, int paramInt2)
  {
    return v0(paramInt1 << 3) + v0(paramInt2);
  }
  
  public static int x(int paramInt, I4 paramI4, Z4 paramZ4)
  {
    return (v0(paramInt << 3) << 1) + ((j3)paramI4).c(paramZ4);
  }
  
  public static int y(int paramInt, String paramString)
  {
    return v0(paramInt << 3) + C(paramString);
  }
  
  public static int z(int paramInt, boolean paramBoolean)
  {
    return v0(paramInt << 3) + 1;
  }
  
  public static int z0(int paramInt)
  {
    return paramInt >> 31 ^ paramInt << 1;
  }
  
  public final void E()
  {
    if (b() == 0) {
      return;
    }
    throw new IllegalStateException("Did not write as much data as expected.");
  }
  
  public final void F(double paramDouble)
  {
    s(Double.doubleToRawLongBits(paramDouble));
  }
  
  public final void G(float paramFloat)
  {
    k(Float.floatToRawIntBits(paramFloat));
  }
  
  public abstract void H(int paramInt);
  
  public final void I(int paramInt, double paramDouble)
  {
    m(paramInt, Double.doubleToRawLongBits(paramDouble));
  }
  
  public final void J(int paramInt, float paramFloat)
  {
    l(paramInt, Float.floatToRawIntBits(paramFloat));
  }
  
  public abstract void K(int paramInt1, int paramInt2);
  
  public abstract void L(int paramInt, long paramLong);
  
  public abstract void M(int paramInt, q3 paramq3);
  
  public abstract void N(long paramLong);
  
  public final void O(boolean paramBoolean)
  {
    j((byte)paramBoolean);
  }
  
  public abstract void U(int paramInt);
  
  public abstract void V(int paramInt1, int paramInt2);
  
  public abstract int b();
  
  public abstract void b0(int paramInt1, int paramInt2);
  
  public abstract void j(byte paramByte);
  
  public abstract void k(int paramInt);
  
  public abstract void l(int paramInt1, int paramInt2);
  
  public abstract void m(int paramInt, long paramLong);
  
  public abstract void n(int paramInt, q3 paramq3);
  
  public abstract void o(int paramInt, I4 paramI4);
  
  public abstract void p(int paramInt, I4 paramI4, Z4 paramZ4);
  
  public abstract void q(int paramInt, String paramString);
  
  public final void q0(int paramInt, long paramLong)
  {
    L(paramInt, u0(paramLong));
  }
  
  public abstract void r(int paramInt, boolean paramBoolean);
  
  public final void r0(long paramLong)
  {
    N(u0(paramLong));
  }
  
  public abstract void s(long paramLong);
  
  public abstract void t(q3 paramq3);
  
  public abstract void u(I4 paramI4);
  
  public abstract void v(String paramString);
  
  public final void w(String paramString, H5 paramH5)
  {
    b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", paramH5);
    paramString = paramString.getBytes(a4.b);
    try
    {
      U(paramString.length);
      a(paramString, 0, paramString.length);
      return;
    }
    catch (IndexOutOfBoundsException paramString)
    {
      throw new b(paramString);
    }
  }
  
  public final void x0(int paramInt)
  {
    U(z0(paramInt));
  }
  
  public final void y0(int paramInt1, int paramInt2)
  {
    b0(paramInt1, z0(paramInt2));
  }
  
  public static final class a
    extends J3
  {
    public final byte[] d;
    public final int e;
    public final int f;
    public int g;
    
    public a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      super();
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
  
  public static final class b
    extends IOException
  {
    public b(String paramString, Throwable paramThrowable)
    {
      super(paramThrowable);
    }
    
    public b(Throwable paramThrowable)
    {
      super(paramThrowable);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.J3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */