package o6;

import kotlin.jvm.internal.Intrinsics;

public abstract class c
{
  public static final long h(long paramLong, int paramInt)
  {
    return a.m((paramLong << 1) + paramInt);
  }
  
  public static final long i(long paramLong)
  {
    return a.m((paramLong << 1) + 1L);
  }
  
  public static final long j(long paramLong)
  {
    if ((-4611686018426L <= paramLong) && (paramLong < 4611686018427L)) {
      paramLong = k(m(paramLong));
    } else {
      paramLong = i(l6.d.e(paramLong, -4611686018427387903L, 4611686018427387903L));
    }
    return paramLong;
  }
  
  public static final long k(long paramLong)
  {
    return a.m(paramLong << 1);
  }
  
  public static final long l(long paramLong)
  {
    if ((-4611686018426999999L <= paramLong) && (paramLong < 4611686018427000000L)) {
      paramLong = k(paramLong);
    } else {
      paramLong = i(n(paramLong));
    }
    return paramLong;
  }
  
  public static final long m(long paramLong)
  {
    return paramLong * 1000000;
  }
  
  public static final long n(long paramLong)
  {
    return paramLong / 1000000;
  }
  
  public static final long o(int paramInt, d paramd)
  {
    Intrinsics.checkNotNullParameter(paramd, "unit");
    long l;
    if (paramd.compareTo(d.s) <= 0) {
      l = k(e.b(paramInt, paramd, d.p));
    } else {
      l = p(paramInt, paramd);
    }
    return l;
  }
  
  public static final long p(long paramLong, d paramd)
  {
    Intrinsics.checkNotNullParameter(paramd, "unit");
    d locald = d.p;
    long l = e.b(4611686018426999999L, locald, paramd);
    if ((-l <= paramLong) && (paramLong <= l)) {
      return k(e.b(paramLong, paramd, locald));
    }
    return i(l6.d.e(e.a(paramLong, paramd, d.r), -4611686018427387903L, 4611686018427387903L));
  }
}

/* Location:
 * Qualified Name:     o6.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */