package s0;

import java.io.OutputStream;
import o0.q.b;

public final class j$d
  extends j.a
{
  public final OutputStream h;
  
  public j$d(q.b paramb, int paramInt)
  {
    super(paramInt);
    h = paramb;
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
    int i = (byte)paramBoolean;
    byte[] arrayOfByte = e;
    paramInt = g;
    g = (paramInt + 1);
    arrayOfByte[paramInt] = ((byte)i);
  }
  
  public final void V(byte[] paramArrayOfByte, int paramInt)
  {
    m0(paramInt);
    w0(paramArrayOfByte, 0, paramInt);
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
    try
    {
      int i = paramString.length() * 3;
      int j = j.P(i);
      int k = j + i;
      m = f;
      byte[] arrayOfByte1;
      if (k > m)
      {
        arrayOfByte1 = new byte[i];
        m = m1.a.b(paramString, arrayOfByte1, 0, i);
        m0(m);
        w0(arrayOfByte1, 0, m);
        return;
      }
      if (k > m - g) {
        u0();
      }
      i = j.P(paramString.length());
      m = g;
      if (i == j)
      {
        k = m + i;
        try
        {
          g = k;
          arrayOfByte1 = e;
          j = f;
          j = m1.a.b(paramString, arrayOfByte1, k, j - k);
          g = m;
          s0(j - m - i);
          g = j;
        }
        catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
        {
          break label211;
        }
        catch (m1.d locald1)
        {
          break label226;
        }
      }
      else
      {
        i = m1.a(paramString);
        s0(i);
        arrayOfByte2 = e;
        j = g;
        g = m1.a.b(paramString, arrayOfByte2, j, i);
      }
    }
    catch (m1.d locald2)
    {
      int m;
      byte[] arrayOfByte2;
      label211:
      j.c localc;
      label226:
      S(paramString, locald2);
    }
    localc = new s0/j$c;
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
 * Qualified Name:     s0.j.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */