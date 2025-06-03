package l1;

import F0.L;
import F0.s;
import g0.E;
import g0.M;
import g0.z;

public final class A
{
  public final E a = new E(0L);
  public final z b = new z();
  public boolean c;
  public boolean d;
  public boolean e;
  public long f = -9223372036854775807L;
  public long g = -9223372036854775807L;
  public long h = -9223372036854775807L;
  
  public static boolean a(byte[] paramArrayOfByte)
  {
    boolean bool = false;
    if ((paramArrayOfByte[0] & 0xC4) != 68) {
      return false;
    }
    if ((paramArrayOfByte[2] & 0x4) != 4) {
      return false;
    }
    if ((paramArrayOfByte[4] & 0x4) != 4) {
      return false;
    }
    if ((paramArrayOfByte[5] & 0x1) != 1) {
      return false;
    }
    if ((paramArrayOfByte[8] & 0x3) == 3) {
      bool = true;
    }
    return bool;
  }
  
  public static long l(z paramz)
  {
    int i = paramz.f();
    if (paramz.a() < 9) {
      return -9223372036854775807L;
    }
    byte[] arrayOfByte = new byte[9];
    paramz.l(arrayOfByte, 0, 9);
    paramz.T(i);
    if (!a(arrayOfByte)) {
      return -9223372036854775807L;
    }
    return m(arrayOfByte);
  }
  
  public static long m(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte[0];
    long l1 = i;
    long l2 = i;
    long l3 = paramArrayOfByte[1];
    i = paramArrayOfByte[2];
    return (l1 & 0x38) >> 3 << 30 | (l2 & 0x3) << 28 | (l3 & 0xFF) << 20 | (i & 0xF8) >> 3 << 15 | (i & 0x3) << 13 | (paramArrayOfByte[3] & 0xFF) << 5 | (paramArrayOfByte[4] & 0xF8) >> 3;
  }
  
  public final int b(s params)
  {
    b.Q(M.f);
    c = true;
    params.h();
    return 0;
  }
  
  public long c()
  {
    return h;
  }
  
  public E d()
  {
    return a;
  }
  
  public boolean e()
  {
    return c;
  }
  
  public final int f(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte[paramInt];
    int j = paramArrayOfByte[(paramInt + 1)];
    int k = paramArrayOfByte[(paramInt + 2)];
    return paramArrayOfByte[(paramInt + 3)] & 0xFF | (i & 0xFF) << 24 | (j & 0xFF) << 16 | (k & 0xFF) << 8;
  }
  
  public int g(s params, L paramL)
  {
    if (!e) {
      return j(params, paramL);
    }
    if (g == -9223372036854775807L) {
      return b(params);
    }
    if (!d) {
      return h(params, paramL);
    }
    long l = f;
    if (l == -9223372036854775807L) {
      return b(params);
    }
    l = a.b(l);
    h = (a.c(g) - l);
    return b(params);
  }
  
  public final int h(s params, L paramL)
  {
    int i = (int)Math.min(20000L, params.a());
    long l1 = params.p();
    long l2 = 0;
    if (l1 != l2)
    {
      a = l2;
      return 1;
    }
    b.P(i);
    params.h();
    params.n(b.e(), 0, i);
    f = i(b);
    d = true;
    return 0;
  }
  
  public final long i(z paramz)
  {
    int i = paramz.f();
    int j = paramz.g();
    while (i < j - 3)
    {
      if (f(paramz.e(), i) == 442)
      {
        paramz.T(i + 4);
        long l = l(paramz);
        if (l != -9223372036854775807L) {
          return l;
        }
      }
      i++;
    }
    return -9223372036854775807L;
  }
  
  public final int j(s params, L paramL)
  {
    long l = params.a();
    int i = (int)Math.min(20000L, l);
    l -= i;
    if (params.p() != l)
    {
      a = l;
      return 1;
    }
    b.P(i);
    params.h();
    params.n(b.e(), 0, i);
    g = k(b);
    e = true;
    return 0;
  }
  
  public final long k(z paramz)
  {
    int i = paramz.f();
    for (int j = paramz.g() - 4; j >= i; j--) {
      if (f(paramz.e(), j) == 442)
      {
        paramz.T(j + 4);
        long l = l(paramz);
        if (l != -9223372036854775807L) {
          return l;
        }
      }
    }
    return -9223372036854775807L;
  }
}

/* Location:
 * Qualified Name:     l1.A
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */