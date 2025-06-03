package a1;

import F0.s;
import F0.u;
import d0.A;
import g0.a;
import g0.z;

public final class f
{
  public int a;
  public int b;
  public long c;
  public long d;
  public long e;
  public long f;
  public int g;
  public int h;
  public int i;
  public final int[] j = new int['ÿ'];
  public final z k = new z(255);
  
  public boolean a(s params, boolean paramBoolean)
  {
    b();
    k.P(27);
    byte[] arrayOfByte = k.e();
    int m = 0;
    if ((u.b(params, arrayOfByte, 0, 27, paramBoolean)) && (k.I() == 1332176723L))
    {
      int n = k.G();
      a = n;
      if (n != 0)
      {
        if (paramBoolean) {
          return false;
        }
        throw A.d("unsupported bit stream revision");
      }
      b = k.G();
      c = k.u();
      d = k.w();
      e = k.w();
      f = k.w();
      n = k.G();
      g = n;
      h = (n + 27);
      k.P(n);
      if (!u.b(params, k.e(), 0, g, paramBoolean)) {
        return false;
      }
      while (m < g)
      {
        j[m] = k.G();
        i += j[m];
        m++;
      }
      return true;
    }
    return false;
  }
  
  public void b()
  {
    a = 0;
    b = 0;
    c = 0L;
    d = 0L;
    e = 0L;
    f = 0L;
    g = 0;
    h = 0;
    i = 0;
  }
  
  public boolean c(s params)
  {
    return d(params, -1L);
  }
  
  public boolean d(s params, long paramLong)
  {
    boolean bool1;
    if (params.p() == params.m()) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    a.a(bool1);
    k.P(4);
    boolean bool2;
    for (;;)
    {
      bool2 = paramLong < -1L;
      if (((bool2) && (params.p() + 4L >= paramLong)) || (!u.b(params, k.e(), 0, 4, true))) {
        break;
      }
      k.T(0);
      if (k.I() == 1332176723L)
      {
        params.h();
        return true;
      }
      params.i(1);
    }
    while (((!bool2) || (params.p() < paramLong)) && (params.b(1) != -1)) {}
    return false;
  }
}

/* Location:
 * Qualified Name:     a1.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */