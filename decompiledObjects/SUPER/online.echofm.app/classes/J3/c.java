package J3;

public final class c
  extends B.a
{
  public final int a;
  public final String b;
  public final int c;
  public final int d;
  public final long e;
  public final long f;
  public final long g;
  public final String h;
  public final C i;
  
  public c(int paramInt1, String paramString1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, long paramLong3, String paramString2, C paramC)
  {
    a = paramInt1;
    b = paramString1;
    c = paramInt2;
    d = paramInt3;
    e = paramLong1;
    f = paramLong2;
    g = paramLong3;
    h = paramString2;
    i = paramC;
  }
  
  public C b()
  {
    return i;
  }
  
  public int c()
  {
    return d;
  }
  
  public int d()
  {
    return a;
  }
  
  public String e()
  {
    return b;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof B.a))
    {
      Object localObject = (B.a)paramObject;
      if ((a == ((B.a)localObject).d()) && (b.equals(((B.a)localObject).e())) && (c == ((B.a)localObject).g()) && (d == ((B.a)localObject).c()) && (e == ((B.a)localObject).f()) && (f == ((B.a)localObject).h()) && (g == ((B.a)localObject).i()))
      {
        paramObject = h;
        if (paramObject == null ? ((B.a)localObject).j() == null : ((String)paramObject).equals(((B.a)localObject).j()))
        {
          paramObject = i;
          localObject = ((B.a)localObject).b();
          if (paramObject == null ? localObject == null : ((C)paramObject).equals(localObject)) {
            break label168;
          }
        }
      }
      bool = false;
      label168:
      return bool;
    }
    return false;
  }
  
  public long f()
  {
    return e;
  }
  
  public int g()
  {
    return c;
  }
  
  public long h()
  {
    return f;
  }
  
  public int hashCode()
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
      i4 = ((C)localObject).hashCode();
    }
    return ((((((((j ^ 0xF4243) * 1000003 ^ k) * 1000003 ^ m) * 1000003 ^ n) * 1000003 ^ i1) * 1000003 ^ i2) * 1000003 ^ i3) * 1000003 ^ i5) * 1000003 ^ i4;
  }
  
  public long i()
  {
    return g;
  }
  
  public String j()
  {
    return h;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ApplicationExitInfo{pid=");
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
  
  public static final class b
    extends B.a.b
  {
    public Integer a;
    public String b;
    public Integer c;
    public Integer d;
    public Long e;
    public Long f;
    public Long g;
    public String h;
    public C i;
    
    public B.a a()
    {
      Object localObject1 = a;
      Object localObject2 = "";
      if (localObject1 == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("");
        ((StringBuilder)localObject1).append(" pid");
        localObject2 = ((StringBuilder)localObject1).toString();
      }
      localObject1 = localObject2;
      if (b == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" processName");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      localObject2 = localObject1;
      if (c == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append(" reasonCode");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      localObject1 = localObject2;
      if (d == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" importance");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      localObject2 = localObject1;
      if (e == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append(" pss");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      localObject1 = localObject2;
      if (f == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" rss");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      localObject2 = localObject1;
      if (g == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append(" timestamp");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      if (((String)localObject2).isEmpty()) {
        return new c(a.intValue(), b, c.intValue(), d.intValue(), e.longValue(), f.longValue(), g.longValue(), h, i, null);
      }
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Missing required properties:");
      ((StringBuilder)localObject1).append((String)localObject2);
      throw new IllegalStateException(((StringBuilder)localObject1).toString());
    }
    
    public B.a.b b(C paramC)
    {
      i = paramC;
      return this;
    }
    
    public B.a.b c(int paramInt)
    {
      d = Integer.valueOf(paramInt);
      return this;
    }
    
    public B.a.b d(int paramInt)
    {
      a = Integer.valueOf(paramInt);
      return this;
    }
    
    public B.a.b e(String paramString)
    {
      if (paramString != null)
      {
        b = paramString;
        return this;
      }
      throw new NullPointerException("Null processName");
    }
    
    public B.a.b f(long paramLong)
    {
      e = Long.valueOf(paramLong);
      return this;
    }
    
    public B.a.b g(int paramInt)
    {
      c = Integer.valueOf(paramInt);
      return this;
    }
    
    public B.a.b h(long paramLong)
    {
      f = Long.valueOf(paramLong);
      return this;
    }
    
    public B.a.b i(long paramLong)
    {
      g = Long.valueOf(paramLong);
      return this;
    }
    
    public B.a.b j(String paramString)
    {
      h = paramString;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     J3.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */