package m8;

import a0.j;
import f;
import java.util.List;

public final class c
  extends f0.a
{
  public final int a;
  public final String b;
  public final int c;
  public final int d;
  public final long e;
  public final long f;
  public final long g;
  public final String h;
  public final List<f0.a.a> i;
  
  public c() {}
  
  public c(int paramInt1, String paramString1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, long paramLong3, String paramString2, List paramList)
  {
    a = paramInt1;
    b = paramString1;
    c = paramInt2;
    d = paramInt3;
    e = paramLong1;
    f = paramLong2;
    g = paramLong3;
    h = paramString2;
    i = paramList;
  }
  
  public final List<f0.a.a> a()
  {
    return i;
  }
  
  public final int b()
  {
    return d;
  }
  
  public final int c()
  {
    return a;
  }
  
  public final String d()
  {
    return b;
  }
  
  public final long e()
  {
    return e;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof f0.a))
    {
      Object localObject = (f0.a)paramObject;
      if ((a == ((f0.a)localObject).c()) && (b.equals(((f0.a)localObject).d())) && (c == ((f0.a)localObject).f()) && (d == ((f0.a)localObject).b()) && (e == ((f0.a)localObject).e()) && (f == ((f0.a)localObject).g()) && (g == ((f0.a)localObject).h()))
      {
        paramObject = h;
        if (paramObject == null ? ((f0.a)localObject).i() == null : ((String)paramObject).equals(((f0.a)localObject).i()))
        {
          paramObject = i;
          localObject = ((f0.a)localObject).a();
          if (paramObject == null ? localObject == null : ((List)paramObject).equals(localObject)) {
            break label170;
          }
        }
      }
      bool = false;
      label170:
      return bool;
    }
    return false;
  }
  
  public final int f()
  {
    return c;
  }
  
  public final long g()
  {
    return f;
  }
  
  public final long h()
  {
    return g;
  }
  
  public final int hashCode()
  {
    int j = a;
    int k = b.hashCode();
    int m = c;
    int n = d;
    long l = e;
    int i1 = (int)(l ^ l >>> 32);
    l = f;
    int i2 = (int)(l ^ l >>> 32);
    l = g;
    int i3 = (int)(l ^ l >>> 32);
    Object localObject = h;
    int i4 = 0;
    int i5;
    if (localObject == null) {
      i5 = 0;
    } else {
      i5 = ((String)localObject).hashCode();
    }
    localObject = i;
    if (localObject != null) {
      i4 = ((List)localObject).hashCode();
    }
    return ((((((((j ^ 0xF4243) * 1000003 ^ k) * 1000003 ^ m) * 1000003 ^ n) * 1000003 ^ i1) * 1000003 ^ i2) * 1000003 ^ i3) * 1000003 ^ i5) * 1000003 ^ i4;
  }
  
  public final String i()
  {
    return h;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("ApplicationExitInfo{pid=");
    localStringBuilder.append(a);
    localStringBuilder.append(", processName=");
    localStringBuilder.append(b);
    localStringBuilder.append(", reasonCode=");
    localStringBuilder.append(c);
    localStringBuilder.append(", importance=");
    localStringBuilder.append(d);
    localStringBuilder.append(", pss=");
    localStringBuilder.append(e);
    localStringBuilder.append(", rss=");
    localStringBuilder.append(f);
    localStringBuilder.append(", timestamp=");
    localStringBuilder.append(g);
    localStringBuilder.append(", traceFile=");
    localStringBuilder.append(h);
    localStringBuilder.append(", buildIdMappingForArch=");
    localStringBuilder.append(i);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class a
    extends f0.a.b
  {
    public int a;
    public String b;
    public int c;
    public int d;
    public long e;
    public long f;
    public long g;
    public String h;
    public List<f0.a.a> i;
    public byte j;
    
    public final c a()
    {
      if (j == 63)
      {
        localObject = b;
        if (localObject != null) {
          return new c(a, (String)localObject, c, d, e, f, g, h, i);
        }
      }
      Object localObject = new StringBuilder();
      if ((j & 0x1) == 0) {
        ((StringBuilder)localObject).append(" pid");
      }
      if (b == null) {
        ((StringBuilder)localObject).append(" processName");
      }
      if ((j & 0x2) == 0) {
        ((StringBuilder)localObject).append(" reasonCode");
      }
      if ((j & 0x4) == 0) {
        ((StringBuilder)localObject).append(" importance");
      }
      if ((j & 0x8) == 0) {
        ((StringBuilder)localObject).append(" pss");
      }
      if ((j & 0x10) == 0) {
        ((StringBuilder)localObject).append(" rss");
      }
      if ((j & 0x20) == 0) {
        ((StringBuilder)localObject).append(" timestamp");
      }
      throw new IllegalStateException(j.l("Missing required properties:", (StringBuilder)localObject));
    }
  }
}

/* Location:
 * Qualified Name:     m8.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */