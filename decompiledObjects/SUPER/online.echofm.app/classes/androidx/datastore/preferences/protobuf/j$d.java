package androidx.datastore.preferences.protobuf;

import java.io.OutputStream;

public final class j$d
  extends j.b
{
  public final OutputStream i;
  
  public j$d(OutputStream paramOutputStream, int paramInt)
  {
    super(paramInt);
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

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.j.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */