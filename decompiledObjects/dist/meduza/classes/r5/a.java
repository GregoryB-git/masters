package r5;

import b5.n;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import o7.t;
import o7.t.a;
import p2.m0;
import v5.c;
import v5.e0;
import v5.z;

public final class a
  extends b
{
  public final t5.e g;
  public final long h;
  public final long i;
  public final long j;
  public final int k;
  public final int l;
  public final float m;
  public final float n;
  public final t<a> o;
  public final c p;
  public float q;
  public int r;
  public int s;
  public long t;
  public b5.m u;
  
  public a(z4.i0 parami0, int[] paramArrayOfInt, int paramInt, t5.e parame, long paramLong1, long paramLong2, long paramLong3, t paramt)
  {
    super(parami0, paramArrayOfInt);
    long l1 = paramLong3;
    if (paramLong3 < paramLong1)
    {
      v5.m.f("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
      l1 = paramLong1;
    }
    g = parame;
    h = (paramLong1 * 1000L);
    i = (paramLong2 * 1000L);
    j = (l1 * 1000L);
    k = 1279;
    l = 719;
    m = 0.7F;
    n = 0.75F;
    o = t.p(paramt);
    p = localz;
    q = 1.0F;
    s = 0;
    t = -9223372036854775807L;
  }
  
  public static void v(ArrayList paramArrayList, long[] paramArrayOfLong)
  {
    int i1 = 0;
    long l1 = 0L;
    int i3;
    for (int i2 = 0;; i2++)
    {
      i3 = i1;
      if (i2 >= paramArrayOfLong.length) {
        break;
      }
      l1 += paramArrayOfLong[i2];
    }
    while (i3 < paramArrayList.size())
    {
      t.a locala = (t.a)paramArrayList.get(i3);
      if (locala != null) {
        locala.c(new a(l1, paramArrayOfLong[i3]));
      }
      i3++;
    }
  }
  
  public static long x(List paramList)
  {
    boolean bool = paramList.isEmpty();
    long l1 = -9223372036854775807L;
    if (bool) {
      return -9223372036854775807L;
    }
    paramList = (b5.m)m0.K(paramList);
    long l2 = g;
    long l3 = l1;
    if (l2 != -9223372036854775807L)
    {
      long l4 = h;
      l3 = l1;
      if (l4 != -9223372036854775807L) {
        l3 = l4 - l2;
      }
    }
    return l3;
  }
  
  public final void g()
  {
    u = null;
  }
  
  public final int i()
  {
    return r;
  }
  
  public final void j(long paramLong1, long paramLong2, List paramList, n[] paramArrayOfn)
  {
    long l1 = p.d();
    int i1 = r;
    long l2;
    if ((i1 < paramArrayOfn.length) && (paramArrayOfn[i1].next()))
    {
      paramArrayOfn = paramArrayOfn[r];
      l2 = paramArrayOfn.b();
      l3 = paramArrayOfn.a();
    }
    else
    {
      i2 = paramArrayOfn.length;
    }
    for (i1 = 0; i1 < i2; i1++)
    {
      n localn = paramArrayOfn[i1];
      if (localn.next())
      {
        l2 = localn.b();
        l3 = localn.a();
        l3 = l2 - l3;
        break label141;
      }
    }
    long l3 = x(paramList);
    label141:
    int i2 = s;
    if (i2 == 0)
    {
      s = 1;
      r = w(l1, l3);
      return;
    }
    i1 = r;
    if (paramList.isEmpty()) {
      i3 = -1;
    } else {
      i3 = d(Kd);
    }
    if (i3 != -1)
    {
      i2 = Ke;
      i1 = i3;
    }
    int i4 = w(l1, l3);
    int i3 = i4;
    if (!l(i1, l1))
    {
      paramArrayOfn = d;
      paramList = paramArrayOfn[i1];
      paramArrayOfn = paramArrayOfn[i4];
      if (paramLong2 == -9223372036854775807L)
      {
        paramLong2 = h;
      }
      else
      {
        l2 = paramLong2;
        if (l3 != -9223372036854775807L) {
          l2 = paramLong2 - l3;
        }
        paramLong2 = Math.min(((float)l2 * n), h);
      }
      int i5 = p;
      int i6 = p;
      if ((i5 <= i6) || (paramLong1 >= paramLong2))
      {
        i3 = i4;
        if (i5 < i6)
        {
          i3 = i4;
          if (paramLong1 < i) {}
        }
      }
      else
      {
        i3 = i1;
      }
    }
    if (i3 != i1) {
      i2 = 3;
    }
    s = i2;
    r = i3;
  }
  
  public final void m()
  {
    t = -9223372036854775807L;
    u = null;
  }
  
  public final int n(long paramLong, List<? extends b5.m> paramList)
  {
    long l1 = p.d();
    long l2 = t;
    int i1 = 0;
    if ((l2 != -9223372036854775807L) && (l1 - l2 < 1000L) && ((paramList.isEmpty()) || (((b5.m)m0.K(paramList)).equals(u)))) {
      i2 = 0;
    } else {
      i2 = 1;
    }
    if (i2 == 0) {
      return paramList.size();
    }
    t = l1;
    b5.m localm;
    if (paramList.isEmpty()) {
      localm = null;
    } else {
      localm = (b5.m)m0.K(paramList);
    }
    u = localm;
    if (paramList.isEmpty()) {
      return 0;
    }
    int i3 = paramList.size();
    l2 = e0.x(get1g - paramLong, q);
    long l3 = j;
    if (l2 < l3) {
      return i3;
    }
    int i2 = w(l1, x(paramList));
    v3.i0 locali01 = d[i2];
    for (i2 = i1; i2 < i3; i2++)
    {
      localm = (b5.m)paramList.get(i2);
      v3.i0 locali02 = d;
      if ((e0.x(g - paramLong, q) >= l3) && (p < p))
      {
        i1 = z;
        if ((i1 != -1) && (i1 <= l))
        {
          int i4 = y;
          if ((i4 != -1) && (i4 <= k) && (i1 < z)) {
            return i2;
          }
        }
      }
    }
    return i3;
  }
  
  public final int q()
  {
    return s;
  }
  
  public final void r(float paramFloat)
  {
    q = paramFloat;
  }
  
  public final Object s()
  {
    return null;
  }
  
  public final int w(long paramLong1, long paramLong2)
  {
    paramLong2 = ((float)g.g() * m);
    g.c();
    paramLong2 = ((float)paramLong2 / q);
    if (!o.isEmpty())
    {
      for (i1 = 1; (i1 < o.size() - 1) && (o.get(i1)).a < paramLong2); i1++) {}
      a locala1 = (a)o.get(i1 - 1);
      a locala2 = (a)o.get(i1);
      long l1 = a;
      float f = (float)(paramLong2 - l1) / (float)(a - l1);
      paramLong2 = b;
      paramLong2 = (f * (float)(b - paramLong2)) + paramLong2;
    }
    int i1 = 0;
    int i2 = i1;
    while (i1 < b)
    {
      if ((paramLong1 == Long.MIN_VALUE) || (!l(i1, paramLong1)))
      {
        if (d[i1].p <= paramLong2) {
          i2 = 1;
        } else {
          i2 = 0;
        }
        if (i2 != 0) {
          return i1;
        }
        i2 = i1;
      }
      i1++;
    }
    return i2;
  }
  
  public static final class a
  {
    public final long a;
    public final long b;
    
    public a(long paramLong1, long paramLong2)
    {
      a = paramLong1;
      b = paramLong2;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof a)) {
        return false;
      }
      paramObject = (a)paramObject;
      if ((a != a) || (b != b)) {
        bool = false;
      }
      return bool;
    }
    
    public final int hashCode()
    {
      return (int)a * 31 + (int)b;
    }
  }
  
  public static final class b
    implements h.b
  {}
}

/* Location:
 * Qualified Name:     r5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */