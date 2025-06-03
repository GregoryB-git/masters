package x2;

import ec.i;
import f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import o2.o;
import o2.o.a;
import o2.o.b;
import q0.g;

public final class s
{
  public static final String x;
  public final String a;
  public o.b b;
  public String c;
  public String d;
  public androidx.work.c e;
  public androidx.work.c f;
  public long g;
  public long h;
  public long i;
  public o2.c j;
  public int k;
  public int l;
  public long m;
  public long n;
  public long o;
  public long p;
  public boolean q;
  public int r;
  public int s;
  public final int t;
  public long u;
  public int v;
  public final int w;
  
  static
  {
    String str = o2.j.f("WorkSpec");
    i.d(str, "tagWithPrefix(\"WorkSpec\")");
    x = str;
  }
  
  public s(String paramString1, o.b paramb, String paramString2, String paramString3, androidx.work.c paramc1, androidx.work.c paramc2, long paramLong1, long paramLong2, long paramLong3, o2.c paramc, int paramInt1, int paramInt2, long paramLong4, long paramLong5, long paramLong6, long paramLong7, boolean paramBoolean, int paramInt3, int paramInt4, int paramInt5, long paramLong8, int paramInt6, int paramInt7)
  {
    a = paramString1;
    b = paramb;
    c = paramString2;
    d = paramString3;
    e = paramc1;
    f = paramc2;
    g = paramLong1;
    h = paramLong2;
    i = paramLong3;
    j = paramc;
    k = paramInt1;
    l = paramInt2;
    m = paramLong4;
    n = paramLong5;
    o = paramLong6;
    p = paramLong7;
    q = paramBoolean;
    r = paramInt3;
    s = paramInt4;
    t = paramInt5;
    u = paramLong8;
    v = paramInt6;
    w = paramInt7;
  }
  
  public final long a()
  {
    boolean bool;
    if ((b == o.b.a) && (k > 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return a.a(bool, k, l, m, n, s, c(), g, i, h, u);
  }
  
  public final boolean b()
  {
    return i.a(o2.c.i, j) ^ true;
  }
  
  public final boolean c()
  {
    boolean bool;
    if (h != 0L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof s)) {
      return false;
    }
    paramObject = (s)paramObject;
    if (!i.a(a, a)) {
      return false;
    }
    if (b != b) {
      return false;
    }
    if (!i.a(c, c)) {
      return false;
    }
    if (!i.a(d, d)) {
      return false;
    }
    if (!i.a(e, e)) {
      return false;
    }
    if (!i.a(f, f)) {
      return false;
    }
    if (g != g) {
      return false;
    }
    if (h != h) {
      return false;
    }
    if (i != i) {
      return false;
    }
    if (!i.a(j, j)) {
      return false;
    }
    if (k != k) {
      return false;
    }
    if (l != l) {
      return false;
    }
    if (m != m) {
      return false;
    }
    if (n != n) {
      return false;
    }
    if (o != o) {
      return false;
    }
    if (p != p) {
      return false;
    }
    if (q != q) {
      return false;
    }
    if (r != r) {
      return false;
    }
    if (s != s) {
      return false;
    }
    if (t != t) {
      return false;
    }
    if (u != u) {
      return false;
    }
    if (v != v) {
      return false;
    }
    return w == w;
  }
  
  public final int hashCode()
  {
    int i1 = a.hashCode();
    int i4 = b.hashCode();
    i4 = a0.j.e(c, (i4 + i1 * 31) * 31, 31);
    int i5 = a0.j.e(d, i4, 31);
    int i6 = e.hashCode();
    int i7 = f.hashCode();
    long l1 = g;
    int i8 = (int)(l1 ^ l1 >>> 32);
    l1 = h;
    int i9 = (int)(l1 ^ l1 >>> 32);
    l1 = i;
    int i10 = (int)(l1 ^ l1 >>> 32);
    int i11 = j.hashCode();
    int i12 = k;
    int i13 = g.c(l);
    l1 = m;
    int i14 = (int)(l1 ^ l1 >>> 32);
    l1 = n;
    int i15 = (int)(l1 ^ l1 >>> 32);
    l1 = o;
    int i16 = (int)(l1 ^ l1 >>> 32);
    l1 = p;
    int i17 = (int)(l1 ^ l1 >>> 32);
    int i2 = q;
    i4 = i2;
    if (i2 != 0) {
      i4 = 1;
    }
    int i18 = g.c(r);
    int i19 = s;
    int i3 = t;
    l1 = u;
    return (((((i18 + ((((((i13 + ((i11 + ((((i7 + (i6 + i5) * 31) * 31 + i8) * 31 + i9) * 31 + i10) * 31) * 31 + i12) * 31) * 31 + i14) * 31 + i15) * 31 + i16) * 31 + i17) * 31 + i4) * 31) * 31 + i19) * 31 + i3) * 31 + (int)(l1 >>> 32 ^ l1)) * 31 + v) * 31 + w;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("{WorkSpec: ");
    localStringBuilder.append(a);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public static long a(boolean paramBoolean1, int paramInt1, int paramInt2, long paramLong1, long paramLong2, int paramInt3, boolean paramBoolean2, long paramLong3, long paramLong4, long paramLong5, long paramLong6)
    {
      a0.j.p(paramInt2, "backoffPolicy");
      long l = Long.MAX_VALUE;
      if ((paramLong6 != Long.MAX_VALUE) && (paramBoolean2))
      {
        if (paramInt3 != 0)
        {
          paramLong1 = 900000L + paramLong2;
          if (paramLong6 < paramLong1) {
            paramLong6 = paramLong1;
          }
        }
        return paramLong6;
      }
      int i = 0;
      int j = 0;
      if (paramBoolean1)
      {
        paramInt3 = j;
        if (paramInt2 == 2) {
          paramInt3 = 1;
        }
        if (paramInt3 != 0) {
          paramLong1 = paramInt1 * paramLong1;
        } else {
          paramLong1 = Math.scalb((float)paramLong1, paramInt1 - 1);
        }
        paramLong3 = paramLong1;
        if (paramLong1 > 18000000L) {
          paramLong3 = 18000000L;
        }
        paramLong1 = paramLong2 + paramLong3;
      }
      else if (paramBoolean2)
      {
        if (paramInt3 == 0) {
          paramLong1 = paramLong2 + paramLong3;
        } else {
          paramLong1 = paramLong2 + paramLong5;
        }
        paramLong2 = paramLong1;
        paramInt1 = i;
        if (paramLong4 != paramLong5) {
          paramInt1 = 1;
        }
        paramLong1 = paramLong2;
        if (paramInt1 != 0)
        {
          paramLong1 = paramLong2;
          if (paramInt3 == 0) {
            paramLong1 = paramLong2 + (paramLong5 - paramLong4);
          }
        }
      }
      else if (paramLong2 == -1L)
      {
        paramLong1 = l;
      }
      else
      {
        paramLong1 = paramLong2 + paramLong3;
      }
      return paramLong1;
    }
  }
  
  public static final class b
  {
    public String a;
    public o.b b;
    
    public b(o.b paramb, String paramString)
    {
      a = paramString;
      b = paramb;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof b)) {
        return false;
      }
      paramObject = (b)paramObject;
      if (!i.a(a, a)) {
        return false;
      }
      return b == b;
    }
    
    public final int hashCode()
    {
      int i = a.hashCode();
      return b.hashCode() + i * 31;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = f.l("IdAndState(id=");
      localStringBuilder.append(a);
      localStringBuilder.append(", state=");
      localStringBuilder.append(b);
      localStringBuilder.append(')');
      return localStringBuilder.toString();
    }
  }
  
  public static final class c
  {
    public final String a;
    public final o.b b;
    public final androidx.work.c c;
    public final long d;
    public final long e;
    public final long f;
    public final o2.c g;
    public final int h;
    public int i;
    public long j;
    public long k;
    public int l;
    public final int m;
    public final long n;
    public final int o;
    public final List<String> p;
    public final List<androidx.work.c> q;
    
    public c(String paramString, o.b paramb, androidx.work.c paramc, long paramLong1, long paramLong2, long paramLong3, o2.c paramc1, int paramInt1, int paramInt2, long paramLong4, long paramLong5, int paramInt3, int paramInt4, long paramLong6, int paramInt5, ArrayList paramArrayList1, ArrayList paramArrayList2)
    {
      a = paramString;
      b = paramb;
      c = paramc;
      d = paramLong1;
      e = paramLong2;
      f = paramLong3;
      g = paramc1;
      h = paramInt1;
      i = paramInt2;
      j = paramLong4;
      k = paramLong5;
      l = paramInt3;
      m = paramInt4;
      n = paramLong6;
      o = paramInt5;
      p = paramArrayList1;
      q = paramArrayList2;
    }
    
    public final o a()
    {
      androidx.work.c localc1;
      if ((q.isEmpty() ^ true)) {
        localc1 = (androidx.work.c)q.get(0);
      } else {
        localc1 = androidx.work.c.c;
      }
      UUID localUUID = UUID.fromString(a);
      i.d(localUUID, "fromString(id)");
      o.b localb1 = b;
      HashSet localHashSet = new HashSet(p);
      androidx.work.c localc2 = c;
      i.d(localc1, "progress");
      int i1 = h;
      int i2 = m;
      o2.c localc = g;
      long l1 = d;
      long l2 = e;
      boolean bool1 = l2 < 0L;
      o.a locala;
      if (bool1) {
        locala = new o.a(l2, f);
      } else {
        locala = null;
      }
      o.b localb2 = b;
      o.b localb3 = o.b.a;
      long l3;
      if (localb2 == localb3)
      {
        String str = s.x;
        boolean bool2;
        if ((localb2 == localb3) && (i1 > 0)) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        int i3 = i;
        l3 = j;
        long l4 = k;
        int i4 = l;
        boolean bool3;
        if (bool1) {
          bool3 = true;
        } else {
          bool3 = false;
        }
        long l5 = f;
        long l6 = n;
        l3 = s.a.a(bool2, i1, i3, l3, l4, i4, bool3, l1, l5, l2, l6);
      }
      else
      {
        l3 = Long.MAX_VALUE;
      }
      return new o(localUUID, localb1, localHashSet, localc2, localc1, i1, i2, localc, l1, locala, l3, o);
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof c)) {
        return false;
      }
      paramObject = (c)paramObject;
      if (!i.a(a, a)) {
        return false;
      }
      if (b != b) {
        return false;
      }
      if (!i.a(c, c)) {
        return false;
      }
      if (d != d) {
        return false;
      }
      if (e != e) {
        return false;
      }
      if (f != f) {
        return false;
      }
      if (!i.a(g, g)) {
        return false;
      }
      if (h != h) {
        return false;
      }
      if (i != i) {
        return false;
      }
      if (j != j) {
        return false;
      }
      if (k != k) {
        return false;
      }
      if (l != l) {
        return false;
      }
      if (m != m) {
        return false;
      }
      if (n != n) {
        return false;
      }
      if (o != o) {
        return false;
      }
      if (!i.a(p, p)) {
        return false;
      }
      return i.a(q, q);
    }
    
    public final int hashCode()
    {
      int i1 = a.hashCode();
      int i2 = b.hashCode();
      int i3 = c.hashCode();
      long l1 = d;
      int i4 = (int)(l1 ^ l1 >>> 32);
      l1 = e;
      int i5 = (int)(l1 ^ l1 >>> 32);
      l1 = f;
      int i6 = (int)(l1 ^ l1 >>> 32);
      int i7 = g.hashCode();
      int i8 = h;
      int i9 = g.c(i);
      l1 = j;
      int i10 = (int)(l1 ^ l1 >>> 32);
      l1 = k;
      int i11 = (int)(l1 ^ l1 >>> 32);
      int i12 = l;
      int i13 = m;
      l1 = n;
      int i14 = (int)(l1 ^ l1 >>> 32);
      int i15 = o;
      int i16 = p.hashCode();
      return q.hashCode() + (i16 + (((((((i9 + ((i7 + ((((i3 + (i2 + i1 * 31) * 31) * 31 + i4) * 31 + i5) * 31 + i6) * 31) * 31 + i8) * 31) * 31 + i10) * 31 + i11) * 31 + i12) * 31 + i13) * 31 + i14) * 31 + i15) * 31) * 31;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = f.l("WorkInfoPojo(id=");
      localStringBuilder.append(a);
      localStringBuilder.append(", state=");
      localStringBuilder.append(b);
      localStringBuilder.append(", output=");
      localStringBuilder.append(c);
      localStringBuilder.append(", initialDelay=");
      localStringBuilder.append(d);
      localStringBuilder.append(", intervalDuration=");
      localStringBuilder.append(e);
      localStringBuilder.append(", flexDuration=");
      localStringBuilder.append(f);
      localStringBuilder.append(", constraints=");
      localStringBuilder.append(g);
      localStringBuilder.append(", runAttemptCount=");
      localStringBuilder.append(h);
      localStringBuilder.append(", backoffPolicy=");
      localStringBuilder.append(f.t(i));
      localStringBuilder.append(", backoffDelayDuration=");
      localStringBuilder.append(j);
      localStringBuilder.append(", lastEnqueueTime=");
      localStringBuilder.append(k);
      localStringBuilder.append(", periodCount=");
      localStringBuilder.append(l);
      localStringBuilder.append(", generation=");
      localStringBuilder.append(m);
      localStringBuilder.append(", nextScheduleTimeOverride=");
      localStringBuilder.append(n);
      localStringBuilder.append(", stopReason=");
      localStringBuilder.append(o);
      localStringBuilder.append(", tags=");
      localStringBuilder.append(p);
      localStringBuilder.append(", progress=");
      localStringBuilder.append(q);
      localStringBuilder.append(')');
      return localStringBuilder.toString();
    }
  }
}

/* Location:
 * Qualified Name:     x2.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */