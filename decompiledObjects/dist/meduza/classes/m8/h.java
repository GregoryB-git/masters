package m8;

import a0.j;
import f;
import java.util.List;

public final class h
  extends f0.e
{
  public final String a;
  public final String b;
  public final String c;
  public final long d;
  public final Long e;
  public final boolean f;
  public final f0.e.a g;
  public final f0.e.f h;
  public final f0.e.e i;
  public final f0.e.c j;
  public final List<f0.e.d> k;
  public final int l;
  
  public h() {}
  
  public h(String paramString1, String paramString2, String paramString3, long paramLong, Long paramLong1, boolean paramBoolean, f0.e.a parama, f0.e.f paramf, f0.e.e parame, f0.e.c paramc, List paramList, int paramInt)
  {
    a = paramString1;
    b = paramString2;
    c = paramString3;
    d = paramLong;
    e = paramLong1;
    f = paramBoolean;
    g = parama;
    h = paramf;
    i = parame;
    j = paramc;
    k = paramList;
    l = paramInt;
  }
  
  public final f0.e.a a()
  {
    return g;
  }
  
  public final String b()
  {
    return c;
  }
  
  public final f0.e.c c()
  {
    return j;
  }
  
  public final Long d()
  {
    return e;
  }
  
  public final List<f0.e.d> e()
  {
    return k;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof f0.e))
    {
      paramObject = (f0.e)paramObject;
      if ((a.equals(((f0.e)paramObject).f())) && (b.equals(((f0.e)paramObject).h())))
      {
        Object localObject = c;
        if ((localObject == null ? ((f0.e)paramObject).b() == null : ((String)localObject).equals(((f0.e)paramObject).b())) && (d == ((f0.e)paramObject).j()))
        {
          localObject = e;
          if ((localObject == null ? ((f0.e)paramObject).d() == null : ((Long)localObject).equals(((f0.e)paramObject).d())) && (f == ((f0.e)paramObject).l()) && (g.equals(((f0.e)paramObject).a())))
          {
            localObject = h;
            if (localObject == null ? ((f0.e)paramObject).k() == null : localObject.equals(((f0.e)paramObject).k()))
            {
              localObject = i;
              if (localObject == null ? ((f0.e)paramObject).i() == null : localObject.equals(((f0.e)paramObject).i()))
              {
                localObject = j;
                if (localObject == null ? ((f0.e)paramObject).c() == null : localObject.equals(((f0.e)paramObject).c()))
                {
                  localObject = k;
                  if ((localObject == null ? ((f0.e)paramObject).e() == null : ((List)localObject).equals(((f0.e)paramObject).e())) && (l == ((f0.e)paramObject).g())) {
                    break label284;
                  }
                }
              }
            }
          }
        }
      }
      bool = false;
      label284:
      return bool;
    }
    return false;
  }
  
  public final String f()
  {
    return a;
  }
  
  public final int g()
  {
    return l;
  }
  
  public final String h()
  {
    return b;
  }
  
  public final int hashCode()
  {
    int m = a.hashCode();
    int n = b.hashCode();
    Object localObject = c;
    int i1 = 0;
    int i2;
    if (localObject == null) {
      i2 = 0;
    } else {
      i2 = ((String)localObject).hashCode();
    }
    long l1 = d;
    int i3 = (int)(l1 ^ l1 >>> 32);
    localObject = e;
    int i4;
    if (localObject == null) {
      i4 = 0;
    } else {
      i4 = ((Long)localObject).hashCode();
    }
    int i5;
    if (f) {
      i5 = 1231;
    } else {
      i5 = 1237;
    }
    int i6 = g.hashCode();
    localObject = h;
    int i7;
    if (localObject == null) {
      i7 = 0;
    } else {
      i7 = localObject.hashCode();
    }
    localObject = i;
    int i8;
    if (localObject == null) {
      i8 = 0;
    } else {
      i8 = localObject.hashCode();
    }
    localObject = j;
    int i9;
    if (localObject == null) {
      i9 = 0;
    } else {
      i9 = localObject.hashCode();
    }
    localObject = k;
    if (localObject != null) {
      i1 = ((List)localObject).hashCode();
    }
    return (((((((((((m ^ 0xF4243) * 1000003 ^ n) * 1000003 ^ i2) * 1000003 ^ i3) * 1000003 ^ i4) * 1000003 ^ i5) * 1000003 ^ i6) * 1000003 ^ i7) * 1000003 ^ i8) * 1000003 ^ i9) * 1000003 ^ i1) * 1000003 ^ l;
  }
  
  public final f0.e.e i()
  {
    return i;
  }
  
  public final long j()
  {
    return d;
  }
  
  public final f0.e.f k()
  {
    return h;
  }
  
  public final boolean l()
  {
    return f;
  }
  
  public final a m()
  {
    return new a(this);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Session{generator=");
    localStringBuilder.append(a);
    localStringBuilder.append(", identifier=");
    localStringBuilder.append(b);
    localStringBuilder.append(", appQualitySessionId=");
    localStringBuilder.append(c);
    localStringBuilder.append(", startedAt=");
    localStringBuilder.append(d);
    localStringBuilder.append(", endedAt=");
    localStringBuilder.append(e);
    localStringBuilder.append(", crashed=");
    localStringBuilder.append(f);
    localStringBuilder.append(", app=");
    localStringBuilder.append(g);
    localStringBuilder.append(", user=");
    localStringBuilder.append(h);
    localStringBuilder.append(", os=");
    localStringBuilder.append(i);
    localStringBuilder.append(", device=");
    localStringBuilder.append(j);
    localStringBuilder.append(", events=");
    localStringBuilder.append(k);
    localStringBuilder.append(", generatorType=");
    return j.m(localStringBuilder, l, "}");
  }
  
  public static final class a
    extends f0.e.b
  {
    public String a;
    public String b;
    public String c;
    public long d;
    public Long e;
    public boolean f;
    public f0.e.a g;
    public f0.e.f h;
    public f0.e.e i;
    public f0.e.c j;
    public List<f0.e.d> k;
    public int l;
    public byte m;
    
    public a() {}
    
    public a(f0.e parame)
    {
      a = parame.f();
      b = parame.h();
      c = parame.b();
      d = parame.j();
      e = parame.d();
      f = parame.l();
      g = parame.a();
      h = parame.k();
      i = parame.i();
      j = parame.c();
      k = parame.e();
      l = parame.g();
      m = ((byte)7);
    }
    
    public final h a()
    {
      if (m == 7)
      {
        String str1 = a;
        if (str1 != null)
        {
          String str2 = b;
          if (str2 != null)
          {
            localObject = g;
            if (localObject != null) {
              return new h(str1, str2, c, d, e, f, (f0.e.a)localObject, h, i, j, k, l);
            }
          }
        }
      }
      Object localObject = new StringBuilder();
      if (a == null) {
        ((StringBuilder)localObject).append(" generator");
      }
      if (b == null) {
        ((StringBuilder)localObject).append(" identifier");
      }
      if ((m & 0x1) == 0) {
        ((StringBuilder)localObject).append(" startedAt");
      }
      if ((m & 0x2) == 0) {
        ((StringBuilder)localObject).append(" crashed");
      }
      if (g == null) {
        ((StringBuilder)localObject).append(" app");
      }
      if ((m & 0x4) == 0) {
        ((StringBuilder)localObject).append(" generatorType");
      }
      throw new IllegalStateException(j.l("Missing required properties:", (StringBuilder)localObject));
    }
  }
}

/* Location:
 * Qualified Name:     m8.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */