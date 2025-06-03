package i9;

import f;
import g9.k0;
import j9.q;
import java.util.Objects;
import m9.p0;
import ma.h;

public final class m1
{
  public final k0 a;
  public final int b;
  public final long c;
  public final e0 d;
  public final q e;
  public final q f;
  public final h g;
  public final Integer h;
  
  public m1(k0 paramk0, int paramInt, long paramLong, e0 parame0)
  {
    this(paramk0, paramInt, paramLong, parame0, localq, localq, p0.u, null);
  }
  
  public m1(k0 paramk0, int paramInt, long paramLong, e0 parame0, q paramq1, q paramq2, h paramh, Integer paramInteger)
  {
    paramk0.getClass();
    a = paramk0;
    b = paramInt;
    c = paramLong;
    f = paramq2;
    d = parame0;
    paramq1.getClass();
    e = paramq1;
    paramh.getClass();
    g = paramh;
    h = paramInteger;
  }
  
  public final m1 a(h paramh, q paramq)
  {
    return new m1(a, b, c, d, paramq, f, paramh, null);
  }
  
  public final m1 b(long paramLong)
  {
    return new m1(a, b, paramLong, d, e, f, g, h);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (m1.class == paramObject.getClass()))
    {
      paramObject = (m1)paramObject;
      if ((!a.equals(a)) || (b != b) || (c != c) || (!d.equals(d)) || (!e.equals(e)) || (!f.equals(f)) || (!g.equals(g)) || (!Objects.equals(h, h))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    int j = b;
    int k = (int)c;
    int m = d.hashCode();
    int n = e.hashCode();
    int i1 = f.hashCode();
    int i2 = g.hashCode();
    return Objects.hashCode(h) + (i2 + (i1 + (n + (m + ((i * 31 + j) * 31 + k) * 31) * 31) * 31) * 31) * 31;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("TargetData{target=");
    localStringBuilder.append(a);
    localStringBuilder.append(", targetId=");
    localStringBuilder.append(b);
    localStringBuilder.append(", sequenceNumber=");
    localStringBuilder.append(c);
    localStringBuilder.append(", purpose=");
    localStringBuilder.append(d);
    localStringBuilder.append(", snapshotVersion=");
    localStringBuilder.append(e);
    localStringBuilder.append(", lastLimboFreeSnapshotVersion=");
    localStringBuilder.append(f);
    localStringBuilder.append(", resumeToken=");
    localStringBuilder.append(g);
    localStringBuilder.append(", expectedCount=");
    localStringBuilder.append(h);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     i9.m1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */