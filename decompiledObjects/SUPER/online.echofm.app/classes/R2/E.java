package R2;

import A2.n;

public final class E
{
  public final String a;
  public final String b;
  public final long c;
  public final long d;
  public final long e;
  public final long f;
  public final long g;
  public final Long h;
  public final Long i;
  public final Long j;
  public final Boolean k;
  
  public E(String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, Long paramLong6, Long paramLong7, Long paramLong8, Boolean paramBoolean)
  {
    n.e(paramString1);
    n.e(paramString2);
    boolean bool1 = true;
    boolean bool2;
    if (paramLong1 >= 0L) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    n.a(bool2);
    if (paramLong2 >= 0L) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    n.a(bool2);
    if (paramLong3 >= 0L) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    n.a(bool2);
    if (paramLong5 >= 0L) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    n.a(bool2);
    a = paramString1;
    b = paramString2;
    c = paramLong1;
    d = paramLong2;
    e = paramLong3;
    f = paramLong4;
    g = paramLong5;
    h = paramLong6;
    i = paramLong7;
    j = paramLong8;
    k = paramBoolean;
  }
  
  public E(String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, long paramLong4, Long paramLong5, Long paramLong6, Long paramLong7, Boolean paramBoolean)
  {
    this(paramString1, paramString2, 0L, 0L, 0L, paramLong3, 0L, null, null, null, null);
  }
  
  public final E a(long paramLong)
  {
    return new E(a, b, c, d, e, paramLong, g, h, i, j, k);
  }
  
  public final E b(long paramLong1, long paramLong2)
  {
    return new E(a, b, c, d, e, f, paramLong1, Long.valueOf(paramLong2), i, j, k);
  }
  
  public final E c(Long paramLong1, Long paramLong2, Boolean paramBoolean)
  {
    if ((paramBoolean != null) && (!paramBoolean.booleanValue())) {
      paramBoolean = null;
    }
    return new E(a, b, c, d, e, f, g, h, paramLong1, paramLong2, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     R2.E
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */