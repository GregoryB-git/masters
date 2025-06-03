package o6;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import x1.j;

public final class a
  implements Comparable
{
  public static final a p = new a(null);
  public static final long q = m(0L);
  public static final long r = c.b(4611686018427387903L);
  public static final long s = c.b(-4611686018427387903L);
  public final long o;
  
  public static final int C(long paramLong)
  {
    int i;
    if (S(paramLong)) {
      i = 0;
    } else {
      i = (int)(w(paramLong) % 60);
    }
    return i;
  }
  
  public static final d D(long paramLong)
  {
    d locald;
    if (M(paramLong)) {
      locald = d.p;
    } else {
      locald = d.r;
    }
    return locald;
  }
  
  public static final long F(long paramLong)
  {
    return paramLong >> 1;
  }
  
  public static int G(long paramLong)
  {
    return j.a(paramLong);
  }
  
  public static final boolean H(long paramLong)
  {
    return S(paramLong) ^ true;
  }
  
  public static final boolean K(long paramLong)
  {
    int i = (int)paramLong;
    boolean bool = true;
    if ((i & 0x1) != 1) {
      bool = false;
    }
    return bool;
  }
  
  public static final boolean M(long paramLong)
  {
    int i = (int)paramLong;
    boolean bool = true;
    if ((i & 0x1) != 0) {
      bool = false;
    }
    return bool;
  }
  
  public static final boolean S(long paramLong)
  {
    boolean bool;
    if ((paramLong != r) && (paramLong != s)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static final boolean T(long paramLong)
  {
    boolean bool;
    if (paramLong < 0L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static final boolean U(long paramLong)
  {
    boolean bool;
    if (paramLong > 0L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static final long V(long paramLong1, long paramLong2)
  {
    return W(paramLong1, Z(paramLong2));
  }
  
  public static final long W(long paramLong1, long paramLong2)
  {
    if (S(paramLong1))
    {
      if ((!H(paramLong2)) && ((paramLong2 ^ paramLong1) < 0L)) {
        throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
      }
      return paramLong1;
    }
    if (S(paramLong2)) {
      return paramLong2;
    }
    if (((int)paramLong1 & 0x1) == ((int)paramLong2 & 0x1))
    {
      paramLong2 = F(paramLong1) + F(paramLong2);
      if (M(paramLong1)) {
        paramLong1 = c.e(paramLong2);
      } else {
        paramLong1 = c.c(paramLong2);
      }
    }
    else if (K(paramLong1))
    {
      paramLong1 = c(paramLong1, F(paramLong1), F(paramLong2));
    }
    else
    {
      paramLong1 = c(paramLong1, F(paramLong2), F(paramLong1));
    }
    return paramLong1;
  }
  
  public static final long X(long paramLong, d paramd)
  {
    Intrinsics.checkNotNullParameter(paramd, "unit");
    if (paramLong == r) {
      paramLong = Long.MAX_VALUE;
    } else if (paramLong == s) {
      paramLong = Long.MIN_VALUE;
    } else {
      paramLong = e.a(F(paramLong), D(paramLong), paramd);
    }
    return paramLong;
  }
  
  public static String Y(long paramLong)
  {
    String str;
    if (paramLong == 0L)
    {
      str = "0s";
    }
    else if (paramLong == r)
    {
      str = "Infinity";
    }
    else if (paramLong == s)
    {
      str = "-Infinity";
    }
    else
    {
      boolean bool = T(paramLong);
      StringBuilder localStringBuilder = new StringBuilder();
      if (bool) {
        localStringBuilder.append('-');
      }
      long l1 = o(paramLong);
      long l2 = r(l1);
      int i = p(l1);
      int j = x(l1);
      int k = C(l1);
      int m = z(l1);
      int n = 0;
      int i1;
      if (l2 != 0L) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      int i2;
      if (i != 0) {
        i2 = 1;
      } else {
        i2 = 0;
      }
      int i3;
      if (j != 0) {
        i3 = 1;
      } else {
        i3 = 0;
      }
      int i4;
      if ((k == 0) && (m == 0)) {
        i4 = 0;
      } else {
        i4 = 1;
      }
      if (i1 != 0)
      {
        localStringBuilder.append(l2);
        localStringBuilder.append('d');
        n = 1;
      }
      if (i2 == 0)
      {
        i5 = n;
        if (i1 == 0) {
          break label263;
        }
        if (i3 == 0)
        {
          i5 = n;
          if (i4 == 0) {
            break label263;
          }
        }
      }
      if (n > 0) {
        localStringBuilder.append(' ');
      }
      localStringBuilder.append(i);
      localStringBuilder.append('h');
      int i5 = n + 1;
      label263:
      if (i3 == 0)
      {
        n = i5;
        if (i4 == 0) {
          break label326;
        }
        if (i2 == 0)
        {
          n = i5;
          if (i1 == 0) {
            break label326;
          }
        }
      }
      if (i5 > 0) {
        localStringBuilder.append(' ');
      }
      localStringBuilder.append(j);
      localStringBuilder.append('m');
      n = i5 + 1;
      label326:
      i5 = n;
      if (i4 != 0)
      {
        if (n > 0) {
          localStringBuilder.append(' ');
        }
        if ((k == 0) && (i1 == 0) && (i2 == 0) && (i3 == 0)) {
          if (m >= 1000000)
          {
            i5 = m / 1000000;
            i1 = m % 1000000;
            str = "ms";
            i2 = 6;
          }
        }
        for (;;)
        {
          e(paramLong, localStringBuilder, i5, i1, i2, str, false);
          break;
          if (m >= 1000)
          {
            i5 = m / 1000;
            i1 = m % 1000;
            str = "us";
            i2 = 3;
          }
          else
          {
            localStringBuilder.append(m);
            localStringBuilder.append("ns");
            break;
            i2 = 9;
            i5 = k;
            i1 = m;
            str = "s";
          }
        }
        i5 = n + 1;
      }
      if ((bool) && (i5 > 1)) {
        localStringBuilder.insert(1, '(').append(')');
      }
      str = localStringBuilder.toString();
      Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
    }
    return str;
  }
  
  public static final long Z(long paramLong)
  {
    return c.a(-F(paramLong), (int)paramLong & 0x1);
  }
  
  public static final long c(long paramLong1, long paramLong2, long paramLong3)
  {
    paramLong1 = c.g(paramLong3);
    paramLong2 += paramLong1;
    if ((-4611686018426L <= paramLong2) && (paramLong2 < 4611686018427L))
    {
      paramLong1 = c.f(paramLong1);
      paramLong1 = c.d(c.f(paramLong2) + (paramLong3 - paramLong1));
    }
    else
    {
      paramLong1 = c.b(l6.d.e(paramLong2, -4611686018427387903L, 4611686018427387903L));
    }
    return paramLong1;
  }
  
  public static final void e(long paramLong, StringBuilder paramStringBuilder, int paramInt1, int paramInt2, int paramInt3, String paramString, boolean paramBoolean)
  {
    paramStringBuilder.append(paramInt1);
    if (paramInt2 != 0)
    {
      paramStringBuilder.append('.');
      String str = i.O(String.valueOf(paramInt2), paramInt3, '0');
      paramInt1 = str.length();
      paramInt2 = -1;
      paramInt3 = paramInt1 - 1;
      paramInt1 = paramInt2;
      if (paramInt3 >= 0) {
        for (paramInt1 = paramInt3;; paramInt1 = paramInt3)
        {
          paramInt3 = paramInt1 - 1;
          if (str.charAt(paramInt1) != '0') {
            break;
          }
          if (paramInt3 < 0)
          {
            paramInt1 = paramInt2;
            break;
          }
        }
      }
      paramInt2 = paramInt1 + 1;
      if ((!paramBoolean) && (paramInt2 < 3)) {
        paramStringBuilder.append(str, 0, paramInt2);
      }
      for (;;)
      {
        Intrinsics.checkNotNullExpressionValue(paramStringBuilder, "append(...)");
        break;
        paramStringBuilder.append(str, 0, (paramInt1 + 3) / 3 * 3);
      }
    }
    paramStringBuilder.append(paramString);
  }
  
  public static int l(long paramLong1, long paramLong2)
  {
    long l = paramLong1 ^ paramLong2;
    if ((l >= 0L) && (((int)l & 0x1) != 0))
    {
      int i = ((int)paramLong1 & 0x1) - ((int)paramLong2 & 0x1);
      int j = i;
      if (T(paramLong1)) {
        j = -i;
      }
      return j;
    }
    return Intrinsics.e(paramLong1, paramLong2);
  }
  
  public static long m(long paramLong)
  {
    if (b.a())
    {
      long l;
      StringBuilder localStringBuilder;
      if (M(paramLong))
      {
        l = F(paramLong);
        if ((-4611686018426999999L > l) || (l >= 4611686018427000000L))
        {
          localStringBuilder = new StringBuilder();
          localStringBuilder.append(F(paramLong));
          localStringBuilder.append(" ns is out of nanoseconds range");
          throw new AssertionError(localStringBuilder.toString());
        }
      }
      else
      {
        l = F(paramLong);
        if ((-4611686018427387903L <= l) && (l < 4611686018427387904L))
        {
          l = F(paramLong);
          if ((-4611686018426L <= l) && (l < 4611686018427L))
          {
            localStringBuilder = new StringBuilder();
            localStringBuilder.append(F(paramLong));
            localStringBuilder.append(" ms is denormalized");
            throw new AssertionError(localStringBuilder.toString());
          }
        }
        else
        {
          localStringBuilder = new StringBuilder();
          localStringBuilder.append(F(paramLong));
          localStringBuilder.append(" ms is out of milliseconds range");
          throw new AssertionError(localStringBuilder.toString());
        }
      }
    }
    return paramLong;
  }
  
  public static boolean n(long paramLong, Object paramObject)
  {
    if (!(paramObject instanceof a)) {
      return false;
    }
    return paramLong == ((a)paramObject).a0();
  }
  
  public static final long o(long paramLong)
  {
    long l = paramLong;
    if (T(paramLong)) {
      l = Z(paramLong);
    }
    return l;
  }
  
  public static final int p(long paramLong)
  {
    int i;
    if (S(paramLong)) {
      i = 0;
    } else {
      i = (int)(s(paramLong) % 24);
    }
    return i;
  }
  
  public static final long r(long paramLong)
  {
    return X(paramLong, d.v);
  }
  
  public static final long s(long paramLong)
  {
    return X(paramLong, d.u);
  }
  
  public static final long u(long paramLong)
  {
    return X(paramLong, d.t);
  }
  
  public static final long w(long paramLong)
  {
    return X(paramLong, d.s);
  }
  
  public static final int x(long paramLong)
  {
    int i;
    if (S(paramLong)) {
      i = 0;
    } else {
      i = (int)(u(paramLong) % 60);
    }
    return i;
  }
  
  public static final int z(long paramLong)
  {
    int i;
    if (S(paramLong))
    {
      i = 0;
    }
    else
    {
      boolean bool = K(paramLong);
      paramLong = F(paramLong);
      if (bool) {}
      for (paramLong = c.f(paramLong % 'Ϩ');; paramLong %= 1000000000)
      {
        i = (int)paramLong;
        break;
      }
    }
    return i;
  }
  
  public boolean equals(Object paramObject)
  {
    return n(o, paramObject);
  }
  
  public int hashCode()
  {
    return G(o);
  }
  
  public int j(long paramLong)
  {
    return l(o, paramLong);
  }
  
  public String toString()
  {
    return Y(o);
  }
  
  public static final class a {}
}

/* Location:
 * Qualified Name:     o6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */