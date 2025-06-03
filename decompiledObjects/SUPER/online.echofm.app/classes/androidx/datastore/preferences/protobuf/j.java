package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class j
  extends f
{
  public static final Logger c = Logger.getLogger(j.class.getName());
  public static final boolean d = p0.C();
  public k a;
  public boolean b;
  
  public static int A(O paramO)
  {
    return y(paramO.a());
  }
  
  public static int B(O paramO, e0 parame0)
  {
    return y(((a)paramO).j(parame0));
  }
  
  public static int C(int paramInt)
  {
    if (paramInt > 4096) {
      return 4096;
    }
    return paramInt;
  }
  
  public static int D(int paramInt, g paramg)
  {
    return P(1) * 2 + Q(2, paramInt) + f(3, paramg);
  }
  
  public static int E(int paramInt)
  {
    return R(paramInt);
  }
  
  public static int F(int paramInt1, int paramInt2)
  {
    return P(paramInt1) + G(paramInt2);
  }
  
  public static int G(int paramInt)
  {
    return 4;
  }
  
  public static int H(int paramInt, long paramLong)
  {
    return P(paramInt) + I(paramLong);
  }
  
  public static int I(long paramLong)
  {
    return 8;
  }
  
  public static int J(int paramInt1, int paramInt2)
  {
    return P(paramInt1) + K(paramInt2);
  }
  
  public static int K(int paramInt)
  {
    return R(U(paramInt));
  }
  
  public static int L(int paramInt, long paramLong)
  {
    return P(paramInt) + M(paramLong);
  }
  
  public static int M(long paramLong)
  {
    return T(V(paramLong));
  }
  
  public static int N(int paramInt, String paramString)
  {
    return P(paramInt) + O(paramString);
  }
  
  public static int O(String paramString)
  {
    int i;
    try
    {
      i = q0.g(paramString);
    }
    catch (q0.d locald)
    {
      i = paramString.getBytes(y.a).length;
    }
    return y(i);
  }
  
  public static int P(int paramInt)
  {
    return R(r0.c(paramInt, 0));
  }
  
  public static int Q(int paramInt1, int paramInt2)
  {
    return P(paramInt1) + R(paramInt2);
  }
  
  public static int R(int paramInt)
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
  
  public static int S(int paramInt, long paramLong)
  {
    return P(paramInt) + T(paramLong);
  }
  
  public static int T(long paramLong)
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
  
  public static int U(int paramInt)
  {
    return paramInt >> 31 ^ paramInt << 1;
  }
  
  public static long V(long paramLong)
  {
    return paramLong >> 63 ^ paramLong << 1;
  }
  
  public static j Z(OutputStream paramOutputStream, int paramInt)
  {
    return new d(paramOutputStream, paramInt);
  }
  
  public static int c(int paramInt, boolean paramBoolean)
  {
    return P(paramInt) + d(paramBoolean);
  }
  
  public static int d(boolean paramBoolean)
  {
    return 1;
  }
  
  public static int e(byte[] paramArrayOfByte)
  {
    return y(paramArrayOfByte.length);
  }
  
  public static int f(int paramInt, g paramg)
  {
    return P(paramInt) + g(paramg);
  }
  
  public static int g(g paramg)
  {
    return y(paramg.size());
  }
  
  public static int h(int paramInt, double paramDouble)
  {
    return P(paramInt) + i(paramDouble);
  }
  
  public static int i(double paramDouble)
  {
    return 8;
  }
  
  public static int j(int paramInt1, int paramInt2)
  {
    return P(paramInt1) + k(paramInt2);
  }
  
  public static int k(int paramInt)
  {
    return v(paramInt);
  }
  
  public static int l(int paramInt1, int paramInt2)
  {
    return P(paramInt1) + m(paramInt2);
  }
  
  public static int m(int paramInt)
  {
    return 4;
  }
  
  public static int n(int paramInt, long paramLong)
  {
    return P(paramInt) + o(paramLong);
  }
  
  public static int o(long paramLong)
  {
    return 8;
  }
  
  public static int p(int paramInt, float paramFloat)
  {
    return P(paramInt) + q(paramFloat);
  }
  
  public static int q(float paramFloat)
  {
    return 4;
  }
  
  public static int r(int paramInt, O paramO, e0 parame0)
  {
    return P(paramInt) * 2 + t(paramO, parame0);
  }
  
  public static int s(O paramO)
  {
    return paramO.a();
  }
  
  public static int t(O paramO, e0 parame0)
  {
    return ((a)paramO).j(parame0);
  }
  
  public static int u(int paramInt1, int paramInt2)
  {
    return P(paramInt1) + v(paramInt2);
  }
  
  public static int v(int paramInt)
  {
    if (paramInt >= 0) {
      return R(paramInt);
    }
    return 10;
  }
  
  public static int w(int paramInt, long paramLong)
  {
    return P(paramInt) + x(paramLong);
  }
  
  public static int x(long paramLong)
  {
    return T(paramLong);
  }
  
  public static int y(int paramInt)
  {
    return R(paramInt) + paramInt;
  }
  
  public static int z(int paramInt, O paramO, e0 parame0)
  {
    return P(paramInt) + B(paramO, parame0);
  }
  
  public abstract void A0(O paramO);
  
  public abstract void B0(int paramInt, O paramO);
  
  public abstract void C0(int paramInt, g paramg);
  
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
    O0(paramInt1, U(paramInt2));
  }
  
  public final void I0(int paramInt)
  {
    P0(U(paramInt));
  }
  
  public final void J0(int paramInt, long paramLong)
  {
    Q0(paramInt, V(paramLong));
  }
  
  public final void K0(long paramLong)
  {
    R0(V(paramLong));
  }
  
  public abstract void L0(int paramInt, String paramString);
  
  public abstract void M0(String paramString);
  
  public abstract void N0(int paramInt1, int paramInt2);
  
  public abstract void O0(int paramInt1, int paramInt2);
  
  public abstract void P0(int paramInt);
  
  public abstract void Q0(int paramInt, long paramLong);
  
  public abstract void R0(long paramLong);
  
  public abstract void W();
  
  public final void X(String paramString, q0.d paramd)
  {
    c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", paramd);
    paramString = paramString.getBytes(y.a);
    try
    {
      P0(paramString.length);
      a(paramString, 0, paramString.length);
      return;
    }
    catch (c paramString) {}catch (IndexOutOfBoundsException paramString) {}
    throw paramString;
    throw new c(paramString);
  }
  
  public boolean Y()
  {
    return b;
  }
  
  public abstract void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public abstract void a0(byte paramByte);
  
  public abstract void b0(int paramInt, boolean paramBoolean);
  
  public final void c0(boolean paramBoolean)
  {
    a0((byte)paramBoolean);
  }
  
  public final void d0(byte[] paramArrayOfByte)
  {
    e0(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public abstract void e0(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public abstract void f0(int paramInt, g paramg);
  
  public abstract void g0(g paramg);
  
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
  
  public final void r0(int paramInt, O paramO)
  {
    N0(paramInt, 3);
    t0(paramO);
    N0(paramInt, 4);
  }
  
  public final void s0(int paramInt, O paramO, e0 parame0)
  {
    N0(paramInt, 3);
    u0(paramO, parame0);
    N0(paramInt, 4);
  }
  
  public final void t0(O paramO)
  {
    paramO.g(this);
  }
  
  public final void u0(O paramO, e0 parame0)
  {
    parame0.i(paramO, a);
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
  
  public abstract void z0(int paramInt, O paramO, e0 parame0);
  
  public static abstract class b
    extends j
  {
    public final byte[] e;
    public final int f;
    public int g;
    public int h;
    
    public b(int paramInt)
    {
      super();
      if (paramInt >= 0)
      {
        byte[] arrayOfByte = new byte[Math.max(paramInt, 20)];
        e = arrayOfByte;
        f = arrayOfByte.length;
        return;
      }
      throw new IllegalArgumentException("bufferSize must be >= 0");
    }
    
    public final void S0(byte paramByte)
    {
      byte[] arrayOfByte = e;
      int i = g;
      g = (i + 1);
      arrayOfByte[i] = ((byte)paramByte);
      h += 1;
    }
    
    public final void T0(int paramInt)
    {
      byte[] arrayOfByte = e;
      int i = g;
      arrayOfByte[i] = ((byte)(byte)(paramInt & 0xFF));
      arrayOfByte[(i + 1)] = ((byte)(byte)(paramInt >> 8 & 0xFF));
      arrayOfByte[(i + 2)] = ((byte)(byte)(paramInt >> 16 & 0xFF));
      g = (i + 4);
      arrayOfByte[(i + 3)] = ((byte)(byte)(paramInt >> 24 & 0xFF));
      h += 4;
    }
    
    public final void U0(long paramLong)
    {
      byte[] arrayOfByte = e;
      int i = g;
      arrayOfByte[i] = ((byte)(byte)(int)(paramLong & 0xFF));
      arrayOfByte[(i + 1)] = ((byte)(byte)(int)(paramLong >> 8 & 0xFF));
      arrayOfByte[(i + 2)] = ((byte)(byte)(int)(paramLong >> 16 & 0xFF));
      arrayOfByte[(i + 3)] = ((byte)(byte)(int)(0xFF & paramLong >> 24));
      arrayOfByte[(i + 4)] = ((byte)(byte)((int)(paramLong >> 32) & 0xFF));
      arrayOfByte[(i + 5)] = ((byte)(byte)((int)(paramLong >> 40) & 0xFF));
      arrayOfByte[(i + 6)] = ((byte)(byte)((int)(paramLong >> 48) & 0xFF));
      g = (i + 8);
      arrayOfByte[(i + 7)] = ((byte)(byte)((int)(paramLong >> 56) & 0xFF));
      h += 8;
    }
    
    public final void V0(int paramInt)
    {
      if (paramInt >= 0) {
        X0(paramInt);
      } else {
        Y0(paramInt);
      }
    }
    
    public final void W0(int paramInt1, int paramInt2)
    {
      X0(r0.c(paramInt1, paramInt2));
    }
    
    public final void X0(int paramInt)
    {
      int i = paramInt;
      byte[] arrayOfByte;
      if (j.b())
      {
        long l = g;
        for (;;)
        {
          if ((paramInt & 0xFFFFFF80) == 0)
          {
            arrayOfByte = e;
            i = g;
            g = (i + 1);
            p0.H(arrayOfByte, i, (byte)paramInt);
            paramInt = (int)(g - l);
            h += paramInt;
            return;
          }
          arrayOfByte = e;
          i = g;
          g = (i + 1);
          p0.H(arrayOfByte, i, (byte)(paramInt & 0x7F | 0x80));
          paramInt >>>= 7;
        }
      }
      for (;;)
      {
        if ((i & 0xFFFFFF80) == 0)
        {
          arrayOfByte = e;
          paramInt = g;
          g = (paramInt + 1);
          arrayOfByte[paramInt] = ((byte)(byte)i);
          h += 1;
          return;
        }
        arrayOfByte = e;
        paramInt = g;
        g = (paramInt + 1);
        arrayOfByte[paramInt] = ((byte)(byte)(i & 0x7F | 0x80));
        h += 1;
        i >>>= 7;
      }
    }
    
    public final void Y0(long paramLong)
    {
      long l = paramLong;
      byte[] arrayOfByte;
      int i;
      if (j.b())
      {
        l = g;
        for (;;)
        {
          if ((paramLong & 0xFFFFFFFFFFFFFF80) == 0L)
          {
            arrayOfByte = e;
            i = g;
            g = (i + 1);
            p0.H(arrayOfByte, i, (byte)(int)paramLong);
            i = (int)(g - l);
            h += i;
            return;
          }
          arrayOfByte = e;
          i = g;
          g = (i + 1);
          p0.H(arrayOfByte, i, (byte)((int)paramLong & 0x7F | 0x80));
          paramLong >>>= 7;
        }
      }
      for (;;)
      {
        if ((l & 0xFFFFFFFFFFFFFF80) == 0L)
        {
          arrayOfByte = e;
          i = g;
          g = (i + 1);
          arrayOfByte[i] = ((byte)(byte)(int)l);
          h += 1;
          return;
        }
        arrayOfByte = e;
        i = g;
        g = (i + 1);
        arrayOfByte[i] = ((byte)(byte)((int)l & 0x7F | 0x80));
        h += 1;
        l >>>= 7;
      }
    }
  }
  
  public static class c
    extends IOException
  {
    private static final long serialVersionUID = -6947486886997889499L;
    
    public c(Throwable paramThrowable)
    {
      super(paramThrowable);
    }
  }
  
  public static final class d
    extends j.b
  {
    public final OutputStream i;
    
    public d(OutputStream paramOutputStream, int paramInt)
    {
      super();
      if (paramOutputStream != null)
      {
        i = paramOutputStream;
        return;
      }
      throw new NullPointerException("out");
    }
    
    public void A0(O paramO)
    {
      P0(paramO.a());
      paramO.g(this);
    }
    
    public void B0(int paramInt, O paramO)
    {
      N0(1, 3);
      O0(2, paramInt);
      c1(3, paramO);
      N0(1, 4);
    }
    
    public void C0(int paramInt, g paramg)
    {
      N0(1, 3);
      O0(2, paramInt);
      f0(3, paramg);
      N0(1, 4);
    }
    
    public void L0(int paramInt, String paramString)
    {
      N0(paramInt, 2);
      M0(paramString);
    }
    
    public void M0(String paramString)
    {
      try
      {
        j = paramString.length() * 3;
        k = j.R(j);
        m = k + j;
        n = f;
        if (m > n)
        {
          byte[] arrayOfByte = new byte[j];
          k = q0.f(paramString, arrayOfByte, 0, j);
          P0(k);
          a(arrayOfByte, 0, k);
          return;
        }
      }
      catch (q0.d locald1)
      {
        int k;
        int n;
        break label241;
        if (m > n - g) {
          Z0();
        }
        int m = j.R(paramString.length());
        int j = g;
        if (m == k)
        {
          k = j + m;
          try
          {
            g = k;
            n = q0.f(paramString, e, k, f - k);
            g = j;
            k = n - j - m;
            X0(k);
            g = n;
          }
          catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
          {
            break label203;
          }
          catch (q0.d locald2)
          {
            break label218;
          }
        }
        else
        {
          k = q0.g(paramString);
          X0(k);
          g = q0.f(paramString, e, g, k);
        }
        h += k;
        return;
        label203:
        j.c localc = new androidx/datastore/preferences/protobuf/j$c;
        localc.<init>(locald2);
        throw localc;
        label218:
        h -= g - j;
        g = j;
        throw locald2;
        label241:
        X(paramString, locald2);
      }
    }
    
    public void N0(int paramInt1, int paramInt2)
    {
      P0(r0.c(paramInt1, paramInt2));
    }
    
    public void O0(int paramInt1, int paramInt2)
    {
      a1(20);
      W0(paramInt1, 0);
      X0(paramInt2);
    }
    
    public void P0(int paramInt)
    {
      a1(5);
      X0(paramInt);
    }
    
    public void Q0(int paramInt, long paramLong)
    {
      a1(20);
      W0(paramInt, 0);
      Y0(paramLong);
    }
    
    public void R0(long paramLong)
    {
      a1(10);
      Y0(paramLong);
    }
    
    public void W()
    {
      if (g > 0) {
        Z0();
      }
    }
    
    public final void Z0()
    {
      i.write(e, 0, g);
      g = 0;
    }
    
    public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      b1(paramArrayOfByte, paramInt1, paramInt2);
    }
    
    public void a0(byte paramByte)
    {
      if (g == f) {
        Z0();
      }
      S0(paramByte);
    }
    
    public final void a1(int paramInt)
    {
      if (f - g < paramInt) {
        Z0();
      }
    }
    
    public void b0(int paramInt, boolean paramBoolean)
    {
      a1(11);
      W0(paramInt, 0);
      S0((byte)paramBoolean);
    }
    
    public void b1(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      int j = f;
      int k = g;
      if (j - k >= paramInt2)
      {
        System.arraycopy(paramArrayOfByte, paramInt1, e, k, paramInt2);
        g += paramInt2;
      }
      for (;;)
      {
        h += paramInt2;
        break;
        j -= k;
        System.arraycopy(paramArrayOfByte, paramInt1, e, k, j);
        paramInt1 += j;
        paramInt2 -= j;
        g = f;
        h += j;
        Z0();
        if (paramInt2 <= f)
        {
          System.arraycopy(paramArrayOfByte, paramInt1, e, 0, paramInt2);
          g = paramInt2;
        }
        else
        {
          i.write(paramArrayOfByte, paramInt1, paramInt2);
        }
      }
    }
    
    public void c1(int paramInt, O paramO)
    {
      N0(paramInt, 2);
      A0(paramO);
    }
    
    public void d1(O paramO, e0 parame0)
    {
      P0(((a)paramO).j(parame0));
      parame0.i(paramO, a);
    }
    
    public void e0(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      P0(paramInt2);
      b1(paramArrayOfByte, paramInt1, paramInt2);
    }
    
    public void f0(int paramInt, g paramg)
    {
      N0(paramInt, 2);
      g0(paramg);
    }
    
    public void g0(g paramg)
    {
      P0(paramg.size());
      paramg.d0(this);
    }
    
    public void l0(int paramInt1, int paramInt2)
    {
      a1(14);
      W0(paramInt1, 5);
      T0(paramInt2);
    }
    
    public void m0(int paramInt)
    {
      a1(4);
      T0(paramInt);
    }
    
    public void n0(int paramInt, long paramLong)
    {
      a1(18);
      W0(paramInt, 1);
      U0(paramLong);
    }
    
    public void o0(long paramLong)
    {
      a1(8);
      U0(paramLong);
    }
    
    public void v0(int paramInt1, int paramInt2)
    {
      a1(20);
      W0(paramInt1, 0);
      V0(paramInt2);
    }
    
    public void w0(int paramInt)
    {
      if (paramInt >= 0) {
        P0(paramInt);
      } else {
        R0(paramInt);
      }
    }
    
    public void z0(int paramInt, O paramO, e0 parame0)
    {
      N0(paramInt, 2);
      d1(paramO, parame0);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */