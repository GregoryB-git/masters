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

public final class s$c
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
  
  public s$c(String paramString, o.b paramb, androidx.work.c paramc, long paramLong1, long paramLong2, long paramLong3, o2.c paramc1, int paramInt1, int paramInt2, long paramLong4, long paramLong5, int paramInt3, int paramInt4, long paramLong6, int paramInt5, ArrayList paramArrayList1, ArrayList paramArrayList2)
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

/* Location:
 * Qualified Name:     x2.s.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */