package ma;

import java.io.OutputStream;

public final class k$d
  extends k.a
{
  public final OutputStream h;
  
  public k$d(OutputStream paramOutputStream, int paramInt)
  {
    super(paramInt);
    if (paramOutputStream != null)
    {
      h = paramOutputStream;
      return;
    }
    throw new NullPointerException("out");
  }
  
  public final void T(byte paramByte)
  {
    if (g == f) {
      u0();
    }
    byte[] arrayOfByte = e;
    int i = g;
    g = (i + 1);
    arrayOfByte[i] = ((byte)paramByte);
  }
  
  public final void U(int paramInt, boolean paramBoolean)
  {
    v0(11);
    r0(paramInt, 0);
    paramInt = (byte)paramBoolean;
    byte[] arrayOfByte = e;
    int i = g;
    g = (i + 1);
    arrayOfByte[i] = ((byte)paramInt);
  }
  
  public final void V(byte[] paramArrayOfByte, int paramInt)
  {
    m0(paramInt);
    w0(paramArrayOfByte, 0, paramInt);
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
    v0(14);
    r0(paramInt1, 5);
    p0(paramInt2);
  }
  
  public final void Z(int paramInt)
  {
    v0(4);
    p0(paramInt);
  }
  
  public final void a0(int paramInt, long paramLong)
  {
    v0(18);
    r0(paramInt, 1);
    q0(paramLong);
  }
  
  public final void b0(long paramLong)
  {
    v0(8);
    q0(paramLong);
  }
  
  public final void c0(int paramInt1, int paramInt2)
  {
    v0(20);
    r0(paramInt1, 0);
    if (paramInt2 >= 0) {
      s0(paramInt2);
    } else {
      t0(paramInt2);
    }
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
    try
    {
      int i = paramString.length() * 3;
      int j = k.P(i);
      int k = j + i;
      m = f;
      byte[] arrayOfByte1;
      if (k > m)
      {
        arrayOfByte1 = new byte[i];
        m = u1.a.d(paramString, arrayOfByte1, 0, i);
        m0(m);
        w0(arrayOfByte1, 0, m);
        return;
      }
      if (k > m - g) {
        u0();
      }
      k = k.P(paramString.length());
      m = g;
      if (k == j)
      {
        j = m + k;
        try
        {
          g = j;
          arrayOfByte1 = e;
          i = f;
          j = u1.a.d(paramString, arrayOfByte1, j, i - j);
          g = m;
          s0(j - m - k);
          g = j;
        }
        catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
        {
          break label214;
        }
        catch (u1.d locald1)
        {
          break label229;
        }
      }
      else
      {
        k = u1.b(paramString);
        s0(k);
        arrayOfByte2 = e;
        j = g;
        g = u1.a.d(paramString, arrayOfByte2, j, k);
      }
    }
    catch (u1.d locald2)
    {
      int m;
      byte[] arrayOfByte2;
      label214:
      k.c localc;
      label229:
      S(paramString, locald2);
    }
    localc = new ma/k$c;
    localc.<init>(arrayOfByte2);
    throw localc;
    g = m;
    throw arrayOfByte2;
  }
  
  public final void k0(int paramInt1, int paramInt2)
  {
    m0(paramInt1 << 3 | paramInt2);
  }
  
  public final void l0(int paramInt1, int paramInt2)
  {
    v0(20);
    r0(paramInt1, 0);
    s0(paramInt2);
  }
  
  public final void m0(int paramInt)
  {
    v0(5);
    s0(paramInt);
  }
  
  public final void n0(int paramInt, long paramLong)
  {
    v0(20);
    r0(paramInt, 0);
    t0(paramLong);
  }
  
  public final void o0(long paramLong)
  {
    v0(10);
    t0(paramLong);
  }
  
  public final void s(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    w0(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public final void u0()
  {
    h.write(e, 0, g);
    g = 0;
  }
  
  public final void v0(int paramInt)
  {
    if (f - g < paramInt) {
      u0();
    }
  }
  
  public final void w0(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = f;
    int j = g;
    i -= j;
    if (i >= paramInt2)
    {
      System.arraycopy(paramArrayOfByte, paramInt1, e, j, paramInt2);
      g += paramInt2;
    }
    else
    {
      System.arraycopy(paramArrayOfByte, paramInt1, e, j, i);
      paramInt1 += i;
      paramInt2 -= i;
      g = f;
      u0();
      if (paramInt2 <= f)
      {
        System.arraycopy(paramArrayOfByte, paramInt1, e, 0, paramInt2);
        g = paramInt2;
      }
      else
      {
        h.write(paramArrayOfByte, paramInt1, paramInt2);
      }
    }
  }
}

/* Location:
 * Qualified Name:     ma.k.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */