package e7;

import m6.j;

public final class b0
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
  
  public b0(String paramString1, String paramString2, long paramLong)
  {
    this(paramString1, paramString2, 0L, 0L, 0L, paramLong, 0L, null, null, null, null);
  }
  
  public b0(String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, Long paramLong6, Long paramLong7, Long paramLong8, Boolean paramBoolean)
  {
    j.e(paramString1);
    j.e(paramString2);
    boolean bool1 = true;
    boolean bool2;
    if (paramLong1 >= 0L) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    j.b(bool2);
    if (paramLong2 >= 0L) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    j.b(bool2);
    if (paramLong3 >= 0L) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    j.b(bool2);
    if (paramLong5 >= 0L) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    j.b(bool2);
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
  
  public final b0 a(long paramLong1, long paramLong2)
  {
    return new b0(a, b, c, d, e, f, paramLong1, Long.valueOf(paramLong2), i, j, k);
  }
  
  public final b0 b(Long paramLong1, Long paramLong2, Boolean paramBoolean)
  {
    if ((paramBoolean != null) && (!paramBoolean.booleanValue())) {
      paramBoolean = null;
    }
    return new b0(a, b, c, d, e, f, g, h, paramLong1, paramLong2, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     e7.b0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */