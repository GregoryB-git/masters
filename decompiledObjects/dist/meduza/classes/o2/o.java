package o2;

import ec.i;
import f;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public final class o
{
  public final UUID a;
  public final b b;
  public final Set<String> c;
  public final androidx.work.c d;
  public final androidx.work.c e;
  public final int f;
  public final int g;
  public final c h;
  public final long i;
  public final a j;
  public final long k;
  public final int l;
  
  public o(UUID paramUUID, b paramb, HashSet paramHashSet, androidx.work.c paramc1, androidx.work.c paramc2, int paramInt1, int paramInt2, c paramc, long paramLong1, a parama, long paramLong2, int paramInt3)
  {
    a = paramUUID;
    b = paramb;
    c = paramHashSet;
    d = paramc1;
    e = paramc2;
    f = paramInt1;
    g = paramInt2;
    h = paramc;
    i = paramLong1;
    j = parama;
    k = paramLong2;
    l = paramInt3;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramObject != null) {
      if (!i.a(o.class, paramObject.getClass()))
      {
        bool2 = bool1;
      }
      else
      {
        paramObject = (o)paramObject;
        if (f != f) {
          return false;
        }
        if (g != g) {
          return false;
        }
        if (!i.a(a, a)) {
          return false;
        }
        if (b != b) {
          return false;
        }
        if (!i.a(d, d)) {
          return false;
        }
        if (!i.a(h, h)) {
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
        if (!i.a(c, c)) {
          bool2 = bool1;
        } else {
          bool2 = i.a(e, e);
        }
      }
    }
    return bool2;
  }
  
  public final int hashCode()
  {
    int m = a.hashCode();
    int n = b.hashCode();
    int i1 = d.hashCode();
    int i2 = c.hashCode();
    int i3 = e.hashCode();
    int i4 = f;
    int i5 = g;
    int i6 = h.hashCode();
    long l1 = i;
    int i7 = (int)(l1 ^ l1 >>> 32);
    a locala = j;
    int i8;
    if (locala != null) {
      i8 = locala.hashCode();
    } else {
      i8 = 0;
    }
    l1 = k;
    return ((((i6 + (((i3 + (i2 + (i1 + (n + m * 31) * 31) * 31) * 31) * 31 + i4) * 31 + i5) * 31) * 31 + i7) * 31 + i8) * 31 + (int)(l1 ^ l1 >>> 32)) * 31 + l;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("WorkInfo{id='");
    localStringBuilder.append(a);
    localStringBuilder.append("', state=");
    localStringBuilder.append(b);
    localStringBuilder.append(", outputData=");
    localStringBuilder.append(d);
    localStringBuilder.append(", tags=");
    localStringBuilder.append(c);
    localStringBuilder.append(", progress=");
    localStringBuilder.append(e);
    localStringBuilder.append(", runAttemptCount=");
    localStringBuilder.append(f);
    localStringBuilder.append(", generation=");
    localStringBuilder.append(g);
    localStringBuilder.append(", constraints=");
    localStringBuilder.append(h);
    localStringBuilder.append(", initialDelayMillis=");
    localStringBuilder.append(i);
    localStringBuilder.append(", periodicityInfo=");
    localStringBuilder.append(j);
    localStringBuilder.append(", nextScheduleTimeMillis=");
    localStringBuilder.append(k);
    localStringBuilder.append("}, stopReason=");
    localStringBuilder.append(l);
    return localStringBuilder.toString();
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
      if ((paramObject != null) && (i.a(a.class, paramObject.getClass())))
      {
        paramObject = (a)paramObject;
        if ((a != a) || (b != b)) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public final int hashCode()
    {
      long l = a;
      int i = (int)(l ^ l >>> 32);
      l = b;
      return i * 31 + (int)(l >>> 32 ^ l);
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = f.l("PeriodicityInfo{repeatIntervalMillis=");
      localStringBuilder.append(a);
      localStringBuilder.append(", flexIntervalMillis=");
      localStringBuilder.append(b);
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
  }
  
  public static enum b
  {
    static
    {
      b localb1 = new b("ENQUEUED", 0);
      a = localb1;
      b localb2 = new b("RUNNING", 1);
      b = localb2;
      b localb3 = new b("SUCCEEDED", 2);
      c = localb3;
      b localb4 = new b("FAILED", 3);
      d = localb4;
      b localb5 = new b("BLOCKED", 4);
      e = localb5;
      b localb6 = new b("CANCELLED", 5);
      f = localb6;
      o = new b[] { localb1, localb2, localb3, localb4, localb5, localb6 };
    }
    
    public b() {}
    
    public final boolean f()
    {
      boolean bool;
      if ((this != c) && (this != d) && (this != f)) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     o2.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */